grammar miniP_AST;

options {
    output=AST;
    ASTLabelType=CommonTree;
}

tokens {
    PROG;
    CONSEQUENCE;
    ALTERNATIVE;
    DECL;
    IFELSE;
    WHILE;
    BLOCK;
    SLIST;
    FUNC;
}

// START:rules
prog	:	PROGRAM
		  declarations
		BEGINSYM
		  statements
		ENDSYM -> ^(PROG declarations+ statements);
		
declarations
	:	(variable SEMICOLON)+ -> ^(DECL variable+);
	
variable
	:	type ID (COMMA ID)* -> ^(type ID)+;
	
type	:	TYPESYM;
	
statements
	:	((assignment | ifstmt | whilestmt | functions) SEMICOLON!)+;

block	:	statements -> ^(BLOCK statements);

consequence	
	:	statements -> ^(CONSEQUENCE statements);

alternative
	:	statements -> ^(ALTERNATIVE statements);
	
assignment
	:	ID ASSIGNSYM expr  -> ^(ASSIGNSYM ID expr);

expr
	:	(STRINGSYM | comparison | arith_expression);
	
comparison
	:	comparable CMP_OPS comparable -> ^(CMP_OPS comparable comparable);

comparable
	:	(intsym | realsym | ID);


// START:if
ifstmt
	:	IFSYM comparison THENSYM
			consequence
		(ELSESYM
			alternative)?
		FISYM -> ^(IFELSE comparison consequence alternative);
		
		
IFSYM:	 	'if';
THENSYM: 	'then';
ELSESYM: 	'else';
FISYM:   	'fi';
// END:if


// START:while
whilestmt:	WHILESYM comparison DOSYM
			block
		ODSYM -> ^(WHILE comparison block);
		
WHILESYM:	'while';
DOSYM:		'do';		
ODSYM:		'od';
// END:while


// START:function
functions:	readfunc | printlnfunc;

readfunc:	READSYM RND_BRACK_OPEN ID RND_BRACK_CLOSED -> ^(READSYM ID);
READSYM:	'read';

printlnfunc:	PRINTLNSYM RND_BRACK_OPEN func RND_BRACK_CLOSED -> ^(PRINTLNSYM func);
PRINTLNSYM:	'println';
func 	:	 (realsym | intsym | STRINGSYM | ID);
// END:function
   
   
// START:arithmetische expression
arith_expression : term  ( (ADD^ | SUB^) term)*;
term       : factor  ( (MUL^ | DIV^) factor)*;
factor     : ((intsym | realsym) | ID | (RND_BRACK_OPEN! arith_expression RND_BRACK_CLOSED!));
// END:arithmetische expression  
   
   
// END:rules


// START:keywords
PROGRAM	:	'program';
BEGINSYM:	'begin';
ENDSYM	:	'end';
BLOCKCOMMENT
	:	COMMENTBEGIN (options{greedy=false;}: .)* COMMENTEND {$channel=HIDDEN;};

// END:keywords


// START:type symbols
UINTSYM	:	DIGIT+;
intsym:		(ADD | SUB)? UINTSYM;
realsym	:	intsym ('.' UINTSYM) ;

STRINGSYM:	SINGLE_QUOTE ( options {greedy=false;}: . )*  SINGLE_QUOTE;
BOOLEANSYM:	('true' | 'false');
TYPESYM:	('integer' | 'real' | 'string' | 'boolean');
ID	:	LETTER (LETTER|UNDERSCR|DIGIT)*;
// END:type symbols

// START:arithm. tokens
ADD:		'+';
SUB:		'-';
MUL:		'*';
DIV:		'/';
// END:arithm. tokens

// START:special tokens
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
// END:special tokens

//
COMMA:		',';
SEMICOLON:	';';
ASSIGNSYM:	':=';
RND_BRACK_OPEN:	'(';
RND_BRACK_CLOSED: ')';
//

// START:fragments
fragment LETTER	:	'A'..'Z'|'a'..'z';
fragment UNDERSCR:	'_';	
fragment DIGIT	:	'0'..'9';
fragment SINGLE_QUOTE:	'\'';
fragment COMMENTBEGIN:	'/*';
fragment COMMENTEND:	'*/';
// END:fragments

// START:comparators
fragment EQL:		'=';
fragment NOTEQL:	'<>';
fragment LESS:		'<';
fragment LE:		'<=';
fragment GREATER:	'>';
fragment GE:		'>=';
CMP_OPS:	(EQL | NOTEQL | LESS | LE | GREATER | GE);
// END;comparators