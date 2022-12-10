package stacks;

import java.util.Stack;

class StringReverser {
	public String reverse(String input) {
		String rev = "";
		Stack<Character> stack = new Stack<Character>(); 
		//pushing character one by one into stack
		for(char ch : input.toCharArray()) {
			stack.push(ch);
		}
		//removing elements from stack and storing it in variable
		while(!stack.isEmpty()) {
			rev += stack.pop();
		}
		return rev;
	}
}

public class ReverseStringStack {
	
	public static void main(String[] args) {
		String str = "aabbcc";
		StringReverser rev = new StringReverser();
		String res = rev.reverse(str);
		System.out.println("Original String : " + str);
		System.out.println("Reversed String : " + res);
	}

}
