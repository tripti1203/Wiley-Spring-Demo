package queue;
import java.util.*;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		queue.offer(10);
		queue.add(20);
		queue.offer(30);
		queue.add(40);
		
		System.out.println("Head element using element method : " + queue.element());
		System.out.println("Head element using peek method : " + queue.peek());
		System.out.println("Queue is empty : " + queue.isEmpty());
		
		System.out.println("Remove element using poll method : " + queue.poll());
		System.out.println("Remove element using remove method : " + queue.remove());
		
		System.out.println(queue);
		Iterator<Integer> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
