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
		-> ^(EQL ^($AS1 ^(NUMBER $L1) ^(NUMBER $L2)) ^(NUMBER $L3))
		   ^(EQL ^($AS5 ^(NUMBER $L4) ^(NUMBER $L5)) ^(NUMBER $L6))
		   ^(EQL ^($AS6 ^(NUMBER $L7) ^(NUMBER $L8)) ^(NUMBER $L9))
		   ^(EQL ^($AS2 ^(NUMBER $L1) ^(NUMBER $L4)) ^(NUMBER $L7))
		   ^(EQL ^($AS3 ^(NUMBER $L2) ^(NUMBER $L5)) ^(NUMBER $L8))
		   ^(EQL ^($AS4 ^(NUMBER $L3) ^(NUMBER $L6)) ^(NUMBER $L9));
		   
number: LETTER+ ;
operator: ADD | SUB;


// START:tokens
 LETTER :	('A'..'Z') ;
 ADD	:	'+';
 SUB	:	'-';
 EQL	:	'=';
 NEWLINE:	'\r'? '\n' ;
// END:tokens

// START:fragments
// END:fragments