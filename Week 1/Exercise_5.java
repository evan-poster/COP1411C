// 1.3.4

// Write a stack client Parentheses that reads in a text stream from standard input and uses a stack to determine whether its parentheses are properly balanced. For example, your program should print true for [()]{}{[()()]()} and false for [(]).

import java.util.Stack;
import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
		String[] tests = {
			"[()]{}{[()()]()}",
			"[(])",
			"[[[()]]]"
		};

		for (String inputString : tests) {
			System.out.println(inputString + ": " + checkBalanced(inputString));
		}
    }

	public static boolean checkBalanced(String input) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : input.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					break;
				}
				char lastChar = stack.pop();
				if ((lastChar == '(' && c != ')') || (lastChar == '{' && c != '}') || (lastChar == '[' && c != ']')) {
					break;
				}
			}
		}
		return stack.isEmpty();
	}
}
