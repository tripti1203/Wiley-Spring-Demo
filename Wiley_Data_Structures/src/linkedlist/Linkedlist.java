package linkedlist;

public class Linkedlist {

    Node head,tail;

    class Node {
        int val;
        Node prev;
        Node next;

        Node(int d) { 
        	val = d; 
        }
    }
	//ADD AT LAST
	public void addLast(int item) {
		Node newNode = new Node(item);
		if(head == null) {
			head = tail = newNode;
			tail.next = null;
			tail.prev = null;
			
		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode; 
	}
	//ADD AT FIRST 
	public void addFirst(int item) {
		Node newNode = new Node(item);
		if(head == null) {
			head = tail = newNode;
			tail.next = null;
			tail.prev = null;
		}
		head.prev = newNode;
		newNode.prev = null;
		head = newNode;
	}
	//REMOVE FIRST ELEMENT OF THE LINKED LIST
	public void removeFirst() {
		if(head == null)
			throw new IllegalStateException();
		
		Node temp = head.next;
		head.next = null;
	}
	//REMOVE THE LAST ELEMENT FROM THE LINKED LIST
	public void removeLast() {
		if(head == null)
			throw new IllegalStateException();
		Node temp = tail.prev;
		temp.next = null;
	}
	
	//FIND MIDDLE OF THE LINKED LIST
	public void printMiddle() {
		if(head == null)
			throw new IllegalStateException();
		
		//Count the size
		int count = 0;
		Node temp = head;
		while(temp.next != null) {
			count++;
			temp = temp.next;
		}
		//finding middle node
		Node slow = head;
		Node fast = head.next;
		temp = null;
		while(fast.next != null || fast.next.next != null) {
			temp = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		//Checking if size of list is even or odd
		if(count % 2 != 0)
			System.out.println("Middle of linked list is : " + slow.val);
		else
			System.out.println("Middle of linked list is : " + slow.prev.val + " " + slow.val);
	}
	
	//DETECT LOOP IN A LINKED LIST
	public boolean detectLoop() {
		boolean hasLoop = false;
		Node slow = head;
		Node fast = head;
		while(slow != fast) {
			slow = slow.next;
			fast = fast.next.next;
			hasLoop = false;
		}
		hasLoop = true;
		return hasLoop;
	}
	
	//DISPLAY THE LINKED LIST ELEMENTS
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}
	
	//CONVERT TO CHARACTER ARRAY
	public int[] convertToArray() {
		int[] array = new int[10];
		var current = head;
		var index = 0;
		while(current!=null) {
			array[index++] = current.val;
			current = current.next;
		}
		return array;
	}

	//SIZE OF THE LINKED LIST
	public int size() {
		int size = 0;
		Node temp = head;
		while (temp.next != null) {
			size++;
			temp = temp.next;
		}
		
		return size;
	}

}
