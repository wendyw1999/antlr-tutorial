package edu.ucsd.cse232b.project.visitor;

import com.sun.javafx.css.converters.DurationConverter;
import com.sun.scenario.effect.impl.state.LinearConvolveKernel;
import edu.ucsd.cse232b.antlrTutorial.expression.*;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;
import edu.ucsd.cse232b.project.xpath.ChildRoot;
import edu.ucsd.cse232b.project.xpath.DescRoot;
import edu.ucsd.cse232b.project.xpath.TagName;
import edu.ucsd.cse232b.project.xpath.Xpath;
import edu.ucsd.cse232b.project.xpathParsers.xpathBaseVisitor;
import edu.ucsd.cse232b.project.xpathParsers.xpathParser;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.xpath.XPathEvaluator;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import org.w3c.dom.Node;
import sun.awt.image.ImageWatched;

import static org.antlr.v4.runtime.tree.Trees.getDescendants;

public class XpathBuilder extends xpathBaseVisitor<LinkedList<Node>> {
    LinkedList<Node> currentNodes = new LinkedList<Node>();
    Document inputDoc= null;


    public void setCurrentNodes(LinkedList<Node> Nodes){
        currentNodes = Nodes;
    }

    public LinkedList<Node> visitDoc(String fileName) {
        File xmlFile = new File(fileName);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setIgnoringElementContentWhitespace(true);
        LinkedList<Node> results = new LinkedList<>();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(xmlFile);

            doc.getDocumentElement().normalize();
            inputDoc = doc;
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        results.add(inputDoc);
        currentNodes = results;
        return results;

    }

    /**
     * Return the relative path nodes of the context node
     * Rule #1
     */
    @Override
    public LinkedList<Node> visitChildRoot(xpathParser.ChildRootContext ctx) {

       visitDoc(ctx.fileName().getText());
       return visit(ctx.rp());
    }

    /**
     * Return the descendant or self's relative path
     * Rule #2
     */
    @Override
    public LinkedList<Node> visitDescRoot(xpathParser.DescRootContext ctx) {

        visitDoc(ctx.fileName().getText());
        LinkedList<Node> descendants = getDescendants(currentNodes);
        currentNodes.addAll(descendants);
        return visit(ctx.rp());
    }

    /**
     * Return the tag name name of the context node
     * Rule #3
     */
    @Override
    public LinkedList<Node> visitTAG_NAME(xpathParser.TAG_NAMEContext ctx) {

        LinkedList<Node> results = new LinkedList<>();
        LinkedList<Node> childrenList = getChildren(currentNodes);
        for (Node child: childrenList)
            if(child.getNodeType() == Node.ELEMENT_NODE && child.getNodeName().equals(ctx.getText()))
                results.add(child);
        currentNodes = results;
        return results;
    }

    /**
     * Return the wildcard matching
     * Rule #4
     */
    @Override
    public LinkedList<Node> visitSTAR(xpathParser.STARContext ctx) {

        LinkedList<Node> results = new LinkedList<>();
        for (Node child: getChildren(currentNodes))
            if(child.getNodeType() == Node.ELEMENT_NODE)
                results.add(child);
        currentNodes = results;
        return results;
    }

    /**
     * Return the context node
     * Rule #5
     */
    @Override
    public LinkedList<Node> visitSELF_AXIS(xpathParser.SELF_AXISContext ctx) {
        return currentNodes;
    }

    /**
     * Rule #6
     * @param ctx context node
     * @return the parent node
     */
    @Override
    public LinkedList<Node> visitPARENT_AXIS(xpathParser.PARENT_AXISContext ctx) {
        currentNodes = getParents(currentNodes);
        return currentNodes;
    }

    /**
     * Rule #7
     * @param ctx the context node
     * @return the children of the context node that are text
     */
    @Override
    public LinkedList<Node> visitTEXT_AXIS(xpathParser.TEXT_AXISContext ctx) {
        LinkedList<Node> results = new LinkedList<>();
        for (Node node : getChildren(currentNodes)) {
            if (node.getNodeType() == Node.TEXT_NODE) results.add(node);
        }
        return results;
    }

    /**
     * Rule #8
     * @param ctx the context node
     * @return the attributes of the context node
     */
    @Override
    public LinkedList<Node> visitATTR_AXIS(xpathParser.ATTR_AXISContext ctx) {
        LinkedList<Node> results = new LinkedList<>();
        for (Node node : currentNodes) {
            if (node.getNodeType() == Node.ELEMENT_NODE && !node.getAttributes().equals("")) {
                results.add(node);
            }
        }
        currentNodes = results;
        return results;
    }

    /**
     * Rule #9
     * @param ctx the context node
     * @return the relative path execution of the context node
     */
    @Override
    public LinkedList<Node> visitPARENTHESIS(xpathParser.PARENTHESISContext ctx) {
        return visit(ctx.rp());
    }

    /**
     * return the the relative path of the child of another relative path
     * Rule #10
     */
    @Override
    public LinkedList<Node> visitCHILD_RP(xpathParser.CHILD_RPContext ctx) {
        visit(ctx.rp(0));
        return visit(ctx.rp(1));
    }

