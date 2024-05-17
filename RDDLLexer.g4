// $antlr-format alignTrailingComments true, columnLimit 150, maxEmptyLinesToKeep 1, reflowComments false, useTab false
// $antlr-format allowShortRulesOnASingleLine true, allowShortBlocksOnASingleLine true, minEmptyLines 0, alignSemicolons ownLine
// $antlr-format alignColons trailing, singleLineOverrulesHangingColon true, alignLexerCommands true, alignLabels true, alignTrailers true

// + = one or more
// * = zero or more
// ? = zero or none

lexer grammar RDDLLexer;

ALPHA : [a-zA-Z]+;
DIGIT : [0-9];

INTEGER    : DIGIT+;
DOUBLE     : DIGIT* '.' DIGIT+;
ID         : ALPHA ((ALPHA | DIGIT | '-' | '_')* (ALPHA | DIGIT))? '\''?;
VARIABLE   : '?' (ALPHA | DIGIT | '-' | '_')* (ALPHA | DIGIT);
ENUM_VALUE : '@' (ALPHA | DIGIT | '-' | '_')* (ALPHA | DIGIT);

//////////////////////////////////////////////////////
/////////     Reserved keywords        ///////////////
//////////////////////////////////////////////////////

// Domain block
DOMAIN               : 'domain';
REQUIREMENTS         : 'requirements';
TYPES                : 'types';
PVARIABLES           : 'pvariables';
CPFS                 : 'cpfs';
REWARD               : 'reward';
STATE_INVARIANTS     : 'state-invariants';
ACTION_PRECONDITIONS : 'action-preconditions';
TERMINATION          : 'termination';

// Instance block
INSTANCE                 : 'instance';
NON_FLUENTS              : 'non-fluents';
OBJECTS                  : 'objects';
INIT_STATE               : 'init-state';
MAX_NONDEF_ACTIONS       : 'max-nondef-actions';
HORIZON                  : 'horizon';
DISCOUNT                 : 'discount';
STATE_ACTION_CONSTRAINTS : 'state-action-constraints'; // deprecated?

// Requirements
CONCURRENT           : 'concurrent';
CONSTRAINED_STATE    : 'constrained-state';
CONTINUOUS           : 'continuous';
CPF_DETERMINISTIC    : 'cpf-deterministic';
INTEGER_VALUED       : 'integer-valued';
INTERMEDIATE_NODES   : 'intermediate-nodes';
MULTIVALUED          : 'multivalued';
PARTIALLY_OBSERVED   : 'partially-observed';
REWARD_DETERMINISTIC : 'reward-deterministic';

// Type fluents
NON_FLUENT          : 'non-fluent';
STATE_FLUENT        : 'state-fluent';
INTERMEDIATE_FLUENT : 'interm-fluent';
DERIVED_FLUENT      : 'derived-fluent';
OBSERVATION_FLUENT  : 'observ-fluent'; //deprecation warning!
ACTION_FLUENT       : 'action-fluent';

// Type values
BOOL   : 'bool';
INT    : 'int';
REAL   : 'real';
OBJECT : 'object';

// Basic math functions
DIV   : 'div';
MOD   : 'mod';
FMOD  : 'fmod';
MIN   : 'min';
MAX   : 'max';
ABS   : 'abs';
SGN   : 'sgn';
ROUND : 'round';
FLOOR : 'floor';
CEIL  : 'ceil';

// Exponential, logarithmic and transcendental functions
LOG     : 'log';
LN      : 'ln';
EXP     : 'exp';
POW     : 'pow';
SQRT    : 'sqrt';
HYPOT   : 'hypot';
GAMMA   : 'gamma';
LNGAMMA : 'lngamma';

// Trigonometric functions
COS  : 'cos';
SIN  : 'sin';
TAN  : 'tan';
ACOS : 'acos';
ASIN : 'asin';
ATAN : 'atan';
COSH : 'cosh';
SINH : 'sinh';
TANH : 'tanh';

// Equality and inequality comparison expressions
IF      : 'if';
THEN    : 'then';
ELSE    : 'else';
SWITCH  : 'switch';
CASE    : 'case';
DEFAULT : 'default';

// Logical expressions
FORALL  : 'forall';
EXISTS  : 'exists';
SUM     : 'sum';
PROD    : 'prod';
AVG     : 'avg';
MINIMUM : 'minimum';
MAXIMUM : 'maximum';
ARGMAX  : 'argmax';
ARGMIN  : 'argmin';

// Probability distributions
// Discrete probability distributions
KRON_DELTA       : 'KronDelta';
BERNOULLI        : 'Bernoulli';
DISCRETE         : 'Discrete';
UNNORMDISCRETE   : 'UnnormDiscrete';
POISSON          : 'Poisson';
BINOMIAL         : 'Binomial';
NEGATIVEBINOMIAL : 'NegativeBinomial';
GEOMETRIC        : 'Geometric';

// Continuous probability distributions
DIRAC_DELTA : 'DiracDelta';
NORMAL      : 'Normal';
UNIFORM     : 'Uniform';
EXPONENTIAL : 'Exponential';
WEIBULL     : 'Weibull';
GAMMA_DIST  : 'Gamma';
BETA        : 'Beta';
PARETO      : 'Pareto';
STUDENT     : 'Student';
GUMBEL      : 'Gumbel';
LAPLACE     : 'Laplace';
CAUCHY      : 'Cauchy';
GOMPERTZ    : 'Gompertz';
CHISQUARE   : 'ChiSquare';
KUMARASWAMY : 'Kumaraswamy';

// Multivariable distributions
DIRICHLET           : 'Dirichlet';
MULTINOMIAL         : 'Multinomial';
MULTIVARIATENORMAL  : 'MultivariateNormal';
MULTIVARIATESTUDENT : 'MultivariateStudent';

// Matrix operations
ROW           : 'row';
COLUMN        : 'col';
DET           : 'det';
INVERSE       : 'inverse';
PSEUDOINVERSE : 'pinverse';
CHOLESKY      : 'cholesky';

// Operators and punctuation
AND          : '^';
OR           : '|';
NOT          : '~';
PLUS         : '+';
TIMES        : '*';
LPAREN       : '(';
RPAREN       : ')';
LCURLY       : '{';
RCURLY       : '}';
DOT          : '.';
COMMA        : ',';
UNDERSCORE   : '_';
LBRACK       : '[';
RBRACK       : ']';
IMPLY        : '=>';
EQUIV        : '<=>';
NEQ          : '~=';
LESSEQ       : '<=';
LESS         : '<';
GREATEREQ    : '>=';
GREATER      : '>';
ASSIGN_EQUAL : '=';
COMP_EQUAL   : '==';
DIV_OP       : '/';
MINUS        : '-';
COLON        : ':';
SEMI         : ';';
DOLLAR_SIGN  : '$';
QUESTION     : '?';
AMPERSAND    : '&';

// Miscellaneous 
NEG_INF : 'neg-inf';
POS_INF : 'pos-inf';
LEVEL   : 'level'; // deprecated? Are computed automatically at compile time
TRUE    : 'true';
FALSE   : 'false';

// Unsupported ?
OTHERWISE      : 'otherwise';
TERMINATE_WHEN : 'terminate-when';
TERMINAL       : 'terminal';
CDFS           : 'cdfs';

// Whitespace
WS: [ \t\r\n]+ -> skip;