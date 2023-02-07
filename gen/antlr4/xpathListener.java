// Generated from java-escape by ANTLR 4.11.1
package antlr4;

package edu.ucsd.cse232b.project.xpathParsers;

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
	 * Enter a parse tree produced by the {@code ChildRoot}
	 * labeled alternative in {@link xpathParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterChildRoot(xpathParser.ChildRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChildRoot}
	 * labeled alternative in {@link xpathParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitChildRoot(xpathParser.ChildRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DescRoot}
	 * labeled alternative in {@link xpathParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterDescRoot(xpathParser.DescRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DescRoot}
	 * labeled alternative in {@link xpathParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitDescRoot(xpathParser.DescRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CHILD_RP}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCHILD_RP(xpathParser.CHILD_RPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CHILD_RP}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCHILD_RP(xpathParser.CHILD_RPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SELF_AXIS}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSELF_AXIS(xpathParser.SELF_AXISContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SELF_AXIS}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSELF_AXIS(xpathParser.SELF_AXISContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STAR}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSTAR(xpathParser.STARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STAR}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSTAR(xpathParser.STARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARENT_AXIS}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterPARENT_AXIS(xpathParser.PARENT_AXISContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARENT_AXIS}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitPARENT_AXIS(xpathParser.PARENT_AXISContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TWO_RP}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTWO_RP(xpathParser.TWO_RPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TWO_RP}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTWO_RP(xpathParser.TWO_RPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARENTHESIS}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterPARENTHESIS(xpathParser.PARENTHESISContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARENTHESIS}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitPARENTHESIS(xpathParser.PARENTHESISContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TEXT_AXIS}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTEXT_AXIS(xpathParser.TEXT_AXISContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TEXT_AXIS}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTEXT_AXIS(xpathParser.TEXT_AXISContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATTR_AXIS}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterATTR_AXIS(xpathParser.ATTR_AXISContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATTR_AXIS}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitATTR_AXIS(xpathParser.ATTR_AXISContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILTER_RP}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterFILTER_RP(xpathParser.FILTER_RPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILTER_RP}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitFILTER_RP(xpathParser.FILTER_RPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DESC_RP}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterDESC_RP(xpathParser.DESC_RPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DESC_RP}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitDESC_RP(xpathParser.DESC_RPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TAG_NAME}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTAG_NAME(xpathParser.TAG_NAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TAG_NAME}
	 * labeled alternative in {@link xpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTAG_NAME(xpathParser.TAG_NAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILTERNOT}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFILTERNOT(xpathParser.FILTERNOTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILTERNOT}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFILTERNOT(xpathParser.FILTERNOTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILTER_OR}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFILTER_OR(xpathParser.FILTER_ORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILTER_OR}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFILTER_OR(xpathParser.FILTER_ORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILTER_EQ_STRING}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFILTER_EQ_STRING(xpathParser.FILTER_EQ_STRINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILTER_EQ_STRING}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFILTER_EQ_STRING(xpathParser.FILTER_EQ_STRINGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILTER_PARENT}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFILTER_PARENT(xpathParser.FILTER_PARENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILTER_PARENT}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFILTER_PARENT(xpathParser.FILTER_PARENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILTER_AND}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFILTER_AND(xpathParser.FILTER_ANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILTER_AND}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFILTER_AND(xpathParser.FILTER_ANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILTER_EQ}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFILTER_EQ(xpathParser.FILTER_EQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILTER_EQ}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFILTER_EQ(xpathParser.FILTER_EQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILTER_EXIST}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFILTER_EXIST(xpathParser.FILTER_EXISTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILTER_EXIST}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFILTER_EXIST(xpathParser.FILTER_EXISTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILTER_IS}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFILTER_IS(xpathParser.FILTER_ISContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILTER_IS}
	 * labeled alternative in {@link xpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFILTER_IS(xpathParser.FILTER_ISContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(xpathParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(xpathParser.FileNameContext ctx);
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