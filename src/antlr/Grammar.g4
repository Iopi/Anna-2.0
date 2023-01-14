grammar Grammar;

// program
program: (main)* ;

// main
//main: declaration | initialization | function ;
main: statement_body | function ;

// declaration (constants, global and local variables)
// nasobne prirazeni, paralelni prirazeni
declaration: single_declaration | multiple_assignment | parallel_assignment ;
// int a;
single_declaration: CONST? type IDENTIFIER SEMICOLON;
// int a = b = c = 15 ;
multiple_assignment: CONST? type IDENTIFIER (EQUAL IDENTIFIER)* assignment SEMICOLON ;
// int {a b c} = {4 2 3}
parallel_assignment: CONST? type LEFT_COMPOUND_PARENTHESIS IDENTIFIER+ RIGHT_COMPOUND_PARENTHESIS EQUAL LEFT_COMPOUND_PARENTHESIS value+
                     RIGHT_COMPOUND_PARENTHESIS SEMICOLON ;

// inicialization a = 5;
initialization: IDENTIFIER assignment SEMICOLON ;

// function
function: FUNC IDENTIFIER  LEFT_ROUND_PARENTHESIS (parameter)* RIGHT_ROUND_PARENTHESIS statement ;
parameter: type IDENTIFIER COMMA? ;
FUNC: 'function';

// statement
statement: LEFT_COMPOUND_PARENTHESIS statement_body+ RIGHT_COMPOUND_PARENTHESIS ;

statement_body: declaration | initialization | cycle | conditional | function_call SEMICOLON ;

// identifier (variable/function name)
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]* ;

assignment: EQUAL expression | EQUAL STRING | EQUAL ARRAY;

// TODO boolean, real, string, array, function name ...

// expression
expression: MINUS? INT | MINUS? REAL | BOOLEAN | IDENTIFIER// | function_call
          | LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS
          | expression op=(MULT | DIVISION) expression
          | expression op=(PLUS | MINUS) expression
          | expression op=NOT expression
          | expression op=(EQV_EQV | NOT_EQV | LESS_THAN | GREATER_THAN | LESS_THAN_OR_EQV | GREATER_THAN_OR_EQV) expression
          | expression op=(AND | OR) expression
          ;

//expression: value | advanced_expression ;
//advanced_expression: value; // TODO math, bool op,...
value: MINUS? INT | MINUS? REAL | BOOLEAN | STRING | ARRAY ;// | function_call ;

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
case_body: CASE (value | IDENTIFIER) DOUBLE_DOT statement_body+ BREAK SEMICOLON;
SWITCH: 'switch' ;
CASE: 'case' ;
repeat_cycle: REPEAT statement UNTIL LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS ;
REPEAT: 'repeat' ;
UNTIL: 'until' ;
for_cycle: FOR LEFT_ROUND_PARENTHESIS multiple_assignment SEMICOLON expression SEMICOLON IDENTIFIER assignment RIGHT_ROUND_PARENTHESIS statement ;
FOR: 'for' ;

// function call
function_call: IDENTIFIER  LEFT_ROUND_PARENTHESIS (IDENTIFIER COMMA?)* RIGHT_ROUND_PARENTHESIS ;

// type
type: type_no_array | array_type ;
type_no_array: 'void' | 'int' | 'real' | 'ratio' | 'boolean' | 'string' ;
// data type
INT: [0-9]+ ;
//INT: [1-9][0-9]* | 0;
REAL: INT DOT INT ;
RATIO: INT DIVISION INT ;
BOOLEAN: 'true' | 'false' ;
STRING: '"'[a-zA-Z0-9]*'"' ;
array_type: ARRAY LESS_THAN type_no_array GREATER_THAN ;
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

