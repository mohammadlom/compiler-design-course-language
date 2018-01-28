grammar lulu2;
program :ft_dcl? ft_def*;

Single_line_c: '%%' ~[\r\n]* -> skip;
Multi_line_c:'%@'.*?'@%' ->skip ;
OCONTROLLS:'.'|','|';'|':';
OBLOCK:'['|']'|'{'|'}'| '(' |')';

INT:'int';
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
READ :'read';
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


fragment DIGIT:[0-9];

Int_const : DIGIT+ | '0'('x'|'X')([0-9]|'a'|'A'|'b'|'B'|'c'|'C'|'d'|'D'|'e'|'E'|'f'|'F')+;
ID:(LETTER|'_')(LETTER|'_'|[0-9])*;

LETTER: [a-zA-Z];

OptionalExponent:(('e'|'E')('+'|'-')?)[0-9]+;

REAL_CONST:(REAL_FACT|REAL_FACT[0-9]+|'.'[0-9]+) (OptionalExponent)?;
REAL_FACT: [0-9]+'.';

CHAR_CONST:'\''([a-z]|[A-Z]|'\\0'|'\\t'|'\\n'|'\\r'|ASCII|[0-9]|ARITHMETIC|
    RELATIONAL|OCONTROLLS|OBLOCK)'\'';
//--------------------------
ASCII:'\\'('x'|'X')( ( ([0-9])+ | ([a-f])+ )+ |(([0-9])+ | ([A-F])+ )+ );
Bool_const:TRUE|FALSE;
String_const: '"' Schar* '"';
fragment Schar: ~["\\] | Escapesequence;
fragment Escapesequence:'\\\'' | '\\"' | '\\?' | '\\\\' | '\\a' | '\\b' | '\\f' | '\\n' | '\\r' | '\\t' | '\\v' ;
ft_dcl : 'declare' '{' ( func_dcl | type_dcl | var_def)+ '}';
func_dcl : ( '(' args ')' '=' )? ID '(' ( args | args_var )? ')' ';';
args : type ( '[' ']' )* | args ',' type ( '[' ']' )*;
args_var : args_var_def ( ',' args_var_def )*;
array_dcl : '[' ']';
args_var_def : type ID ( array_dcl )*;
block : '{' ( stmt | var_def )* '}';
stmt : assign ';' | func_call ';' | cond_stmt | loop_stmt | RETURN ';' | 'goto' ID ';' | label | expr ';' | loop_cond_stmt |
DESTRUCT ( '[' ']' )* ID ';';
loop_cond_stmt : BREAK ';' | CONTINUE ';';
type : INT | BOOL | FLOAT | LONG | CHAR | DOUBLE | STRING | ID;
type_dcl : ID ';';
var_def : CONST? type var_val ( ',' var_val )* ';';
var_val : ID ( '[' Int_const ']' )* ( '=' ( expr | list | ALLOCATE ID ) )?;
list : '[' ( expr | list ) ( ',' ( expr | list ) )* ']';
ft_def : ( type_def | fun_def )+;
type_def : 'type' ID ( ':' ID )? '{' component+ '}';
component : access_modifier? ( var_def | fun_def );
access_modifier : 'private' | 'public' | 'protected';
fun_def : ( '(' args_var ')' '=' )? FUNCTION ID '(' args_var? ')' block;


assign : var '=' expr | var '=' NEW | '(' var ( ',' var )* ')' '=' func_call;//LEFT FACTORING

var : ( ( THIS | SUPER ) '.' )? ref ( '.' ref )*;
ref : ID ( '[' expr ']' )*;

expr : uop = '!' expr |uop = '~' expr| uop = '-' expr |uop = '(' expr ')' |expr bop='*' expr | expr bop='/' expr
|expr bop =('+' | '-' | '%' | '&' | '|' | '^' | '||' | '&&') expr
| expr bop = ('==' | '!=' | '<=' | '>=' | '<' | '>') expr
| const_val |func_call | var | NIL;


func_call : READ '(' var ')' |( var '.' )? ID '(' params? ')' | SIZEOF '(' ( type | var ) ')' | WRITE '(' var ')';

params : expr np;//left fact
np:',' params|;

cond_stmt : if_stmt (else_stmt)? | SWITCH '(' var ') of'  ':' '{' case_stmt default_stmt '}';
case_stmt : ( CASE Int_const ':' block )*;
default_stmt : DEFAULT ':' block;
if_stmt:IF '(' expr ')' block ;
else_stmt:( ELSE block );
loop_stmt : for_loop | while_loop;
for_loop : FOR '(' var_def? ';' expr ';' assign? ')' block;
while_loop : WHILE '(' expr ')' block;
label : ID ':';
const_val : Int_const | REAL_CONST | CHAR_CONST | Bool_const | String_const;
ARITHMETIC : '+' | '-' | '*' | '/' | '%' ;
RELATIONAL : '==' | '!=' | '<=' | '=>' | '<' | '>';

WS : [ \t\r\n]+ -> skip;