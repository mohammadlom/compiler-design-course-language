grammar Lulu2;
//program : ft_dcl? ft_def*
program : ft_dcl? ft_def*;
ft_dcl : 'declare' '{' ( func_dcl | type_dcl | var_def )+ '}';
func_dcl : ( '(' args ')' '=' )? id '(' ( args | args_var )? ')' ';';
args : type ( '[' ']' )* | args ',' type ( '[' ']' )*;
args_var : type id ( '[' ']' )* | args_var ',' type id ( '[' ']' )*;
type : int | bool | float | long | char | double | string | id;
type_dcl : id ';';
var_def : const? type var_val ( ',' var_val )* ';';
var_val : id ( '[' int_const ']' )* ( '=' ( expr | list | allocate id ) )?;
list : '[' ( expr | list ) ( ',' ( expr | list ) )* ']';
ft_def : ( type_def | fun_def )+;
type_def : type id ( ':' id )? '{' component+ '}';
component : access modifier? ( var_def | fun_def );
access_modifier : 'private' | 'public' | 'protected';
fun_def : ( '(' args_var ')' '=' )? function id '(' args_var? ')' block;
block : '{' ( var_def | stmt )* '}';
stmt : assign ';' | func_call ';' | cond_stmt | loop_stmt | return ';' | goto ';' | label | expr ';' | break ';' | continue ';' |
destruct ( '[' ']' )* id ';';
assign : var '=' expr | var '=' new | '(' var ( ',' var )* ')' '=' func_call;
var : ( ( this | super ) '.' )? ref ( '.' ref )*;
ref : id ( '[' expr ']' )*;
expr : expr binary_op expr | '(' expr ')' | unary_op expr| const_val |
func_call | var | nil;
func_call : ( var '.' )? id '(' params? ')' | sizeof '(' ( type | var ) ')' |
read '(' var ')' | write '(' var ')';
params : expr | expr ',' params;
cond_stmt : if '(' expr ')' block ( else block )? | switch '(' var ')' of ':' '{' ( case int_const ':' block )* default ':' block '}';
loop_stmt : for '(' var_def? ';' expr ';' assign? ')' block | while '(' expr ')' block;
goto : goto id;
label : id ':';
const_val : int_const | real_const | char_const | bool_const | string_const;
unary_op : '-' | '!' | '~';
binary_op : arithmetic | relational;
arithmetic : '+' | '-' | '*' | '/' | '%' | '&' | '|' | '^' | '||' | '&&';
relational : '==' | '!=' | '<=' | '=>' | '<' | '>';
