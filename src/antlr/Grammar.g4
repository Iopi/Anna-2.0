grammar Grammar;

// program
program: (main)* ;

// main
main: declaration | inicialization | function ;

// declaration (constants, global and local variables)
// nasobne prirazeni, paralelni prirazeni
declaration: CONST? type IDENTIFIER (EQUAL IDENTIFIER)* assignment? SEMICOLON | // int a = b = c = 15 ;
CONST? type LEFT_COMPOUND_PARENTHESIS IDENTIFIER+ RIGHT_COMPOUND_PARENTHESIS EQUAL LEFT_COMPOUND_PARENTHESIS value+
RIGHT_COMPOUND_PARENTHESIS SEMICOLON ; // int {a b c} = {4 2 3}

// inicialization a = 5;
inicialization: IDENTIFIER right_side SEMICOLON ;
right_side: assignment | IDENTIFIER; // chce to lepsi nazev

// function
function: FUNC IDENTIFIER  LEFT_ROUND_PARENTHESIS (parameter)* RIGHT_ROUND_PARENTHESIS statement ;
parameter: type IDENTIFIER COMMA? ;
FUNC: 'function';

// statement
statement: LEFT_COMPOUND_PARENTHESIS statement_body+ RIGHT_COMPOUND_PARENTHESIS ;

statement_body: declaration | inicialization | cycle | conditional | function_call SEMICOLON ;

// identifier (variable/function name)
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]* ;

assignment: EQUAL expression ;

// TODO boolean, real, string, array, function name ...

// expression
expression: MINUS? INT | MINUS? REAL | BOOLEAN | function_call |
          | LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS
          | expression op=(MULT | DIVISION) expression
          | expression op=(PLUS | MINUS) expression
          | expression op=NOT expression
          | expression op=(EQV_EQV | NOT_EQV | LESS_THAN | GREATER_THAN | LESS_THAN_OR_EQV | GREATER_THAN_OR_EQV) expression
          | expression op=(AND | OR) expression
          ;

//expression: value | advanced_expression ;
//advanced_expression: value; // TODO math, bool op,...
value: MINUS? INT | MINUS? REAL | BOOLEAN | STRING | ARRAY | function_call ;

// conditonal
conditional: if_part else_part? ; 
if_part: IF LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS statement ;
else_part: ELSE statement ;
IF: 'if' ;
ELSE: 'else' ;

// cycle (switch, for, while.. do, do.. while, repeat.. Until)
cycle: while | do_while | for | repeat | switch ;
while: WHILE LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS statement ;
WHILE: 'while' ;
do_while: DO statement WHILE LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS ;
DO: 'do' ;
switch: SWITCH LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS
LEFT_COMPOUND_PARENTHESIS (CASE IDENTIFIER DOUBLE_DOT statement_body+ BREAK SEMICOLON) RIGHT_COMPOUND_PARENTHESIS ;
SWITCH: 'switch' ;
CASE: 'case' ;
repeat: REPEAT statement UNTIL LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS ;
REPEAT: 'repeat' ;
UNTIL: 'until' ;
for: FOR LEFT_ROUND_PARENTHESIS for_declaration SEMICOLON expression SEMICOLON IDENTIFIER assignment RIGHT_ROUND_PARENTHESIS statement ;
FOR: 'for' ;
//for_declaration: type IDENTIFIER EQUAL value ;
for_declaration: declaration; /* TODO paralelni nemuze atd. */

// function call
function_call: IDENTIFIER  LEFT_ROUND_PARENTHESIS (IDENTIFIER COMMA?)* RIGHT_ROUND_PARENTHESIS ;

// type
type: 'void' | 'int' | 'real' | 'ratio' | 'boolean' | 'string' | array_type ;
// data type
INT: [0-9]+ ;
//INT: [1-9][0-9]* | 0;
REAL: INT DOT INT ;
RATIO: INT DIVISION INT ;
BOOLEAN: 'true' | 'false' ;
STRING: [a-zA-Z][a-zA-Z0-9]* ;
array_type: ARRAY LESS_THAN type GREATER_THAN ;
ARRAY: 'array' ;

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
SPACE: [ \n\t\r]+ -> skip ;

