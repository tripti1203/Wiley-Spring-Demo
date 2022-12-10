package linkedlist_collection;

import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<String> prelist = new LinkedList<String>();
		prelist.add("Aman");
		prelist.add("Amir");
		prelist.add("Ananya")
		;
		LinkedList<String> list = new LinkedList<String>();
		list.add("King Kochar");
		list.add("Sarah Bowling");
		list.add("Shreya Sharma");
		list.add("Roger Lee");
		list.addFirst("John Smith");
		list.add("Shreya Sharma");
		list.addLast("Tripti K");
		list.addAll(prelist);
		list.add("Shreya Sharma");
		
		System.out.println(list);
		
		//return elements at specified index
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		
		//set elements at a particular index
		list.set(0, "Krishna");
		System.out.println(list);
		
		//first elements removed
		list.remove();
		System.out.println(list);
		
		//check elements present or not
		System.out.println("Contains element : " + list.contains("Sarah Bowling"));
		
		//specific element remove
		list.remove("Sarah Bowling");
		System.out.println(list);
		
		Object obj = list.poll();
		System.out.println("Element removed is : " + obj);
		
		list.removeFirstOccurrence("Shreya Sharma");
		System.out.println(list);
		list.removeLastOccurrence("Shreya Sharma");
		System.out.println(list);
		//first element removed
		list.removeFirst();
		System.out.println(list);
		
		//last element removed
		list.removeLast();
		System.out.println(list);
		
		//removed all the prelist elements
		list.removeAll(prelist);
		System.out.println(list);
		
		//cleared the linkedlist and set it empty 
		list.clear();
		System.out.println(list);

	}

}
