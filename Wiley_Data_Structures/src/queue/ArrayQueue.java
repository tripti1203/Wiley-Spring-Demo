package queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue {

	private int[] items;
	private int rear;
	private int front;
	private int count;
	
	public ArrayQueue(int capacity) {
		items = new int[capacity];
	}
	
	public void enqueue(int element) {
		if(count == items.length)
			throw new IllegalStateException();
		items[rear++] = element;
		count++;
	}
	
	public int dequeue() {
		if(count < 0)
			throw new NoSuchElementException();
		int x = items[front];
		front++;
		count--;
		return x;
	}
	
	public int peek() {
		return items[front];
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public boolean isFull() {
		return count==items.length;
	}
	
	public void traverse() {
		if(count == 0)
			throw new NoSuchElementException();
		System.out.println("Elements in Queue : ");
		for(int i = front ; i<rear ; i++) {
			System.out.println(items[i]);
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(items); 
	}
	
}
