grammar SymbolRiddle_AST;

options {
    output=AST;
    ASTLabelType=CommonTree;
}

tokens{
   NUMBER;
}

// START:stat
prog:   symbolRiddle;

// END:stat

symbolRiddle
	:	L1=number  AS1=ADDSUB L2=number  EQL L3=number NEWLINE
		AS2=ADDSUB 	      AS3=ADDSUB    AS4=ADDSUB NEWLINE
		L4=number  AS5=ADDSUB L5=number  EQL L6=number NEWLINE
		     EQL                  EQL            EQL   NEWLINE
		L7=number AS6=ADDSUB L8=number EQL L9=number 
		-> ^(EQL ^($AS1 ^(NUMBER $L1) ^(NUMBER $L2)) ^(NUMBER $L3))
		   ^(EQL ^($AS5 ^(NUMBER $L4) ^(NUMBER $L5)) ^(NUMBER $L6))
		   ^(EQL ^($AS6 ^(NUMBER $L7) ^(NUMBER $L8)) ^(NUMBER $L9))
		   ^(EQL ^($AS2 ^(NUMBER $L1) ^(NUMBER $L4)) ^(NUMBER $L7))
		   ^(EQL ^($AS3 ^(NUMBER $L2) ^(NUMBER $L5)) ^(NUMBER $L8))
		   ^(EQL ^($AS4 ^(NUMBER $L3) ^(NUMBER $L6)) ^(NUMBER $L9));
		   
number: LETTER+ ;


// START:tokens
 LETTER :	('A'..'Z') ;
 ADDSUB	:	('+' | '-');
 EQL	:	'=';
 NEWLINE:	'\r'? '\n' ;
// END:tokens

// START:fragments
// END:fragments