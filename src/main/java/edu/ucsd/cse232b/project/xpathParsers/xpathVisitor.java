// Generated from xpath.g4 by ANTLR 4.7.2

package edu.ucsd.cse232b.project.xpathParsers;

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
	 * Visit a parse tree produced by the {@code ChildRoot}
	 * labeled alternative in {@link xpathParser#xpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildRoot(xpathParser.ChildRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DescRoot}
	 * labeled alternative in {@link xpathParser#xpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescRoot(xpathParser.DescRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CHILD_RP}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCHILD_RP(xpathParser.CHILD_RPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SELF_AXIS}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSELF_AXIS(xpathParser.SELF_AXISContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STAR}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTAR(xpathParser.STARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARENT_AXIS}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARENT_AXIS(xpathParser.PARENT_AXISContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TWO_RP}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTWO_RP(xpathParser.TWO_RPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARENTHESIS}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARENTHESIS(xpathParser.PARENTHESISContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TEXT_AXIS}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTEXT_AXIS(xpathParser.TEXT_AXISContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATTR_AXIS}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATTR_AXIS(xpathParser.ATTR_AXISContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FILTER_RP}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFILTER_RP(xpathParser.FILTER_RPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DESC_RP}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDESC_RP(xpathParser.DESC_RPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TAG_NAME}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTAG_NAME(xpathParser.TAG_NAMEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FILTEER_EXIST}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFILTEER_EXIST(xpathParser.FILTEER_EXISTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FILTERNOT}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFILTERNOT(xpathParser.FILTERNOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FILTER_OR}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFILTER_OR(xpathParser.FILTER_ORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FILTER_EQ_STRING}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFILTER_EQ_STRING(xpathParser.FILTER_EQ_STRINGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FILTER_PARENT}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFILTER_PARENT(xpathParser.FILTER_PARENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FILTER_AND}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFILTER_AND(xpathParser.FILTER_ANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FILTER_EQ}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFILTER_EQ(xpathParser.FILTER_EQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FILTER_IS}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFILTER_IS(xpathParser.FILTER_ISContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(xpathParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathParser#attname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttname(xpathParser.AttnameContext ctx);
}