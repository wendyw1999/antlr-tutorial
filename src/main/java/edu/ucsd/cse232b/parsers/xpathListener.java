// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xpathParser}.
 */
public interface xpathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link xpathParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(xpathParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(xpathParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterXpath(xpathParser.XpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitXpath(xpathParser.XpathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChildRoot}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterChildRoot(xpathParser.ChildRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChildRoot}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitChildRoot(xpathParser.ChildRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DescRoot}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterDescRoot(xpathParser.DescRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DescRoot}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitDescRoot(xpathParser.DescRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextAxis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTextAxis(xpathParser.TextAxisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextAxis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTextAxis(xpathParser.TextAxisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DescRp}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterDescRp(xpathParser.DescRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DescRp}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitDescRp(xpathParser.DescRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfAxis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSelfAxis(xpathParser.SelfAxisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfAxis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSelfAxis(xpathParser.SelfAxisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(xpathParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(xpathParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagName(xpathParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagName(xpathParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Star}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterStar(xpathParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Star}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitStar(xpathParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrAxis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttrAxis(xpathParser.AttrAxisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrAxis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttrAxis(xpathParser.AttrAxisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentAxis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParentAxis(xpathParser.ParentAxisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentAxis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParentAxis(xpathParser.ParentAxisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterFilterRp(xpathParser.FilterRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitFilterRp(xpathParser.FilterRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChildRp}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterChildRp(xpathParser.ChildRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChildRp}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitChildRp(xpathParser.ChildRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoRp}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTwoRp(xpathParser.TwoRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoRp}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTwoRp(xpathParser.TwoRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterEqString}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterEqString(xpathParser.FilterEqStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterEqString}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterEqString(xpathParser.FilterEqStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterNot(xpathParser.FilterNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterNot(xpathParser.FilterNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterOr(xpathParser.FilterOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterOr(xpathParser.FilterOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterAnd(xpathParser.FilterAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterAnd(xpathParser.FilterAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterParent}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterParent(xpathParser.FilterParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterParent}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterParent(xpathParser.FilterParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterEq}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterEq(xpathParser.FilterEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterEq}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterEq(xpathParser.FilterEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterIs}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterIs(xpathParser.FilterIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterIs}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterIs(xpathParser.FilterIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterExist}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilterExist(xpathParser.FilterExistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterExist}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilterExist(xpathParser.FilterExistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xml_File}
	 * labeled alternative in {@link xpathParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterXml_File(xpathParser.Xml_FileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xml_File}
	 * labeled alternative in {@link xpathParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitXml_File(xpathParser.Xml_FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#tagname}.
	 * @param ctx the parse tree
	 */
	void enterTagname(xpathParser.TagnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#tagname}.
	 * @param ctx the parse tree
	 */
	void exitTagname(xpathParser.TagnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#attname}.
	 * @param ctx the parse tree
	 */
	void enterAttname(xpathParser.AttnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#attname}.
	 * @param ctx the parse tree
	 */
	void exitAttname(xpathParser.AttnameContext ctx);
}