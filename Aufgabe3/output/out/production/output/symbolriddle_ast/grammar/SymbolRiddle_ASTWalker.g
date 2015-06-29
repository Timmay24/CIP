tree grammar SymbolRiddle_ASTWalker;

options {
    output=AST;
    tokenVocab=SymbolRiddle_AST;
    ASTLabelType=CommonTree;
}

// package for walker
@header {package symbolriddle_ast.grammar;}

// START:stat
prog	:   	symbolRiddle;

// END:stat

symbolRiddle
	:	problem problem problem problem problem problem;
		   

problem
	:	^(EQL ^(ADD number number) number) |
		^(EQL ^(SUB t1= number t2=number) t3=number) -> ^(EQL ^(ADD["+"] $t2 $t3) $t1);
	
number
	:	^(NUMBER LETTER+) ;
