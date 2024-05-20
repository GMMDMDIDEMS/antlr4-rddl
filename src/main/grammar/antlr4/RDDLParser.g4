// $antlr-format alignTrailingComments true, columnLimit 150, minEmptyLines 1, maxEmptyLinesToKeep 1, reflowComments false, useTab false
// $antlr-format allowShortRulesOnASingleLine false, allowShortBlocksOnASingleLine true, alignSemicolons hanging, alignColons hanging

// + = one or more
// * = zero or more
// ? = zero or none

// RDDLParser.g4
parser grammar RDDLParser;

options {
    tokenVocab = RDDLLexer;
}

domainBlock
    : DOMAIN ID LCURLY requirementsBlock? typesBlock pvariablesBlock cpfs REWARD STATE_INVARIANTS? ACTION_PRECONDITIONS? TERMINATION? RCURLY
    ;

requirementsBlock
    : REQUIREMENTS LCURLY requirementList (COMMA requirementList)* RCURLY SEMI
    ;

requirementList
    : CONCURRENT
    | CONSTRAINED_STATE
    | CONTINUOUS
    | CPF_DETERMINISTIC
    | INTEGER_VALUED
    | INTERMEDIATE_NODES
    | MULTIVALUED
    | PARTIALLY_OBSERVED
    | REWARD_DETERMINISTIC
    ;

typesBlock
    : TYPES LCURLY typeList+ RCURLY SEMI
    ;

typeList
    : ID COLON OBJECT SEMI
    | ID COLON LCURLY ENUM_VALUE (COMMA ENUM_VALUE)* RCURLY SEMI
    ;

pvariablesBlock
    : PVARIABLES LCURLY pvariable* RCURLY SEMI
    ;

pvariable
    : ID params? COLON LCURLY typefluentList RCURLY SEMI
    ;

params
    : LPAREN ID (COMMA ID)* RPAREN
    ;

typefluentList
    : defaultFluent COMMA typeValue COMMA DEFAULT ASSIGN_EQUAL value
    | levelFluent COMMA typeValue COMMA LEVEL ASSIGN_EQUAL value
    | shortFluent COMMA typeValue
    ;

defaultFluent
    : NON_FLUENT
    | STATE_FLUENT
    | ACTION_FLUENT
    ;

levelFluent
    : INTERMEDIATE_FLUENT
    | DERIVED_FLUENT
    ;

shortFluent
    : INTERMEDIATE_FLUENT
    | DERIVED_FLUENT
    | OBSERVATION_FLUENT
    ;

typeValue
    : BOOL
    | INT
    | REAL
    | ID
    ;

value
    : TRUE
    | FALSE
    | INTEGER
    | DOUBLE
    | ENUM_VALUE
    | ID
    ;

cpfs
    : CPFS LCURLY cpfContent RCURLY SEMI
    ;

cpfContent
    : pvarExpr ASSIGN_EQUAL expr SEMI
    ;

pvarExpr
    : ID LPAREN termList RPAREN
    | ID
    | ENUM_VALUE
    | VARIABLE
    ;

termList
    : term (COMMA term)*
    ;

term
    : VARIABLE
    | ENUM_VALUE
    | pvarExpr
    ;

expr
    : expr (TIMES | DIV) expr
    | expr (PLUS | MINUS) expr
    | expr (GREATER | GREATEREQ | LESS | LESSEQ) expr
    | expr (COMP_EQUAL | NEQ) expr
    | expr (AND | AMPERSAND) expr
    | expr (OR) expr
    | NOT expr
    | MINUS expr
    | LPAREN expr RPAREN
    | atom
    ;

atom
    : INTEGER
    | DOUBLE
    | TRUE
    | FALSE
    | ID
    | ID LPAREN exprList RPAREN
    | ID LBRACK expr (COMMA expr)* RBRACK
    ;

exprList
    : expr (COMMA expr)*
    ;