// Generated from /Users/jankautenburger/Documents/Github/antlr4-rddl/src/main/grammar/antlr4/RDDLParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RDDLParser}.
 */
public interface RDDLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RDDLParser#domainBlock}.
	 * @param ctx the parse tree
	 */
	void enterDomainBlock(RDDLParser.DomainBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#domainBlock}.
	 * @param ctx the parse tree
	 */
	void exitDomainBlock(RDDLParser.DomainBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#requirementsBlock}.
	 * @param ctx the parse tree
	 */
	void enterRequirementsBlock(RDDLParser.RequirementsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#requirementsBlock}.
	 * @param ctx the parse tree
	 */
	void exitRequirementsBlock(RDDLParser.RequirementsBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#requirementList}.
	 * @param ctx the parse tree
	 */
	void enterRequirementList(RDDLParser.RequirementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#requirementList}.
	 * @param ctx the parse tree
	 */
	void exitRequirementList(RDDLParser.RequirementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#typesBlock}.
	 * @param ctx the parse tree
	 */
	void enterTypesBlock(RDDLParser.TypesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#typesBlock}.
	 * @param ctx the parse tree
	 */
	void exitTypesBlock(RDDLParser.TypesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(RDDLParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(RDDLParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#pvariablesBlock}.
	 * @param ctx the parse tree
	 */
	void enterPvariablesBlock(RDDLParser.PvariablesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#pvariablesBlock}.
	 * @param ctx the parse tree
	 */
	void exitPvariablesBlock(RDDLParser.PvariablesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#pvariable}.
	 * @param ctx the parse tree
	 */
	void enterPvariable(RDDLParser.PvariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#pvariable}.
	 * @param ctx the parse tree
	 */
	void exitPvariable(RDDLParser.PvariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(RDDLParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(RDDLParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#typefluentList}.
	 * @param ctx the parse tree
	 */
	void enterTypefluentList(RDDLParser.TypefluentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#typefluentList}.
	 * @param ctx the parse tree
	 */
	void exitTypefluentList(RDDLParser.TypefluentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#defaultFluent}.
	 * @param ctx the parse tree
	 */
	void enterDefaultFluent(RDDLParser.DefaultFluentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#defaultFluent}.
	 * @param ctx the parse tree
	 */
	void exitDefaultFluent(RDDLParser.DefaultFluentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#levelFluent}.
	 * @param ctx the parse tree
	 */
	void enterLevelFluent(RDDLParser.LevelFluentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#levelFluent}.
	 * @param ctx the parse tree
	 */
	void exitLevelFluent(RDDLParser.LevelFluentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#shortFluent}.
	 * @param ctx the parse tree
	 */
	void enterShortFluent(RDDLParser.ShortFluentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#shortFluent}.
	 * @param ctx the parse tree
	 */
	void exitShortFluent(RDDLParser.ShortFluentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#typeValue}.
	 * @param ctx the parse tree
	 */
	void enterTypeValue(RDDLParser.TypeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#typeValue}.
	 * @param ctx the parse tree
	 */
	void exitTypeValue(RDDLParser.TypeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(RDDLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(RDDLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#cpfs}.
	 * @param ctx the parse tree
	 */
	void enterCpfs(RDDLParser.CpfsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#cpfs}.
	 * @param ctx the parse tree
	 */
	void exitCpfs(RDDLParser.CpfsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#cpfContent}.
	 * @param ctx the parse tree
	 */
	void enterCpfContent(RDDLParser.CpfContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#cpfContent}.
	 * @param ctx the parse tree
	 */
	void exitCpfContent(RDDLParser.CpfContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#pvarExpr}.
	 * @param ctx the parse tree
	 */
	void enterPvarExpr(RDDLParser.PvarExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#pvarExpr}.
	 * @param ctx the parse tree
	 */
	void exitPvarExpr(RDDLParser.PvarExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#termList}.
	 * @param ctx the parse tree
	 */
	void enterTermList(RDDLParser.TermListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#termList}.
	 * @param ctx the parse tree
	 */
	void exitTermList(RDDLParser.TermListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(RDDLParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(RDDLParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(RDDLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(RDDLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(RDDLParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(RDDLParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDDLParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(RDDLParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDDLParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(RDDLParser.ExprListContext ctx);
}