grammar Grammar;

// program
program: (declaration | function)* ;

// declaration (constants, gloval and local variables)
// nasobne prirazeni
// TODO paralelni prirazeni
declaration: CONST? type IDENTIFIER assignment? (COMMA IDENTIFIER assignment?)* SEMICOLON ;

// function
function: type function_call LEFT_COMPOUND_PARENTHESIS statement_body RIGHT_COMPOUND_PARENTHESIS statement ;

// statement TODO
statement: LEFT_COMPOUND_PARENTHESIS statement_body+ RIGHT_COMPOUND_PARENTHESIS ;

statement_body: declaration | cycle  |  conditional | function_call ;

// identifier (variable/function name)
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]* ;

assignment: EQUAL expression ;

// TODO boolean, real, string, array, function name ...

// expression
expression: value | advanced_expression ;
advanced_expression: value; // TODO math, bool op,...
value: MINUS? INT | MINUS? REAL | BOOLEAN | STRING | ARRAY | function_call ;

// conditonal
conditional: if_part else_part? ; 
if_part: IF LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS statement ; // TODO expression nebo special cond?
else_part: ELSE statement ;
IF: 'if' ;
ELSE: 'else' ;

// cycle TODO more then while
cycle: WHILE LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS statement ;
WHILE: 'while' ;
//switch, for, while.. do, do.. while, repeat.. Until

// function call
function_call: IDENTIFIER  LEFT_ROUND_PARENTHESIS (type IDENTIFIER COMMA?)* RIGHT_ROUND_PARENTHESIS SEMICOLON ;

// type
type: 'int' | 'real' | 'ratio' | 'boolean' | 'string' | array_type ;
// data type
INT: [0-9]+ ; // TODO problem 012 == 12?
//INT: [1-9][0-9]* | 0;
REAL: INT DOT INT ;
RATIO: INT DIVISION INT ; // TODO pod lomitkem asi bez nuly
BOOLEAN: 'true' | 'false' ;
STRING: [a-zA-Z][a-zA-Z0-9]* ; // TODO
array_type: ARRAY LEFT_SHARP_PARENTHESIS type RIGHT_SHARP_PARENTHESIS ;
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
LEFT_SHARP_PARENTHESIS: '<' ;
RIGHT_SHARP_PARENTHESIS: '>' ;

// operators
EQUAL: '=' ;

// arithmetic operators

// logical operations

// other
DOT: '.' ;
COMMA: ',' ;
SEMICOLON: ';' ;

