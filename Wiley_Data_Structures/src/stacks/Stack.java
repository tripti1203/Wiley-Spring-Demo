package stacks;

import java.util.Arrays;

public class Stack {

	private int[] items = new int[5];
	private int count=0;
	
	public void push(int element) {
		if(count == items.length) {
			throw new StackOverflowError();
		}
		items[count++] = element;
		System.out.println("Element pushed into stack.");//O(N)
	}
	public int pop() {
		if(count == 0) {
			throw new IllegalStateException();
		}
		return items[--count];           //O(N)
	}
	
	public void traverse() {
		for(int i : items) {         //O(N)
			System.out.println(i);
		}
	}
	
	public int peek() {
		return items[count-1];   //O(1)
	}
	
	public boolean isEmpty() {
		return count == 0;       //O(1)
	}
	public boolean isFull() {
		return count==items.length;
	}
	@Override
	public String toString() {
		return Arrays.toString(items);
	}
	
}
