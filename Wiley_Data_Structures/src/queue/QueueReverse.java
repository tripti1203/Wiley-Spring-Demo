package queue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

class Reverse{
	public void reverse(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<Integer>();
		while(!queue.isEmpty()) {
			stack.push(queue.poll());
		}
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
	}
}

public class QueueReverse {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		System.out.println("Original Queue : " + queue);
		Reverse rev  = new Reverse();
		rev.reverse(queue);
		System.out.println("Queue After Reversal : " + queue);
		
	}
}
