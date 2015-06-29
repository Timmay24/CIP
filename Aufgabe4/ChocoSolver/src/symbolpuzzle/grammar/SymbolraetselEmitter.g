tree grammar SymbolraetselEmitter;

options {
  language=Java;
  tokenVocab   = SymbolRiddle_AST;
  output       = template;
  ASTLabelType = CommonTree;
}

@header {
package symbolpuzzle.grammar;

import java.util.Set;
import java.util.HashSet;
import java.lang.Character;

import symbolpuzzle.implementation.Constraint;
import symbolpuzzle.implementation.Number;
}

@members {
Set<Character> symbols = new HashSet<Character>();
}

prog
  :   constraints+=constraint*
     -> prog(symbols={symbols}, constraints={$constraints});

constraint
	@after {
		Constraint constraint = new Constraint();
		constraint.getNumbers().add($n1.number);
		constraint.getNumbers().add($n2.number);
		constraint.getNumbers().add($n3.number);
		constraint.prepare();
	}
	: ^( EQL ^(ADD n1=number n2=number) n3=number)
	  -> constraint(number1={$n1.number}, number2={$n2.number}, number3={$n3.number});


number 	returns [Number number]
	@after {
		$number = new Number();
		$number.setDigits($letters);
		symbols.addAll($number.getCharacters());
	}
	:  	^(NUMBER letters+=LETTER+);
