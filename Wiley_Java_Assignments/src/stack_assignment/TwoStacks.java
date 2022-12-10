package stack_assignment;

/*IDEA : To push elements of stack1 from starting index and stack2 from end of the array by not dividing array into halves*/

import java.util.Arrays;

public class TwoStacks {

	private int[] items;
	private int size;
	private int count1;
	private int count2;
	
	public TwoStacks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public TwoStacks(int n) {
		this.size = n;
		items = new int[n];
		this.count1 = -1;
		this.count2 = size;
	}



	public void push1(int element) {
		if (count1 > count2 - 1) {
			throw new StackOverflowError();
		}
		items[++count1] = element;
	}
	
	public void push2(int element) {
		if (count1 > count2 - 1) {
			throw new StackOverflowError();
		}
		items[--count2] = element;
	}

	public int pop1() {
		if (count1 < 0) {
			throw new IllegalStateException();
		}
		return items[count1--]; 
	}
	public int pop2() {
		if (count2 == size) {
			throw new IllegalStateException();
		}
		return items[count2++]; 
	}

	public boolean isEmpty1() {
		return count1 == -1; 
	}
	public boolean isEmpty2() {
		return count2 == size; 
	}

	public boolean isFull1() {
		return count1 == count2 - 1;
	}
	public boolean isFull2() {
		return count1 == count2;
	}
	
	public void traverse() {
		if(count1 < 0 || count2 == items.length)
			throw new IllegalStateException();
		for(int i : items) {
			System.out.println(i);
		}
	}

}
