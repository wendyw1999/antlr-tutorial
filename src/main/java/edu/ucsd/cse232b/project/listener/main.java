package edu.ucsd.cse232b.project.listener;


import edu.ucsd.cse232b.project.xpath.Prog;

import edu.ucsd.cse232b.project.xpathParsers.xpathLexer;
import edu.ucsd.cse232b.project.xpathParsers.xpathParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;



public class main {
    public static void main(String[] args) {
        final String xpath = "doc(j_caesar.xml)//tagName";
        final xpathLexer lexer = new xpathLexer(CharStreams.fromString(xpath));
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final xpathParser parser = new xpathParser(tokens);
        final ParserRuleContext tree = parser.prog();
        final ParseTreeWalker walker = new ParseTreeWalker();
        final XpathBuilder xpathBuilder = new XpathBuilder();
        walker.walk(xpathBuilder, tree);
        final Prog xpathObjects = xpathBuilder.getProg(tree);
        System.out.println(xpathObjects);

    }
}
