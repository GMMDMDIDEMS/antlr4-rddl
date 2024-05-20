// Generated from src/main/grammar/antlr4/RDDLParser.g4 by ANTLR 4.13.1

import * as antlr from "antlr4ng";
import { Token } from "antlr4ng";

import { RDDLParserListener } from "./RDDLParserListener.js";
import { RDDLParserVisitor } from "./RDDLParserVisitor.js";

// for running tests with parameters, TODO: discuss strategy for typed parameters in CI
// eslint-disable-next-line no-unused-vars
type int = number;


export class RDDLParser extends antlr.Parser {
    public static readonly ALPHA = 1;
    public static readonly DIGIT = 2;
    public static readonly INTEGER = 3;
    public static readonly DOUBLE = 4;
    public static readonly ID = 5;
    public static readonly VARIABLE = 6;
    public static readonly ENUM_VALUE = 7;
    public static readonly DOMAIN = 8;
    public static readonly REQUIREMENTS = 9;
    public static readonly TYPES = 10;
    public static readonly PVARIABLES = 11;
    public static readonly CPFS = 12;
    public static readonly REWARD = 13;
    public static readonly STATE_INVARIANTS = 14;
    public static readonly ACTION_PRECONDITIONS = 15;
    public static readonly TERMINATION = 16;
    public static readonly INSTANCE = 17;
    public static readonly NON_FLUENTS = 18;
    public static readonly OBJECTS = 19;
    public static readonly INIT_STATE = 20;
    public static readonly MAX_NONDEF_ACTIONS = 21;
    public static readonly HORIZON = 22;
    public static readonly DISCOUNT = 23;
    public static readonly STATE_ACTION_CONSTRAINTS = 24;
    public static readonly CONCURRENT = 25;
    public static readonly CONSTRAINED_STATE = 26;
    public static readonly CONTINUOUS = 27;
    public static readonly CPF_DETERMINISTIC = 28;
    public static readonly INTEGER_VALUED = 29;
    public static readonly INTERMEDIATE_NODES = 30;
    public static readonly MULTIVALUED = 31;
    public static readonly PARTIALLY_OBSERVED = 32;
    public static readonly REWARD_DETERMINISTIC = 33;
    public static readonly NON_FLUENT = 34;
    public static readonly STATE_FLUENT = 35;
    public static readonly INTERMEDIATE_FLUENT = 36;
    public static readonly DERIVED_FLUENT = 37;
    public static readonly OBSERVATION_FLUENT = 38;
    public static readonly ACTION_FLUENT = 39;
    public static readonly BOOL = 40;
    public static readonly INT = 41;
    public static readonly REAL = 42;
    public static readonly OBJECT = 43;
    public static readonly DIV = 44;
    public static readonly MOD = 45;
    public static readonly FMOD = 46;
    public static readonly MIN = 47;
    public static readonly MAX = 48;
    public static readonly ABS = 49;
    public static readonly SGN = 50;
    public static readonly ROUND = 51;
    public static readonly FLOOR = 52;
    public static readonly CEIL = 53;
    public static readonly LOG = 54;
    public static readonly LN = 55;
    public static readonly EXP = 56;
    public static readonly POW = 57;
    public static readonly SQRT = 58;
    public static readonly HYPOT = 59;
    public static readonly GAMMA = 60;
    public static readonly LNGAMMA = 61;
    public static readonly COS = 62;
    public static readonly SIN = 63;
    public static readonly TAN = 64;
    public static readonly ACOS = 65;
    public static readonly ASIN = 66;
    public static readonly ATAN = 67;
    public static readonly COSH = 68;
    public static readonly SINH = 69;
    public static readonly TANH = 70;
    public static readonly IF = 71;
    public static readonly THEN = 72;
    public static readonly ELSE = 73;
    public static readonly SWITCH = 74;
    public static readonly CASE = 75;
    public static readonly DEFAULT = 76;
    public static readonly FORALL = 77;
    public static readonly EXISTS = 78;
    public static readonly SUM = 79;
    public static readonly PROD = 80;
    public static readonly AVG = 81;
    public static readonly MINIMUM = 82;
    public static readonly MAXIMUM = 83;
    public static readonly ARGMAX = 84;
    public static readonly ARGMIN = 85;
    public static readonly KRON_DELTA = 86;
    public static readonly BERNOULLI = 87;
    public static readonly DISCRETE = 88;
    public static readonly UNNORMDISCRETE = 89;
    public static readonly POISSON = 90;
    public static readonly BINOMIAL = 91;
    public static readonly NEGATIVEBINOMIAL = 92;
    public static readonly GEOMETRIC = 93;
    public static readonly DIRAC_DELTA = 94;
    public static readonly NORMAL = 95;
    public static readonly UNIFORM = 96;
    public static readonly EXPONENTIAL = 97;
    public static readonly WEIBULL = 98;
    public static readonly GAMMA_DIST = 99;
    public static readonly BETA = 100;
    public static readonly PARETO = 101;
    public static readonly STUDENT = 102;
    public static readonly GUMBEL = 103;
    public static readonly LAPLACE = 104;
    public static readonly CAUCHY = 105;
    public static readonly GOMPERTZ = 106;
    public static readonly CHISQUARE = 107;
    public static readonly KUMARASWAMY = 108;
    public static readonly DIRICHLET = 109;
    public static readonly MULTINOMIAL = 110;
    public static readonly MULTIVARIATENORMAL = 111;
    public static readonly MULTIVARIATESTUDENT = 112;
    public static readonly ROW = 113;
    public static readonly COLUMN = 114;
    public static readonly DET = 115;
    public static readonly INVERSE = 116;
    public static readonly PSEUDOINVERSE = 117;
    public static readonly CHOLESKY = 118;
    public static readonly AND = 119;
    public static readonly OR = 120;
    public static readonly NOT = 121;
    public static readonly PLUS = 122;
    public static readonly TIMES = 123;
    public static readonly LPAREN = 124;
    public static readonly RPAREN = 125;
    public static readonly LCURLY = 126;
    public static readonly RCURLY = 127;
    public static readonly DOT = 128;
    public static readonly COMMA = 129;
    public static readonly UNDERSCORE = 130;
    public static readonly LBRACK = 131;
    public static readonly RBRACK = 132;
    public static readonly IMPLY = 133;
    public static readonly EQUIV = 134;
    public static readonly NEQ = 135;
    public static readonly LESSEQ = 136;
    public static readonly LESS = 137;
    public static readonly GREATEREQ = 138;
    public static readonly GREATER = 139;
    public static readonly ASSIGN_EQUAL = 140;
    public static readonly COMP_EQUAL = 141;
    public static readonly DIV_OP = 142;
    public static readonly MINUS = 143;
    public static readonly COLON = 144;
    public static readonly SEMI = 145;
    public static readonly DOLLAR_SIGN = 146;
    public static readonly QUESTION = 147;
    public static readonly AMPERSAND = 148;
    public static readonly NEG_INF = 149;
    public static readonly POS_INF = 150;
    public static readonly LEVEL = 151;
    public static readonly TRUE = 152;
    public static readonly FALSE = 153;
    public static readonly OTHERWISE = 154;
    public static readonly TERMINATE_WHEN = 155;
    public static readonly TERMINAL = 156;
    public static readonly CDFS = 157;
    public static readonly WS = 158;
    public static readonly RULE_domainBlock = 0;
    public static readonly RULE_requirementsBlock = 1;
    public static readonly RULE_requirementList = 2;
    public static readonly RULE_typesBlock = 3;
    public static readonly RULE_typeList = 4;
    public static readonly RULE_pvariablesBlock = 5;
    public static readonly RULE_pvariable = 6;
    public static readonly RULE_params = 7;
    public static readonly RULE_typefluentList = 8;
    public static readonly RULE_defaultFluent = 9;
    public static readonly RULE_levelFluent = 10;
    public static readonly RULE_shortFluent = 11;
    public static readonly RULE_typeValue = 12;
    public static readonly RULE_value = 13;
    public static readonly RULE_cpfs = 14;
    public static readonly RULE_cpfContent = 15;
    public static readonly RULE_pvarExpr = 16;
    public static readonly RULE_termList = 17;
    public static readonly RULE_term = 18;
    public static readonly RULE_expr = 19;
    public static readonly RULE_atom = 20;
    public static readonly RULE_exprList = 21;

