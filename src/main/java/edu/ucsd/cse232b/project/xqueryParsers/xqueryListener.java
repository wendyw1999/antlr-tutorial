// Generated from xquery.g4 by ANTLR 4.7.2

package edu.ucsd.cse232b.project.xqueryParsers;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xqueryParser}.
 */
public interface xqueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterFLWR(xqueryParser.FLWRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitFLWR(xqueryParser.FLWRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleSlashXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterSingleSlashXQ(xqueryParser.SingleSlashXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleSlashXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitSingleSlashXQ(xqueryParser.SingleSlashXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterTagXQ(xqueryParser.TagXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitTagXQ(xqueryParser.TagXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterApXQ(xqueryParser.ApXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitApXQ(xqueryParser.ApXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterLetXQ(xqueryParser.LetXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitLetXQ(xqueryParser.LetXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterCommaXQ(xqueryParser.CommaXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitCommaXQ(xqueryParser.CommaXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterVarXQ(xqueryParser.VarXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitVarXQ(xqueryParser.VarXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterScXQ(xqueryParser.ScXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitScXQ(xqueryParser.ScXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code braceXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterBraceXQ(xqueryParser.BraceXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code braceXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitBraceXQ(xqueryParser.BraceXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterJoinXQ(xqueryParser.JoinXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitJoinXQ(xqueryParser.JoinXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleSlashXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterDoubleSlashXQ(xqueryParser.DoubleSlashXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleSlashXQ}
	 * labeled alternative in {@link xqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitDoubleSlashXQ(xqueryParser.DoubleSlashXQContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(xqueryParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(xqueryParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(xqueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(xqueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(xqueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(xqueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(xqueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(xqueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(xqueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(xqueryParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagReturn}
	 * labeled alternative in {@link xqueryParser#rt}.
	 * @param ctx the parse tree
	 */
	void enterTagReturn(xqueryParser.TagReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagReturn}
	 * labeled alternative in {@link xqueryParser#rt}.
	 * @param ctx the parse tree
	 */
	void exitTagReturn(xqueryParser.TagReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqReturn}
	 * labeled alternative in {@link xqueryParser#rt}.
	 * @param ctx the parse tree
	 */
	void enterXqReturn(xqueryParser.XqReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqReturn}
	 * labeled alternative in {@link xqueryParser#rt}.
	 * @param ctx the parse tree
	 */
	void exitXqReturn(xqueryParser.XqReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaReturn}
	 * labeled alternative in {@link xqueryParser#rt}.
	 * @param ctx the parse tree
	 */
	void enterCommaReturn(xqueryParser.CommaReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaReturn}
	 * labeled alternative in {@link xqueryParser#rt}.
	 * @param ctx the parse tree
	 */
	void exitCommaReturn(xqueryParser.CommaReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code braceCond}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterBraceCond(xqueryParser.BraceCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code braceCond}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitBraceCond(xqueryParser.BraceCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orCond}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterOrCond(xqueryParser.OrCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orCond}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitOrCond(xqueryParser.OrCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code satisfyCond}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterSatisfyCond(xqueryParser.SatisfyCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code satisfyCond}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitSatisfyCond(xqueryParser.SatisfyCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyCond}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterEmptyCond(xqueryParser.EmptyCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyCond}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitEmptyCond(xqueryParser.EmptyCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andCond}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterAndCond(xqueryParser.AndCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andCond}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitAndCond(xqueryParser.AndCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isCond}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterIsCond(xqueryParser.IsCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isCond}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitIsCond(xqueryParser.IsCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqCond}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterEqCond(xqueryParser.EqCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqCond}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitEqCond(xqueryParser.EqCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notCond}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterNotCond(xqueryParser.NotCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notCond}
	 * labeled alternative in {@link xqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitNotCond(xqueryParser.NotCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#startTag}.
	 * @param ctx the parse tree
	 */
	void enterStartTag(xqueryParser.StartTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#startTag}.
	 * @param ctx the parse tree
	 */
	void exitStartTag(xqueryParser.StartTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#endTag}.
	 * @param ctx the parse tree
	 */
	void enterEndTag(xqueryParser.EndTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#endTag}.
	 * @param ctx the parse tree
	 */
	void exitEndTag(xqueryParser.EndTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(xqueryParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(xqueryParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(xqueryParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(xqueryParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleAP}
	 * labeled alternative in {@link xqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterDoubleAP(xqueryParser.DoubleAPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleAP}
	 * labeled alternative in {@link xqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitDoubleAP(xqueryParser.DoubleAPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleAP}
	 * labeled alternative in {@link xqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterSingleAP(xqueryParser.SingleAPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleAP}
	 * labeled alternative in {@link xqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitSingleAP(xqueryParser.SingleAPContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(xqueryParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(xqueryParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code braceRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterBraceRP(xqueryParser.BraceRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code braceRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitBraceRP(xqueryParser.BraceRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleSlashRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterDoubleSlashRP(xqueryParser.DoubleSlashRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleSlashRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitDoubleSlashRP(xqueryParser.DoubleSlashRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTextRP(xqueryParser.TextRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTextRP(xqueryParser.TextRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttRP(xqueryParser.AttRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttRP(xqueryParser.AttRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParentRP(xqueryParser.ParentRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParentRP(xqueryParser.ParentRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSelfRP(xqueryParser.SelfRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSelfRP(xqueryParser.SelfRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterFilterRP(xqueryParser.FilterRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitFilterRP(xqueryParser.FilterRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCommaRP(xqueryParser.CommaRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCommaRP(xqueryParser.CommaRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childrenRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterChildrenRP(xqueryParser.ChildrenRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childrenRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitChildrenRP(xqueryParser.ChildrenRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagRP(xqueryParser.TagRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagRP(xqueryParser.TagRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleSlashRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSingleSlashRP(xqueryParser.SingleSlashRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleSlashRP}
	 * labeled alternative in {@link xqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSingleSlashRP(xqueryParser.SingleSlashRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqFilter}
	 * labeled alternative in {@link xqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterEqFilter(xqueryParser.EqFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqFilter}
	 * labeled alternative in {@link xqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitEqFilter(xqueryParser.EqFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notFilter}
	 * labeled alternative in {@link xqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterNotFilter(xqueryParser.NotFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFilter}
	 * labeled alternative in {@link xqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitNotFilter(xqueryParser.NotFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andFilter}
	 * labeled alternative in {@link xqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterAndFilter(xqueryParser.AndFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andFilter}
	 * labeled alternative in {@link xqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitAndFilter(xqueryParser.AndFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isFilter}
	 * labeled alternative in {@link xqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterIsFilter(xqueryParser.IsFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isFilter}
	 * labeled alternative in {@link xqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitIsFilter(xqueryParser.IsFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link xqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterRpFilter(xqueryParser.RpFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link xqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitRpFilter(xqueryParser.RpFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpEqString}
	 * labeled alternative in {@link xqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterRpEqString(xqueryParser.RpEqStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpEqString}
	 * labeled alternative in {@link xqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitRpEqString(xqueryParser.RpEqStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code braceFilter}
	 * labeled alternative in {@link xqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterBraceFilter(xqueryParser.BraceFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code braceFilter}
	 * labeled alternative in {@link xqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitBraceFilter(xqueryParser.BraceFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orFilter}
	 * labeled alternative in {@link xqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterOrFilter(xqueryParser.OrFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orFilter}
	 * labeled alternative in {@link xqueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitOrFilter(xqueryParser.OrFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(xqueryParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(xqueryParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(xqueryParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(xqueryParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link xqueryParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(xqueryParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link xqueryParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(xqueryParser.FilenameContext ctx);
}