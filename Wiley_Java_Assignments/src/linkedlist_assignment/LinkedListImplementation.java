package linkedlist_assignment;

public class LinkedListImplementation {

	public static void main(String[] args) {
		LinkedListOperation list = new LinkedListOperation();
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addFirst(70);
		list.addFirst(80);
		
		list.display();
		list.printMiddle();
		
		System.out.println("------------------");
		
		list.removeFirst();
		list.display();
		list.printMiddle();
		
		System.out.println("------------------");
		
		list.removeLast();
		list.display();
		list.printMiddle();
		
		System.out.println("------------------");
		
		System.out.println(list.detectLoop());
	}

}
