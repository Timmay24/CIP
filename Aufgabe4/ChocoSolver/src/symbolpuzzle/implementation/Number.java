package symbolpuzzle.implementation;

import java.util.*;

import org.antlr.runtime.tree.Tree;

public class Number {
	char[] digits;
	int maxSize;

	public void setDigits(List<Tree> tokens) {
		digits = new char[tokens.size()];
		for (int i = 0; i < tokens.size(); i++) {
			Tree tree = tokens.get(i);
			char c = tree.getText().charAt(0);
			digits[i] = c;
		}
	}
	
	public List<Character> getCharacters() {
		List<Character> number = new ArrayList<Character>();
		for (int i = maxSize - digits.length; i > 0; i--) {
			number.add(null);
		}
		for (int i = 0; i < digits.length; i++) {
			number.add(digits[i]);
		}
		return number;
	}


	public List<Character> getCharactersReversed() {
		List<Character> numbers = this.getCharacters();
		Collections.reverse(numbers);
		return numbers;
	}

	public int getSize() {
		return digits.length;
	}


}
