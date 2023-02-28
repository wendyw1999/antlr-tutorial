package edu.ucsd.cse232b.project.xquery;


import edu.ucsd.cse232b.project.xqueryParsers.xqueryBaseVisitor;
import edu.ucsd.cse232b.project.xqueryParsers.xqueryParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

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

/**
 visitFLWR handles all the for loops with or not with, let, where, return
 **/

    @Override public LinkedList<Node> visitFLWR(xqueryParser.FLWRContext ctx) {
        LinkedList<Node> results = new LinkedList<>();
        HashMap<String, LinkedList<Node>> contextMapOld = new HashMap<>(contextMap);
        contextStack.push(contextMapOld);
        FLWRHelper(0, results, ctx);
        contextMap = contextStack.pop();
        return results;
    }
    /**
    FLWRHelper helps with unfold for loop into known number of loops
     **/
        private void FLWRHelper(int k, LinkedList<Node> results, xqueryParser.FLWRContext ctx){
        int numForLoop;
        numForLoop = ctx.forClause().var().size();
        //If we reached the number of for loops required
        if (k == numForLoop){
            if (ctx.letClause() != null) visit(ctx.letClause());
            if (ctx.whereClause() != null)
                if (visit(ctx.whereClause()).size() == 0) return;
            LinkedList<Node> result = visit(ctx.returnClause());
            results.addAll(result);
        }
        //if we are still not in the last loop yet
        else{
            String key = ctx.forClause().var(k).getText();
            LinkedList<Node> valueList = visit(ctx.forClause().xq(k));
            for (Node node: valueList){
                HashMap<String, LinkedList<Node>> contextMapPrev = new HashMap<>(contextMap);
                contextStack.push(contextMapPrev);
                LinkedList<Node> value = new LinkedList<>(); value.add(node);
                contextMap.put(key, value);
                if (k+1 <= numForLoop)
                    FLWRHelper(k+1, results, ctx);
                contextMap = contextStack.pop();
            }
        }
    }


    @Override public LinkedList<Node> visitTagXQ(xqueryParser.TagXQContext ctx){
        String tagName = ctx.startTag().tagName().getText();
        LinkedList<Node> nodeList = visit(ctx.xq());
        Node node = makeElem(tagName, nodeList);
        LinkedList<Node> result = new LinkedList<>();
        result.add(node);
        return result;
    }

    @Override public LinkedList<Node> visitApXQ(xqueryParser.ApXQContext ctx) {
        return visit(ctx.ap());
    }

    @Override public LinkedList<Node> visitLetXQ(xqueryParser.LetXQContext ctx) {
        HashMap<String, LinkedList<Node>> contextMapPrev = new HashMap<>(contextMap);
        contextStack.push(contextMapPrev);
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
        String string = ctx.StringConstant().getText();
        int len = string.length();
        string = string.substring(1,len-1);
        Node node = makeText(string);
        LinkedList<Node> result = new LinkedList<>();
        result.add(node);
        return result;
    }

    @Override public LinkedList<Node> visitBraceXQ(xqueryParser.BraceXQContext ctx) {
        return visit(ctx.xq());
    }

    @Override public LinkedList<Node> visitSingleSlashXQ(xqueryParser.SingleSlashXQContext ctx) {

        LinkedList<Node> currentNodes = new LinkedList<>();
        copyOf(visit(ctx.xq()), currentNodes);
        LinkedList<Node> results = edu.ucsd.cse232b.project.visitor.Main.evalRp(currentNodes, ctx.rp().getText());
        return results;

    }

    @Override public LinkedList<Node> visitDoubleSlashXQ(xqueryParser.DoubleSlashXQContext ctx) {
        visit(ctx.xq());
        currentNodes = getDescendants(this.currentNodes);
        return visit(ctx.rp());
    }

    private void copyOf(LinkedList<Node> l1, LinkedList<Node> l2){
        for (Node node : l1)
            l2.add(node);
    }
    private  LinkedList<Node> forClauseHelper(int k, xqueryParser.ForClauseContext ctx){
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
        return valueList;
    }


    @Override public LinkedList<Node> visitForClause(xqueryParser.ForClauseContext ctx) {
        forClauseHelper(0, ctx);
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
            if (visit(ctx.f()).isEmpty()) {
                results.add(node);
            }
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


    /**
    Helper function that gets the children of the nodes
     **/
    public static LinkedList<Node> getChildren(LinkedList<Node> n){
        LinkedList<Node> childrenList = new LinkedList<Node>();
        for(int j = 0; j < n.size(); j++) {
            Node curNode = n.get(j);
            for (int i = 0; i < curNode.getChildNodes().getLength(); i++) {
                childrenList.add(curNode.getChildNodes().item(i));
            }
        }
        return childrenList;
    }
    /**
     Helper function that get parents of the node
     **/
    public LinkedList<Node> getParents(LinkedList<Node> input) {
        LinkedList<Node> result = new LinkedList<>();
        for(int i = 0; i < input.size(); i++) {
            Node parentNode = input.get(i).getParentNode();
            if(!result.contains(parentNode)) {
                result.add(parentNode);
            }
        }
        return result;
    }

    public LinkedList<Node> getDescendants(LinkedList<Node> list) {
        LinkedList<Node> desc = new LinkedList<>();
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
        LinkedList<Node> allNodes = new LinkedList<>();
        for(int i = 0; i < n.getChildNodes().getLength(); i++) {
            LinkedList<Node> allNodesUnderI = getAllNodes(n.getChildNodes().item(i));
            allNodes.addAll(allNodesUnderI);
        }
        //don't forget the node itself
        allNodes.add(n);
        return allNodes;
    }
}
