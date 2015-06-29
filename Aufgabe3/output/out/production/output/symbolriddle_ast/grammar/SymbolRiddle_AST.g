grammar SymbolRiddle_AST;

options {
    output=AST;
    ASTLabelType=CommonTree;
}

tokens{
   NUMBER;
}

// package for walker
@header {package symbolriddle_ast.grammar;}
// package for lexer
@lexer::header {package symbolriddle_ast.grammar;}

// START:stat
prog:   symbolRiddle;

// END:stat

symbolRiddle
	:	L1=number  AS1=operator L2=number  EQL L3=number NEWLINE
		AS2=operator 	      AS3=operator    AS4=operator NEWLINE
		L4=number  AS5=operator L5=number  EQL L6=number NEWLINE
		     EQL                  EQL            EQL   NEWLINE
		L7=number AS6=operator L8=number EQL L9=number 
		-> ^(EQL ^($AS1 $L1 $L2) $L3)
		   ^(EQL ^($AS5 $L4 $L5) $L6)
		   ^(EQL ^($AS6 $L7 $L8) $L9)
		   ^(EQL ^($AS2 $L1 $L4) $L7)
		   ^(EQL ^($AS3 $L2 $L5) $L8)
		   ^(EQL ^($AS4 $L3 $L6) $L9);
		   
number: LETTER+ 
	-> ^(NUMBER LETTER+);
	
operator: ADD | SUB;

WS  :   ( ' '
        | '\t'
        ){skip();}
    ;
    
// START:tokens
 LETTER :	('A'..'Z') ;
 ADD	:	'+';
 SUB	:	'-';
 EQL	:	'=';
 NEWLINE:	'\r'? '\n' ;
// END:tokens

// START:fragments
// END:fragments