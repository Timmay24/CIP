grammar miniP_AST;

options {
    output=AST;
    ASTLabelType=CommonTree;
}

tokens {
    VAR;
    PROG;
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
	:	(variable (COMMA ID)* SEMICOLON)+ -> ^(DECL variable+);
	
variable
	:	type ID -> ^(VAR type? ID);
	
type	:	TYPESYM;
	
statements
	:	((assignment | ifstmt | whilestmt | functions) SEMICOLON!)+;
	
block	:	statements -> ^(BLOCK statements);
	
assignment
	:	ID ASSIGNSYM expr  -> ^(ASSIGNSYM ID expr);

expr
	:	(STRINGSYM | comparision | arith_expression);
	
comparision
	:	op1= comparable CMP_OPS op2=comparable -> ^(CMP_OPS $op1 $op2);

comparable
	:	(intsym | realsym | ID);


// START:if
ifstmt
	:	IFSYM cond=comparision THENSYM
			ifstat=block
		(ELSESYM
			elsestat=block)?
		FISYM -> ^(IFELSE $cond $ifstat $elsestat);
		
		
IFSYM:	 	'if';
THENSYM: 	'then';
ELSESYM: 	'else';
FISYM:   	'fi';
// END:if


// START:while
whilestmt:	WHILESYM cond=comparision DOSYM
			block
		ODSYM -> ^(WHILE $cond block);
		
WHILESYM:	'while';
DOSYM:		'do';		
ODSYM:		'od';
// END:while


// START:function
functions:	readfunc | printlnfunc;

readfunc:	READSYM RND_BRACK_OPEN ID RND_BRACK_CLOSED -> ^(FUNC READSYM ID);
READSYM:	'read';

printlnfunc:	PRINTLNSYM RND_BRACK_OPEN func RND_BRACK_CLOSED -> ^(FUNC PRINTLNSYM func);
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