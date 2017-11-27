grammar Lulu2;
//program : ft_dcl? ft_def*
program : ft_dcl? ft_def*;
ft_dcl : 'declare' '{' ( func_dcl | type_dcl | var_def )+ '}';
func_dcl : ( '(' args ')' '=' )? id '(' ( args | args_var )? ')' ';';
args : type ( '[' ']' )* | args ',' type ( '[' ']' )*;
args_var : type id ( '[' ']' )* | args_var ',' type id ( '[' ']' )*;
type : INT | BOOL | FLOAT | LONG | CHAR | DOUBLE | string | id;
type_dcl : id ';';
var_def : CONST? type var_val ( ',' var_val )* ';';
var_val : id ( '[' int_const ']' )* ( '=' ( expr | list | allocate id ) )?;
list : '[' ( expr | list ) ( ',' ( expr | list ) )* ']';
ft_def : ( type_def | fun_def )+;
type_def : type id ( ':' id )? '{' component+ '}';
component : access_modifier? ( var_def | fun_def );
access_modifier : 'private' | 'public' | 'protected';
fun_def : ( '(' args_var ')' '=' )? function id '(' args_var? ')' block;
block : '{' ( var_def | stmt )* '}';
stmt : assign ';' | func_call ';' | cond_stmt | loop_stmt | RETURN ';' | goto ';' | label | expr ';' | BREAK ';' | CONTINUE ';' |
destruct ( '[' ']' )* id ';';
assign : var '=' expr | var '=' NEW | '(' var ( ',' var )* ')' '=' func_call;
var : ( ( THIS | SUPER ) '.' )? ref ( '.' ref )*;
ref : id ( '[' expr ']' )*;
expr : expr binary_op expr | '(' expr ')' | unary_op expr| const_val |
func_call | var | nil;
func_call : ( var '.' )? id '(' params? ')' | sizeof '(' ( type | var ) ')' |
read '(' var ')' | write '(' var ')';
params : expr | expr ',' params;
cond_stmt : IF '(' expr ')' block ( ELSE block )? | SWITCH '(' var ')' of ':' '{' ( CASE int_const ':' block )* DEFAULT ':' block '}';
loop_stmt : FOR '(' var_def? ';' expr ';' assign? ')' block | WHILE '(' expr ')' block;
goto : 'goto' id;
label : id ':';
const_val : int_const | real_const | char_const | bool_const | string_const;
unary_op : '-' | '!' | '~';
binary_op : arithmetic | relational;
 arithmetic : '+' | '-' | '*' | '/' | '%' | '&' | '|' | '^' | '||' | '&&'|'!'|'~';
relational : '==' | '!=' | '<=' | '=>' | '<' | '>';
ocontrollS:'.'|','|';'|':'|;
oblock:'['|']'|'{'|'}'| '(' |')';

INT :'int';
BOOL:'bool';
FLOAT:'float';
LONG:'long';
DOUBLE:'double';
string:'string';
id:(char_const|'_')+(char_const|'_'|int_const)*;
CHAR:'char';

allocate :'allocate';
DEFAULT :'default';
THIS:'this';
destruct :'destruct';
IF :'if';
TRUE: 'true';
BREAK :'break';
read :'read';
CASE :'case';
ELSE:'else';
RETURN :'return';
WHILE :'while';
FALSE :'false';
NEW :'new';
sizeof :'sizeof';
write :'write';
CONST :'const';
function :'function';
FOR:'for';
SWITCH:'switch';
CONTINUE:'continue';
of:'of';
nil :'nil';
SUPER:'super';

digit:'[0-9]';
digits:digit(digit)*;


int_const:digits|
'0'('x'|'X')( ( ('[0-9]')+ | ('[a-f]')+ )+ |(('[0-9]')+ | ('[A-F]')+ )+ );

optionalFraction:'.'digits|'.';//null;

optionalExponent:(('e'|'E')('+'|'-')?)digits;



real_const:((digits'.')|('.'digits)|(digits'.'digits)) (optionalExponent)?;


char_const:singleQ

('[a-z]'|'[A-Z]'|'\\0'|'\\t'|'\\n'|'\\r'|
ascii|digit|arithmetic|relational|ocontrollS|oblock)

singleQ;
//--------------------------
ascii:
'\\'('x'|'X')( ( ('[0-9]')+ | ('[a-f]')+ )+ |(('[0-9]')+ | ('[A-F]')+ )+ );
bool_const:TRUE|FALSE;
string_const:doubleQ (char_const)* doubleQ;

singleQ:'\'';
doubleQ:'"';
