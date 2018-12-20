grammar IMP;

// Lexer rules
AVAL : [1-9][0-9]* | '0' ;
BVAL : 'true'|'false' ;
INT : 'int'  ;
IF : 'if' ;
WHILE : 'while' ;
VAR : [a-z]+ ;

PLUS : '+' ;
DIV : '/' ;

OPEN_BRACKET : '(' ;
CLOSE_BRACKET : ')' ;

AND : '&&' ;
GREATER : '>' ;
NOT : '!' ;

WS : [ \t\r\n] -> skip ;
COMMA : ',' ;
SEMICOLON : ';' ;

// Parser rules
integer : AVAL ;
bool : BVAL ;
var : VAR ;

block : '{' '}' | '{' (block | assignment | ifStmt | whileStmt | sequence) '}' ;
assignment : var '=' (var | integer | plus | div | bracketAExpr) SEMICOLON ;
ifStmt : 'if' bracketBExpr block 'else' block ;
whileStmt : 'while' bracketBExpr block ;
sequence : (block | assignment | ifStmt | whileStmt) (block | assignment | ifStmt | whileStmt | sequence);

varList : var COMMA varList | var ;
mainNode : INT varList SEMICOLON (block | assignment | ifStmt | whileStmt | sequence) ;

plus : (var | integer | div | bracketAExpr) ('+' (var | integer | div | bracketAExpr))* ;
div : (var | integer | bracketAExpr) ('/' (var | integer | div | bracketAExpr))* ;

bracketAExpr : '(' (var | integer | plus | div | bracketAExpr) ')' ;
bracketBExpr : '(' (BVAL | and | greater | not | bracketBExpr) ')' ;

and : (bool | greater | not | bracketBExpr) '&&' (bool | and | greater | not | bracketBExpr);
greater : (var | integer | plus | div | bracketAExpr) '>' (var | integer | plus | div | bracketAExpr) ;
not : '!' (bool | and | greater | not | bracketBExpr) ;