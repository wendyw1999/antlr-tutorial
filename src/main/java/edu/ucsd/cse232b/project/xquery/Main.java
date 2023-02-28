package edu.ucsd.cse232b.project.xquery;

import edu.ucsd.cse232b.project.xqueryParsers.xqueryLexer;
import edu.ucsd.cse232b.project.xqueryParsers.xqueryParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
//        String inputPath = "input.txt";
        String inputPath = args[0];
//        String outPath = "output.txt";
        String outPath = args[1];
        PrintWriter writer = new PrintWriter(outPath);
        writer.print("");
        writer.close();
        String inputString = readFile(inputPath);
//        for (int i = 0;i<inputFile.size();i++) {
//            evalXquery(inputFile.get(i),outPath);
//        }
//        String inputString = "<acts> \n" +
//                " {\tfor $a in doc(\"j_caesar.xml\")//ACT\n" +
//                "where empty ( for $sp in $a/SCENE/SPEECH/SPEAKER\n" +
//                "      where $sp/text() = \"CASCA\" \n" +
//                "      return <speaker> {$sp/text()}</speaker>)\n" +
//                "\n" +
//                "return <act>{$a/TITLE/text()}</act>\n" +
//                "\n" +
//                "        }\n" +
//                "</acts>\n";
//        System.out.println(inputString);
        evalXquery(inputString,outPath);
    }

    public static void evalXquery(String xqueryString, String outPath) {
        final xqueryLexer lexer = new xqueryLexer(CharStreams.fromString(xqueryString));
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final xqueryParser parser = new xqueryParser(tokens);
        final ParserRuleContext tree = parser.xq();
        final XqueryBuilder xqueryBuilder = new XqueryBuilder();
        final  LinkedList<Node> results = xqueryBuilder.visit(tree);
        writeToFile(results, outPath);
    }
    public static void writeToFile(LinkedList<Node> res, String filePath) {

        try {
            DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder domBuilder = domFactory.newDocumentBuilder();

            Document newDoc = domBuilder.newDocument();
//            Element rootElement = newDoc.createElement("RESULT");
            for (int i = 0; i < res.size(); i++) {
                Node resultNode = newDoc.importNode(res.get(i),true);
                newDoc.appendChild(resultNode);
//                rootElement.appendChild(resultNode);
            }
            String toWrite = toString(newDoc);
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true));
            writer.write(toWrite);
            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String readFile(String inputPath) throws Exception{
        File f = new File(inputPath);
        FileInputStream fis = new FileInputStream(f);
        byte[] data = new byte[(int) f.length()];
        fis.read(data);
        fis.close();
        return new String(data, "UTF-8");

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