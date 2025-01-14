package edu.ucsd.cse232b.antlrTutorial.visitor;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import edu.ucsd.cse232b.parsers.ExpressionGrammarLexer;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;
import edu.ucsd.cse232b.antlrTutorial.expression.Prog;

public class main {
     public static void main(String[] args) {
         final String expression = "2+3";

         final ExpressionGrammarLexer lexer = new ExpressionGrammarLexer(CharStreams.fromString(expression));
         final CommonTokenStream tokens = new CommonTokenStream(lexer);
         final ExpressionGrammarParser parser = new ExpressionGrammarParser(tokens);
         final ParserRuleContext tree = parser.prog();
         final ProgramBuilder programBuilder = new ProgramBuilder();
         final Prog program = programBuilder.visit(tree);
         System.out.println(program);


    }
}
