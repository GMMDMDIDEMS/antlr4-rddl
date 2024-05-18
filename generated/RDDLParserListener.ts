// Generated from ./RDDLParser.g4 by ANTLR 4.13.1

import { ErrorNode, ParseTreeListener, ParserRuleContext, TerminalNode } from "antlr4ng";


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
 * This interface defines a complete listener for a parse tree produced by
 * `RDDLParser`.
 */
export class RDDLParserListener implements ParseTreeListener {
    /**
     * Enter a parse tree produced by `RDDLParser.domainBlock`.
     * @param ctx the parse tree
     */
    enterDomainBlock?: (ctx: DomainBlockContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.domainBlock`.
     * @param ctx the parse tree
     */
    exitDomainBlock?: (ctx: DomainBlockContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.requirementsBlock`.
     * @param ctx the parse tree
     */
    enterRequirementsBlock?: (ctx: RequirementsBlockContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.requirementsBlock`.
     * @param ctx the parse tree
     */
    exitRequirementsBlock?: (ctx: RequirementsBlockContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.requirementList`.
     * @param ctx the parse tree
     */
    enterRequirementList?: (ctx: RequirementListContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.requirementList`.
     * @param ctx the parse tree
     */
    exitRequirementList?: (ctx: RequirementListContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.typesBlock`.
     * @param ctx the parse tree
     */
    enterTypesBlock?: (ctx: TypesBlockContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.typesBlock`.
     * @param ctx the parse tree
     */
    exitTypesBlock?: (ctx: TypesBlockContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.typeList`.
     * @param ctx the parse tree
     */
    enterTypeList?: (ctx: TypeListContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.typeList`.
     * @param ctx the parse tree
     */
    exitTypeList?: (ctx: TypeListContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.pvariablesBlock`.
     * @param ctx the parse tree
     */
    enterPvariablesBlock?: (ctx: PvariablesBlockContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.pvariablesBlock`.
     * @param ctx the parse tree
     */
    exitPvariablesBlock?: (ctx: PvariablesBlockContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.pvariable`.
     * @param ctx the parse tree
     */
    enterPvariable?: (ctx: PvariableContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.pvariable`.
     * @param ctx the parse tree
     */
    exitPvariable?: (ctx: PvariableContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.params`.
     * @param ctx the parse tree
     */
    enterParams?: (ctx: ParamsContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.params`.
     * @param ctx the parse tree
     */
    exitParams?: (ctx: ParamsContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.typefluentList`.
     * @param ctx the parse tree
     */
    enterTypefluentList?: (ctx: TypefluentListContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.typefluentList`.
     * @param ctx the parse tree
     */
    exitTypefluentList?: (ctx: TypefluentListContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.defaultFluent`.
     * @param ctx the parse tree
     */
    enterDefaultFluent?: (ctx: DefaultFluentContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.defaultFluent`.
     * @param ctx the parse tree
     */
    exitDefaultFluent?: (ctx: DefaultFluentContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.levelFluent`.
     * @param ctx the parse tree
     */
    enterLevelFluent?: (ctx: LevelFluentContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.levelFluent`.
     * @param ctx the parse tree
     */
    exitLevelFluent?: (ctx: LevelFluentContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.shortFluent`.
     * @param ctx the parse tree
     */
    enterShortFluent?: (ctx: ShortFluentContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.shortFluent`.
     * @param ctx the parse tree
     */
    exitShortFluent?: (ctx: ShortFluentContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.typeValue`.
     * @param ctx the parse tree
     */
    enterTypeValue?: (ctx: TypeValueContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.typeValue`.
     * @param ctx the parse tree
     */
    exitTypeValue?: (ctx: TypeValueContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.value`.
     * @param ctx the parse tree
     */
    enterValue?: (ctx: ValueContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.value`.
     * @param ctx the parse tree
     */
    exitValue?: (ctx: ValueContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.cpfs`.
     * @param ctx the parse tree
     */
    enterCpfs?: (ctx: CpfsContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.cpfs`.
     * @param ctx the parse tree
     */
    exitCpfs?: (ctx: CpfsContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.cpfContent`.
     * @param ctx the parse tree
     */
    enterCpfContent?: (ctx: CpfContentContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.cpfContent`.
     * @param ctx the parse tree
     */
    exitCpfContent?: (ctx: CpfContentContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.pvarExpr`.
     * @param ctx the parse tree
     */
    enterPvarExpr?: (ctx: PvarExprContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.pvarExpr`.
     * @param ctx the parse tree
     */
    exitPvarExpr?: (ctx: PvarExprContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.termList`.
     * @param ctx the parse tree
     */
    enterTermList?: (ctx: TermListContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.termList`.
     * @param ctx the parse tree
     */
    exitTermList?: (ctx: TermListContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.term`.
     * @param ctx the parse tree
     */
    enterTerm?: (ctx: TermContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.term`.
     * @param ctx the parse tree
     */
    exitTerm?: (ctx: TermContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.expr`.
     * @param ctx the parse tree
     */
    enterExpr?: (ctx: ExprContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.expr`.
     * @param ctx the parse tree
     */
    exitExpr?: (ctx: ExprContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.atom`.
     * @param ctx the parse tree
     */
    enterAtom?: (ctx: AtomContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.atom`.
     * @param ctx the parse tree
     */
    exitAtom?: (ctx: AtomContext) => void;
    /**
     * Enter a parse tree produced by `RDDLParser.exprList`.
     * @param ctx the parse tree
     */
    enterExprList?: (ctx: ExprListContext) => void;
    /**
     * Exit a parse tree produced by `RDDLParser.exprList`.
     * @param ctx the parse tree
     */
    exitExprList?: (ctx: ExprListContext) => void;

    visitTerminal(node: TerminalNode): void {}
    visitErrorNode(node: ErrorNode): void {}
    enterEveryRule(node: ParserRuleContext): void {}
    exitEveryRule(node: ParserRuleContext): void {}
}