    public static readonly literalNames = [
        null, null, null, null, null, null, null, null, "'domain'", "'requirements'", 
        "'types'", "'pvariables'", "'cpfs'", "'reward'", "'state-invariants'", 
        "'action-preconditions'", "'termination'", "'instance'", "'non-fluents'", 
        "'objects'", "'init-state'", "'max-nondef-actions'", "'horizon'", 
        "'discount'", "'state-action-constraints'", "'concurrent'", "'constrained-state'", 
        "'continuous'", "'cpf-deterministic'", "'integer-valued'", "'intermediate-nodes'", 
        "'multivalued'", "'partially-observed'", "'reward-deterministic'", 
        "'non-fluent'", "'state-fluent'", "'interm-fluent'", "'derived-fluent'", 
        "'observ-fluent'", "'action-fluent'", "'bool'", "'int'", "'real'", 
        "'object'", "'div'", "'mod'", "'fmod'", "'min'", "'max'", "'abs'", 
        "'sgn'", "'round'", "'floor'", "'ceil'", "'log'", "'ln'", "'exp'", 
        "'pow'", "'sqrt'", "'hypot'", "'gamma'", "'lngamma'", "'cos'", "'sin'", 
        "'tan'", "'acos'", "'asin'", "'atan'", "'cosh'", "'sinh'", "'tanh'", 
        "'if'", "'then'", "'else'", "'switch'", "'case'", "'default'", "'forall_'", 
        "'exists_'", "'sum_'", "'prod_'", "'avg_'", "'minimum_'", "'maximum_'", 
        "'argmax_'", "'argmin_'", "'KronDelta'", "'Bernoulli'", "'Discrete'", 
        "'UnnormDiscrete'", "'Poisson'", "'Binomial'", "'NegativeBinomial'", 
        "'Geometric'", "'DiracDelta'", "'Normal'", "'Uniform'", "'Exponential'", 
        "'Weibull'", "'Gamma'", "'Beta'", "'Pareto'", "'Student'", "'Gumbel'", 
        "'Laplace'", "'Cauchy'", "'Gompertz'", "'ChiSquare'", "'Kumaraswamy'", 
        "'Dirichlet'", "'Multinomial'", "'MultivariateNormal'", "'MultivariateStudent'", 
        "'row'", "'col'", "'det'", "'inverse'", "'pinverse'", "'cholesky'", 
        "'^'", "'|'", "'~'", "'+'", "'*'", "'('", "')'", "'{'", "'}'", "'.'", 
        "','", "'_'", "'['", "']'", "'=>'", "'<=>'", "'~='", "'<='", "'<'", 
        "'>='", "'>'", "'='", "'=='", "'/'", "'-'", "':'", "';'", "'$'", 
        "'?'", "'&'", "'neg-inf'", "'pos-inf'", "'level'", "'true'", "'false'", 
        "'otherwise'", "'terminate-when'", "'terminal'", "'cdfs'"
    ];

    public static readonly symbolicNames = [
        null, "ALPHA", "DIGIT", "INTEGER", "DOUBLE", "ID", "VARIABLE", "ENUM_VALUE", 
        "DOMAIN", "REQUIREMENTS", "TYPES", "PVARIABLES", "CPFS", "REWARD", 
        "STATE_INVARIANTS", "ACTION_PRECONDITIONS", "TERMINATION", "INSTANCE", 
        "NON_FLUENTS", "OBJECTS", "INIT_STATE", "MAX_NONDEF_ACTIONS", "HORIZON", 
        "DISCOUNT", "STATE_ACTION_CONSTRAINTS", "CONCURRENT", "CONSTRAINED_STATE", 
        "CONTINUOUS", "CPF_DETERMINISTIC", "INTEGER_VALUED", "INTERMEDIATE_NODES", 
        "MULTIVALUED", "PARTIALLY_OBSERVED", "REWARD_DETERMINISTIC", "NON_FLUENT", 
        "STATE_FLUENT", "INTERMEDIATE_FLUENT", "DERIVED_FLUENT", "OBSERVATION_FLUENT", 
        "ACTION_FLUENT", "BOOL", "INT", "REAL", "OBJECT", "DIV", "MOD", 
        "FMOD", "MIN", "MAX", "ABS", "SGN", "ROUND", "FLOOR", "CEIL", "LOG", 
        "LN", "EXP", "POW", "SQRT", "HYPOT", "GAMMA", "LNGAMMA", "COS", 
        "SIN", "TAN", "ACOS", "ASIN", "ATAN", "COSH", "SINH", "TANH", "IF", 
        "THEN", "ELSE", "SWITCH", "CASE", "DEFAULT", "FORALL", "EXISTS", 
        "SUM", "PROD", "AVG", "MINIMUM", "MAXIMUM", "ARGMAX", "ARGMIN", 
        "KRON_DELTA", "BERNOULLI", "DISCRETE", "UNNORMDISCRETE", "POISSON", 
        "BINOMIAL", "NEGATIVEBINOMIAL", "GEOMETRIC", "DIRAC_DELTA", "NORMAL", 
        "UNIFORM", "EXPONENTIAL", "WEIBULL", "GAMMA_DIST", "BETA", "PARETO", 
        "STUDENT", "GUMBEL", "LAPLACE", "CAUCHY", "GOMPERTZ", "CHISQUARE", 
        "KUMARASWAMY", "DIRICHLET", "MULTINOMIAL", "MULTIVARIATENORMAL", 
        "MULTIVARIATESTUDENT", "ROW", "COLUMN", "DET", "INVERSE", "PSEUDOINVERSE", 
        "CHOLESKY", "AND", "OR", "NOT", "PLUS", "TIMES", "LPAREN", "RPAREN", 
        "LCURLY", "RCURLY", "DOT", "COMMA", "UNDERSCORE", "LBRACK", "RBRACK", 
        "IMPLY", "EQUIV", "NEQ", "LESSEQ", "LESS", "GREATEREQ", "GREATER", 
        "ASSIGN_EQUAL", "COMP_EQUAL", "DIV_OP", "MINUS", "COLON", "SEMI", 
        "DOLLAR_SIGN", "QUESTION", "AMPERSAND", "NEG_INF", "POS_INF", "LEVEL", 
        "TRUE", "FALSE", "OTHERWISE", "TERMINATE_WHEN", "TERMINAL", "CDFS", 
        "WS"
    ];
    public static readonly ruleNames = [
        "domainBlock", "requirementsBlock", "requirementList", "typesBlock", 
        "typeList", "pvariablesBlock", "pvariable", "params", "typefluentList", 
        "defaultFluent", "levelFluent", "shortFluent", "typeValue", "value", 
        "cpfs", "cpfContent", "pvarExpr", "termList", "term", "expr", "atom", 
        "exprList",
    ];

    public get grammarFileName(): string { return "RDDLParser.g4"; }
    public get literalNames(): (string | null)[] { return RDDLParser.literalNames; }
    public get symbolicNames(): (string | null)[] { return RDDLParser.symbolicNames; }
    public get ruleNames(): string[] { return RDDLParser.ruleNames; }
    public get serializedATN(): number[] { return RDDLParser._serializedATN; }

    protected createFailedPredicateException(predicate?: string, message?: string): antlr.FailedPredicateException {
        return new antlr.FailedPredicateException(this, predicate, message);
    }

