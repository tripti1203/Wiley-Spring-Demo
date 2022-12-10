package linkedlist_collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample2 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("King Kochar");
		list.add("Sarah Bowling");
		list.add("Shreya Sharma");
		list.add("Roger Lee");
		list.addFirst("John Smith");
		list.addLast("Shanu Sharma");
		
		System.out.println("---Using FOR LOOP---");
		for(int i=0 ; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---Using FOR EACH LOOP---");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("---Using WHILE LOOP---");
		int count = 0 ;
		while(count < list.size()) {
			System.out.println(list.get(count));
			count++;
		}
		
		System.out.println("---Using ITERATOR---");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
