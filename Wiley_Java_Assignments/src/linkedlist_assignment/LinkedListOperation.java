package linkedlist_assignment;

/*Doubly LinkedLIst Implementation*/

public class LinkedListOperation {
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
		newNode.next = head;
		head = newNode;
	}
	//REMOVE FIRST ELEMENT OF THE LINKED LIST
	public void removeFirst() {
		if(head == null)
			throw new IllegalStateException();
		
		Node temp = head;
		head = head.next;
		temp.next = null;
		head.prev = null;
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
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		
		//finding middle node using floyd's algorithm
		Node slow = head;
		Node fast = head;

		while(fast != null && fast.next != null) {
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
		
		Node slow = head;
		Node fast = head;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
		
	}
	
	//DISPLAY THE LINKED LIST ELEMENTS
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	
}
