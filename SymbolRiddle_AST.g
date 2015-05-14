grammar SymbolRiddle_AST;

options {
    output=AST;
    ASTLabelType=CommonTree;
}

tokens{
   Problem;
}

// START:stat
prog:   symbolRiddle;

// END:stat

symbolRiddle
	:	L1=LETTER AS1=ADDSUB L2=LETTER EQL L3=LETTER NEWLINE
		AS2=ADDSUB AS3=ADDSUB AS4=ADDSUB NEWLINE
		L4=LETTER AS5=ADDSUB L5=LETTER EQL L6=LETTER NEWLINE
		EQL EQL EQL NEWLINE
		L7=LETTER AS6=ADDSUB L8=LETTER EQL L9=LETTER NEWLINE 
		-> ^(Problem ^(EQL ^($AS1 $L1 $L2) $L3))
		   ^(Problem ^(EQL ^($AS5 $L4 $L5) $L6))
		   ^(Problem ^(EQL ^($AS6 $L7 $L8) $L9))
		   ^(Problem ^(EQL ^($AS2 $L1 $L4) $L7))
		   ^(Problem ^(EQL ^($AS3 $L2 $L5) $L8))
		   ^(Problem ^(EQL ^($AS4 $L3 $L6) $L9)); 


// START:tokens
 LETTER :	('A'..'Z')+ ;
 ADDSUB	:	('+' | '-');
 EQL	:	'=';
 NEWLINE:	'\r'? '\n' ;
// END:tokens

// START:fragments
// END:fragments