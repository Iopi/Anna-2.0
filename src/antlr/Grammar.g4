grammar Grammar;

// program
program: (main)* ;

// main
main: declaration | initialization | statement_body | function ;

// declaration, single, parallel and multiple assignment
declaration: single_declaration | multiple_assignment | parallel_assignment ;
// int a;
single_declaration: type IDENTIFIER SEMICOLON;
// int a = b = c = 15 ;
multiple_assignment: CONST? type IDENTIFIER (EQUAL IDENTIFIER)* assignment SEMICOLON ;
// int {a b c} = {4 2 3}
parallel_assignment: CONST? type LEFT_COMPOUND_PARENTHESIS IDENTIFIER+ RIGHT_COMPOUND_PARENTHESIS EQUAL
LEFT_COMPOUND_PARENTHESIS value+ RIGHT_COMPOUND_PARENTHESIS SEMICOLON ;

// inicialization a = 5;
initialization: IDENTIFIER assignment SEMICOLON ;

// function
function: FUNC IDENTIFIER  LEFT_ROUND_PARENTHESIS (parameter)* RIGHT_ROUND_PARENTHESIS statement ;
parameter: type IDENTIFIER COMMA? ;
FUNC: 'function';

// statement
statement: LEFT_COMPOUND_PARENTHESIS (statement_options)+ RIGHT_COMPOUND_PARENTHESIS ;
statement_options: declaration | initialization | statement_body;

statement_body: cycle | conditional | function_call SEMICOLON ;

assignment: EQUAL expression | EQUAL STRING;

// expression
expression: MINUS? INT | MINUS? real | MINUS? ratio | BOOLEAN | IDENTIFIER// | function_call
          | exp_parenthesis | expression exp_op ;

exp_op: exp_mult_div | exp_mult_div | exp_plus_minus | exp_not | exp_eqv | exp_and_or;
exp_parenthesis: LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS ;
exp_mult_div: op=(MULT | DIVISION) expression ;
exp_plus_minus: op=(PLUS | MINUS) expression ;
exp_not: op=NOT expression ;
exp_eqv: op=(EQV_EQV | NOT_EQV | LESS_THAN | GREATER_THAN | LESS_THAN_OR_EQV | GREATER_THAN_OR_EQV) expression ;
exp_and_or: op=(AND | OR) expression ;

// value
value: MINUS? INT | MINUS? real | MINUS? ratio | BOOLEAN | STRING ;

// conditonal
conditional: if_part else_part? ; 
if_part: IF LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS statement ;
else_part: ELSE statement ;
IF: 'if' ;
ELSE: 'else' ;

// cycle (switch, for, while.. do, do.. while, repeat.. Until)
cycle: while_cycle | do_while | for_cycle | repeat_cycle | switch_cycle ;
while_cycle: WHILE LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS statement ;
WHILE: 'while' ;
do_while: DO statement WHILE LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS ;
DO: 'do' ;
switch_cycle: SWITCH LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS
LEFT_COMPOUND_PARENTHESIS (case_body)+ RIGHT_COMPOUND_PARENTHESIS ;
case_body: CASE (value | IDENTIFIER) DOUBLE_DOT (statement_options)+ BREAK SEMICOLON;
SWITCH: 'switch' ;
CASE: 'case' ;
repeat_cycle: REPEAT statement UNTIL LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS ;
REPEAT: 'repeat' ;
UNTIL: 'until' ;
for_cycle: FOR LEFT_ROUND_PARENTHESIS multiple_assignment expression SEMICOLON initialization RIGHT_ROUND_PARENTHESIS statement ;
FOR: 'for' ;

// function call
function_call: IDENTIFIER  LEFT_ROUND_PARENTHESIS (IDENTIFIER COMMA?)* RIGHT_ROUND_PARENTHESIS ;

// type
type: type_no_array ;// | array_type ;
type_no_array: 'void' | 'int' | 'real' | 'ratio' | 'boolean' | 'string' ;
// data type
INT: [0-9]+ ;
//INT: [1-9][0-9]* | 0;
real: INT DOT INT ;
ratio: INT DIVISION INT ;
BOOLEAN: 'true' | 'false' ;
STRING: '"'[a-zA-Z0-9]*'"' ;

// math
MINUS: '-' ;
PLUS: '+' ;
MULT: '*' ;
DIVISION: '/' ;

// keywords
CONST: 'const' ;

// parenthesis
LEFT_ROUND_PARENTHESIS: '(' ;
RIGHT_ROUND_PARENTHESIS: ')' ;
LEFT_COMPOUND_PARENTHESIS: '{' ;
RIGHT_COMPOUND_PARENTHESIS: '}' ;
LEFT_SQUARE_PARENTHESIS: '[' ;
RIGHT_SQUARE_PARENTHESIS: ']' ;

// operators
EQUAL: '=' ;

// arithmetic operators
LESS_THAN: '<';
LESS_THAN_OR_EQV: '<=';
GREATER_THAN: '>';
GREATER_THAN_OR_EQV: '>=';
EQV_EQV: '==';
NOT_EQV: '!=';

// logical operations
AND: '&&' ;
OR: '||' ;
NOT: '!' ;

// other
DOT: '.' ;
DOUBLE_DOT: ':' ;
COMMA: ',' ;
SEMICOLON: ';' ;
BREAK: 'break' ;

// identifier (variable/function name)
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]* ;
SPACE: [ \n\t\r]+ -> skip ;

