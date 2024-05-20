// Generated from /Users/jankautenburger/Documents/Github/antlr4-rddl/src/main/grammar/antlr4/RDDLParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RDDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALPHA=1, DIGIT=2, INTEGER=3, DOUBLE=4, ID=5, VARIABLE=6, ENUM_VALUE=7, 
		DOMAIN=8, REQUIREMENTS=9, TYPES=10, PVARIABLES=11, CPFS=12, REWARD=13, 
		STATE_INVARIANTS=14, ACTION_PRECONDITIONS=15, TERMINATION=16, INSTANCE=17, 
		NON_FLUENTS=18, OBJECTS=19, INIT_STATE=20, MAX_NONDEF_ACTIONS=21, HORIZON=22, 
		DISCOUNT=23, STATE_ACTION_CONSTRAINTS=24, CONCURRENT=25, CONSTRAINED_STATE=26, 
		CONTINUOUS=27, CPF_DETERMINISTIC=28, INTEGER_VALUED=29, INTERMEDIATE_NODES=30, 
		MULTIVALUED=31, PARTIALLY_OBSERVED=32, REWARD_DETERMINISTIC=33, NON_FLUENT=34, 
		STATE_FLUENT=35, INTERMEDIATE_FLUENT=36, DERIVED_FLUENT=37, OBSERVATION_FLUENT=38, 
		ACTION_FLUENT=39, BOOL=40, INT=41, REAL=42, OBJECT=43, DIV=44, MOD=45, 
		FMOD=46, MIN=47, MAX=48, ABS=49, SGN=50, ROUND=51, FLOOR=52, CEIL=53, 
		LOG=54, LN=55, EXP=56, POW=57, SQRT=58, HYPOT=59, GAMMA=60, LNGAMMA=61, 
		COS=62, SIN=63, TAN=64, ACOS=65, ASIN=66, ATAN=67, COSH=68, SINH=69, TANH=70, 
		IF=71, THEN=72, ELSE=73, SWITCH=74, CASE=75, DEFAULT=76, FORALL=77, EXISTS=78, 
		SUM=79, PROD=80, AVG=81, MINIMUM=82, MAXIMUM=83, ARGMAX=84, ARGMIN=85, 
		KRON_DELTA=86, BERNOULLI=87, DISCRETE=88, UNNORMDISCRETE=89, POISSON=90, 
		BINOMIAL=91, NEGATIVEBINOMIAL=92, GEOMETRIC=93, DIRAC_DELTA=94, NORMAL=95, 
		UNIFORM=96, EXPONENTIAL=97, WEIBULL=98, GAMMA_DIST=99, BETA=100, PARETO=101, 
		STUDENT=102, GUMBEL=103, LAPLACE=104, CAUCHY=105, GOMPERTZ=106, CHISQUARE=107, 
		KUMARASWAMY=108, DIRICHLET=109, MULTINOMIAL=110, MULTIVARIATENORMAL=111, 
		MULTIVARIATESTUDENT=112, ROW=113, COLUMN=114, DET=115, INVERSE=116, PSEUDOINVERSE=117, 
		CHOLESKY=118, AND=119, OR=120, NOT=121, PLUS=122, TIMES=123, LPAREN=124, 
		RPAREN=125, LCURLY=126, RCURLY=127, DOT=128, COMMA=129, UNDERSCORE=130, 
		LBRACK=131, RBRACK=132, IMPLY=133, EQUIV=134, NEQ=135, LESSEQ=136, LESS=137, 
		GREATEREQ=138, GREATER=139, ASSIGN_EQUAL=140, COMP_EQUAL=141, DIV_OP=142, 
		MINUS=143, COLON=144, SEMI=145, DOLLAR_SIGN=146, QUESTION=147, AMPERSAND=148, 
		NEG_INF=149, POS_INF=150, LEVEL=151, TRUE=152, FALSE=153, OTHERWISE=154, 
		TERMINATE_WHEN=155, TERMINAL=156, CDFS=157, WS=158;
	public static final int
		RULE_domainBlock = 0, RULE_requirementsBlock = 1, RULE_requirementList = 2, 
		RULE_typesBlock = 3, RULE_typeList = 4, RULE_pvariablesBlock = 5, RULE_pvariable = 6, 
		RULE_params = 7, RULE_typefluentList = 8, RULE_defaultFluent = 9, RULE_levelFluent = 10, 
		RULE_shortFluent = 11, RULE_typeValue = 12, RULE_value = 13, RULE_cpfs = 14, 
		RULE_cpfContent = 15, RULE_pvarExpr = 16, RULE_termList = 17, RULE_term = 18, 
		RULE_expr = 19, RULE_atom = 20, RULE_exprList = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"domainBlock", "requirementsBlock", "requirementList", "typesBlock", 
			"typeList", "pvariablesBlock", "pvariable", "params", "typefluentList", 
			"defaultFluent", "levelFluent", "shortFluent", "typeValue", "value", 
			"cpfs", "cpfContent", "pvarExpr", "termList", "term", "expr", "atom", 
			"exprList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'domain'", "'requirements'", 
			"'types'", "'pvariables'", "'cpfs'", "'reward'", "'state-invariants'", 
			"'action-preconditions'", "'termination'", "'instance'", "'non-fluents'", 
			"'objects'", "'init-state'", "'max-nondef-actions'", "'horizon'", "'discount'", 
			"'state-action-constraints'", "'concurrent'", "'constrained-state'", 
			"'continuous'", "'cpf-deterministic'", "'integer-valued'", "'intermediate-nodes'", 
			"'multivalued'", "'partially-observed'", "'reward-deterministic'", "'non-fluent'", 
			"'state-fluent'", "'interm-fluent'", "'derived-fluent'", "'observ-fluent'", 
			"'action-fluent'", "'bool'", "'int'", "'real'", "'object'", "'div'", 
			"'mod'", "'fmod'", "'min'", "'max'", "'abs'", "'sgn'", "'round'", "'floor'", 
			"'ceil'", "'log'", "'ln'", "'exp'", "'pow'", "'sqrt'", "'hypot'", "'gamma'", 
			"'lngamma'", "'cos'", "'sin'", "'tan'", "'acos'", "'asin'", "'atan'", 
			"'cosh'", "'sinh'", "'tanh'", "'if'", "'then'", "'else'", "'switch'", 
			"'case'", "'default'", "'forall_'", "'exists_'", "'sum_'", "'prod_'", 
			"'avg_'", "'minimum_'", "'maximum_'", "'argmax_'", "'argmin_'", "'KronDelta'", 
			"'Bernoulli'", "'Discrete'", "'UnnormDiscrete'", "'Poisson'", "'Binomial'", 
			"'NegativeBinomial'", "'Geometric'", "'DiracDelta'", "'Normal'", "'Uniform'", 
			"'Exponential'", "'Weibull'", "'Gamma'", "'Beta'", "'Pareto'", "'Student'", 
			"'Gumbel'", "'Laplace'", "'Cauchy'", "'Gompertz'", "'ChiSquare'", "'Kumaraswamy'", 
			"'Dirichlet'", "'Multinomial'", "'MultivariateNormal'", "'MultivariateStudent'", 
			"'row'", "'col'", "'det'", "'inverse'", "'pinverse'", "'cholesky'", "'^'", 
			"'|'", "'~'", "'+'", "'*'", "'('", "')'", "'{'", "'}'", "'.'", "','", 
			"'_'", "'['", "']'", "'=>'", "'<=>'", "'~='", "'<='", "'<'", "'>='", 
			"'>'", "'='", "'=='", "'/'", "'-'", "':'", "';'", "'$'", "'?'", "'&'", 
			"'neg-inf'", "'pos-inf'", "'level'", "'true'", "'false'", "'otherwise'", 
			"'terminate-when'", "'terminal'", "'cdfs'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALPHA", "DIGIT", "INTEGER", "DOUBLE", "ID", "VARIABLE", "ENUM_VALUE", 
			"DOMAIN", "REQUIREMENTS", "TYPES", "PVARIABLES", "CPFS", "REWARD", "STATE_INVARIANTS", 
			"ACTION_PRECONDITIONS", "TERMINATION", "INSTANCE", "NON_FLUENTS", "OBJECTS", 
			"INIT_STATE", "MAX_NONDEF_ACTIONS", "HORIZON", "DISCOUNT", "STATE_ACTION_CONSTRAINTS", 
			"CONCURRENT", "CONSTRAINED_STATE", "CONTINUOUS", "CPF_DETERMINISTIC", 
			"INTEGER_VALUED", "INTERMEDIATE_NODES", "MULTIVALUED", "PARTIALLY_OBSERVED", 
			"REWARD_DETERMINISTIC", "NON_FLUENT", "STATE_FLUENT", "INTERMEDIATE_FLUENT", 
			"DERIVED_FLUENT", "OBSERVATION_FLUENT", "ACTION_FLUENT", "BOOL", "INT", 
			"REAL", "OBJECT", "DIV", "MOD", "FMOD", "MIN", "MAX", "ABS", "SGN", "ROUND", 
			"FLOOR", "CEIL", "LOG", "LN", "EXP", "POW", "SQRT", "HYPOT", "GAMMA", 
			"LNGAMMA", "COS", "SIN", "TAN", "ACOS", "ASIN", "ATAN", "COSH", "SINH", 
			"TANH", "IF", "THEN", "ELSE", "SWITCH", "CASE", "DEFAULT", "FORALL", 
			"EXISTS", "SUM", "PROD", "AVG", "MINIMUM", "MAXIMUM", "ARGMAX", "ARGMIN", 
			"KRON_DELTA", "BERNOULLI", "DISCRETE", "UNNORMDISCRETE", "POISSON", "BINOMIAL", 
			"NEGATIVEBINOMIAL", "GEOMETRIC", "DIRAC_DELTA", "NORMAL", "UNIFORM", 
			"EXPONENTIAL", "WEIBULL", "GAMMA_DIST", "BETA", "PARETO", "STUDENT", 
			"GUMBEL", "LAPLACE", "CAUCHY", "GOMPERTZ", "CHISQUARE", "KUMARASWAMY", 
			"DIRICHLET", "MULTINOMIAL", "MULTIVARIATENORMAL", "MULTIVARIATESTUDENT", 
			"ROW", "COLUMN", "DET", "INVERSE", "PSEUDOINVERSE", "CHOLESKY", "AND", 
			"OR", "NOT", "PLUS", "TIMES", "LPAREN", "RPAREN", "LCURLY", "RCURLY", 
			"DOT", "COMMA", "UNDERSCORE", "LBRACK", "RBRACK", "IMPLY", "EQUIV", "NEQ", 
			"LESSEQ", "LESS", "GREATEREQ", "GREATER", "ASSIGN_EQUAL", "COMP_EQUAL", 
			"DIV_OP", "MINUS", "COLON", "SEMI", "DOLLAR_SIGN", "QUESTION", "AMPERSAND", 
			"NEG_INF", "POS_INF", "LEVEL", "TRUE", "FALSE", "OTHERWISE", "TERMINATE_WHEN", 
			"TERMINAL", "CDFS", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RDDLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RDDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DomainBlockContext extends ParserRuleContext {
		public TerminalNode DOMAIN() { return getToken(RDDLParser.DOMAIN, 0); }
		public TerminalNode ID() { return getToken(RDDLParser.ID, 0); }
		public TerminalNode LCURLY() { return getToken(RDDLParser.LCURLY, 0); }
		public TypesBlockContext typesBlock() {
			return getRuleContext(TypesBlockContext.class,0);
		}
		public PvariablesBlockContext pvariablesBlock() {
			return getRuleContext(PvariablesBlockContext.class,0);
		}
		public CpfsContext cpfs() {
			return getRuleContext(CpfsContext.class,0);
		}
		public TerminalNode REWARD() { return getToken(RDDLParser.REWARD, 0); }
		public TerminalNode RCURLY() { return getToken(RDDLParser.RCURLY, 0); }
		public RequirementsBlockContext requirementsBlock() {
			return getRuleContext(RequirementsBlockContext.class,0);
		}
		public TerminalNode STATE_INVARIANTS() { return getToken(RDDLParser.STATE_INVARIANTS, 0); }
		public TerminalNode ACTION_PRECONDITIONS() { return getToken(RDDLParser.ACTION_PRECONDITIONS, 0); }
		public TerminalNode TERMINATION() { return getToken(RDDLParser.TERMINATION, 0); }
		public DomainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterDomainBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitDomainBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitDomainBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DomainBlockContext domainBlock() throws RecognitionException {
		DomainBlockContext _localctx = new DomainBlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_domainBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(DOMAIN);
			setState(45);
			match(ID);
			setState(46);
			match(LCURLY);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REQUIREMENTS) {
				{
				setState(47);
				requirementsBlock();
				}
			}

			setState(50);
			typesBlock();
			setState(51);
			pvariablesBlock();
			setState(52);
			cpfs();
			setState(53);
			match(REWARD);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATE_INVARIANTS) {
				{
				setState(54);
				match(STATE_INVARIANTS);
				}
			}

			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACTION_PRECONDITIONS) {
				{
				setState(57);
				match(ACTION_PRECONDITIONS);
				}
			}

			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TERMINATION) {
				{
				setState(60);
				match(TERMINATION);
				}
			}

			setState(63);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequirementsBlockContext extends ParserRuleContext {
		public TerminalNode REQUIREMENTS() { return getToken(RDDLParser.REQUIREMENTS, 0); }
		public TerminalNode LCURLY() { return getToken(RDDLParser.LCURLY, 0); }
		public List<RequirementListContext> requirementList() {
			return getRuleContexts(RequirementListContext.class);
		}
		public RequirementListContext requirementList(int i) {
			return getRuleContext(RequirementListContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(RDDLParser.RCURLY, 0); }
		public TerminalNode SEMI() { return getToken(RDDLParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RDDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RDDLParser.COMMA, i);
		}
		public RequirementsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementsBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterRequirementsBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitRequirementsBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitRequirementsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementsBlockContext requirementsBlock() throws RecognitionException {
		RequirementsBlockContext _localctx = new RequirementsBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_requirementsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(REQUIREMENTS);
			setState(66);
			match(LCURLY);
			setState(67);
			requirementList();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(68);
				match(COMMA);
				setState(69);
				requirementList();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(RCURLY);
			setState(76);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequirementListContext extends ParserRuleContext {
		public TerminalNode CONCURRENT() { return getToken(RDDLParser.CONCURRENT, 0); }
		public TerminalNode CONSTRAINED_STATE() { return getToken(RDDLParser.CONSTRAINED_STATE, 0); }
		public TerminalNode CONTINUOUS() { return getToken(RDDLParser.CONTINUOUS, 0); }
		public TerminalNode CPF_DETERMINISTIC() { return getToken(RDDLParser.CPF_DETERMINISTIC, 0); }
		public TerminalNode INTEGER_VALUED() { return getToken(RDDLParser.INTEGER_VALUED, 0); }
		public TerminalNode INTERMEDIATE_NODES() { return getToken(RDDLParser.INTERMEDIATE_NODES, 0); }
		public TerminalNode MULTIVALUED() { return getToken(RDDLParser.MULTIVALUED, 0); }
		public TerminalNode PARTIALLY_OBSERVED() { return getToken(RDDLParser.PARTIALLY_OBSERVED, 0); }
		public TerminalNode REWARD_DETERMINISTIC() { return getToken(RDDLParser.REWARD_DETERMINISTIC, 0); }
		public RequirementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterRequirementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitRequirementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitRequirementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementListContext requirementList() throws RecognitionException {
		RequirementListContext _localctx = new RequirementListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_requirementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17146314752L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypesBlockContext extends ParserRuleContext {
		public TerminalNode TYPES() { return getToken(RDDLParser.TYPES, 0); }
		public TerminalNode LCURLY() { return getToken(RDDLParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(RDDLParser.RCURLY, 0); }
		public TerminalNode SEMI() { return getToken(RDDLParser.SEMI, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TypesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterTypesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitTypesBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitTypesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesBlockContext typesBlock() throws RecognitionException {
		TypesBlockContext _localctx = new TypesBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(TYPES);
			setState(81);
			match(LCURLY);
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				typeList();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(87);
			match(RCURLY);
			setState(88);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeListContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RDDLParser.ID, 0); }
		public TerminalNode COLON() { return getToken(RDDLParser.COLON, 0); }
		public TerminalNode OBJECT() { return getToken(RDDLParser.OBJECT, 0); }
		public TerminalNode SEMI() { return getToken(RDDLParser.SEMI, 0); }
		public TerminalNode LCURLY() { return getToken(RDDLParser.LCURLY, 0); }
		public List<TerminalNode> ENUM_VALUE() { return getTokens(RDDLParser.ENUM_VALUE); }
		public TerminalNode ENUM_VALUE(int i) {
			return getToken(RDDLParser.ENUM_VALUE, i);
		}
		public TerminalNode RCURLY() { return getToken(RDDLParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RDDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RDDLParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeList);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(ID);
				setState(91);
				match(COLON);
				setState(92);
				match(OBJECT);
				setState(93);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(ID);
				setState(95);
				match(COLON);
				setState(96);
				match(LCURLY);
				setState(97);
				match(ENUM_VALUE);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(98);
					match(COMMA);
					setState(99);
					match(ENUM_VALUE);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				match(RCURLY);
				setState(106);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PvariablesBlockContext extends ParserRuleContext {
		public TerminalNode PVARIABLES() { return getToken(RDDLParser.PVARIABLES, 0); }
		public TerminalNode LCURLY() { return getToken(RDDLParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(RDDLParser.RCURLY, 0); }
		public TerminalNode SEMI() { return getToken(RDDLParser.SEMI, 0); }
		public List<PvariableContext> pvariable() {
			return getRuleContexts(PvariableContext.class);
		}
		public PvariableContext pvariable(int i) {
			return getRuleContext(PvariableContext.class,i);
		}
		public PvariablesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pvariablesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterPvariablesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitPvariablesBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitPvariablesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PvariablesBlockContext pvariablesBlock() throws RecognitionException {
		PvariablesBlockContext _localctx = new PvariablesBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pvariablesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(PVARIABLES);
			setState(110);
			match(LCURLY);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(111);
				pvariable();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(RCURLY);
			setState(118);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PvariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RDDLParser.ID, 0); }
		public TerminalNode COLON() { return getToken(RDDLParser.COLON, 0); }
		public TerminalNode LCURLY() { return getToken(RDDLParser.LCURLY, 0); }
		public TypefluentListContext typefluentList() {
			return getRuleContext(TypefluentListContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(RDDLParser.RCURLY, 0); }
		public TerminalNode SEMI() { return getToken(RDDLParser.SEMI, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public PvariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pvariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterPvariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitPvariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitPvariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PvariableContext pvariable() throws RecognitionException {
		PvariableContext _localctx = new PvariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pvariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(121);
				params();
				}
			}

			setState(124);
			match(COLON);
			setState(125);
			match(LCURLY);
			setState(126);
			typefluentList();
			setState(127);
			match(RCURLY);
			setState(128);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RDDLParser.LPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(RDDLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RDDLParser.ID, i);
		}
		public TerminalNode RPAREN() { return getToken(RDDLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RDDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RDDLParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(LPAREN);
			setState(131);
			match(ID);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(132);
				match(COMMA);
				setState(133);
				match(ID);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypefluentListContext extends ParserRuleContext {
		public DefaultFluentContext defaultFluent() {
			return getRuleContext(DefaultFluentContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RDDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RDDLParser.COMMA, i);
		}
		public TypeValueContext typeValue() {
			return getRuleContext(TypeValueContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(RDDLParser.DEFAULT, 0); }
		public TerminalNode ASSIGN_EQUAL() { return getToken(RDDLParser.ASSIGN_EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LevelFluentContext levelFluent() {
			return getRuleContext(LevelFluentContext.class,0);
		}
		public TerminalNode LEVEL() { return getToken(RDDLParser.LEVEL, 0); }
		public ShortFluentContext shortFluent() {
			return getRuleContext(ShortFluentContext.class,0);
		}
		public TypefluentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typefluentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterTypefluentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitTypefluentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitTypefluentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypefluentListContext typefluentList() throws RecognitionException {
		TypefluentListContext _localctx = new TypefluentListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typefluentList);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				defaultFluent();
				setState(142);
				match(COMMA);
				setState(143);
				typeValue();
				setState(144);
				match(COMMA);
				setState(145);
				match(DEFAULT);
				setState(146);
				match(ASSIGN_EQUAL);
				setState(147);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				levelFluent();
				setState(150);
				match(COMMA);
				setState(151);
				typeValue();
				setState(152);
				match(COMMA);
				setState(153);
				match(LEVEL);
				setState(154);
				match(ASSIGN_EQUAL);
				setState(155);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				shortFluent();
				setState(158);
				match(COMMA);
				setState(159);
				typeValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultFluentContext extends ParserRuleContext {
		public TerminalNode NON_FLUENT() { return getToken(RDDLParser.NON_FLUENT, 0); }
		public TerminalNode STATE_FLUENT() { return getToken(RDDLParser.STATE_FLUENT, 0); }
		public TerminalNode ACTION_FLUENT() { return getToken(RDDLParser.ACTION_FLUENT, 0); }
		public DefaultFluentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultFluent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterDefaultFluent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitDefaultFluent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitDefaultFluent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultFluentContext defaultFluent() throws RecognitionException {
		DefaultFluentContext _localctx = new DefaultFluentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defaultFluent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 601295421440L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LevelFluentContext extends ParserRuleContext {
		public TerminalNode INTERMEDIATE_FLUENT() { return getToken(RDDLParser.INTERMEDIATE_FLUENT, 0); }
		public TerminalNode DERIVED_FLUENT() { return getToken(RDDLParser.DERIVED_FLUENT, 0); }
		public LevelFluentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelFluent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterLevelFluent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitLevelFluent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitLevelFluent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelFluentContext levelFluent() throws RecognitionException {
		LevelFluentContext _localctx = new LevelFluentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_levelFluent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !(_la==INTERMEDIATE_FLUENT || _la==DERIVED_FLUENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShortFluentContext extends ParserRuleContext {
		public TerminalNode INTERMEDIATE_FLUENT() { return getToken(RDDLParser.INTERMEDIATE_FLUENT, 0); }
		public TerminalNode DERIVED_FLUENT() { return getToken(RDDLParser.DERIVED_FLUENT, 0); }
		public TerminalNode OBSERVATION_FLUENT() { return getToken(RDDLParser.OBSERVATION_FLUENT, 0); }
		public ShortFluentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortFluent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterShortFluent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitShortFluent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitShortFluent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortFluentContext shortFluent() throws RecognitionException {
		ShortFluentContext _localctx = new ShortFluentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_shortFluent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337152L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeValueContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(RDDLParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(RDDLParser.INT, 0); }
		public TerminalNode REAL() { return getToken(RDDLParser.REAL, 0); }
		public TerminalNode ID() { return getToken(RDDLParser.ID, 0); }
		public TypeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterTypeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitTypeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitTypeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeValueContext typeValue() throws RecognitionException {
		TypeValueContext _localctx = new TypeValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7696581394464L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(RDDLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RDDLParser.FALSE, 0); }
		public TerminalNode INTEGER() { return getToken(RDDLParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(RDDLParser.DOUBLE, 0); }
		public TerminalNode ENUM_VALUE() { return getToken(RDDLParser.ENUM_VALUE, 0); }
		public TerminalNode ID() { return getToken(RDDLParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 184L) != 0) || _la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CpfsContext extends ParserRuleContext {
		public TerminalNode CPFS() { return getToken(RDDLParser.CPFS, 0); }
		public TerminalNode LCURLY() { return getToken(RDDLParser.LCURLY, 0); }
		public CpfContentContext cpfContent() {
			return getRuleContext(CpfContentContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(RDDLParser.RCURLY, 0); }
		public TerminalNode SEMI() { return getToken(RDDLParser.SEMI, 0); }
		public CpfsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpfs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterCpfs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitCpfs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitCpfs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CpfsContext cpfs() throws RecognitionException {
		CpfsContext _localctx = new CpfsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cpfs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(CPFS);
			setState(174);
			match(LCURLY);
			setState(175);
			cpfContent();
			setState(176);
			match(RCURLY);
			setState(177);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CpfContentContext extends ParserRuleContext {
		public PvarExprContext pvarExpr() {
			return getRuleContext(PvarExprContext.class,0);
		}
		public TerminalNode ASSIGN_EQUAL() { return getToken(RDDLParser.ASSIGN_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RDDLParser.SEMI, 0); }
		public CpfContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpfContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterCpfContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitCpfContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitCpfContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CpfContentContext cpfContent() throws RecognitionException {
		CpfContentContext _localctx = new CpfContentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cpfContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			pvarExpr();
			setState(180);
			match(ASSIGN_EQUAL);
			setState(181);
			expr(0);
			setState(182);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PvarExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RDDLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(RDDLParser.LPAREN, 0); }
		public TermListContext termList() {
			return getRuleContext(TermListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RDDLParser.RPAREN, 0); }
		public TerminalNode ENUM_VALUE() { return getToken(RDDLParser.ENUM_VALUE, 0); }
		public TerminalNode VARIABLE() { return getToken(RDDLParser.VARIABLE, 0); }
		public PvarExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pvarExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterPvarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitPvarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitPvarExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PvarExprContext pvarExpr() throws RecognitionException {
		PvarExprContext _localctx = new PvarExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pvarExpr);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(ID);
				setState(185);
				match(LPAREN);
				setState(186);
				termList();
				setState(187);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(ENUM_VALUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(VARIABLE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermListContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RDDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RDDLParser.COMMA, i);
		}
		public TermListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterTermList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitTermList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitTermList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermListContext termList() throws RecognitionException {
		TermListContext _localctx = new TermListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_termList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			term();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(195);
				match(COMMA);
				setState(196);
				term();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(RDDLParser.VARIABLE, 0); }
		public TerminalNode ENUM_VALUE() { return getToken(RDDLParser.ENUM_VALUE, 0); }
		public PvarExprContext pvarExpr() {
			return getRuleContext(PvarExprContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(ENUM_VALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				pvarExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(RDDLParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(RDDLParser.MINUS, 0); }
		public TerminalNode LPAREN() { return getToken(RDDLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RDDLParser.RPAREN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(RDDLParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(RDDLParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(RDDLParser.PLUS, 0); }
		public TerminalNode GREATER() { return getToken(RDDLParser.GREATER, 0); }
		public TerminalNode GREATEREQ() { return getToken(RDDLParser.GREATEREQ, 0); }
		public TerminalNode LESS() { return getToken(RDDLParser.LESS, 0); }
		public TerminalNode LESSEQ() { return getToken(RDDLParser.LESSEQ, 0); }
		public TerminalNode COMP_EQUAL() { return getToken(RDDLParser.COMP_EQUAL, 0); }
		public TerminalNode NEQ() { return getToken(RDDLParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(RDDLParser.AND, 0); }
		public TerminalNode AMPERSAND() { return getToken(RDDLParser.AMPERSAND, 0); }
		public TerminalNode OR() { return getToken(RDDLParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(208);
				match(NOT);
				setState(209);
				expr(4);
				}
				break;
			case MINUS:
				{
				setState(210);
				match(MINUS);
				setState(211);
				expr(3);
				}
				break;
			case LPAREN:
				{
				setState(212);
				match(LPAREN);
				setState(213);
				expr(0);
				setState(214);
				match(RPAREN);
				}
				break;
			case INTEGER:
			case DOUBLE:
			case ID:
			case TRUE:
			case FALSE:
				{
				setState(216);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(220);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==TIMES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(221);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(223);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(226);
						_la = _input.LA(1);
						if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 15L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(229);
						_la = _input.LA(1);
						if ( !(_la==NEQ || _la==COMP_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(232);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==AMPERSAND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(233);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(235);
						match(OR);
						}
						setState(236);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(RDDLParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(RDDLParser.DOUBLE, 0); }
		public TerminalNode TRUE() { return getToken(RDDLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RDDLParser.FALSE, 0); }
		public TerminalNode ID() { return getToken(RDDLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(RDDLParser.LPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RDDLParser.RPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(RDDLParser.LBRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(RDDLParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RDDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RDDLParser.COMMA, i);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atom);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(DOUBLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				match(ID);
				setState(248);
				match(LPAREN);
				setState(249);
				exprList();
				setState(250);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				match(ID);
				setState(253);
				match(LBRACK);
				setState(254);
				expr(0);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(255);
					match(COMMA);
					setState(256);
					expr(0);
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RDDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RDDLParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDDLParserListener ) ((RDDLParserListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RDDLParserVisitor ) return ((RDDLParserVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			expr(0);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(267);
				match(COMMA);
				setState(268);
				expr(0);
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u009e\u0113\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00001\b"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u00008\b\u0000\u0001\u0000\u0003\u0000;\b\u0000\u0001\u0000\u0003\u0000"+
		">\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001G\b\u0001\n\u0001\f\u0001J\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0004\u0003T\b\u0003\u000b\u0003\f\u0003U\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004e\b\u0004\n\u0004\f\u0004h\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004l\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005q\b\u0005\n\u0005\f\u0005t\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0003\u0006{\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0087\b\u0007\n\u0007\f\u0007"+
		"\u008a\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a2"+
		"\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c1\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u00c6\b\u0011\n\u0011\f\u0011\u00c9\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ce\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00da\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00ee\b\u0013\n\u0013\f\u0013\u00f1\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u0102\b\u0014\n\u0014\f\u0014\u0105\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0109\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u010e\b\u0015\n\u0015\f\u0015\u0111\t\u0015\u0001\u0015\u0000"+
		"\u0001&\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*\u0000\u000b\u0001\u0000\u0019!\u0002\u0000"+
		"\"#\'\'\u0001\u0000$%\u0001\u0000$&\u0002\u0000\u0005\u0005(*\u0003\u0000"+
		"\u0003\u0005\u0007\u0007\u0098\u0099\u0002\u0000,,{{\u0002\u0000zz\u008f"+
		"\u008f\u0001\u0000\u0088\u008b\u0002\u0000\u0087\u0087\u008d\u008d\u0002"+
		"\u0000ww\u0094\u0094\u0120\u0000,\u0001\u0000\u0000\u0000\u0002A\u0001"+
		"\u0000\u0000\u0000\u0004N\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000"+
		"\u0000\bk\u0001\u0000\u0000\u0000\nm\u0001\u0000\u0000\u0000\fx\u0001"+
		"\u0000\u0000\u0000\u000e\u0082\u0001\u0000\u0000\u0000\u0010\u00a1\u0001"+
		"\u0000\u0000\u0000\u0012\u00a3\u0001\u0000\u0000\u0000\u0014\u00a5\u0001"+
		"\u0000\u0000\u0000\u0016\u00a7\u0001\u0000\u0000\u0000\u0018\u00a9\u0001"+
		"\u0000\u0000\u0000\u001a\u00ab\u0001\u0000\u0000\u0000\u001c\u00ad\u0001"+
		"\u0000\u0000\u0000\u001e\u00b3\u0001\u0000\u0000\u0000 \u00c0\u0001\u0000"+
		"\u0000\u0000\"\u00c2\u0001\u0000\u0000\u0000$\u00cd\u0001\u0000\u0000"+
		"\u0000&\u00d9\u0001\u0000\u0000\u0000(\u0108\u0001\u0000\u0000\u0000*"+
		"\u010a\u0001\u0000\u0000\u0000,-\u0005\b\u0000\u0000-.\u0005\u0005\u0000"+
		"\u0000.0\u0005~\u0000\u0000/1\u0003\u0002\u0001\u00000/\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0003\u0006"+
		"\u0003\u000034\u0003\n\u0005\u000045\u0003\u001c\u000e\u000057\u0005\r"+
		"\u0000\u000068\u0005\u000e\u0000\u000076\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u00008:\u0001\u0000\u0000\u00009;\u0005\u000f\u0000\u0000"+
		":9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000"+
		"\u0000<>\u0005\u0010\u0000\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0005\u007f\u0000\u0000@\u0001"+
		"\u0001\u0000\u0000\u0000AB\u0005\t\u0000\u0000BC\u0005~\u0000\u0000CH"+
		"\u0003\u0004\u0002\u0000DE\u0005\u0081\u0000\u0000EG\u0003\u0004\u0002"+
		"\u0000FD\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000KL\u0005\u007f\u0000\u0000LM\u0005\u0091\u0000\u0000"+
		"M\u0003\u0001\u0000\u0000\u0000NO\u0007\u0000\u0000\u0000O\u0005\u0001"+
		"\u0000\u0000\u0000PQ\u0005\n\u0000\u0000QS\u0005~\u0000\u0000RT\u0003"+
		"\b\u0004\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WX\u0005\u007f\u0000\u0000XY\u0005\u0091\u0000\u0000Y\u0007\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u0005\u0000\u0000[\\\u0005\u0090\u0000\u0000\\]\u0005"+
		"+\u0000\u0000]l\u0005\u0091\u0000\u0000^_\u0005\u0005\u0000\u0000_`\u0005"+
		"\u0090\u0000\u0000`a\u0005~\u0000\u0000af\u0005\u0007\u0000\u0000bc\u0005"+
		"\u0081\u0000\u0000ce\u0005\u0007\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005\u007f"+
		"\u0000\u0000jl\u0005\u0091\u0000\u0000kZ\u0001\u0000\u0000\u0000k^\u0001"+
		"\u0000\u0000\u0000l\t\u0001\u0000\u0000\u0000mn\u0005\u000b\u0000\u0000"+
		"nr\u0005~\u0000\u0000oq\u0003\f\u0006\u0000po\u0001\u0000\u0000\u0000"+
		"qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005\u007f"+
		"\u0000\u0000vw\u0005\u0091\u0000\u0000w\u000b\u0001\u0000\u0000\u0000"+
		"xz\u0005\u0005\u0000\u0000y{\u0003\u000e\u0007\u0000zy\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0005\u0090"+
		"\u0000\u0000}~\u0005~\u0000\u0000~\u007f\u0003\u0010\b\u0000\u007f\u0080"+
		"\u0005\u007f\u0000\u0000\u0080\u0081\u0005\u0091\u0000\u0000\u0081\r\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005|\u0000\u0000\u0083\u0088\u0005\u0005"+
		"\u0000\u0000\u0084\u0085\u0005\u0081\u0000\u0000\u0085\u0087\u0005\u0005"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005}\u0000\u0000\u008c\u000f\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0003\u0012\t\u0000\u008e\u008f\u0005\u0081\u0000\u0000"+
		"\u008f\u0090\u0003\u0018\f\u0000\u0090\u0091\u0005\u0081\u0000\u0000\u0091"+
		"\u0092\u0005L\u0000\u0000\u0092\u0093\u0005\u008c\u0000\u0000\u0093\u0094"+
		"\u0003\u001a\r\u0000\u0094\u00a2\u0001\u0000\u0000\u0000\u0095\u0096\u0003"+
		"\u0014\n\u0000\u0096\u0097\u0005\u0081\u0000\u0000\u0097\u0098\u0003\u0018"+
		"\f\u0000\u0098\u0099\u0005\u0081\u0000\u0000\u0099\u009a\u0005\u0097\u0000"+
		"\u0000\u009a\u009b\u0005\u008c\u0000\u0000\u009b\u009c\u0003\u001a\r\u0000"+
		"\u009c\u00a2\u0001\u0000\u0000\u0000\u009d\u009e\u0003\u0016\u000b\u0000"+
		"\u009e\u009f\u0005\u0081\u0000\u0000\u009f\u00a0\u0003\u0018\f\u0000\u00a0"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a1\u008d\u0001\u0000\u0000\u0000\u00a1"+
		"\u0095\u0001\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a2"+
		"\u0011\u0001\u0000\u0000\u0000\u00a3\u00a4\u0007\u0001\u0000\u0000\u00a4"+
		"\u0013\u0001\u0000\u0000\u0000\u00a5\u00a6\u0007\u0002\u0000\u0000\u00a6"+
		"\u0015\u0001\u0000\u0000\u0000\u00a7\u00a8\u0007\u0003\u0000\u0000\u00a8"+
		"\u0017\u0001\u0000\u0000\u0000\u00a9\u00aa\u0007\u0004\u0000\u0000\u00aa"+
		"\u0019\u0001\u0000\u0000\u0000\u00ab\u00ac\u0007\u0005\u0000\u0000\u00ac"+
		"\u001b\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\f\u0000\u0000\u00ae\u00af"+
		"\u0005~\u0000\u0000\u00af\u00b0\u0003\u001e\u000f\u0000\u00b0\u00b1\u0005"+
		"\u007f\u0000\u0000\u00b1\u00b2\u0005\u0091\u0000\u0000\u00b2\u001d\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0003 \u0010\u0000\u00b4\u00b5\u0005\u008c"+
		"\u0000\u0000\u00b5\u00b6\u0003&\u0013\u0000\u00b6\u00b7\u0005\u0091\u0000"+
		"\u0000\u00b7\u001f\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0005\u0000"+
		"\u0000\u00b9\u00ba\u0005|\u0000\u0000\u00ba\u00bb\u0003\"\u0011\u0000"+
		"\u00bb\u00bc\u0005}\u0000\u0000\u00bc\u00c1\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c1\u0005\u0005\u0000\u0000\u00be\u00c1\u0005\u0007\u0000\u0000\u00bf"+
		"\u00c1\u0005\u0006\u0000\u0000\u00c0\u00b8\u0001\u0000\u0000\u0000\u00c0"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1!\u0001\u0000\u0000\u0000\u00c2\u00c7"+
		"\u0003$\u0012\u0000\u00c3\u00c4\u0005\u0081\u0000\u0000\u00c4\u00c6\u0003"+
		"$\u0012\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8#\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00ca\u00ce\u0005\u0006\u0000\u0000\u00cb\u00ce\u0005\u0007\u0000"+
		"\u0000\u00cc\u00ce\u0003 \u0010\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce%\u0001\u0000\u0000\u0000\u00cf\u00d0\u0006\u0013\uffff\uffff\u0000"+
		"\u00d0\u00d1\u0005y\u0000\u0000\u00d1\u00da\u0003&\u0013\u0004\u00d2\u00d3"+
		"\u0005\u008f\u0000\u0000\u00d3\u00da\u0003&\u0013\u0003\u00d4\u00d5\u0005"+
		"|\u0000\u0000\u00d5\u00d6\u0003&\u0013\u0000\u00d6\u00d7\u0005}\u0000"+
		"\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00da\u0003(\u0014\u0000"+
		"\u00d9\u00cf\u0001\u0000\u0000\u0000\u00d9\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d4\u0001\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000"+
		"\u00da\u00ef\u0001\u0000\u0000\u0000\u00db\u00dc\n\n\u0000\u0000\u00dc"+
		"\u00dd\u0007\u0006\u0000\u0000\u00dd\u00ee\u0003&\u0013\u000b\u00de\u00df"+
		"\n\t\u0000\u0000\u00df\u00e0\u0007\u0007\u0000\u0000\u00e0\u00ee\u0003"+
		"&\u0013\n\u00e1\u00e2\n\b\u0000\u0000\u00e2\u00e3\u0007\b\u0000\u0000"+
		"\u00e3\u00ee\u0003&\u0013\t\u00e4\u00e5\n\u0007\u0000\u0000\u00e5\u00e6"+
		"\u0007\t\u0000\u0000\u00e6\u00ee\u0003&\u0013\b\u00e7\u00e8\n\u0006\u0000"+
		"\u0000\u00e8\u00e9\u0007\n\u0000\u0000\u00e9\u00ee\u0003&\u0013\u0007"+
		"\u00ea\u00eb\n\u0005\u0000\u0000\u00eb\u00ec\u0005x\u0000\u0000\u00ec"+
		"\u00ee\u0003&\u0013\u0006\u00ed\u00db\u0001\u0000\u0000\u0000\u00ed\u00de"+
		"\u0001\u0000\u0000\u0000\u00ed\u00e1\u0001\u0000\u0000\u0000\u00ed\u00e4"+
		"\u0001\u0000\u0000\u0000\u00ed\u00e7\u0001\u0000\u0000\u0000\u00ed\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\'\u0001"+
		"\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u0109\u0005"+
		"\u0003\u0000\u0000\u00f3\u0109\u0005\u0004\u0000\u0000\u00f4\u0109\u0005"+
		"\u0098\u0000\u0000\u00f5\u0109\u0005\u0099\u0000\u0000\u00f6\u0109\u0005"+
		"\u0005\u0000\u0000\u00f7\u00f8\u0005\u0005\u0000\u0000\u00f8\u00f9\u0005"+
		"|\u0000\u0000\u00f9\u00fa\u0003*\u0015\u0000\u00fa\u00fb\u0005}\u0000"+
		"\u0000\u00fb\u0109\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u0005\u0000"+
		"\u0000\u00fd\u00fe\u0005\u0083\u0000\u0000\u00fe\u0103\u0003&\u0013\u0000"+
		"\u00ff\u0100\u0005\u0081\u0000\u0000\u0100\u0102\u0003&\u0013\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"\u0106\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0005\u0084\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108"+
		"\u00f2\u0001\u0000\u0000\u0000\u0108\u00f3\u0001\u0000\u0000\u0000\u0108"+
		"\u00f4\u0001\u0000\u0000\u0000\u0108\u00f5\u0001\u0000\u0000\u0000\u0108"+
		"\u00f6\u0001\u0000\u0000\u0000\u0108\u00f7\u0001\u0000\u0000\u0000\u0108"+
		"\u00fc\u0001\u0000\u0000\u0000\u0109)\u0001\u0000\u0000\u0000\u010a\u010f"+
		"\u0003&\u0013\u0000\u010b\u010c\u0005\u0081\u0000\u0000\u010c\u010e\u0003"+
		"&\u0013\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000"+
		"\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110+\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000"+
		"\u0000\u001507:=HUfkrz\u0088\u00a1\u00c0\u00c7\u00cd\u00d9\u00ed\u00ef"+
		"\u0103\u0108\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}