    public constructor(input: antlr.TokenStream) {
        super(input);
        this.interpreter = new antlr.ParserATNSimulator(this, RDDLParser._ATN, RDDLParser.decisionsToDFA, new antlr.PredictionContextCache());
    }
    public domainBlock(): DomainBlockContext {
        let localContext = new DomainBlockContext(this.context, this.state);
        this.enterRule(localContext, 0, RDDLParser.RULE_domainBlock);
        let _la: number;
        try {
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 44;
            this.match(RDDLParser.DOMAIN);
            this.state = 45;
            this.match(RDDLParser.ID);
            this.state = 46;
            this.match(RDDLParser.LCURLY);
            this.state = 48;
            this.errorHandler.sync(this);
            _la = this.tokenStream.LA(1);
            if (_la === 9) {
                {
                this.state = 47;
                this.requirementsBlock();
                }
            }

            this.state = 50;
            this.typesBlock();
            this.state = 51;
            this.pvariablesBlock();
            this.state = 52;
            this.cpfs();
            this.state = 53;
            this.match(RDDLParser.REWARD);
            this.state = 55;
            this.errorHandler.sync(this);
            _la = this.tokenStream.LA(1);
            if (_la === 14) {
                {
                this.state = 54;
                this.match(RDDLParser.STATE_INVARIANTS);
                }
            }

            this.state = 58;
            this.errorHandler.sync(this);
            _la = this.tokenStream.LA(1);
            if (_la === 15) {
                {
                this.state = 57;
                this.match(RDDLParser.ACTION_PRECONDITIONS);
                }
            }

            this.state = 61;
            this.errorHandler.sync(this);
            _la = this.tokenStream.LA(1);
            if (_la === 16) {
                {
                this.state = 60;
                this.match(RDDLParser.TERMINATION);
                }
            }

            this.state = 63;
            this.match(RDDLParser.RCURLY);
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public requirementsBlock(): RequirementsBlockContext {
        let localContext = new RequirementsBlockContext(this.context, this.state);
        this.enterRule(localContext, 2, RDDLParser.RULE_requirementsBlock);
        let _la: number;
        try {
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 65;
            this.match(RDDLParser.REQUIREMENTS);
            this.state = 66;
            this.match(RDDLParser.LCURLY);
            this.state = 67;
            this.requirementList();
            this.state = 72;
            this.errorHandler.sync(this);
            _la = this.tokenStream.LA(1);
            while (_la === 129) {
                {
                {
                this.state = 68;
                this.match(RDDLParser.COMMA);
                this.state = 69;
                this.requirementList();
                }
                }
                this.state = 74;
                this.errorHandler.sync(this);
                _la = this.tokenStream.LA(1);
            }
            this.state = 75;
            this.match(RDDLParser.RCURLY);
            this.state = 76;
            this.match(RDDLParser.SEMI);
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public requirementList(): RequirementListContext {
        let localContext = new RequirementListContext(this.context, this.state);
        this.enterRule(localContext, 4, RDDLParser.RULE_requirementList);
        let _la: number;
        try {
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 78;
            _la = this.tokenStream.LA(1);
            if(!(((((_la - 25)) & ~0x1F) === 0 && ((1 << (_la - 25)) & 511) !== 0))) {
            this.errorHandler.recoverInline(this);
            }
            else {
                this.errorHandler.reportMatch(this);
                this.consume();
            }
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public typesBlock(): TypesBlockContext {
        let localContext = new TypesBlockContext(this.context, this.state);
        this.enterRule(localContext, 6, RDDLParser.RULE_typesBlock);
        let _la: number;
        try {
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 80;
            this.match(RDDLParser.TYPES);
            this.state = 81;
            this.match(RDDLParser.LCURLY);
            this.state = 83;
            this.errorHandler.sync(this);
            _la = this.tokenStream.LA(1);
            do {
                {
                {
                this.state = 82;
                this.typeList();
                }
                }
                this.state = 85;
                this.errorHandler.sync(this);
                _la = this.tokenStream.LA(1);
            } while (_la === 5);
            this.state = 87;
            this.match(RDDLParser.RCURLY);
            this.state = 88;
            this.match(RDDLParser.SEMI);
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public typeList(): TypeListContext {
        let localContext = new TypeListContext(this.context, this.state);
        this.enterRule(localContext, 8, RDDLParser.RULE_typeList);
        let _la: number;
        try {
            this.state = 107;
            this.errorHandler.sync(this);
            switch (this.interpreter.adaptivePredict(this.tokenStream, 7, this.context) ) {
            case 1:
                this.enterOuterAlt(localContext, 1);
                {
                this.state = 90;
                this.match(RDDLParser.ID);
                this.state = 91;
                this.match(RDDLParser.COLON);
                this.state = 92;
                this.match(RDDLParser.OBJECT);
                this.state = 93;
                this.match(RDDLParser.SEMI);
                }
                break;
            case 2:
                this.enterOuterAlt(localContext, 2);
                {
                this.state = 94;
                this.match(RDDLParser.ID);
                this.state = 95;
                this.match(RDDLParser.COLON);
                this.state = 96;
                this.match(RDDLParser.LCURLY);
                this.state = 97;
                this.match(RDDLParser.ENUM_VALUE);
                this.state = 102;
                this.errorHandler.sync(this);
                _la = this.tokenStream.LA(1);
                while (_la === 129) {
                    {
                    {
                    this.state = 98;
                    this.match(RDDLParser.COMMA);
                    this.state = 99;
                    this.match(RDDLParser.ENUM_VALUE);
                    }
                    }
                    this.state = 104;
                    this.errorHandler.sync(this);
                    _la = this.tokenStream.LA(1);
                }
                this.state = 105;
                this.match(RDDLParser.RCURLY);
                this.state = 106;
                this.match(RDDLParser.SEMI);
                }
                break;
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public pvariablesBlock(): PvariablesBlockContext {
        let localContext = new PvariablesBlockContext(this.context, this.state);
        this.enterRule(localContext, 10, RDDLParser.RULE_pvariablesBlock);
        let _la: number;
        try {
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 109;
            this.match(RDDLParser.PVARIABLES);
            this.state = 110;
            this.match(RDDLParser.LCURLY);
            this.state = 114;
            this.errorHandler.sync(this);
            _la = this.tokenStream.LA(1);
            while (_la === 5) {
                {
                {
                this.state = 111;
                this.pvariable();
                }
                }
                this.state = 116;
                this.errorHandler.sync(this);
                _la = this.tokenStream.LA(1);
            }
            this.state = 117;
            this.match(RDDLParser.RCURLY);
            this.state = 118;
            this.match(RDDLParser.SEMI);
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public pvariable(): PvariableContext {
        let localContext = new PvariableContext(this.context, this.state);
        this.enterRule(localContext, 12, RDDLParser.RULE_pvariable);
        let _la: number;
        try {
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 120;
            this.match(RDDLParser.ID);
            this.state = 122;
            this.errorHandler.sync(this);
            _la = this.tokenStream.LA(1);
            if (_la === 124) {
                {
                this.state = 121;
                this.params();
                }
            }

            this.state = 124;
            this.match(RDDLParser.COLON);
            this.state = 125;
            this.match(RDDLParser.LCURLY);
            this.state = 126;
            this.typefluentList();
            this.state = 127;
            this.match(RDDLParser.RCURLY);
            this.state = 128;
            this.match(RDDLParser.SEMI);
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public params(): ParamsContext {
        let localContext = new ParamsContext(this.context, this.state);
        this.enterRule(localContext, 14, RDDLParser.RULE_params);
        let _la: number;
        try {
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 130;
            this.match(RDDLParser.LPAREN);
            this.state = 131;
            this.match(RDDLParser.ID);
            this.state = 136;
            this.errorHandler.sync(this);
            _la = this.tokenStream.LA(1);
            while (_la === 129) {
                {
                {
                this.state = 132;
                this.match(RDDLParser.COMMA);
                this.state = 133;
                this.match(RDDLParser.ID);
                }
                }
                this.state = 138;
                this.errorHandler.sync(this);
                _la = this.tokenStream.LA(1);
            }
            this.state = 139;
            this.match(RDDLParser.RPAREN);
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public typefluentList(): TypefluentListContext {
        let localContext = new TypefluentListContext(this.context, this.state);
        this.enterRule(localContext, 16, RDDLParser.RULE_typefluentList);
        try {
            this.state = 161;
            this.errorHandler.sync(this);
            switch (this.interpreter.adaptivePredict(this.tokenStream, 11, this.context) ) {
            case 1:
                this.enterOuterAlt(localContext, 1);
                {
                this.state = 141;
                this.defaultFluent();
                this.state = 142;
                this.match(RDDLParser.COMMA);
                this.state = 143;
                this.typeValue();
                this.state = 144;
                this.match(RDDLParser.COMMA);
                this.state = 145;
                this.match(RDDLParser.DEFAULT);
                this.state = 146;
                this.match(RDDLParser.ASSIGN_EQUAL);
                this.state = 147;
                this.value();
                }
                break;
            case 2:
                this.enterOuterAlt(localContext, 2);
                {
                this.state = 149;
                this.levelFluent();
                this.state = 150;
                this.match(RDDLParser.COMMA);
                this.state = 151;
                this.typeValue();
                this.state = 152;
                this.match(RDDLParser.COMMA);
                this.state = 153;
                this.match(RDDLParser.LEVEL);
                this.state = 154;
                this.match(RDDLParser.ASSIGN_EQUAL);
                this.state = 155;
                this.value();
                }
                break;
            case 3:
                this.enterOuterAlt(localContext, 3);
                {
                this.state = 157;
                this.shortFluent();
                this.state = 158;
                this.match(RDDLParser.COMMA);
                this.state = 159;
                this.typeValue();
                }
                break;
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public defaultFluent(): DefaultFluentContext {
        let localContext = new DefaultFluentContext(this.context, this.state);
        this.enterRule(localContext, 18, RDDLParser.RULE_defaultFluent);
        let _la: number;
        try {
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 163;
            _la = this.tokenStream.LA(1);
            if(!(((((_la - 34)) & ~0x1F) === 0 && ((1 << (_la - 34)) & 35) !== 0))) {
            this.errorHandler.recoverInline(this);
            }
            else {
                this.errorHandler.reportMatch(this);
                this.consume();
            }
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public levelFluent(): LevelFluentContext {
        let localContext = new LevelFluentContext(this.context, this.state);
        this.enterRule(localContext, 20, RDDLParser.RULE_levelFluent);
        let _la: number;
        try {
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 165;
            _la = this.tokenStream.LA(1);
            if(!(_la === 36 || _la === 37)) {
            this.errorHandler.recoverInline(this);
            }
            else {
                this.errorHandler.reportMatch(this);
                this.consume();
            }
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public shortFluent(): ShortFluentContext {
        let localContext = new ShortFluentContext(this.context, this.state);
        this.enterRule(localContext, 22, RDDLParser.RULE_shortFluent);
        let _la: number;
        try {
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 167;
            _la = this.tokenStream.LA(1);
            if(!(((((_la - 36)) & ~0x1F) === 0 && ((1 << (_la - 36)) & 7) !== 0))) {
            this.errorHandler.recoverInline(this);
            }
            else {
                this.errorHandler.reportMatch(this);
                this.consume();
            }
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public typeValue(): TypeValueContext {
        let localContext = new TypeValueContext(this.context, this.state);
        this.enterRule(localContext, 24, RDDLParser.RULE_typeValue);
        let _la: number;
        try {
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 169;
            _la = this.tokenStream.LA(1);
            if(!(_la === 5 || ((((_la - 40)) & ~0x1F) === 0 && ((1 << (_la - 40)) & 7) !== 0))) {
            this.errorHandler.recoverInline(this);
            }
            else {
                this.errorHandler.reportMatch(this);
                this.consume();
            }
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public value(): ValueContext {
        let localContext = new ValueContext(this.context, this.state);
        this.enterRule(localContext, 26, RDDLParser.RULE_value);
        let _la: number;
        try {
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 171;
            _la = this.tokenStream.LA(1);
            if(!((((_la) & ~0x1F) === 0 && ((1 << _la) & 184) !== 0) || _la === 152 || _la === 153)) {
            this.errorHandler.recoverInline(this);
            }
            else {
                this.errorHandler.reportMatch(this);
                this.consume();
            }
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public cpfs(): CpfsContext {
        let localContext = new CpfsContext(this.context, this.state);
        this.enterRule(localContext, 28, RDDLParser.RULE_cpfs);
        try {
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 173;
            this.match(RDDLParser.CPFS);
            this.state = 174;
            this.match(RDDLParser.LCURLY);
            this.state = 175;
            this.cpfContent();
            this.state = 176;
            this.match(RDDLParser.RCURLY);
            this.state = 177;
            this.match(RDDLParser.SEMI);
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public cpfContent(): CpfContentContext {
        let localContext = new CpfContentContext(this.context, this.state);
        this.enterRule(localContext, 30, RDDLParser.RULE_cpfContent);
        try {
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 179;
            this.pvarExpr();
            this.state = 180;
            this.match(RDDLParser.ASSIGN_EQUAL);
            this.state = 181;
            this.expr(0);
            this.state = 182;
            this.match(RDDLParser.SEMI);
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public pvarExpr(): PvarExprContext {
        let localContext = new PvarExprContext(this.context, this.state);
        this.enterRule(localContext, 32, RDDLParser.RULE_pvarExpr);
        try {
            this.state = 192;
            this.errorHandler.sync(this);
            switch (this.interpreter.adaptivePredict(this.tokenStream, 12, this.context) ) {
            case 1:
                this.enterOuterAlt(localContext, 1);
                {
                this.state = 184;
                this.match(RDDLParser.ID);
                this.state = 185;
                this.match(RDDLParser.LPAREN);
                this.state = 186;
                this.termList();
                this.state = 187;
                this.match(RDDLParser.RPAREN);
                }
                break;
            case 2:
                this.enterOuterAlt(localContext, 2);
                {
                this.state = 189;
                this.match(RDDLParser.ID);
                }
                break;
            case 3:
                this.enterOuterAlt(localContext, 3);
                {
                this.state = 190;
                this.match(RDDLParser.ENUM_VALUE);
                }
                break;
            case 4:
                this.enterOuterAlt(localContext, 4);
                {
                this.state = 191;
                this.match(RDDLParser.VARIABLE);
                }
                break;
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public termList(): TermListContext {
        let localContext = new TermListContext(this.context, this.state);
        this.enterRule(localContext, 34, RDDLParser.RULE_termList);
        let _la: number;
        try {
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 194;
            this.term();
            this.state = 199;
            this.errorHandler.sync(this);
            _la = this.tokenStream.LA(1);
            while (_la === 129) {
                {
                {
                this.state = 195;
                this.match(RDDLParser.COMMA);
                this.state = 196;
                this.term();
                }
                }
                this.state = 201;
                this.errorHandler.sync(this);
                _la = this.tokenStream.LA(1);
            }
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public term(): TermContext {
        let localContext = new TermContext(this.context, this.state);
        this.enterRule(localContext, 36, RDDLParser.RULE_term);
        try {
            this.state = 205;
            this.errorHandler.sync(this);
            switch (this.interpreter.adaptivePredict(this.tokenStream, 14, this.context) ) {
            case 1:
                this.enterOuterAlt(localContext, 1);
                {
                this.state = 202;
                this.match(RDDLParser.VARIABLE);
                }
                break;
            case 2:
                this.enterOuterAlt(localContext, 2);
                {
                this.state = 203;
                this.match(RDDLParser.ENUM_VALUE);
                }
                break;
            case 3:
                this.enterOuterAlt(localContext, 3);
                {
                this.state = 204;
                this.pvarExpr();
                }
                break;
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }

    public expr(): ExprContext;
    public expr(_p: number): ExprContext;
    public expr(_p?: number): ExprContext {
        if (_p === undefined) {
            _p = 0;
        }

        let parentContext = this.context;
        let parentState = this.state;
        let localContext = new ExprContext(this.context, parentState);
        let previousContext = localContext;
        let _startState = 38;
        this.enterRecursionRule(localContext, 38, RDDLParser.RULE_expr, _p);
        let _la: number;
        try {
            let alternative: number;
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 217;
            this.errorHandler.sync(this);
            switch (this.tokenStream.LA(1)) {
            case RDDLParser.NOT:
                {
                this.state = 208;
                this.match(RDDLParser.NOT);
                this.state = 209;
                this.expr(4);
                }
                break;
            case RDDLParser.MINUS:
                {
                this.state = 210;
                this.match(RDDLParser.MINUS);
                this.state = 211;
                this.expr(3);
                }
                break;
            case RDDLParser.LPAREN:
                {
                this.state = 212;
                this.match(RDDLParser.LPAREN);
                this.state = 213;
                this.expr(0);
                this.state = 214;
                this.match(RDDLParser.RPAREN);
                }
                break;
            case RDDLParser.INTEGER:
            case RDDLParser.DOUBLE:
            case RDDLParser.ID:
            case RDDLParser.TRUE:
            case RDDLParser.FALSE:
                {
                this.state = 216;
                this.atom();
                }
                break;
            default:
                throw new antlr.NoViableAltException(this);
            }
            this.context!.stop = this.tokenStream.LT(-1);
            this.state = 239;
            this.errorHandler.sync(this);
            alternative = this.interpreter.adaptivePredict(this.tokenStream, 17, this.context);
            while (alternative !== 2 && alternative !== antlr.ATN.INVALID_ALT_NUMBER) {
                if (alternative === 1) {
                    if (this.parseListeners != null) {
                        this.triggerExitRuleEvent();
                    }
                    previousContext = localContext;
                    {
                    this.state = 237;
                    this.errorHandler.sync(this);
                    switch (this.interpreter.adaptivePredict(this.tokenStream, 16, this.context) ) {
                    case 1:
                        {
                        localContext = new ExprContext(parentContext, parentState);
                        this.pushNewRecursionContext(localContext, _startState, RDDLParser.RULE_expr);
                        this.state = 219;
                        if (!(this.precpred(this.context, 10))) {
                            throw this.createFailedPredicateException("this.precpred(this.context, 10)");
                        }
                        this.state = 220;
                        _la = this.tokenStream.LA(1);
                        if(!(_la === 44 || _la === 123)) {
                        this.errorHandler.recoverInline(this);
                        }
                        else {
                            this.errorHandler.reportMatch(this);
                            this.consume();
                        }
                        this.state = 221;
                        this.expr(11);
                        }
                        break;
                    case 2:
                        {
                        localContext = new ExprContext(parentContext, parentState);
                        this.pushNewRecursionContext(localContext, _startState, RDDLParser.RULE_expr);
                        this.state = 222;
                        if (!(this.precpred(this.context, 9))) {
                            throw this.createFailedPredicateException("this.precpred(this.context, 9)");
                        }
                        this.state = 223;
                        _la = this.tokenStream.LA(1);
                        if(!(_la === 122 || _la === 143)) {
                        this.errorHandler.recoverInline(this);
                        }
                        else {
                            this.errorHandler.reportMatch(this);
                            this.consume();
                        }
                        this.state = 224;
                        this.expr(10);
                        }
                        break;
                    case 3:
                        {
                        localContext = new ExprContext(parentContext, parentState);
                        this.pushNewRecursionContext(localContext, _startState, RDDLParser.RULE_expr);
                        this.state = 225;
                        if (!(this.precpred(this.context, 8))) {
                            throw this.createFailedPredicateException("this.precpred(this.context, 8)");
                        }
                        this.state = 226;
                        _la = this.tokenStream.LA(1);
                        if(!(((((_la - 136)) & ~0x1F) === 0 && ((1 << (_la - 136)) & 15) !== 0))) {
                        this.errorHandler.recoverInline(this);
                        }
                        else {
                            this.errorHandler.reportMatch(this);
                            this.consume();
                        }
                        this.state = 227;
                        this.expr(9);
                        }
                        break;
                    case 4:
                        {
                        localContext = new ExprContext(parentContext, parentState);
                        this.pushNewRecursionContext(localContext, _startState, RDDLParser.RULE_expr);
                        this.state = 228;
                        if (!(this.precpred(this.context, 7))) {
                            throw this.createFailedPredicateException("this.precpred(this.context, 7)");
                        }
                        this.state = 229;
                        _la = this.tokenStream.LA(1);
                        if(!(_la === 135 || _la === 141)) {
                        this.errorHandler.recoverInline(this);
                        }
                        else {
                            this.errorHandler.reportMatch(this);
                            this.consume();
                        }
                        this.state = 230;
                        this.expr(8);
                        }
                        break;
                    case 5:
                        {
                        localContext = new ExprContext(parentContext, parentState);
                        this.pushNewRecursionContext(localContext, _startState, RDDLParser.RULE_expr);
                        this.state = 231;
                        if (!(this.precpred(this.context, 6))) {
                            throw this.createFailedPredicateException("this.precpred(this.context, 6)");
                        }
                        this.state = 232;
                        _la = this.tokenStream.LA(1);
                        if(!(_la === 119 || _la === 148)) {
                        this.errorHandler.recoverInline(this);
                        }
                        else {
                            this.errorHandler.reportMatch(this);
                            this.consume();
                        }
                        this.state = 233;
                        this.expr(7);
                        }
                        break;
                    case 6:
                        {
                        localContext = new ExprContext(parentContext, parentState);
                        this.pushNewRecursionContext(localContext, _startState, RDDLParser.RULE_expr);
                        this.state = 234;
                        if (!(this.precpred(this.context, 5))) {
                            throw this.createFailedPredicateException("this.precpred(this.context, 5)");
                        }
                        {
                        this.state = 235;
                        this.match(RDDLParser.OR);
                        }
                        this.state = 236;
                        this.expr(6);
                        }
                        break;
                    }
                    }
                }
                this.state = 241;
                this.errorHandler.sync(this);
                alternative = this.interpreter.adaptivePredict(this.tokenStream, 17, this.context);
            }
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.unrollRecursionContexts(parentContext);
        }
        return localContext;
    }
    public atom(): AtomContext {
        let localContext = new AtomContext(this.context, this.state);
        this.enterRule(localContext, 40, RDDLParser.RULE_atom);
        let _la: number;
        try {
            this.state = 264;
            this.errorHandler.sync(this);
            switch (this.interpreter.adaptivePredict(this.tokenStream, 19, this.context) ) {
            case 1:
                this.enterOuterAlt(localContext, 1);
                {
                this.state = 242;
                this.match(RDDLParser.INTEGER);
                }
                break;
            case 2:
                this.enterOuterAlt(localContext, 2);
                {
                this.state = 243;
                this.match(RDDLParser.DOUBLE);
                }
                break;
            case 3:
                this.enterOuterAlt(localContext, 3);
                {
                this.state = 244;
                this.match(RDDLParser.TRUE);
                }
                break;
            case 4:
                this.enterOuterAlt(localContext, 4);
                {
                this.state = 245;
                this.match(RDDLParser.FALSE);
                }
                break;
            case 5:
                this.enterOuterAlt(localContext, 5);
                {
                this.state = 246;
                this.match(RDDLParser.ID);
                }
                break;
            case 6:
                this.enterOuterAlt(localContext, 6);
                {
                this.state = 247;
                this.match(RDDLParser.ID);
                this.state = 248;
                this.match(RDDLParser.LPAREN);
                this.state = 249;
                this.exprList();
                this.state = 250;
                this.match(RDDLParser.RPAREN);
                }
                break;
            case 7:
                this.enterOuterAlt(localContext, 7);
                {
                this.state = 252;
                this.match(RDDLParser.ID);
                this.state = 253;
                this.match(RDDLParser.LBRACK);
                this.state = 254;
                this.expr(0);
                this.state = 259;
                this.errorHandler.sync(this);
                _la = this.tokenStream.LA(1);
                while (_la === 129) {
                    {
                    {
                    this.state = 255;
                    this.match(RDDLParser.COMMA);
                    this.state = 256;
                    this.expr(0);
                    }
                    }
                    this.state = 261;
                    this.errorHandler.sync(this);
                    _la = this.tokenStream.LA(1);
                }
                this.state = 262;
                this.match(RDDLParser.RBRACK);
                }
                break;
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }
    public exprList(): ExprListContext {
        let localContext = new ExprListContext(this.context, this.state);
        this.enterRule(localContext, 42, RDDLParser.RULE_exprList);
        let _la: number;
        try {
            this.enterOuterAlt(localContext, 1);
            {
            this.state = 266;
            this.expr(0);
            this.state = 271;
            this.errorHandler.sync(this);
            _la = this.tokenStream.LA(1);
            while (_la === 129) {
                {
                {
                this.state = 267;
                this.match(RDDLParser.COMMA);
                this.state = 268;
                this.expr(0);
                }
                }
                this.state = 273;
                this.errorHandler.sync(this);
                _la = this.tokenStream.LA(1);
            }
            }
        }
        catch (re) {
            if (re instanceof antlr.RecognitionException) {
                this.errorHandler.reportError(this, re);
                this.errorHandler.recover(this, re);
            } else {
                throw re;
            }
        }
        finally {
            this.exitRule();
        }
        return localContext;
    }

    public override sempred(localContext: antlr.ParserRuleContext | null, ruleIndex: number, predIndex: number): boolean {
        switch (ruleIndex) {
        case 19:
            return this.expr_sempred(localContext as ExprContext, predIndex);
        }
        return true;
    }
    private expr_sempred(localContext: ExprContext | null, predIndex: number): boolean {
        switch (predIndex) {
        case 0:
            return this.precpred(this.context, 10);
        case 1:
            return this.precpred(this.context, 9);
        case 2:
            return this.precpred(this.context, 8);
        case 3:
            return this.precpred(this.context, 7);
        case 4:
            return this.precpred(this.context, 6);
        case 5:
            return this.precpred(this.context, 5);
        }
        return true;
    }

    public static readonly _serializedATN: number[] = [
        4,1,158,275,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,
        7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,
        13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,
        20,7,20,2,21,7,21,1,0,1,0,1,0,1,0,3,0,49,8,0,1,0,1,0,1,0,1,0,1,0,
        3,0,56,8,0,1,0,3,0,59,8,0,1,0,3,0,62,8,0,1,0,1,0,1,1,1,1,1,1,1,1,
        1,1,5,1,71,8,1,10,1,12,1,74,9,1,1,1,1,1,1,1,1,2,1,2,1,3,1,3,1,3,
        4,3,84,8,3,11,3,12,3,85,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,
        1,4,1,4,1,4,5,4,101,8,4,10,4,12,4,104,9,4,1,4,1,4,3,4,108,8,4,1,
        5,1,5,1,5,5,5,113,8,5,10,5,12,5,116,9,5,1,5,1,5,1,5,1,6,1,6,3,6,
        123,8,6,1,6,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,5,7,135,8,7,10,7,
        12,7,138,9,7,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,
        1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,3,8,162,8,8,1,9,1,9,1,10,1,10,
        1,11,1,11,1,12,1,12,1,13,1,13,1,14,1,14,1,14,1,14,1,14,1,14,1,15,
        1,15,1,15,1,15,1,15,1,16,1,16,1,16,1,16,1,16,1,16,1,16,1,16,3,16,
        193,8,16,1,17,1,17,1,17,5,17,198,8,17,10,17,12,17,201,9,17,1,18,
        1,18,1,18,3,18,206,8,18,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,
        1,19,1,19,3,19,218,8,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,
        1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,5,19,238,8,19,
        10,19,12,19,241,9,19,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,
        1,20,1,20,1,20,1,20,1,20,1,20,5,20,258,8,20,10,20,12,20,261,9,20,
        1,20,1,20,3,20,265,8,20,1,21,1,21,1,21,5,21,270,8,21,10,21,12,21,
        273,9,21,1,21,0,1,38,22,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,
        30,32,34,36,38,40,42,0,11,1,0,25,33,2,0,34,35,39,39,1,0,36,37,1,
        0,36,38,2,0,5,5,40,42,3,0,3,5,7,7,152,153,2,0,44,44,123,123,2,0,
        122,122,143,143,1,0,136,139,2,0,135,135,141,141,2,0,119,119,148,
        148,288,0,44,1,0,0,0,2,65,1,0,0,0,4,78,1,0,0,0,6,80,1,0,0,0,8,107,
        1,0,0,0,10,109,1,0,0,0,12,120,1,0,0,0,14,130,1,0,0,0,16,161,1,0,
        0,0,18,163,1,0,0,0,20,165,1,0,0,0,22,167,1,0,0,0,24,169,1,0,0,0,
        26,171,1,0,0,0,28,173,1,0,0,0,30,179,1,0,0,0,32,192,1,0,0,0,34,194,
        1,0,0,0,36,205,1,0,0,0,38,217,1,0,0,0,40,264,1,0,0,0,42,266,1,0,
        0,0,44,45,5,8,0,0,45,46,5,5,0,0,46,48,5,126,0,0,47,49,3,2,1,0,48,
        47,1,0,0,0,48,49,1,0,0,0,49,50,1,0,0,0,50,51,3,6,3,0,51,52,3,10,
        5,0,52,53,3,28,14,0,53,55,5,13,0,0,54,56,5,14,0,0,55,54,1,0,0,0,
        55,56,1,0,0,0,56,58,1,0,0,0,57,59,5,15,0,0,58,57,1,0,0,0,58,59,1,
        0,0,0,59,61,1,0,0,0,60,62,5,16,0,0,61,60,1,0,0,0,61,62,1,0,0,0,62,
        63,1,0,0,0,63,64,5,127,0,0,64,1,1,0,0,0,65,66,5,9,0,0,66,67,5,126,
        0,0,67,72,3,4,2,0,68,69,5,129,0,0,69,71,3,4,2,0,70,68,1,0,0,0,71,
        74,1,0,0,0,72,70,1,0,0,0,72,73,1,0,0,0,73,75,1,0,0,0,74,72,1,0,0,
        0,75,76,5,127,0,0,76,77,5,145,0,0,77,3,1,0,0,0,78,79,7,0,0,0,79,
        5,1,0,0,0,80,81,5,10,0,0,81,83,5,126,0,0,82,84,3,8,4,0,83,82,1,0,
        0,0,84,85,1,0,0,0,85,83,1,0,0,0,85,86,1,0,0,0,86,87,1,0,0,0,87,88,
        5,127,0,0,88,89,5,145,0,0,89,7,1,0,0,0,90,91,5,5,0,0,91,92,5,144,
        0,0,92,93,5,43,0,0,93,108,5,145,0,0,94,95,5,5,0,0,95,96,5,144,0,
        0,96,97,5,126,0,0,97,102,5,7,0,0,98,99,5,129,0,0,99,101,5,7,0,0,
        100,98,1,0,0,0,101,104,1,0,0,0,102,100,1,0,0,0,102,103,1,0,0,0,103,
        105,1,0,0,0,104,102,1,0,0,0,105,106,5,127,0,0,106,108,5,145,0,0,
        107,90,1,0,0,0,107,94,1,0,0,0,108,9,1,0,0,0,109,110,5,11,0,0,110,
        114,5,126,0,0,111,113,3,12,6,0,112,111,1,0,0,0,113,116,1,0,0,0,114,
        112,1,0,0,0,114,115,1,0,0,0,115,117,1,0,0,0,116,114,1,0,0,0,117,
        118,5,127,0,0,118,119,5,145,0,0,119,11,1,0,0,0,120,122,5,5,0,0,121,
        123,3,14,7,0,122,121,1,0,0,0,122,123,1,0,0,0,123,124,1,0,0,0,124,
        125,5,144,0,0,125,126,5,126,0,0,126,127,3,16,8,0,127,128,5,127,0,
        0,128,129,5,145,0,0,129,13,1,0,0,0,130,131,5,124,0,0,131,136,5,5,
        0,0,132,133,5,129,0,0,133,135,5,5,0,0,134,132,1,0,0,0,135,138,1,
        0,0,0,136,134,1,0,0,0,136,137,1,0,0,0,137,139,1,0,0,0,138,136,1,
        0,0,0,139,140,5,125,0,0,140,15,1,0,0,0,141,142,3,18,9,0,142,143,
        5,129,0,0,143,144,3,24,12,0,144,145,5,129,0,0,145,146,5,76,0,0,146,
        147,5,140,0,0,147,148,3,26,13,0,148,162,1,0,0,0,149,150,3,20,10,
        0,150,151,5,129,0,0,151,152,3,24,12,0,152,153,5,129,0,0,153,154,
        5,151,0,0,154,155,5,140,0,0,155,156,3,26,13,0,156,162,1,0,0,0,157,
        158,3,22,11,0,158,159,5,129,0,0,159,160,3,24,12,0,160,162,1,0,0,
        0,161,141,1,0,0,0,161,149,1,0,0,0,161,157,1,0,0,0,162,17,1,0,0,0,
        163,164,7,1,0,0,164,19,1,0,0,0,165,166,7,2,0,0,166,21,1,0,0,0,167,
        168,7,3,0,0,168,23,1,0,0,0,169,170,7,4,0,0,170,25,1,0,0,0,171,172,
        7,5,0,0,172,27,1,0,0,0,173,174,5,12,0,0,174,175,5,126,0,0,175,176,
        3,30,15,0,176,177,5,127,0,0,177,178,5,145,0,0,178,29,1,0,0,0,179,
        180,3,32,16,0,180,181,5,140,0,0,181,182,3,38,19,0,182,183,5,145,
        0,0,183,31,1,0,0,0,184,185,5,5,0,0,185,186,5,124,0,0,186,187,3,34,
        17,0,187,188,5,125,0,0,188,193,1,0,0,0,189,193,5,5,0,0,190,193,5,
        7,0,0,191,193,5,6,0,0,192,184,1,0,0,0,192,189,1,0,0,0,192,190,1,
        0,0,0,192,191,1,0,0,0,193,33,1,0,0,0,194,199,3,36,18,0,195,196,5,
        129,0,0,196,198,3,36,18,0,197,195,1,0,0,0,198,201,1,0,0,0,199,197,
        1,0,0,0,199,200,1,0,0,0,200,35,1,0,0,0,201,199,1,0,0,0,202,206,5,
        6,0,0,203,206,5,7,0,0,204,206,3,32,16,0,205,202,1,0,0,0,205,203,
        1,0,0,0,205,204,1,0,0,0,206,37,1,0,0,0,207,208,6,19,-1,0,208,209,
        5,121,0,0,209,218,3,38,19,4,210,211,5,143,0,0,211,218,3,38,19,3,
        212,213,5,124,0,0,213,214,3,38,19,0,214,215,5,125,0,0,215,218,1,
        0,0,0,216,218,3,40,20,0,217,207,1,0,0,0,217,210,1,0,0,0,217,212,
        1,0,0,0,217,216,1,0,0,0,218,239,1,0,0,0,219,220,10,10,0,0,220,221,
        7,6,0,0,221,238,3,38,19,11,222,223,10,9,0,0,223,224,7,7,0,0,224,
        238,3,38,19,10,225,226,10,8,0,0,226,227,7,8,0,0,227,238,3,38,19,
        9,228,229,10,7,0,0,229,230,7,9,0,0,230,238,3,38,19,8,231,232,10,
        6,0,0,232,233,7,10,0,0,233,238,3,38,19,7,234,235,10,5,0,0,235,236,
        5,120,0,0,236,238,3,38,19,6,237,219,1,0,0,0,237,222,1,0,0,0,237,
        225,1,0,0,0,237,228,1,0,0,0,237,231,1,0,0,0,237,234,1,0,0,0,238,
        241,1,0,0,0,239,237,1,0,0,0,239,240,1,0,0,0,240,39,1,0,0,0,241,239,
        1,0,0,0,242,265,5,3,0,0,243,265,5,4,0,0,244,265,5,152,0,0,245,265,
        5,153,0,0,246,265,5,5,0,0,247,248,5,5,0,0,248,249,5,124,0,0,249,
        250,3,42,21,0,250,251,5,125,0,0,251,265,1,0,0,0,252,253,5,5,0,0,
        253,254,5,131,0,0,254,259,3,38,19,0,255,256,5,129,0,0,256,258,3,
        38,19,0,257,255,1,0,0,0,258,261,1,0,0,0,259,257,1,0,0,0,259,260,
        1,0,0,0,260,262,1,0,0,0,261,259,1,0,0,0,262,263,5,132,0,0,263,265,
        1,0,0,0,264,242,1,0,0,0,264,243,1,0,0,0,264,244,1,0,0,0,264,245,
        1,0,0,0,264,246,1,0,0,0,264,247,1,0,0,0,264,252,1,0,0,0,265,41,1,
        0,0,0,266,271,3,38,19,0,267,268,5,129,0,0,268,270,3,38,19,0,269,
        267,1,0,0,0,270,273,1,0,0,0,271,269,1,0,0,0,271,272,1,0,0,0,272,
        43,1,0,0,0,273,271,1,0,0,0,21,48,55,58,61,72,85,102,107,114,122,
        136,161,192,199,205,217,237,239,259,264,271
    ];

    private static __ATN: antlr.ATN;
    public static get _ATN(): antlr.ATN {
        if (!RDDLParser.__ATN) {
            RDDLParser.__ATN = new antlr.ATNDeserializer().deserialize(RDDLParser._serializedATN);
        }

        return RDDLParser.__ATN;
    }


    private static readonly vocabulary = new antlr.Vocabulary(RDDLParser.literalNames, RDDLParser.symbolicNames, []);

    public override get vocabulary(): antlr.Vocabulary {
        return RDDLParser.vocabulary;
    }

    private static readonly decisionsToDFA = RDDLParser._ATN.decisionToState.map( (ds: antlr.DecisionState, index: number) => new antlr.DFA(ds, index) );
}

export class DomainBlockContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public DOMAIN(): antlr.TerminalNode {
        return this.getToken(RDDLParser.DOMAIN, 0)!;
    }
    public ID(): antlr.TerminalNode {
        return this.getToken(RDDLParser.ID, 0)!;
    }
    public LCURLY(): antlr.TerminalNode {
        return this.getToken(RDDLParser.LCURLY, 0)!;
    }
    public typesBlock(): TypesBlockContext {
        return this.getRuleContext(0, TypesBlockContext)!;
    }
    public pvariablesBlock(): PvariablesBlockContext {
        return this.getRuleContext(0, PvariablesBlockContext)!;
    }
    public cpfs(): CpfsContext {
        return this.getRuleContext(0, CpfsContext)!;
    }
    public REWARD(): antlr.TerminalNode {
        return this.getToken(RDDLParser.REWARD, 0)!;
    }
    public RCURLY(): antlr.TerminalNode {
        return this.getToken(RDDLParser.RCURLY, 0)!;
    }
    public requirementsBlock(): RequirementsBlockContext | null {
        return this.getRuleContext(0, RequirementsBlockContext);
    }
    public STATE_INVARIANTS(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.STATE_INVARIANTS, 0);
    }
    public ACTION_PRECONDITIONS(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.ACTION_PRECONDITIONS, 0);
    }
    public TERMINATION(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.TERMINATION, 0);
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_domainBlock;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterDomainBlock) {
             listener.enterDomainBlock(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitDomainBlock) {
             listener.exitDomainBlock(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitDomainBlock) {
            return visitor.visitDomainBlock(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class RequirementsBlockContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public REQUIREMENTS(): antlr.TerminalNode {
        return this.getToken(RDDLParser.REQUIREMENTS, 0)!;
    }
    public LCURLY(): antlr.TerminalNode {
        return this.getToken(RDDLParser.LCURLY, 0)!;
    }
    public requirementList(): RequirementListContext[];
    public requirementList(i: number): RequirementListContext | null;
    public requirementList(i?: number): RequirementListContext[] | RequirementListContext | null {
        if (i === undefined) {
            return this.getRuleContexts(RequirementListContext);
        }

        return this.getRuleContext(i, RequirementListContext);
    }
    public RCURLY(): antlr.TerminalNode {
        return this.getToken(RDDLParser.RCURLY, 0)!;
    }
    public SEMI(): antlr.TerminalNode {
        return this.getToken(RDDLParser.SEMI, 0)!;
    }
    public COMMA(): antlr.TerminalNode[];
    public COMMA(i: number): antlr.TerminalNode | null;
    public COMMA(i?: number): antlr.TerminalNode | null | antlr.TerminalNode[] {
    	if (i === undefined) {
    		return this.getTokens(RDDLParser.COMMA);
    	} else {
    		return this.getToken(RDDLParser.COMMA, i);
    	}
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_requirementsBlock;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterRequirementsBlock) {
             listener.enterRequirementsBlock(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitRequirementsBlock) {
             listener.exitRequirementsBlock(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitRequirementsBlock) {
            return visitor.visitRequirementsBlock(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class RequirementListContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public CONCURRENT(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.CONCURRENT, 0);
    }
    public CONSTRAINED_STATE(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.CONSTRAINED_STATE, 0);
    }
    public CONTINUOUS(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.CONTINUOUS, 0);
    }
    public CPF_DETERMINISTIC(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.CPF_DETERMINISTIC, 0);
    }
    public INTEGER_VALUED(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.INTEGER_VALUED, 0);
    }
    public INTERMEDIATE_NODES(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.INTERMEDIATE_NODES, 0);
    }
    public MULTIVALUED(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.MULTIVALUED, 0);
    }
    public PARTIALLY_OBSERVED(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.PARTIALLY_OBSERVED, 0);
    }
    public REWARD_DETERMINISTIC(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.REWARD_DETERMINISTIC, 0);
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_requirementList;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterRequirementList) {
             listener.enterRequirementList(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitRequirementList) {
             listener.exitRequirementList(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitRequirementList) {
            return visitor.visitRequirementList(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class TypesBlockContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public TYPES(): antlr.TerminalNode {
        return this.getToken(RDDLParser.TYPES, 0)!;
    }
    public LCURLY(): antlr.TerminalNode {
        return this.getToken(RDDLParser.LCURLY, 0)!;
    }
    public RCURLY(): antlr.TerminalNode {
        return this.getToken(RDDLParser.RCURLY, 0)!;
    }
    public SEMI(): antlr.TerminalNode {
        return this.getToken(RDDLParser.SEMI, 0)!;
    }
    public typeList(): TypeListContext[];
    public typeList(i: number): TypeListContext | null;
    public typeList(i?: number): TypeListContext[] | TypeListContext | null {
        if (i === undefined) {
            return this.getRuleContexts(TypeListContext);
        }

        return this.getRuleContext(i, TypeListContext);
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_typesBlock;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterTypesBlock) {
             listener.enterTypesBlock(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitTypesBlock) {
             listener.exitTypesBlock(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitTypesBlock) {
            return visitor.visitTypesBlock(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class TypeListContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public ID(): antlr.TerminalNode {
        return this.getToken(RDDLParser.ID, 0)!;
    }
    public COLON(): antlr.TerminalNode {
        return this.getToken(RDDLParser.COLON, 0)!;
    }
    public OBJECT(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.OBJECT, 0);
    }
    public SEMI(): antlr.TerminalNode {
        return this.getToken(RDDLParser.SEMI, 0)!;
    }
    public LCURLY(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.LCURLY, 0);
    }
    public ENUM_VALUE(): antlr.TerminalNode[];
    public ENUM_VALUE(i: number): antlr.TerminalNode | null;
    public ENUM_VALUE(i?: number): antlr.TerminalNode | null | antlr.TerminalNode[] {
    	if (i === undefined) {
    		return this.getTokens(RDDLParser.ENUM_VALUE);
    	} else {
    		return this.getToken(RDDLParser.ENUM_VALUE, i);
    	}
    }
    public RCURLY(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.RCURLY, 0);
    }
    public COMMA(): antlr.TerminalNode[];
    public COMMA(i: number): antlr.TerminalNode | null;
    public COMMA(i?: number): antlr.TerminalNode | null | antlr.TerminalNode[] {
    	if (i === undefined) {
    		return this.getTokens(RDDLParser.COMMA);
    	} else {
    		return this.getToken(RDDLParser.COMMA, i);
    	}
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_typeList;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterTypeList) {
             listener.enterTypeList(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitTypeList) {
             listener.exitTypeList(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitTypeList) {
            return visitor.visitTypeList(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class PvariablesBlockContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public PVARIABLES(): antlr.TerminalNode {
        return this.getToken(RDDLParser.PVARIABLES, 0)!;
    }
    public LCURLY(): antlr.TerminalNode {
        return this.getToken(RDDLParser.LCURLY, 0)!;
    }
    public RCURLY(): antlr.TerminalNode {
        return this.getToken(RDDLParser.RCURLY, 0)!;
    }
    public SEMI(): antlr.TerminalNode {
        return this.getToken(RDDLParser.SEMI, 0)!;
    }
    public pvariable(): PvariableContext[];
    public pvariable(i: number): PvariableContext | null;
    public pvariable(i?: number): PvariableContext[] | PvariableContext | null {
        if (i === undefined) {
            return this.getRuleContexts(PvariableContext);
        }

        return this.getRuleContext(i, PvariableContext);
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_pvariablesBlock;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterPvariablesBlock) {
             listener.enterPvariablesBlock(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitPvariablesBlock) {
             listener.exitPvariablesBlock(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitPvariablesBlock) {
            return visitor.visitPvariablesBlock(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class PvariableContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public ID(): antlr.TerminalNode {
        return this.getToken(RDDLParser.ID, 0)!;
    }
    public COLON(): antlr.TerminalNode {
        return this.getToken(RDDLParser.COLON, 0)!;
    }
    public LCURLY(): antlr.TerminalNode {
        return this.getToken(RDDLParser.LCURLY, 0)!;
    }
    public typefluentList(): TypefluentListContext {
        return this.getRuleContext(0, TypefluentListContext)!;
    }
    public RCURLY(): antlr.TerminalNode {
        return this.getToken(RDDLParser.RCURLY, 0)!;
    }
    public SEMI(): antlr.TerminalNode {
        return this.getToken(RDDLParser.SEMI, 0)!;
    }
    public params(): ParamsContext | null {
        return this.getRuleContext(0, ParamsContext);
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_pvariable;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterPvariable) {
             listener.enterPvariable(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitPvariable) {
             listener.exitPvariable(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitPvariable) {
            return visitor.visitPvariable(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class ParamsContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public LPAREN(): antlr.TerminalNode {
        return this.getToken(RDDLParser.LPAREN, 0)!;
    }
    public ID(): antlr.TerminalNode[];
    public ID(i: number): antlr.TerminalNode | null;
    public ID(i?: number): antlr.TerminalNode | null | antlr.TerminalNode[] {
    	if (i === undefined) {
    		return this.getTokens(RDDLParser.ID);
    	} else {
    		return this.getToken(RDDLParser.ID, i);
    	}
    }
    public RPAREN(): antlr.TerminalNode {
        return this.getToken(RDDLParser.RPAREN, 0)!;
    }
    public COMMA(): antlr.TerminalNode[];
    public COMMA(i: number): antlr.TerminalNode | null;
    public COMMA(i?: number): antlr.TerminalNode | null | antlr.TerminalNode[] {
    	if (i === undefined) {
    		return this.getTokens(RDDLParser.COMMA);
    	} else {
    		return this.getToken(RDDLParser.COMMA, i);
    	}
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_params;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterParams) {
             listener.enterParams(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitParams) {
             listener.exitParams(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitParams) {
            return visitor.visitParams(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class TypefluentListContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public defaultFluent(): DefaultFluentContext | null {
        return this.getRuleContext(0, DefaultFluentContext);
    }
    public COMMA(): antlr.TerminalNode[];
    public COMMA(i: number): antlr.TerminalNode | null;
    public COMMA(i?: number): antlr.TerminalNode | null | antlr.TerminalNode[] {
    	if (i === undefined) {
    		return this.getTokens(RDDLParser.COMMA);
    	} else {
    		return this.getToken(RDDLParser.COMMA, i);
    	}
    }
    public typeValue(): TypeValueContext {
        return this.getRuleContext(0, TypeValueContext)!;
    }
    public DEFAULT(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.DEFAULT, 0);
    }
    public ASSIGN_EQUAL(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.ASSIGN_EQUAL, 0);
    }
    public value(): ValueContext | null {
        return this.getRuleContext(0, ValueContext);
    }
    public levelFluent(): LevelFluentContext | null {
        return this.getRuleContext(0, LevelFluentContext);
    }
    public LEVEL(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.LEVEL, 0);
    }
    public shortFluent(): ShortFluentContext | null {
        return this.getRuleContext(0, ShortFluentContext);
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_typefluentList;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterTypefluentList) {
             listener.enterTypefluentList(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitTypefluentList) {
             listener.exitTypefluentList(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitTypefluentList) {
            return visitor.visitTypefluentList(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class DefaultFluentContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public NON_FLUENT(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.NON_FLUENT, 0);
    }
    public STATE_FLUENT(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.STATE_FLUENT, 0);
    }
    public ACTION_FLUENT(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.ACTION_FLUENT, 0);
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_defaultFluent;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterDefaultFluent) {
             listener.enterDefaultFluent(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitDefaultFluent) {
             listener.exitDefaultFluent(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitDefaultFluent) {
            return visitor.visitDefaultFluent(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class LevelFluentContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public INTERMEDIATE_FLUENT(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.INTERMEDIATE_FLUENT, 0);
    }
    public DERIVED_FLUENT(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.DERIVED_FLUENT, 0);
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_levelFluent;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterLevelFluent) {
             listener.enterLevelFluent(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitLevelFluent) {
             listener.exitLevelFluent(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitLevelFluent) {
            return visitor.visitLevelFluent(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class ShortFluentContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public INTERMEDIATE_FLUENT(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.INTERMEDIATE_FLUENT, 0);
    }
    public DERIVED_FLUENT(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.DERIVED_FLUENT, 0);
    }
    public OBSERVATION_FLUENT(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.OBSERVATION_FLUENT, 0);
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_shortFluent;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterShortFluent) {
             listener.enterShortFluent(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitShortFluent) {
             listener.exitShortFluent(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitShortFluent) {
            return visitor.visitShortFluent(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class TypeValueContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public BOOL(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.BOOL, 0);
    }
    public INT(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.INT, 0);
    }
    public REAL(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.REAL, 0);
    }
    public ID(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.ID, 0);
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_typeValue;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterTypeValue) {
             listener.enterTypeValue(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitTypeValue) {
             listener.exitTypeValue(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitTypeValue) {
            return visitor.visitTypeValue(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class ValueContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public TRUE(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.TRUE, 0);
    }
    public FALSE(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.FALSE, 0);
    }
    public INTEGER(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.INTEGER, 0);
    }
    public DOUBLE(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.DOUBLE, 0);
    }
    public ENUM_VALUE(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.ENUM_VALUE, 0);
    }
    public ID(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.ID, 0);
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_value;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterValue) {
             listener.enterValue(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitValue) {
             listener.exitValue(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitValue) {
            return visitor.visitValue(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class CpfsContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public CPFS(): antlr.TerminalNode {
        return this.getToken(RDDLParser.CPFS, 0)!;
    }
    public LCURLY(): antlr.TerminalNode {
        return this.getToken(RDDLParser.LCURLY, 0)!;
    }
    public cpfContent(): CpfContentContext {
        return this.getRuleContext(0, CpfContentContext)!;
    }
    public RCURLY(): antlr.TerminalNode {
        return this.getToken(RDDLParser.RCURLY, 0)!;
    }
    public SEMI(): antlr.TerminalNode {
        return this.getToken(RDDLParser.SEMI, 0)!;
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_cpfs;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterCpfs) {
             listener.enterCpfs(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitCpfs) {
             listener.exitCpfs(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitCpfs) {
            return visitor.visitCpfs(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class CpfContentContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public pvarExpr(): PvarExprContext {
        return this.getRuleContext(0, PvarExprContext)!;
    }
    public ASSIGN_EQUAL(): antlr.TerminalNode {
        return this.getToken(RDDLParser.ASSIGN_EQUAL, 0)!;
    }
    public expr(): ExprContext {
        return this.getRuleContext(0, ExprContext)!;
    }
    public SEMI(): antlr.TerminalNode {
        return this.getToken(RDDLParser.SEMI, 0)!;
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_cpfContent;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterCpfContent) {
             listener.enterCpfContent(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitCpfContent) {
             listener.exitCpfContent(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitCpfContent) {
            return visitor.visitCpfContent(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class PvarExprContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public ID(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.ID, 0);
    }
    public LPAREN(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.LPAREN, 0);
    }
    public termList(): TermListContext | null {
        return this.getRuleContext(0, TermListContext);
    }
    public RPAREN(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.RPAREN, 0);
    }
    public ENUM_VALUE(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.ENUM_VALUE, 0);
    }
    public VARIABLE(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.VARIABLE, 0);
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_pvarExpr;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterPvarExpr) {
             listener.enterPvarExpr(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitPvarExpr) {
             listener.exitPvarExpr(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitPvarExpr) {
            return visitor.visitPvarExpr(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class TermListContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public term(): TermContext[];
    public term(i: number): TermContext | null;
    public term(i?: number): TermContext[] | TermContext | null {
        if (i === undefined) {
            return this.getRuleContexts(TermContext);
        }

        return this.getRuleContext(i, TermContext);
    }
    public COMMA(): antlr.TerminalNode[];
    public COMMA(i: number): antlr.TerminalNode | null;
    public COMMA(i?: number): antlr.TerminalNode | null | antlr.TerminalNode[] {
    	if (i === undefined) {
    		return this.getTokens(RDDLParser.COMMA);
    	} else {
    		return this.getToken(RDDLParser.COMMA, i);
    	}
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_termList;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterTermList) {
             listener.enterTermList(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitTermList) {
             listener.exitTermList(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitTermList) {
            return visitor.visitTermList(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class TermContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public VARIABLE(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.VARIABLE, 0);
    }
    public ENUM_VALUE(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.ENUM_VALUE, 0);
    }
    public pvarExpr(): PvarExprContext | null {
        return this.getRuleContext(0, PvarExprContext);
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_term;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterTerm) {
             listener.enterTerm(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitTerm) {
             listener.exitTerm(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitTerm) {
            return visitor.visitTerm(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class ExprContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public NOT(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.NOT, 0);
    }
    public expr(): ExprContext[];
    public expr(i: number): ExprContext | null;
    public expr(i?: number): ExprContext[] | ExprContext | null {
        if (i === undefined) {
            return this.getRuleContexts(ExprContext);
        }

        return this.getRuleContext(i, ExprContext);
    }
    public MINUS(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.MINUS, 0);
    }
    public LPAREN(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.LPAREN, 0);
    }
    public RPAREN(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.RPAREN, 0);
    }
    public atom(): AtomContext | null {
        return this.getRuleContext(0, AtomContext);
    }
    public TIMES(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.TIMES, 0);
    }
    public DIV(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.DIV, 0);
    }
    public PLUS(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.PLUS, 0);
    }
    public GREATER(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.GREATER, 0);
    }
    public GREATEREQ(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.GREATEREQ, 0);
    }
    public LESS(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.LESS, 0);
    }
    public LESSEQ(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.LESSEQ, 0);
    }
    public COMP_EQUAL(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.COMP_EQUAL, 0);
    }
    public NEQ(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.NEQ, 0);
    }
    public AND(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.AND, 0);
    }
    public AMPERSAND(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.AMPERSAND, 0);
    }
    public OR(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.OR, 0);
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_expr;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterExpr) {
             listener.enterExpr(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitExpr) {
             listener.exitExpr(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitExpr) {
            return visitor.visitExpr(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class AtomContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public INTEGER(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.INTEGER, 0);
    }
    public DOUBLE(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.DOUBLE, 0);
    }
    public TRUE(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.TRUE, 0);
    }
    public FALSE(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.FALSE, 0);
    }
    public ID(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.ID, 0);
    }
    public LPAREN(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.LPAREN, 0);
    }
    public exprList(): ExprListContext | null {
        return this.getRuleContext(0, ExprListContext);
    }
    public RPAREN(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.RPAREN, 0);
    }
    public LBRACK(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.LBRACK, 0);
    }
    public expr(): ExprContext[];
    public expr(i: number): ExprContext | null;
    public expr(i?: number): ExprContext[] | ExprContext | null {
        if (i === undefined) {
            return this.getRuleContexts(ExprContext);
        }

        return this.getRuleContext(i, ExprContext);
    }
    public RBRACK(): antlr.TerminalNode | null {
        return this.getToken(RDDLParser.RBRACK, 0);
    }
    public COMMA(): antlr.TerminalNode[];
    public COMMA(i: number): antlr.TerminalNode | null;
    public COMMA(i?: number): antlr.TerminalNode | null | antlr.TerminalNode[] {
    	if (i === undefined) {
    		return this.getTokens(RDDLParser.COMMA);
    	} else {
    		return this.getToken(RDDLParser.COMMA, i);
    	}
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_atom;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterAtom) {
             listener.enterAtom(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitAtom) {
             listener.exitAtom(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitAtom) {
            return visitor.visitAtom(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}


export class ExprListContext extends antlr.ParserRuleContext {
    public constructor(parent: antlr.ParserRuleContext | null, invokingState: number) {
        super(parent, invokingState);
    }
    public expr(): ExprContext[];
    public expr(i: number): ExprContext | null;
    public expr(i?: number): ExprContext[] | ExprContext | null {
        if (i === undefined) {
            return this.getRuleContexts(ExprContext);
        }

        return this.getRuleContext(i, ExprContext);
    }
    public COMMA(): antlr.TerminalNode[];
    public COMMA(i: number): antlr.TerminalNode | null;
    public COMMA(i?: number): antlr.TerminalNode | null | antlr.TerminalNode[] {
    	if (i === undefined) {
    		return this.getTokens(RDDLParser.COMMA);
    	} else {
    		return this.getToken(RDDLParser.COMMA, i);
    	}
    }
    public override get ruleIndex(): number {
        return RDDLParser.RULE_exprList;
    }
    public override enterRule(listener: RDDLParserListener): void {
        if(listener.enterExprList) {
             listener.enterExprList(this);
        }
    }
    public override exitRule(listener: RDDLParserListener): void {
        if(listener.exitExprList) {
             listener.exitExprList(this);
        }
    }
    public override accept<Result>(visitor: RDDLParserVisitor<Result>): Result | null {
        if (visitor.visitExprList) {
            return visitor.visitExprList(this);
        } else {
            return visitor.visitChildren(this);
        }
    }
}
