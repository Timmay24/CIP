tree grammar SymbolRiddle_ASTWalker;

options {
    tokenVocab=SymbolRiddle_AST;
    ASTLabelType=CommonTree;
    output=AST;
}

// package for walker
@header {package symbolriddle_ast.grammar;}

// START:stat
prog	:   	symbolRiddle;

// END:stat

symbolRiddle
	:	problem problem problem problem problem problem;
		   
number
	:	^(NUMBER LETTER+) ;
problem
	:	^(EQL ^(ADD t1 t2) t3) |
		^(EQL ^(SUB t1 t2) t3) -> ^(EQL ^(ADD["+"] t2 t3) t1);
	
t1	:	number;
t2	:	number;
t3	:	number;