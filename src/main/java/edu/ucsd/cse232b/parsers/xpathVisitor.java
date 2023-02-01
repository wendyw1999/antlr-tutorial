// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link xpathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface xpathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link xpathParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(xpathParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathParser#xpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXpath(xpathParser.XpathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChildRoot}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildRoot(xpathParser.ChildRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DescRoot}
	 * labeled alternative in {@link xpathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescRoot(xpathParser.DescRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextAxis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextAxis(xpathParser.TextAxisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DescRp}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescRp(xpathParser.DescRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfAxis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfAxis(xpathParser.SelfAxisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(xpathParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(xpathParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Star}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(xpathParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrAxis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrAxis(xpathParser.AttrAxisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentAxis}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentAxis(xpathParser.ParentAxisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterRp(xpathParser.FilterRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChildRp}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildRp(xpathParser.ChildRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoRp}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoRp(xpathParser.TwoRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterEqString}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEqString(xpathParser.FilterEqStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterNot(xpathParser.FilterNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterOr(xpathParser.FilterOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterAnd(xpathParser.FilterAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterParent}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterParent(xpathParser.FilterParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterEq}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEq(xpathParser.FilterEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterIs}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterIs(xpathParser.FilterIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterExist}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterExist(xpathParser.FilterExistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xml_File}
	 * labeled alternative in {@link xpathParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_File(xpathParser.Xml_FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathParser#tagname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagname(xpathParser.TagnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathParser#attname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttname(xpathParser.AttnameContext ctx);
}