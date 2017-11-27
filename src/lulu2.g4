grammar lulu2;
//program : ft_dcl? ft_def*

OCONTROLLS:'.'|','|';'|':';
OBLOCK:'['|']'|'{'|'}'| '(' |')';

INT :'int';
BOOL:'bool';
FLOAT:'float';
LONG:'long';
DOUBLE:'double';
STRING:'string';
CHAR:'char';

ALLOCATE :'allocate';
DEFAULT :'default';
THIS:'this';
DESTRUCT :'destruct';
IF :'if';
TRUE: 'true';
BREAK :'break';
READ :'READ';
CASE :'case';
ELSE:'else';
RETURN :'return';
WHILE :'while';
FALSE :'false';
NEW :'new';
SIZEOF :'sizeof';
WRITE :'write';
CONST :'const';
FUNCTION :'function';
FOR:'for';
SWITCH:'switch';
CONTINUE:'continue';
OF:'of';
NIL :'nil';
SUPER:'super';


DIGIT:[0-9];
DIGITS:DIGIT(DIGIT)*;


INT_CONST:DIGITS|'0'('x'|'X')( ( ([0-9])+ | ([a-f])+ )+ |(([0-9])+ | ([A-F])+ )+ );

ID:(LETTER|'_')+(LETTER|'_'|DIGITS)*;

LETTER: [a-z]|[A-Z];

optionalExponent:(('e'|'E')('+'|'-')?)DIGITS;

real_const:((DIGITS'.')|('.'DIGITS)|(DIGITS'.'DIGITS)) (optionalExponent)?;

CHAR_CONST:'\''([a-z]|[A-Z]|'\\0'|'\\t'|'\\n'|'\\r'|ASCII|DIGIT|ARITHMETIC|
    RELATIONAL|OCONTROLLS|OBLOCK)'\'';
//--------------------------
ASCII:'\\'('x'|'X')( ( ([0-9])+ | ([a-f])+ )+ |(([0-9])+ | ([A-F])+ )+ );
bool_const:TRUE|FALSE;
string_const:'"' (CHAR_CONST)* '"';
program : ft_dcl? ft_def*;
ft_dcl : 'declare' '{' ( func_dcl | type_dcl | var_def )+ '}';
func_dcl : ( '(' args ')' '=' )? ID '(' ( args | args_var )? ')' ';';
args : type ( '[' ']' )* | args ',' type ( '[' ']' )*;
args_var : type ID ( '[' ']' )* | args_var ',' type ID ( '[' ']' )*;
type : INT | BOOL | FLOAT | LONG | CHAR | DOUBLE | STRING | ID;
type_dcl : ID ';';
dvar_def : CONST? type var_val ( ',' var_val )* ';';
var_val : ID ( '[' INT_CONST ']' )* ( '=' ( expr | list | ALLOCATE ID ) )?;
list : '[' ( expr | list ) ( ',' ( expr | list ) )* ']';
ft_def : ( type_def | fun_def )+;
type_def : type ID ( ':' ID )? '{' component+ '}';
component : access_modifier? ( var_def | fun_def );
access_modifier : 'private' | 'public' | 'protected';
fun_def : ( '(' args_var ')' '=' )? FUNCTION ID '(' args_var? ')' block;
block : '{' ( var_def | stmt )* '}';
stmt : assign ';' | func_call ';' | cond_stmt | loop_stmt | RETURN ';' | GOTO ';' | label | expr ';' | BREAK ';' | CONTINUE ';' |
DESTRUCT ( '[' ']' )* ID ';';
assign : var '=' expr | var '=' NEW | '(' var ( ',' var )* ')' '=' func_call;
var : ( ( THIS | SUPER ) '.' )? ref ( '.' ref )*;
ref : ID ( '[' expr ']' )*;
expr : (expr1  | '(' expr ')' | unary_op expr| const_val |
func_call | var | NIL);
expr1: binary_op expr expr1;
func_call : ( var '.' )? ID '(' params? ')' | SIZEOF '(' ( type | var ) ')' |
READ '(' var ')' | WRITE '(' var ')';
params : expr | expr ',' params;
cond_stmt : IF '(' expr ')' block ( ELSE block )? | SWITCH '(' var ') of'  ':' '{' ( CASE INT_CONST ':' block )* DEFAULT ':' block '}';
loop_stmt : FOR '(' var_def? ';' expr ';' assign? ')' block | WHILE '(' expr ')' block;
GOTO : 'goto' ID;
label : ID ':';
const_val : INT_CONST | real_const | CHAR_CONST | bool_const | string_const;
unary_op : '-' | '!' | '~';
binary_op : ARITHMETIC | RELATIONAL;
ARITHMETIC : '+' | '-' | '*' | '/' | '%' | '&' | '|' | '^' | '||' | '&&'|'!'|'~';
RELATIONAL : '==' | '!=' | '<=' | '=>' | '<' | '>';

WS : [ \t\r\n]+ -> skip;
