grammar IMP;

// Lexer rules
AVAL : [1-9][0-9]* ;
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

block : '{' '}' | '{' (block | assignment | ifStmt | whileStmt | sequenceNode) '}' ;
assignment : var '=' (var | integer | plusNode | divNode | bracketAExpr) SEMICOLON ;
ifStmt : 'if' bracketBExpr block 'else' block ;
whileStmt : 'while' bracketBExpr block ;
sequenceNode : (block | assignment | ifStmt | whileStmt) (block | assignment | ifStmt | whileStmt | sequenceNode);

varList : var COMMA varList | var ;
mainNode : INT varList SEMICOLON (block | assignment | ifStmt | whileStmt | sequenceNode) ;

plusNode : (var | integer | divNode | bracketAExpr) '+' (var | integer | plusNode | divNode | bracketAExpr) ;
divNode : (var | integer | bracketAExpr) '/' (var | integer | divNode | bracketAExpr) ;

bracketAExpr : '(' (var | integer | plusNode | divNode | bracketAExpr) ')' ;
bracketBExpr : '(' (BVAL | and | greater | not | bracketBExpr) ')' ;

and : (bool | greater | not | bracketBExpr) '&&' (bool | and | greater | not | bracketBExpr);
greater : (var | integer | plusNode | divNode | bracketAExpr) '>' (var | integer | plusNode | divNode | bracketAExpr) ;
not : '!' (bool | and | greater | not | bracketBExpr) ;