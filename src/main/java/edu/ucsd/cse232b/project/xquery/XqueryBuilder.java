package edu.ucsd.cse232b.project.xquery;


import edu.ucsd.cse232b.project.xqueryParsers.xqueryBaseVisitor;
import edu.ucsd.cse232b.project.xqueryParsers.xqueryParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import sun.awt.image.ImageWatched;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.*;


public class XqueryBuilder extends xqueryBaseVisitor<LinkedList<Node>> {
    private HashMap<String, LinkedList<Node>> contextMap = new HashMap<>();
    private Stack<HashMap<String, LinkedList<Node>>> contextStack = new Stack<>();
    private LinkedList<Node> currentNodes = new LinkedList<>();
    private Document outputDoc = null;

    private Document doc = null;

    public XqueryBuilder() {
        try {
            DocumentBuilderFactory docBF = DocumentBuilderFactory.newInstance();
            DocumentBuilder docB = docBF.newDocumentBuilder();
            outputDoc = docB.newDocument();
            doc = docB.newDocument();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }


    @Override public LinkedList<Node> visitFLWR(xqueryParser.FLWRContext ctx) {
        LinkedList<Node> results = new LinkedList<>();

        HashMap<String, LinkedList<Node>> contextMapOld = new HashMap<>(contextMap);
        contextStack.push(contextMapOld);
        FLWRHelper(0, results, ctx);

        contextMap = contextStack.pop();
        return results;
    }
        private void FLWRHelper(int k, LinkedList<Node> results, xqueryParser.FLWRContext ctx){
        int numFor;
        numFor = ctx.forClause().var().size();
        if (k == numFor){
            if (ctx.letClause() != null) visit(ctx.letClause());
            if (ctx.whereClause() != null)
                if (visit(ctx.whereClause()).size() == 0) return;
            LinkedList<Node> result = visit(ctx.returnClause());
            results.addAll(result);
        }
        else{
            String key = ctx.forClause().var(k).getText();
            LinkedList<Node> valueList = visit(ctx.forClause().xq(k));
            for (Node node: valueList){
                HashMap<String, LinkedList<Node>> contextMapOld = new HashMap<>(contextMap);
                contextStack.push(contextMapOld);
                LinkedList<Node> value = new LinkedList<>(); value.add(node);
                contextMap.put(key, value);
                if (k+1 <= numFor)
                    FLWRHelper(k+1, results, ctx);
                contextMap = contextStack.pop();
            }
        }
    }
    private String reWriter(xqueryParser.FLWRContext ctx){
        //PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
        String output = "";

        int numFor;// nums of for clause
        numFor = ctx.forClause().var().size();
        List<HashSet<String>> classify = new LinkedList<HashSet<String>>();
        List<String> relation = new LinkedList<String>();
        for(int i=0; i < numFor;i++) {
            String key = ctx.forClause().var(i).getText();
            String parent = ctx.forClause().xq(i).getText().split("/")[0];
            int size = classify.size();
            boolean found = false;
            // construct the classification
            for(int j = 0; j < size; j++) {
                HashSet<String> curSet = classify.get(j);
                if(curSet.contains(parent)) {
                    curSet.add(key);
                    found = true;
                    break;
                }
            }
            if(!found) {
                HashSet<String> newSet = new HashSet<String>();
                newSet.add(key);
                classify.add(newSet);
                relation.add(key);
            }
        }
        //where clause
        String[] where = ctx.whereClause().cond().getText().split("and");
        String[][] cond = new String[where.length][2];
        for(int i = 0; i < where.length;i++) {
            cond[i][0] = where[i].split("eq|=")[0];
            cond[i][1] = where[i].split("eq|=")[1];
        }

        if(classify.size() == 1) {
            System.out.println("No need to join!");
            return "";
        }
        /*
        the relation that the where condition belongs to. it could belong to two relations at most
         */
        int[][] relaWhere = new int[cond.length][2];

        for(int i=0; i < cond.length; i++) {
            String cur0 = cond[i][0];
            String cur1 = cond[i][1];
            relaWhere[i][0] = -1;
            relaWhere[i][1] = -1;
            for(int j = 0; j < classify.size();j++) {
                if(classify.get(j).contains(cur0)) {
                    relaWhere[i][0] = j;
                }
                if(classify.get(j).contains(cur1)) {
                    relaWhere[i][1] = j;
                }
            }
        }


        int class_size = classify.size();
        //print out
        output += "for $tuple in";
        //writer.print("For $tuple in join  (");
        System.out.print("for $tuple in");
        for (int i = 1; i < class_size;i++) {

            output += " join (";
            System.out.print(" join (");

        }
        //for clause
        //print eq: [af1,al1],[af21,al21]
        output = Print2Join(classify, ctx, output,cond,relaWhere);

        if(class_size > 2) {
            output = Print3Join(classify, ctx, output, cond, relaWhere);
        }
        if(class_size > 3) {
            output = Print4Join(classify, ctx, output, cond, relaWhere);
        }
        if(class_size > 4) {
            output = Print5Join(classify, ctx, output, cond, relaWhere);
        }
        if(class_size > 5) {
            output = Print6Join(classify, ctx, output, cond, relaWhere);
        }

        /*
            return clause
        */
        String retClause = ctx.returnClause().rt().getText();
        String[] tempRet = retClause.split("\\$");
        for (int i = 0; i < tempRet.length-1; i++) {
            tempRet[i] = tempRet[i]+"$tuple/";
        }
        retClause  = tempRet[0];
        for (int i = 1; i < tempRet.length; i++) {
            String[] cur1 = tempRet[i].split(",",2);
            String[] cur2 = tempRet[i].split("}",2);
            String[] cur3 = tempRet[i].split("/",2);
            String[] cur = cur1;
            if(cur2[0].length() < cur[0].length()) {
                cur = cur2;
            }
            if(cur3[0].length() < cur[0].length()) {
                cur = cur3;
            }
            tempRet[i] = cur[0] + "/*";
//            if(cur[1].charAt(0) == '$' || cur[1].charAt(0) == '<') {
//                tempRet[i] += ",";
//            }else {
//                tempRet[i] += "/";
//            }
            if(cur == cur1) {
                tempRet[i] += ",";
            }else if(cur == cur2) {
                tempRet[i] += "}";
            }else {
                tempRet[i] += "/";
            }
            tempRet[i] += cur[1];
            retClause = retClause + tempRet[i];
        }
//        int end = tempRet.length-1;
//        String[] cur = tempRet[end].split("}",2);
//        tempRet[end] = cur[0] + "/*}";
//        tempRet[end] += cur[1];
//        retClause = retClause + tempRet[end];

        output += "return\n";
        output += retClause+"\n";
        System.out.println("return");
        System.out.println(retClause);
        /*
            write in txt
         */
//        writer w = new writer();
//        w.writing("input/output.txt",output);
        return output;
    }

//    @Override public LinkedList<Node> visitFLWR(xqueryParser.FLWRContext ctx) {
//        LinkedList<Node> results = new LinkedList<>();
//        HashMap<String, LinkedList<Node>> temp = new HashMap<>(contextMap);
//        FLWRHelper(0, results, ctx);
//        contextMap = temp;
//        return results;
//    }
//
//    private void FLWRHelper(int k, LinkedList<Node> results, xqueryParser.FLWRContext ctx){
//        int numFor;
//        numFor = ctx.forClause().var().size();
//        if (k == numFor){
//            if (ctx.letClause() != null) visit(ctx.letClause());
//            if (ctx.whereClause() != null)
//                if (visit(ctx.whereClause()) == null) return;
//            LinkedList<Node> result = visit(ctx.returnClause());
//            results.addAll(result);
//        } else {
//            String key = ctx.forClause().var(k).getText();
//            LinkedList<Node> valueList = visit(ctx.forClause().xq(k));
//            for (Node node: valueList){
//                HashMap<String, LinkedList<Node>> contextMapOld = new HashMap<>(contextMap);
//                contextStack.push(contextMapOld);
//                LinkedList<Node> value = new LinkedList<>(); value.add(node);
//                contextMap.put(key, value);
////                if (k+1 <= numFor)
//                FLWRHelper(k+1, results, ctx);
//                contextMap = contextStack.pop();
//            }
//        }
//    }


    private String PrintJoinCond(LinkedList<String> ret0, LinkedList<String> ret1, String output) {
        output += "                 [";
        System.out.print("                 [");
        for(int i = 0; i < ret0.size();i++) {
            output +=ret0.get(i);
            System.out.print(ret0.get(i));
            if(i != ret0.size()-1) {
                output +=",";
                System.out.print(",");
            }
        }
        output +="], [";
        System.out.print("], [");
        for(int i = 0; i < ret1.size();i++) {
            output +=ret1.get(i);
            System.out.print(ret1.get(i));
            if(i != ret1.size()-1) {
                output +=",";
                System.out.print(",");
            }
        }
        output += "]  ";
        System.out.print("]  ");
        return output;
    }

    private String Print2Join(List<HashSet<String>> classify, xqueryParser.FLWRContext ctx, String output,String[][] cond,int[][] relaWhere) {
        //for clause
        int numFor = ctx.forClause().var().size();
        //for(int i = 0; i < classify.size(); i++) {
        for(int i = 0; i < 2; i++) {
            HashSet<String> curSet = classify.get(i);
            String tuples = "";
            int count = 0;
            //print for
            for(int k = 0; k < numFor; k++) {
                String key = ctx.forClause().var(k).getText();
                if(curSet.contains(key)){
                    if(count == 0) {
                        output += "for " + key + " in " + ctx.forClause().xq(k).getText();
                        System.out.print("for " + key + " in " + ctx.forClause().xq(k).getText());
                        count++;
                    }else {
                        output += ",\n";
                        output += "                   " + key + " in " + ctx.forClause().xq(k).getText();
                        System.out.println(",");
                        System.out.print("                   " + key + " in " + ctx.forClause().xq(k).getText());
                    }
                    if(tuples.equals("")) {
                        tuples = tuples + " <" + key.substring(1) + "> " + " {" + key + "} " + " </" + key.substring(1) + ">";
                    }else {
                        tuples = tuples + ", <" + key.substring(1) + "> " + " {" + key + "} " + " </" + key.substring(1) + ">";
                    }
                }
            }
            output += "\n";
            System.out.print("\n");
            //print where
            for(int j = 0;j < cond.length;j++) {
                int count1 = 0;
                if(relaWhere[j][1] == -1 && curSet.contains(cond[j][0])) {
                    if(count1 == 0){
                        count1++;
                        output += "where " + cond[j][0] + " eq " + cond[j][1] +"\n";
                        System.out.println("where " + cond[j][0] + " eq " + cond[j][1]);
                    }else {
                        output += " and  " + cond[j][0] + " eq " + cond[j][1] + "\n";
                        System.out.println(" and  " + cond[j][0] + " eq " + cond[j][1]);
                    }
                }
            }
            //print return
            tuples = "<tuple> "+tuples+" </tuple>,";
            output += "                  return" + tuples + "\n";
            System.out.println("                  return" + tuples);
        }
        //return
        LinkedList<String> ret0 = new LinkedList<String>();
        LinkedList<String> ret1 = new LinkedList<String>();
        for(int i = 0; i < cond.length; i++) {
            if (relaWhere[i][0] == 1 && relaWhere[i][1] == 0) {
                ret0.add(cond[i][1].substring(1));
                ret1.add(cond[i][0].substring(1));
            }else if(relaWhere[i][0] == 0 && relaWhere[i][1] == 1) {
                ret0.add(cond[i][0].substring(1));
                ret1.add(cond[i][1].substring(1));
            }
        }
        output = PrintJoinCond(ret0,ret1,output);
        output += ")\n";
        System.out.println(")");
        return output;
    }
    private String Print3Join(List<HashSet<String>> classify, xqueryParser.FLWRContext ctx,String output,String[][] cond,int[][] relaWhere) {
        int numFor = ctx.forClause().var().size();
        HashSet<String> curSet = classify.get(2);
        String tuples = "";
        int count = 0;
        //print for
        for(int k = 0; k < numFor; k++) {
            String key = ctx.forClause().var(k).getText();
            if(curSet.contains(key)){
                if(count == 0) {
                    output += ",for " + key + " in " + ctx.forClause().xq(k).getText();
                    System.out.print(",for " + key + " in " + ctx.forClause().xq(k).getText());
                    count++;
                }else {
                    output += ",\n";
                    output += "                   " + key + " in " + ctx.forClause().xq(k).getText();
                    System.out.println(",");
                    System.out.print("                   " + key + " in " + ctx.forClause().xq(k).getText());
                }
                if(tuples.equals("")) {
                    tuples = tuples + " <" + key.substring(1) + "> " + " {" + key + "} " + " </" + key.substring(1) + ">";
                }else {
                    tuples = tuples + ", <" + key.substring(1) + "> " + " {" + key + "} " + " </" + key.substring(1) + ">";
                }
            }
        }
        output += "\n";
        System.out.print("\n");
        //print where
        for(int j = 0;j < cond.length;j++) {
            int count1 = 0;
            if(relaWhere[j][1] == -1 && curSet.contains(cond[j][0])) {
                if(count1 == 0){
                    count1++;
                    output += "where " + cond[j][0] + " eq " + cond[j][1] +"\n";
                    System.out.println("where " + cond[j][0] + " eq " + cond[j][1]);
                }else {
                    output += " and  " + cond[j][0] + " eq " + cond[j][1] + "\n";
                    System.out.println(" and  " + cond[j][0] + " eq " + cond[j][1]);
                }
            }
        }
        //print return
        tuples = "<tuple> "+tuples+" </tuple>,";
        output += "                  return" + tuples + "\n";
        System.out.println("                  return" + tuples);

        LinkedList<String> ret0 = new LinkedList<String>();
        LinkedList<String> ret2 = new LinkedList<String>();
        for(int i = 0; i < cond.length; i++) {
            if (relaWhere[i][0] == 2 && (relaWhere[i][1] == 1 || relaWhere[i][1] == 0)){
                ret0.add(cond[i][1].substring(1));
                ret2.add(cond[i][0].substring(1));
            }else if((relaWhere[i][0] == 1 || relaWhere[i][0] == 0) && relaWhere[i][1] == 2) {
                ret0.add(cond[i][0].substring(1));
                ret2.add(cond[i][1].substring(1));
            }
        }
        output = PrintJoinCond(ret0,ret2,output);
        output += ")\n";
        System.out.println(")");
        return output;
    }
    private String Print4Join(List<HashSet<String>> classify, xqueryParser.FLWRContext ctx,String output,String[][] cond,int[][] relaWhere) {
        int numFor = ctx.forClause().var().size();
        HashSet<String> curSet = classify.get(3);
        String tuples = "";
        int count = 0;
        //print for
        for(int k = 0; k < numFor; k++) {
            String key = ctx.forClause().var(k).getText();
            if(curSet.contains(key)){
                if(count == 0) {
                    output += ",for " + key + " in " + ctx.forClause().xq(k).getText();
                    System.out.print(",for " + key + " in " + ctx.forClause().xq(k).getText());
                    count++;
                }else {
                    output += ",\n";
                    output += "                   " + key + " in " + ctx.forClause().xq(k).getText();
                    System.out.println(",");
                    System.out.print("                   " + key + " in " + ctx.forClause().xq(k).getText());
                }
                if(tuples.equals("")) {
                    tuples = tuples + " <" + key.substring(1) + "> " + " {" + key + "} " + " </" + key.substring(1) + ">";
                }else {
                    tuples = tuples + ", <" + key.substring(1) + "> " + " {" + key + "} " + " </" + key.substring(1) + ">";
                }
            }
        }
        output += "\n";
        System.out.print("\n");
        //print where
        for(int j = 0;j < cond.length;j++) {
            int count1 = 0;
            if(relaWhere[j][1] == -1 && curSet.contains(cond[j][0])) {
                if(count1 == 0){
                    count1++;
                    output += "where " + cond[j][0] + " eq " + cond[j][1] +"\n";
                    System.out.println("where " + cond[j][0] + " eq " + cond[j][1]);
                }else {
                    output += " and " + cond[j][0] + " eq " + cond[j][1] + "\n";
                    System.out.println(" and  " + cond[j][0] + " eq " + cond[j][1]);
                }
            }
        }
        //print return
        tuples = "<tuple> "+tuples+" </tuple>,";
        output += "                  return" + tuples + "\n";
        System.out.println("                  return" + tuples);

        LinkedList<String> ret0 = new LinkedList<String>();
        LinkedList<String> ret2 = new LinkedList<String>();
        for(int i = 0; i < cond.length; i++) {
            if (relaWhere[i][0] == 3 && (relaWhere[i][1] >= 0 && relaWhere[i][1] <= 2)){
                ret0.add(cond[i][1].substring(1));
                ret2.add(cond[i][0].substring(1));
            }else if((relaWhere[i][0] >= 0 && relaWhere[i][0] <= 2) && relaWhere[i][1] == 3) {
                ret0.add(cond[i][0].substring(1));
                ret2.add(cond[i][1].substring(1));
            }
        }
        output = PrintJoinCond(ret0,ret2,output);
        output += ")\n";
        System.out.println(")");
        return output;
    }
    private String Print5Join(List<HashSet<String>> classify, xqueryParser.FLWRContext ctx,String output,String[][] cond,int[][] relaWhere) {
        int numFor = ctx.forClause().var().size();
        HashSet<String> curSet = classify.get(4);
        String tuples = "";
        int count = 0;
        //print for
        for(int k = 0; k < numFor; k++) {
            String key = ctx.forClause().var(k).getText();
            if(curSet.contains(key)){
                if(count == 0) {
                    output += ",for " + key + " in " + ctx.forClause().xq(k).getText();
                    System.out.print(",for " + key + " in " + ctx.forClause().xq(k).getText());
                    count++;
                }else {
                    output += ",\n";
                    output += "                   " + key + " in " + ctx.forClause().xq(k).getText();
                    System.out.println(",");
                    System.out.print("                   " + key + " in " + ctx.forClause().xq(k).getText());
                }
                if(tuples.equals("")) {
                    tuples = tuples + " <" + key.substring(1) + "> " + " {" + key + "} " + " </" + key.substring(1) + ">";
                }else {
                    tuples = tuples + ", <" + key.substring(1) + "> " + " {" + key + "} " + " </" + key.substring(1) + ">";
                }
            }
        }
        output += "\n";
        System.out.print("\n");
        //print where
        for(int j = 0;j < cond.length;j++) {
            int count1 = 0;
            if(relaWhere[j][1] == -1 && curSet.contains(cond[j][0])) {
                if(count1 == 0){
                    count1++;
                    output += "where " + cond[j][0] + " eq " + cond[j][1] +"\n";
                    System.out.println("where " + cond[j][0] + " eq " + cond[j][1]);
                }else {
                    output += " and  " + cond[j][0] + " eq " + cond[j][1] + "\n";
                    System.out.println(" and  " + cond[j][0] + " eq " + cond[j][1]);
                }
            }
        }
        //print return
        tuples = "<tuple> "+tuples+" </tuple>,";
        output += "                  return" + tuples + "\n";
        System.out.println("                  return" + tuples);

        LinkedList<String> ret0 = new LinkedList<String>();
        LinkedList<String> ret2 = new LinkedList<String>();
        for(int i = 0; i < cond.length; i++) {
            if (relaWhere[i][0] == 2 && (relaWhere[i][1] == 1 || relaWhere[i][1] == 0)){
                ret0.add(cond[i][1].substring(1));
                ret2.add(cond[i][0].substring(1));
            }else if((relaWhere[i][0] == 1 || relaWhere[i][0] == 0) && relaWhere[i][1] == 2) {
                ret0.add(cond[i][0].substring(1));
                ret2.add(cond[i][1].substring(1));
            }
        }
        output = PrintJoinCond(ret0,ret2,output);
        output += ")\n";
        System.out.println(")");
        return output;
    }
    private String Print6Join(List<HashSet<String>> classify, xqueryParser.FLWRContext ctx,String output,String[][] cond,int[][] relaWhere) {
        int numFor = ctx.forClause().var().size();
        HashSet<String> curSet = classify.get(5);
        String tuples = "";
        int count = 0;
        //print for
        for(int k = 0; k < numFor; k++) {
            String key = ctx.forClause().var(k).getText();
            if(curSet.contains(key)){
                if(count == 0) {
                    output += ",for " + key + " in " + ctx.forClause().xq(k).getText();
                    System.out.print(",for " + key + " in " + ctx.forClause().xq(k).getText());
                    count++;
                }else {
                    output += ",\n";
                    output += "                   " + key + " in " + ctx.forClause().xq(k).getText();
                    System.out.println(",");
                    System.out.print("                   " + key + " in " + ctx.forClause().xq(k).getText());
                }
                if(tuples.equals("")) {
                    tuples = tuples + " <" + key.substring(1) + "> " + " {" + key + "} " + " </" + key.substring(1) + ">";
                }else {
                    tuples = tuples + ", <" + key.substring(1) + "> " + " {" + key + "} " + " </" + key.substring(1) + ">";
                }
            }
        }
        output += "\n";
        System.out.print("\n");
        //print where
        for(int j = 0;j < cond.length;j++) {
            int count1 = 0;
            if(relaWhere[j][1] == -1 && curSet.contains(cond[j][0])) {
                if(count1 == 0){
                    count1++;
                    output += "where " + cond[j][0] + " eq " + cond[j][1] +"\n";
                    System.out.println("where " + cond[j][0] + " eq " + cond[j][1]);
                }else {
                    output += " and  " + cond[j][0] + " eq " + cond[j][1] + "\n";
                    System.out.println(" and  " + cond[j][0] + " eq " + cond[j][1]);
                }
            }
        }
        //print return
        tuples = "<tuple> "+tuples+" </tuple>,";
        output += "                  return" + tuples + "\n";
        System.out.println("                  return" + tuples);

        LinkedList<String> ret0 = new LinkedList<String>();
        LinkedList<String> ret2 = new LinkedList<String>();
        for(int i = 0; i < cond.length; i++) {
            if (relaWhere[i][0] == 2 && (relaWhere[i][1] == 1 || relaWhere[i][1] == 0)){
                ret0.add(cond[i][1].substring(1));
                ret2.add(cond[i][0].substring(1));
            }else if((relaWhere[i][0] == 1 || relaWhere[i][0] == 0) && relaWhere[i][1] == 2) {
                ret0.add(cond[i][0].substring(1));
                ret2.add(cond[i][1].substring(1));
            }
        }
        output = PrintJoinCond(ret0,ret2,output);
        output += ")\n";
        System.out.println(")");
        return output;
    }



    @Override public LinkedList<Node> visitTagXQ(xqueryParser.TagXQContext ctx) {

        String tagName = ctx.startTag().tagName().getText();
        LinkedList<Node> nodeList = visit(ctx.xq());
        Node node = makeElem(tagName, nodeList);
        LinkedList<Node> result = new  LinkedList<>();
        result.add(node);
        return result;
    }

    @Override public LinkedList<Node> visitApXQ(xqueryParser.ApXQContext ctx) {
//        String ap = ctx.getText();
//        LinkedList<Node> results = edu.ucsd.cse232b.project.visitor.Main.evalAp(ap);
//        return results;
        return visit(ctx.ap());
    }

    @Override public LinkedList<Node> visitLetXQ(xqueryParser.LetXQContext ctx) {
        HashMap<String, LinkedList<Node>> contextMapOld = new HashMap<>(contextMap);
        contextStack.push(contextMapOld);
        LinkedList<Node> result = visitChildren(ctx);
        contextMap = contextStack.pop();
        return result;

    }

    @Override public LinkedList<Node> visitCommaXQ(xqueryParser.CommaXQContext ctx) {
        LinkedList<Node> result = new LinkedList<>();
        copyOf(visit(ctx.xq(0)), result);
        result.addAll(visit(ctx.xq(1)));
        return result;
    }

    @Override public LinkedList<Node> visitVarXQ(xqueryParser.VarXQContext ctx) {
        return contextMap.get(ctx.getText());
    }

    @Override public LinkedList<Node> visitScXQ(xqueryParser.ScXQContext ctx) {
        String str = ctx.StringConstant().getText();
        int len = str.length();
        str = str.substring(1,len-1);
        Node node = makeText(str);
        LinkedList<Node> result = new LinkedList<>();
        result.add(node);
        return result;
    }

    @Override public LinkedList<Node> visitBraceXQ(xqueryParser.BraceXQContext ctx) {
        return visit(ctx.xq());
    }

    @Override public LinkedList<Node> visitSingleSlashXQ(xqueryParser.SingleSlashXQContext ctx) {
//        LinkedList<Node> currentNodes = new LinkedList<>();
//        copyOf(visit(ctx.xq()), currentNodes);
////        LinkedList<Node> results = edu.ucsd.cse232b.project.visitor.Main.evalRp(currentNodes, ctx.rp().getText());
//        this.currentNodes = visit(ctx.xq());
//
//        return visit(ctx.rp());

        LinkedList<Node> currentNodes = new LinkedList<>();
        System.out.println(visit(ctx.xq()));
        copyOf(visit(ctx.xq()), currentNodes);
        LinkedList<Node> results = edu.ucsd.cse232b.project.visitor.Main.evalRp(currentNodes, ctx.rp().getText());
        return results;

    }

    @Override public LinkedList<Node> visitDoubleSlashXQ(xqueryParser.DoubleSlashXQContext ctx) {
//        LinkedList<Node> currentNodes = new LinkedList<>();
//        copyOf(visit(ctx.xq()), currentNodes);
//        LinkedList<Node> descendants = getDescendants(currentNodes);
//        currentNodes.addAll(descendants);
//        LinkedList<Node> results = edu.ucsd.cse232b.project.visitor.Main.evalRp(currentNodes, ctx.rp().getText());
//        return results;
        visit(ctx.xq());
        currentNodes = getDescendants(this.currentNodes);
        return visit(ctx.rp());
    }

    private void copyOf(LinkedList<Node> l1, LinkedList<Node> l2){
        for (Node node : l1)
            l2.add(node);
    }
    /*
    private  LinkedList<Node> forClauseHelper(int k, XQueryParser.ForClauseContext ctx){
        String key = ctx.var(k).getText();
        LinkedList<Node> valueList = visit(ctx.xq(k));
        for (Node node: valueList){
            HashMap<String, LinkedList<Node>> contextMapOld = new HashMap<>(contextMap);
            contextStack.push(contextMapOld);
            LinkedList<Node> value = new LinkedList<>(); value.add(node);
            contextMap.put(key, value);
            if (k+1 < ctx.var().size())
                forClauseHelper(k+1, ctx);
            contextMap = contextStack.pop();
        }
    }*/

    @Override public LinkedList<Node> visitForClause(xqueryParser.ForClauseContext ctx) {
        //forClauseHelper(0, ctx);
        return null;
    }

    @Override public LinkedList<Node> visitLetClause(xqueryParser.LetClauseContext ctx) {
        for (int i = 0; i < ctx.var().size(); i++) {
            String key = ctx.var(i).getText();
            LinkedList<Node> value = visit(ctx.xq(i));
            contextMap.put(key, value);
        }
        return null;
    }

    @Override public LinkedList<Node> visitWhereClause(xqueryParser.WhereClauseContext ctx) {
        return visit(ctx.cond());
    }

    @Override public LinkedList<Node> visitReturnClause(xqueryParser.ReturnClauseContext ctx) {

        return visit(ctx.rt());
    }
    @Override public LinkedList<Node> visitTagReturn(xqueryParser.TagReturnContext ctx) {
        String startTag = ctx.startTag().tagName().getText();
        String endTag = ctx.endTag().tagName().getText();
        if (!startTag.equals(endTag)) {
            throw new RuntimeException("Tags not matching");
        }
        LinkedList<Node> nodeList = visit(ctx.rt());
        Node node = makeElem(startTag, nodeList);
        LinkedList<Node> result = new LinkedList<>();
        result.add(node);
        return result;
    }


    @Override public LinkedList<Node> visitXqReturn(xqueryParser.XqReturnContext ctx) { return visit(ctx.xq()); }

    @Override public LinkedList<Node> visitCommaReturn(xqueryParser.CommaReturnContext ctx) {
        LinkedList<Node> result = visit(ctx.rt(0));
        result.addAll(visit(ctx.rt(1)));
        return result;
    }

    @Override public LinkedList<Node> visitBraceCond(xqueryParser.BraceCondContext ctx) {
        return visit(ctx.cond());
    }



    private boolean satisfyCondHelper(int k, xqueryParser.SatisfyCondContext ctx){

        int numFor = ctx.var().size();
        if (k == numFor){
            if (visit(ctx.cond()).size() == 1)
                return true;
        }
        else{
            String key = ctx.var(k).getText();
            LinkedList<Node> valueList = visit(ctx.xq(k));

            for (Node node: valueList){
                HashMap<String, LinkedList<Node>> contextMapOld = new HashMap<>(contextMap);
                contextStack.push(contextMapOld);

                LinkedList<Node> value = new LinkedList<>(); value.add(node);
                contextMap.put(key, value);
                if (k+1 <= numFor)
                    if (satisfyCondHelper(k+1, ctx)) {
                        contextMap = contextStack.pop();
                        return true;
                    }
                contextMap = contextStack.pop();
            }
        }
        return false;
    }


    @Override public LinkedList<Node> visitSatisfyCond(xqueryParser.SatisfyCondContext ctx) {
        LinkedList<Node> result = new LinkedList<>();
        if (satisfyCondHelper(0, ctx)){
            Node True = doc.createTextNode("true");
            result.add(True);
        }
        return result;
    }

    @Override public LinkedList<Node> visitEmptyCond(xqueryParser.EmptyCondContext ctx) {
        LinkedList<Node> xqResult = visit(ctx.xq());
        LinkedList<Node> result = new LinkedList<>();
        if (xqResult.isEmpty()){
            Node True = doc.createTextNode("true");
            result.add(True);
        }
        return result;
    }

    @Override public LinkedList<Node> visitOrCond(xqueryParser.OrCondContext ctx) {
        LinkedList<Node> left = new LinkedList<>(visit(ctx.cond(0)));
        LinkedList<Node> right = new LinkedList<>(visit(ctx.cond(1)));
        LinkedList<Node> result = new LinkedList<>();
        if (left.size() > 0 || right.size() > 0){
            Node True = doc.createTextNode("true");
            result.add(True);
        }
        return result;
    }

    @Override public LinkedList<Node> visitAndCond(xqueryParser.AndCondContext ctx) {
        LinkedList<Node> left = new LinkedList<>(visit(ctx.cond(0)));
        LinkedList<Node> right = new LinkedList<>(visit(ctx.cond(1)));
        LinkedList<Node> result = new LinkedList<>();
        if (left.size() > 0 && right.size() > 0){
            Node True = doc.createTextNode("true");
            result.add(True);
        }
        return result;
    }

    @Override public LinkedList<Node> visitIsCond(xqueryParser.IsCondContext ctx) {
        LinkedList<Node> left = new LinkedList<>(visit(ctx.xq(0)));
        LinkedList<Node> right = new LinkedList<>(visit(ctx.xq(1)));
        LinkedList<Node> result = new LinkedList<>();
        for (Node l: left)
            for (Node r: right)
                if (l.isSameNode(r)){
                    Node True = doc.createTextNode("true");
                    result.add(True);
                    return result;
                }
        return result;
    }


    @Override public LinkedList<Node> visitEqCond(xqueryParser.EqCondContext ctx) {
        LinkedList<Node> left = new LinkedList<>(visit(ctx.xq(0)));
        LinkedList<Node> right = new LinkedList<>(visit(ctx.xq(1)));
        LinkedList<Node> result = new LinkedList<>();
        for (Node l: left)
            for (Node r: right)
                if (l.isEqualNode(r)){
                    Node True = doc.createTextNode("true");
                    result.add(True);
                    return result;
                }
        return result;
    }

    @Override public LinkedList<Node> visitNotCond(xqueryParser.NotCondContext ctx) {
        LinkedList<Node> oppResult = new LinkedList<>(visit(ctx.cond()));
        LinkedList<Node> result = new LinkedList<>();
        if (oppResult.isEmpty()){
            Node True = doc.createTextNode("true");
            result.add(True);
        }
        return result;
    }

    @Override public LinkedList<Node> visitStartTag(xqueryParser.StartTagContext ctx) {
        return visit(ctx.tagName());
    }

    @Override public LinkedList<Node> visitEndTag(xqueryParser.EndTagContext ctx) {
        return visit(ctx.tagName());
    }

    @Override public LinkedList<Node> visitVar(xqueryParser.VarContext ctx) {
        return visitChildren(ctx);
    }

    private Node makeText(String s){
        Node result = doc.createTextNode(s);
        return result;
    }
    private Node makeElem(String tag, LinkedList<Node> list){
        Node result = outputDoc.createElement(tag);
        for (Node node : list) {
            if (node != null) {
                Node newNode = outputDoc.importNode(node, true);
                result.appendChild(newNode);
            }
        }
        return result;
    }
    //from XPath

    @Override public LinkedList<Node> visitDoubleAP(xqueryParser.DoubleAPContext ctx) {
        visit(ctx.doc());
        LinkedList<Node> descendants = getDescendants(currentNodes);
        currentNodes.addAll(descendants);
        return visit(ctx.rp());
    }

    @Override public LinkedList<Node> visitSingleAP(xqueryParser.SingleAPContext ctx) {
        this.visitDoc(ctx.doc());
        return visit(ctx.rp());
    }

    @Override public LinkedList<Node> visitDoc(xqueryParser.DocContext ctx) {
        File xmlFile = new File(ctx.filename().getText());
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setIgnoringElementContentWhitespace(true);
        LinkedList<Node> results = new LinkedList<>();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(xmlFile);

            doc.getDocumentElement().normalize();
            this.doc = doc;
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        results.add(this.doc);
        this.currentNodes = results;
        return results;
    }

    @Override public LinkedList<Node> visitBraceRP(xqueryParser.BraceRPContext ctx) {
        return visit(ctx.rp());
    }

    @Override public LinkedList<Node> visitDoubleSlashRP(xqueryParser.DoubleSlashRPContext ctx) {
        visit(ctx.rp(0));
        this.currentNodes = getDescendants(this.currentNodes);
        return visit(ctx.rp(1));
    }

    @Override public LinkedList<Node> visitTextRP(xqueryParser.TextRPContext ctx) {
        LinkedList<Node> results = new LinkedList<>();
        for (Node node : getChildren(currentNodes)) {
            if (node.getNodeType() == Node.TEXT_NODE) results.add(node);
        }
        return results;
    }

    @Override public LinkedList<Node> visitAttRP(xqueryParser.AttRPContext ctx) {
        LinkedList<Node> results = new LinkedList<>();
        for (Node node : currentNodes) {
            if (node.getNodeType() == Node.ELEMENT_NODE && !node.getAttributes().equals("")) {
                results.add(node);
            }
        }
        currentNodes = results;
        return results;
    }

    @Override public LinkedList<Node> visitParentRP(xqueryParser.ParentRPContext ctx) {
        this.currentNodes = getParents(this.currentNodes);
        return currentNodes;
    }

    @Override public LinkedList<Node> visitSelfRP(xqueryParser.SelfRPContext ctx) {
        return this.currentNodes;
    }

    @Override public LinkedList<Node> visitFilterRP(xqueryParser.FilterRPContext ctx) {
        visit(ctx.rp());
        LinkedList<Node> temp = new LinkedList<>(currentNodes);
        LinkedList<Node> results = new LinkedList<>();
        for (Node node : temp) {
            currentNodes = new LinkedList<>();
            currentNodes.add(node);
            if (!visit(ctx.f()).isEmpty()) results.add(node);
        }
        currentNodes = results;
        return results;
    }

    @Override public LinkedList<Node> visitCommaRP(xqueryParser.CommaRPContext ctx) {
        LinkedList<Node> results;
        LinkedList<Node> prevNodes = this.currentNodes;
        visit(ctx.rp(0));
        LinkedList<Node> resultsFirst = this.currentNodes;
        currentNodes = prevNodes;
        visit(ctx.rp(1));
        LinkedList<Node> resultsSecond = this.currentNodes;
        resultsFirst.addAll(resultsSecond);
        results = resultsFirst;
        currentNodes = results;
        return results;
    }

    @Override public LinkedList<Node> visitChildrenRP(xqueryParser.ChildrenRPContext ctx) {
        LinkedList<Node> results = new LinkedList<>();
        LinkedList<Node> childrenList = getChildren(this.currentNodes);
        for (Node child : childrenList) {
            if (child.getNodeType() == Node.ELEMENT_NODE) {
                results.add(child);
            }
        }
        this.currentNodes = results;
        return results;
    }

    @Override public LinkedList<Node> visitTagRP(xqueryParser.TagRPContext ctx) {
        LinkedList<Node> results = new LinkedList<>();
        System.out.println(this.currentNodes);

        LinkedList<Node> childrenList = getChildren(this.currentNodes);
        for (Node child : childrenList) {
            if (child.getNodeType() == Node.ELEMENT_NODE && child.getNodeName().equals(ctx.tagName().getText())) {
                results.add(child);
            }
        }
        this.currentNodes = results;
        return results;
    }

    @Override public LinkedList<Node> visitSingleSlashRP(xqueryParser.SingleSlashRPContext ctx) {
        visit(ctx.rp(0));
        return visit(ctx.rp(1));
    }

    @Override public LinkedList<Node> visitEqFilter(xqueryParser.EqFilterContext ctx) {
        for (Node n1 : visit(ctx.rp(0))) {
            for (Node n2 : visit(ctx.rp(1))) {
                if (n1.isEqualNode(n2)) return this.currentNodes;
            }
        }
        return new LinkedList<>();
    }

    @Override public LinkedList<Node> visitNotFilter(xqueryParser.NotFilterContext ctx) {
        LinkedList<Node> temp = new LinkedList<>(this.currentNodes);
        LinkedList<Node> results = new LinkedList<>();
        for (int i = 0; i < temp.size(); i++) {
            Node node = temp.get(i);
            this.currentNodes = new LinkedList<>();
            this.currentNodes.add(node);
            if (visit(ctx.f()).isEmpty()) results.add(node);
        }
        currentNodes = results;
        return results;
    }

    @Override public LinkedList<Node> visitAndFilter(xqueryParser.AndFilterContext ctx) {
        LinkedList<Node> temp = new LinkedList<>(this.currentNodes);
        LinkedList<Node> results = visit(ctx.f(0));
        this.currentNodes = temp;
        results.retainAll(visit(ctx.f(1)));
        this.currentNodes = results;
        return results;
    }

    @Override public LinkedList<Node> visitIsFilter(xqueryParser.IsFilterContext ctx) {
        LinkedList<Node> temp = this.currentNodes;
        LinkedList<Node> results = new LinkedList<>();
        for (Node node : temp) {
            LinkedList<Node> singleCurrent = new LinkedList<>();
            singleCurrent.add(node);
            this.currentNodes = singleCurrent;
            LinkedList<Node> leftList = visit(ctx.rp(0));
            this.currentNodes = singleCurrent;
            LinkedList<Node> rightList = visit(ctx.rp(1));
            for (Node left : leftList) {
                for (Node right : rightList) {
                    if (left.isSameNode(right) & !results.contains(node))
                        results.add(node);
                }
            }
        }
        this.currentNodes = results;
        return results;
    }

    @Override public LinkedList<Node> visitRpFilter(xqueryParser.RpFilterContext ctx) {
        LinkedList<Node> temp = new LinkedList<>(this.currentNodes);
        LinkedList<Node> results = visit(ctx.rp());
        this.currentNodes = temp;
        return results;
    }

    @Override public LinkedList<Node> visitBraceFilter(xqueryParser.BraceFilterContext ctx) {
        LinkedList<Node> results = visit(ctx.f());
        this.currentNodes = results;
        return results;
    }

    @Override public LinkedList<Node> visitOrFilter(xqueryParser.OrFilterContext ctx) {
        LinkedList<Node> temp = new LinkedList<>(currentNodes);
        HashSet<Node> set = new HashSet<>(visit(ctx.f(0)));
        this.currentNodes = temp;
        set.addAll(visit(ctx.f(1)));
        LinkedList<Node> results = new LinkedList<>(set);
        this.currentNodes = results;
        return results;
    }

    @Override public LinkedList<Node> visitTagName(xqueryParser.TagNameContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitAttName(xqueryParser.AttNameContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitFilename(xqueryParser.FilenameContext ctx) { return visitChildren(ctx); }


    public static LinkedList<Node> getChildren(LinkedList<Node> n){
        /**
         * return the children of the a node (just the next level)
         */
        LinkedList<Node> childrenList = new LinkedList<Node>();
        for(int j = 0; j < n.size(); j++) {
            Node curNode = n.get(j);
            for (int i = 0; i < curNode.getChildNodes().getLength(); i++) {
                childrenList.add(curNode.getChildNodes().item(i));
            }
        }
        return childrenList;
    }

    public static LinkedList<Node> getChildren(Node curNode){
        LinkedList<Node> childrenList = new LinkedList<Node>();
        for (int i = 0; i < curNode.getChildNodes().getLength(); i++) {
            childrenList.add(curNode.getChildNodes().item(i));
        }
        return childrenList;
    }

    public LinkedList<Node> getParents(LinkedList<Node> input) {
        LinkedList<Node> res = new LinkedList<Node>();
        for(int i = 0; i < input.size(); i++) {
            Node parentNode = input.get(i).getParentNode();
            if(!res.contains(parentNode)) {
                res.add(parentNode);
            }
        }
        return res;
    }

    public LinkedList<Node> getDescendants(LinkedList<Node> list) {
        LinkedList<Node> desc = new LinkedList<Node>();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getChildNodes().getLength() != 0) {
                for(int j = 0; j < list.get(i).getChildNodes().getLength(); j++) {
                    desc.addAll(getAllNodes(list.get(i).getChildNodes().item(j)));
                }
            }
        }
        return desc;
    }

    public LinkedList<Node> getAllNodes(Node n) {
        LinkedList<Node> allNodes = new LinkedList<Node>();
        for(int i = 0; i < n.getChildNodes().getLength(); i++) {
            allNodes.addAll( getAllNodes( n.getChildNodes().item(i) ) );
        }
        allNodes.add(n);
        return allNodes;
    }
    /**
    forLoop
     @param k the number of loops
     @param results
     @param ctx
     **/

//    private void forLoop(int k, LinkedList<Node> results, xqueryParser.FLWRContext ctx) {
//        int numFor;
//        numFor = ctx.forClause().var().size();
//        System.out.println(numFor);
//        if (k == numFor){
//
//            if (ctx.letClause() != null) {
//                visit(ctx.letClause());
//            }
//            if (ctx.whereClause() != null)
//                if (visit(ctx.whereClause()).size() == 0) return;
//            LinkedList<Node> result = visit(ctx.returnClause());
//            results.addAll(result);
//        }
//        else {
//            String key = ctx.forClause().var(k).getText();
//            LinkedList<Node> valueList = visit(ctx.forClause().xq(k));
//            System.out.println(valueList);
//            for (Node node: valueList){
//                HashMap<String, LinkedList<Node>> contextMapOld = new HashMap<>(contextMap);
//                contextStack.push(contextMapOld);
//                LinkedList<Node> value = new LinkedList<>(); value.add(node);
//                contextMap.put(key, value);
//                if (k+1 <= numFor)
//                    forLoop(k+1, results, ctx);
//                contextMap = contextStack.pop();
//            }
//        }
//
//    }
}
