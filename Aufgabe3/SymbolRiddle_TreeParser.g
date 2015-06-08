tree grammar SymbolRiddle_TreeParser;

options {
    tokenVocab=SymbolRiddle_AST;
    output=AST;
    ASTLabelType=CommonTree;
}

@header {package symbolpuzzle.grammar; }

prog:   symbolRiddle;


symbolRiddle
	:	^(PUZ problem problem problem problem problem problem);
	
problem	:	^(EQL ^(ADD num1 num2) num3);

num1	:	number;

num2	:	number;

num3	:	number;
		   
number: ^(NUMBER LETTER+);



