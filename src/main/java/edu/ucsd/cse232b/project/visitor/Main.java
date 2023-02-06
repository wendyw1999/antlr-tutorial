package edu.ucsd.cse232b.project.visitor;

import edu.ucsd.cse232b.project.xpath.ProgCustom;
import edu.ucsd.cse232b.project.xpathParsers.xpathLexer;
import edu.ucsd.cse232b.project.xpathParsers.xpathParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) throws Exception {
        String inputPath = args[0];

        String outPath = args[1];
        PrintWriter writer = new PrintWriter(outPath);
        writer.print("");
        writer.close();
        ArrayList<String> inputFile = readFile(inputPath);
        for (int i = 0;i<inputFile.size();i++) {
            evalXpath(inputFile.get(i),outPath);
        }
    }

    public static void evalXpath(String xpathString, String outPath) {
        final xpathLexer lexer = new xpathLexer(CharStreams.fromString(xpathString));
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final xpathParser parser = new xpathParser(tokens);
        final ParserRuleContext tree = parser.prog();
        final ProgramBuilder programBuilder = new ProgramBuilder(); //todo
        final ProgCustom program = programBuilder.visit(tree);
        final LinkedList<Node> resultList = program.getNodeList();
        writeToFile(resultList, outPath);

    }
    public static void writeToFile(LinkedList<Node> res, String filePath) {

        try {
            DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder domBuilder = domFactory.newDocumentBuilder();

            Document newDoc = domBuilder.newDocument();
            Element rootElement = newDoc.createElement("RESULT");
            for (int i = 0; i < res.size(); i++) {
                Node resultNode = newDoc.importNode(res.get(i),true);
                rootElement.appendChild(resultNode);
            }
            String toWrite = toString(rootElement);
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true));
            writer.write(toWrite);
            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ArrayList readFile(String inputPath) throws Exception{
        ArrayList<String> arr = new ArrayList<>();
        Files.lines(Paths.get(inputPath)).forEach(str ->
                {
                    arr.add(str);
                }
        );
        return arr;

    }
    private static String toString(Node node) {
        StringWriter sw = new StringWriter();
        try {
            TransformerFactory tranFactory = TransformerFactory.newInstance();
            Transformer t = tranFactory.newTransformer();
            t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            t.setOutputProperty(OutputKeys.INDENT, "yes");
            t.transform(new DOMSource(node), new StreamResult(sw));

        } catch(TransformerException te) {
            te.printStackTrace();
        }
        return sw.toString();
    }
}