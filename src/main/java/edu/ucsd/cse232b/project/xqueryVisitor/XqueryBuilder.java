package edu.ucsd.cse232b.project.xqueryVisitor;

import edu.ucsd.cse232b.project.xqueryParsers.xqueryBaseVisitor;
import edu.ucsd.cse232b.project.xqueryParsers.xqueryParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class XqueryBuilder extends xqueryBaseVisitor<LinkedList<Node>> {
    private HashMap<String, LinkedList<Node>> contextMap = new HashMap<>();
    private Stack<HashMap<String, LinkedList<Node>>> contextStack = new Stack<>();
    Document outputDoc = null;

    private Document doc = null;
    boolean needRewrite = true;

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

    @Override
    public LinkedList<Node> visitFLWR(xqueryParser.FLWRContext ctx) {
        LinkedList<Node> results = new LinkedList<>();

        HashMap<String, LinkedList<Node>> contextMapOld = new HashMap<>(contextMap);

        System.out.println(ctx.whereClause());
        return results;

    }
}
