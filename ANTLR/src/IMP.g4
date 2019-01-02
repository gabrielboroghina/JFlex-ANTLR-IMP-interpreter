grammar IMP;

// Lexer rules

AVAL : [1-9][0-9]* | '0' ; // integer
BVAL : 'true'|'false' ;    // boolean
VAR : [a-z]+ ;             // variable

WS : [ \t\r\n] -> skip ;   // skip all whitespaces

// Parser rules

integer : AVAL ;
bool : BVAL ;
var : VAR ;

block : '{' '}'
      | '{' (block | assignment | ifStmt | whileStmt | sequence) '}' ;

assignment : var '=' (var | integer | plus | div | bracketAExpr) ';' ; // var = AExpr;

ifStmt : 'if' bracketBExpr block 'else' block ;

whileStmt : 'while' bracketBExpr block ;

sequence : // right-associative
         (block | assignment | ifStmt | whileStmt) (block | assignment | ifStmt | whileStmt | sequence) ;

varList : var ',' varList
        | var ;

varDecl : 'int' varList ';' ;

mainNode : varDecl (block | assignment | ifStmt | whileStmt | sequence) ;

plus : plus '+' (var | integer | div | bracketAExpr) // left-assocative operator
     | (var | integer | div | bracketAExpr) '+' (var | integer | div | bracketAExpr) ;

div : div '/' (var | integer | bracketAExpr) // left-assocative operator
    | (var | integer | bracketAExpr) '/' (var | integer | bracketAExpr) ;

bracketAExpr : '(' (var | integer | plus | div | bracketAExpr) ')' ; // ( AExpr )

bracketBExpr : '(' (bool | and | greater | not | bracketBExpr) ')' ; // ( BExpr )

and : and '&&' (bool | greater | not | bracketBExpr) // left-assocative operator
    | (bool | greater | not | bracketBExpr) '&&' (bool | greater | not | bracketBExpr) ;

greater : (var | integer | plus | div | bracketAExpr) '>' (var | integer | plus | div | bracketAExpr) ; // AExpr > AExpr

not : '!' (bool | bracketBExpr | not | and | greater) ; // ! BExpr