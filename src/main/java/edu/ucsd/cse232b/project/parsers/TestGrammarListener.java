// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.project.parsers;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestGrammarParser}.
 */
public interface TestGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TestGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TestGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Doc}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterDoc(TestGrammarParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Doc}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitDoc(TestGrammarParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Doc_Xpath}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterDoc_Xpath(TestGrammarParser.Doc_XpathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Doc_Xpath}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitDoc_Xpath(TestGrammarParser.Doc_XpathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lpr_Xpath_Rpr}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterLpr_Xpath_Rpr(TestGrammarParser.Lpr_Xpath_RprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lpr_Xpath_Rpr}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitLpr_Xpath_Rpr(TestGrammarParser.Lpr_Xpath_RprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ap_Xpath}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterAp_Xpath(TestGrammarParser.Ap_XpathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ap_Xpath}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitAp_Xpath(TestGrammarParser.Ap_XpathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Xpath}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterRp_Xpath(TestGrammarParser.Rp_XpathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Xpath}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitRp_Xpath(TestGrammarParser.Rp_XpathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Dot}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterDot(TestGrammarParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Dot}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitDot(TestGrammarParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Dotdot}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterDotdot(TestGrammarParser.DotdotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Dotdot}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitDotdot(TestGrammarParser.DotdotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Star}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterStar(TestGrammarParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Star}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitStar(TestGrammarParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Txt_Lpr_Rpr}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterTxt_Lpr_Rpr(TestGrammarParser.Txt_Lpr_RprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Txt_Lpr_Rpr}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitTxt_Lpr_Rpr(TestGrammarParser.Txt_Lpr_RprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tagname}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterTagname(TestGrammarParser.TagnameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tagname}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitTagname(TestGrammarParser.TagnameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attname}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterAttname(TestGrammarParser.AttnameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attname}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitAttname(TestGrammarParser.AttnameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tagname_Xpath}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterTagname_Xpath(TestGrammarParser.Tagname_XpathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tagname_Xpath}
	 * labeled alternative in {@link TestGrammarParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitTagname_Xpath(TestGrammarParser.Tagname_XpathContext ctx);
}