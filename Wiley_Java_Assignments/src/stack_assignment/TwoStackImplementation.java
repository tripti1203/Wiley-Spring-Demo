package stack_assignment;

public class TwoStackImplementation {

	public static void main(String[] args) {
		TwoStacks stack = new TwoStacks(5);
		
		  stack.push1(50); 
		  stack.push2(40); 
		  stack.push2(70); 
		  stack.push1(10);
		  stack.push2(90); 
		  
		  System.out.println("Display before remove operation : ");
		  stack.traverse();
		  System.out.println("----------------------");
		  
		  System.out.println("Popped element : " + stack.pop2());
		  System.out.println("Popped element : " + stack.pop1());
		  System.out.println("Popped element : " + stack.pop2());
		  System.out.println("Popped element : " + stack.pop2());
		  System.out.println("Popped element : " + stack.pop1());
		  System.out.println("----------------------");
		  
		
		  System.out.println("Is the first stack empty : " + stack.isEmpty1());
		  System.out.println("Is the Second stack empty : " + stack.isEmpty2());
		  System.out.println("----------------------");
		  System.out.println("Is the first stack full : " + stack.isFull1());
		  System.out.println("Is the Second stack full : " + stack.isFull2());

	}

}
