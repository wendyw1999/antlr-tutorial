package edu.ucsd.cse232b.project.visitor;

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
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import org.w3c.dom.Node;

import static org.antlr.v4.runtime.tree.Trees.getDescendants;

public class XpathBuilder extends xpathBaseVisitor<LinkedList> {
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
    @Override
    public LinkedList<Node> visitChildRoot(xpathParser.ChildRootContext ctx) {

       visitDoc(ctx.fileName().getText());
       return visit(ctx.rp());
    }

    @Override
    public LinkedList<Node> visitDescRoot(xpathParser.DescRootContext ctx) {
        visitDoc(ctx.fileName().getText());
        LinkedList<Node> descendants = getDescendants(currentNodes);
        currentNodes.addAll(descendants);
        return visit(ctx.rp());
    }

    @Override
    public LinkedList<Node> visitTAG_NAME(xpathParser.TAG_NAMEContext ctx) {
        LinkedList<Node> results = new LinkedList<>();
        LinkedList<Node>  childrenList =  getChildren(currentNodes);
        for (Node child: childrenList)
            if(child.getNodeType() == Node.ELEMENT_NODE && child.getNodeName().equals(ctx.getText()))
                results.add(child);
        currentNodes = results;
        return results;
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

}

