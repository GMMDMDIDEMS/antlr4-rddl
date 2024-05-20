// Generated from /Users/jankautenburger/Documents/Github/antlr4-rddl/src/main/grammar/antlr4/RDDLParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RDDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RDDLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RDDLParser#domainBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomainBlock(RDDLParser.DomainBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#requirementsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirementsBlock(RDDLParser.RequirementsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#requirementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirementList(RDDLParser.RequirementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#typesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesBlock(RDDLParser.TypesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(RDDLParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#pvariablesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPvariablesBlock(RDDLParser.PvariablesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#pvariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPvariable(RDDLParser.PvariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(RDDLParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#typefluentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypefluentList(RDDLParser.TypefluentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#defaultFluent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultFluent(RDDLParser.DefaultFluentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#levelFluent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelFluent(RDDLParser.LevelFluentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#shortFluent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortFluent(RDDLParser.ShortFluentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#typeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeValue(RDDLParser.TypeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(RDDLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#cpfs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpfs(RDDLParser.CpfsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#cpfContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpfContent(RDDLParser.CpfContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#pvarExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPvarExpr(RDDLParser.PvarExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#termList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermList(RDDLParser.TermListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(RDDLParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(RDDLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(RDDLParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link RDDLParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(RDDLParser.ExprListContext ctx);
}