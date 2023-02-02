package edu.ucsd.cse232b.project.visitor;

import edu.ucsd.cse232b.project.xpath.Prog;
import edu.ucsd.cse232b.project.xpath.ProgCustom;
import edu.ucsd.cse232b.project.xpathParsers.xpathLexer;
import edu.ucsd.cse232b.project.xpathParsers.xpathParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

public class main {
    public static void main(String[] args) {
        final String xpathString = "doc(j_caesar_M3.xml)/PLAY/FM/P";

        final xpathLexer lexer = new xpathLexer(CharStreams.fromString(xpathString));
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final xpathParser parser = new xpathParser(tokens);
        final ParserRuleContext tree = parser.prog();
        final ProgramBuilder programBuilder = new ProgramBuilder(); //todo
        final ProgCustom program = programBuilder.visit(tree);
        System.out.println(program);

    }
}