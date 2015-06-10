grammar SymbolRiddle;

// START:stat
prog:   expr NEWLINE
	addsubline NEWLINE
	expr NEWLINE
	eqlline NEWLINE
	expr;

// END:stat

// START:expr
expr:   	LETTER ADDSUB LETTER EQL LETTER;
addsubline:	ADDSUB ADDSUB ADDSUB;	
eqlline	:	EQL EQL EQL;


// END:expr

// START:tokens
 LETTER :	('A'..'Z')+ ;
 ADDSUB	:	('+' | '-');
 EQL	:	'=';
 NEWLINE:	'\r'? '\n' ;
// END:tokens

// START:fragments
// END:fragments