grammar IMP;

// Lexer rules
AVAL : [1-9][0-9]* | '0' ;
BVAL : 'true'|'false' ;
VAR : [a-z]+ ;

WS : [ \t\r\n] -> skip ;

// Parser rules
integer : AVAL ;
bool : BVAL ;
var : VAR ;

block : '{' '}'
      | '{' (block | assignment | ifStmt | whileStmt | sequence) '}' ;

assignment : var '=' (var | integer | plus | div | bracketAExpr) ';' ;

ifStmt : 'if' bracketBExpr block 'else' block ;

whileStmt : 'while' bracketBExpr block ;

sequence : (block | assignment | ifStmt | whileStmt) (block | assignment | ifStmt | whileStmt | sequence) ;

varList : var ',' varList
        | var ;

varDecl : 'int' varList ';' ;

mainNode : varDecl (block | assignment | ifStmt | whileStmt | sequence) ;

plus : plus '+' (var | integer | div | bracketAExpr)
     | (var | integer | div | bracketAExpr) '+' (var | integer | div | bracketAExpr) ;

div : div '/' (var | integer | bracketAExpr)
    | (var | integer | bracketAExpr) '/' (var | integer | bracketAExpr) ;

bracketAExpr : '(' (var | integer | plus | div | bracketAExpr) ')' ;

bracketBExpr : '(' (bool | and | greater | not | bracketBExpr) ')' ;

and : and '&&' (bool | greater | not | bracketBExpr)
    | (bool | greater | not | bracketBExpr) '&&' (bool | greater | not | bracketBExpr) ;

greater : (var | integer | plus | div | bracketAExpr) '>' (var | integer | plus | div | bracketAExpr) ;

not : '!' (bool | and | greater | not | bracketBExpr) ;