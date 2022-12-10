package queue;

public class QueueImplementation {

	public static void main(String[] args) {
		ArrayQueue arr = new ArrayQueue(5);
		arr.enqueue(10);
		arr.enqueue(20);
		arr.enqueue(30);
		arr.enqueue(40);
		arr.enqueue(50);
		
		arr.traverse();
		
		System.out.println("Element Deleted : "+ arr.dequeue());
		System.out.println("Element Deleted : "+ arr.dequeue());
		System.out.println("Element Deleted : "+ arr.dequeue());
		System.out.println("Element Deleted : "+ arr.dequeue());
		System.out.println("Element Deleted : "+ arr.dequeue());
		
		System.out.println("Queue is full : " + arr.isFull());
		System.out.println("Queue is empty : " + arr.isEmpty());
		//System.out.println("Head of the queue : " + arr.peek());
		
		//arr.traverse();
	}

}
