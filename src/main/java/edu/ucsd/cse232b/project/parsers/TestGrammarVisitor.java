// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.project.parsers;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TestGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(TestGrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Doc}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(TestGrammarParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Doc_Xpath}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc_Xpath(TestGrammarParser.Doc_XpathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lpr_Xpath_Rpr}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLpr_Xpath_Rpr(TestGrammarParser.Lpr_Xpath_RprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ap_Xpath}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp_Xpath(TestGrammarParser.Ap_XpathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rp_Xpath}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_Xpath(TestGrammarParser.Rp_XpathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Dot}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(TestGrammarParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Dotdot}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotdot(TestGrammarParser.DotdotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Star}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(TestGrammarParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Txt_Lpr_Rpr}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTxt_Lpr_Rpr(TestGrammarParser.Txt_Lpr_RprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tagname}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagname(TestGrammarParser.TagnameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attname}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttname(TestGrammarParser.AttnameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tagname_Xpath}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagname_Xpath(TestGrammarParser.Tagname_XpathContext ctx);
}