    /**
     * Rule #11
     * @param ctx the context node
     * @return the self or descendant from rp1 to rp2
     */
    @Override
    public LinkedList<Node> visitDESC_RP(xpathParser.DESC_RPContext ctx) {
        for (Node node : getDescendants(visit(ctx.rp(0)))) {
            currentNodes.add(node);
        }
        HashSet<Node> set = new HashSet<>();
        set.addAll(visit(ctx.rp(1)));
        LinkedList<Node> result = new LinkedList<Node>(set);
        currentNodes = result;
        return currentNodes;
    }

    /**
     * Rule #12
     * @param ctx
     * @return the
     */
    @Override
    public LinkedList<Node> visitFILTER_RP(xpathParser.FILTER_RPContext ctx) {
        LinkedList<Node> temp = visit(ctx.rp());
        LinkedList<Node> result = new LinkedList<>();
        for (Node node : currentNodes) {
            if (!visit(ctx.filter()).isEmpty()) result.add(node);
        }
        currentNodes = result;
        return result;
    }

    /**
     * Rule #13
     * @param ctx
     * @return the combination of two relative path queries
     */
    @Override
    public LinkedList<Node> visitTWO_RP(xpathParser.TWO_RPContext ctx) {
        LinkedList<Node> result = visit(ctx.rp(0));
        result.addAll(visit(ctx.rp(1)));
        currentNodes = result;
        return result;
    }

    /**
     * Rule #14
     * @param ctx the parse tree
     * @return the evaluation of the filter nodes
     */
    @Override
    public LinkedList<Node> visitFILTER_EXIST(xpathParser.FILTER_EXISTContext ctx) {
        LinkedList<Node> result = visit(ctx.rp());
        currentNodes = result;
        return result;
    }

    /**
     * Rule #15
     * @param ctx
     * @return whether the two relative path queries have equal values
     */
    @Override
    public LinkedList<Node> visitFILTER_EQ(xpathParser.FILTER_EQContext ctx) {
        for (Node n1 : visit(ctx.rp(0))) {
            for (Node n2 : visit(ctx.rp(1))) {
                if (n1.isEqualNode(n2)) return currentNodes;
            }
        }
        return new LinkedList<>();
    }

    /**
     * Rule #16
     * @param ctx
     * @return whether two relative path queries have the same node objects
     */
    @Override
    public LinkedList<Node> visitFILTER_IS(xpathParser.FILTER_ISContext ctx) {
        for (Node n1 : visit(ctx.rp(0))) {
            for (Node n2 : visit(ctx.rp(1))) {
                if (n1 == n2) return currentNodes;
            }
        }
        return new LinkedList<>();
    }

    /**
     * Rule #17
     * @param ctx
     * @return whether any of the relative path query results have the same string value
     */
    @Override
    public LinkedList<Node> visitFILTER_EQ_STRING(xpathParser.FILTER_EQ_STRINGContext ctx) {
        for (Node node : visit(ctx.rp())) {
            if (node.getTextContent().equals(ctx.STRING().toString().replaceAll("^\"|\"$|^\'|\'$", ""))) {
                return currentNodes;
            }
        }
        return new LinkedList<>();
    }

    /**
     * Rule #18
     * @param ctx
     * @return the filter within the parenthesis
     */
    @Override
    public LinkedList<Node> visitFILTER_PARENT(xpathParser.FILTER_PARENTContext ctx) {
        LinkedList<Node> result = visit(ctx.filter());
        currentNodes = result;
        return result;
    }

    /**
     * Rule #19
     * @param ctx
     * @return the and operation between two filters
     */
    @Override
    public LinkedList<Node> visitFILTER_AND(xpathParser.FILTER_ANDContext ctx) {
        LinkedList<Node> result = visit(ctx.filter(0));
        result.retainAll(visit(ctx.filter(1)));
        currentNodes = result;
        return result;
    }

    /**
     * Rule #20
     * @param ctx
     * @return the or operation between two filters
     */
    @Override
    public LinkedList<Node> visitFILTER_OR(xpathParser.FILTER_ORContext ctx) {
        HashSet<Node> set = new HashSet<>(visit(ctx.filter(0)));
        set.addAll(visit(ctx.filter(1)));
        LinkedList<Node> result = new LinkedList<>(set);
        currentNodes = result;
        return result;
    }

    @Override
    public LinkedList<Node> visitFILTERNOT(xpathParser.FILTERNOTContext ctx) {
        LinkedList<Node> result = new LinkedList<>();
        for (int i = 0; i < currentNodes.size(); i++) {
            Node node = currentNodes.get(i);
            currentNodes = new LinkedList<>();
            currentNodes.add(node);
            if (visit(ctx.filter()).isEmpty()) result.add(node);
        }
        currentNodes = result;
        return result;
    }


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


    public LinkedList<Node> getAllNodes(Node n) {
        LinkedList<Node> allNodes = new LinkedList<Node>();
        for(int i = 0; i < n.getChildNodes().getLength(); i++) {
            allNodes.addAll( getAllNodes( n.getChildNodes().item(i) ) );
        }
        allNodes.add(n);
        return allNodes;
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
    public LinkedList<Node> getParents(LinkedList<Node> input) {
        LinkedList<Node> res = new LinkedList<>();
        for(int i = 0; i < input.size(); i++) {
            Node parentNode = input.get(i).getParentNode();
            if(!res.contains(parentNode)) {
                res.add(parentNode);
            }
        }
        return res;
    }

}

