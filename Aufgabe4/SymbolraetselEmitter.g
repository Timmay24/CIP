tree grammar SymbolraetselEmitter;

// ### Options
options {
  language=Java;
  tokenVocab=SymbolRiddle_AST;
  output=template;
  ASTLabelType=CommonTree;
}

// ### Header

// package for parser
@header {package symbolpuzzle.grammar;

}

@members {
}

prog
  :  ^(constraints+=constraint*)
     -> sums(sums={$constraints});

constraint
	@after {
		Constraint constraint = new Constraint();
		constraint.numbers.add($n1.number);
		constraint.numbers.add($n2.number);
		constraint.numbers.add($n3.number);
		constraint.prepare();
	}
	: ^( EQL ^(ADD n1=number n2=number) n3=number)
	  -> sum(number1={$n1.number}, number2={$n2.number}, number3={$n3.number});


number 	returns [Number number]
	@after {
		$number = new Number();
		$number.setDigits($letters);
	}
	:  	^(NUMBER letters+=LETTER+);
