// Generated from ./RDDLParser.g4 by ANTLR 4.13.1

import { AbstractParseTreeVisitor } from "antlr4ng";


import { DomainBlockContext } from "./RDDLParser.js";
import { RequirementsBlockContext } from "./RDDLParser.js";
import { RequirementListContext } from "./RDDLParser.js";
import { TypesBlockContext } from "./RDDLParser.js";
import { TypeListContext } from "./RDDLParser.js";
import { PvariablesBlockContext } from "./RDDLParser.js";
import { PvariableContext } from "./RDDLParser.js";
import { ParamsContext } from "./RDDLParser.js";
import { TypefluentListContext } from "./RDDLParser.js";
import { DefaultFluentContext } from "./RDDLParser.js";
import { LevelFluentContext } from "./RDDLParser.js";
import { ShortFluentContext } from "./RDDLParser.js";
import { TypeValueContext } from "./RDDLParser.js";
import { ValueContext } from "./RDDLParser.js";
import { CpfsContext } from "./RDDLParser.js";
import { CpfContentContext } from "./RDDLParser.js";
import { PvarExprContext } from "./RDDLParser.js";
import { TermListContext } from "./RDDLParser.js";
import { TermContext } from "./RDDLParser.js";
import { ExprContext } from "./RDDLParser.js";
import { AtomContext } from "./RDDLParser.js";
import { ExprListContext } from "./RDDLParser.js";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `RDDLParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export class RDDLParserVisitor<Result> extends AbstractParseTreeVisitor<Result> {
    /**
     * Visit a parse tree produced by `RDDLParser.domainBlock`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitDomainBlock?: (ctx: DomainBlockContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.requirementsBlock`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitRequirementsBlock?: (ctx: RequirementsBlockContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.requirementList`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitRequirementList?: (ctx: RequirementListContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.typesBlock`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitTypesBlock?: (ctx: TypesBlockContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.typeList`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitTypeList?: (ctx: TypeListContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.pvariablesBlock`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitPvariablesBlock?: (ctx: PvariablesBlockContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.pvariable`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitPvariable?: (ctx: PvariableContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.params`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitParams?: (ctx: ParamsContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.typefluentList`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitTypefluentList?: (ctx: TypefluentListContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.defaultFluent`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitDefaultFluent?: (ctx: DefaultFluentContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.levelFluent`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitLevelFluent?: (ctx: LevelFluentContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.shortFluent`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitShortFluent?: (ctx: ShortFluentContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.typeValue`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitTypeValue?: (ctx: TypeValueContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.value`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitValue?: (ctx: ValueContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.cpfs`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitCpfs?: (ctx: CpfsContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.cpfContent`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitCpfContent?: (ctx: CpfContentContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.pvarExpr`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitPvarExpr?: (ctx: PvarExprContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.termList`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitTermList?: (ctx: TermListContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.term`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitTerm?: (ctx: TermContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.expr`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitExpr?: (ctx: ExprContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.atom`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitAtom?: (ctx: AtomContext) => Result;
    /**
     * Visit a parse tree produced by `RDDLParser.exprList`.
     * @param ctx the parse tree
     * @return the visitor result
     */
    visitExprList?: (ctx: ExprListContext) => Result;
}

