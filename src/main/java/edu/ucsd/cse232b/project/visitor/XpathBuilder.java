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

public class XpathBuilder extends xpathBaseVisitor<Xpath> {

    @Override
    public Xpath visitChildRoot(xpathParser.ChildRootContext ctx) {
        final String fileName = ctx.fileName().getText();
        final Xpath rp = visit(ctx.rp());
//        try {
//            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//
//            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
//
//            // parse XML file
//            DocumentBuilder db = dbf.newDocumentBuilder();
//
//            Document doc = db.parse(new File(fileName));
//            doc.getDocumentElement().normalize();
//        } catch (ParserConfigurationException | SAXException | IOException e) {
//            e.printStackTrace();
//        }

        return new ChildRoot(rp,fileName);
    }

    @Override
    public Xpath visitDescRoot(xpathParser.DescRootContext ctx) {
        final String fileName = ctx.fileName().getText();
        final Xpath rp = visit(ctx.rp());
        return new DescRoot(rp,fileName);
    }

    @Override
    public Xpath visitTAG_NAME(xpathParser.TAG_NAMEContext ctx) {
        final TagName tagName = new TagName(ctx.ID().getText());
        return tagName;
    }
}

