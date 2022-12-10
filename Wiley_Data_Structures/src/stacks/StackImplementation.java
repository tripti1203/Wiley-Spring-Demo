package stacks;

public class StackImplementation {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		//stack.push(60);  //Overflow error
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		
		//stack.traverse();
		System.out.println(stack);
		System.out.println("Element at the top : " + stack.peek());
		System.out.println("Stack is empty : " + stack.isEmpty());
	}

}
