grammar Grammar;

program: body ;
body: (variableDeclaration | functionDeclaration)* ;

/* variables */
variableDeclaration: singleDeclaration | multipleDeclaration | parallelDeclaration;
singleDeclaration: CONST? type variableAssignment SEMICOLON;
multipleDeclaration: CONST? type variableAssignment (COMMA variableAssignment)+ SEMICOLON;
parallelDeclaration: CONST? type LEFT_ROUND_PARENTHESIS (IDENTIFIER (COMMA IDENTIFIER)*) RIGHT_ROUND_PARENTHESIS EQUALS LEFT_ROUND_PARENTHESIS (expression (COMMA expression)*) RIGHT_ROUND_PARENTHESIS SEMICOLON;

variableAssignment: IDENTIFIER (EQUALS expression)?;
variableInitialization: IDENTIFIER EQUALS (expression (EQUALS expression)*) SEMICOLON;

/* functions */
functionDeclaration: type IDENTIFIER LEFT_ROUND_PARENTHESIS (type IDENTIFIER (COMMA type IDENTIFIER)*)? RIGHT_ROUND_PARENTHESIS statement;

/* statement */
statement: LEFT_COMPOUND_PARENTHESIS (statement (RETURN expression SEMICOLON)?) RIGHT_COMPOUND_PARENTHESIS | (statementBody)* ;
RETURN: 'return';
statementBody: (variableDeclaration | variableInitialization | conditional | cycle | (functionCall SEMICOLON)) ;

/* function call */
functionCall: IDENTIFIER LEFT_ROUND_PARENTHESIS (expression (COMMA expression)*)? RIGHT_ROUND_PARENTHESIS;
/* if/else */
conditional: IF LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS statement (ELSE statement)?;
IF: 'if' ;
ELSE: 'else' ;
/* cycle */
cycle: whileCycle | doWhile | repeatCycle | forCycle | switchCycle;
whileCycle: WHILE LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS statement;
WHILE: 'while' ;
doWhile: DO statement WHILE LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS;
DO: 'do' ;
repeatCycle: REPEAT statement UNTIL LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS;
REPEAT: 'repeat' ;
UNTIL: 'until' ;
forCycle: FOR LEFT_ROUND_PARENTHESIS (variableDeclaration | variableAssignment) SEMICOLON expression SEMICOLON variableAssignment RIGHT_ROUND_PARENTHESIS statement ;
FOR: 'for' ;
switchCycle: SWITCH LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS LEFT_COMPOUND_PARENTHESIS (switchBody)+ RIGHT_COMPOUND_PARENTHESIS;
SWITCH: 'switch' ;
CASE: 'case' ;
BREAK: 'break';
switchBody: CASE (expression | IDENTIFIER) LEFT_COMPOUND_PARENTHESIS (statementBody)+ RIGHT_COMPOUND_PARENTHESIS;

/* expression */

expression: value | IDENTIFIER | functionCall
          | LEFT_ROUND_PARENTHESIS expression RIGHT_ROUND_PARENTHESIS
          | expression op=(MULT | DIVISION) expression
          | expression op=(PLUS | MINUS) expression
          | expression op=NOT expression
          | expression op=(EQV_EQV | NOT_EQV | LESS_THAN | GREATER_THAN | LESS_THAN_OR_EQV | GREATER_THAN_OR_EQV) expression
          | expression op=(AND | OR) expression
          ;

value: MINUS? INT | MINUS? real | BOOLEAN | STRING ;

type: 'void' | 'int' | 'real' | 'boolean' | 'string' ;

EQUALS: '=';

// math
MINUS: '-' ;
PLUS: '+' ;
MULT: '*' ;
DIVISION: '/' ;

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

// parenthesees
LEFT_ROUND_PARENTHESIS: '(' ;
RIGHT_ROUND_PARENTHESIS: ')' ;
LEFT_COMPOUND_PARENTHESIS: '{' ;
RIGHT_COMPOUND_PARENTHESIS: '}' ;
/* instruction end */
SEMICOLON: ';';
/* common stuff */
COMMA: ',';
DOT: '.';
/* constant */
CONST: 'const';
/* data types */
real: INT DOT INT ;
BOOLEAN: 'true' | 'false' ;
STRING: '"'[a-zA-Z0-9]*'"' ;
INT : [0-9]+;

// identifier of variable or function
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]* ;
// spaces
SPACE: [ \n\t\r]+ -> skip ;