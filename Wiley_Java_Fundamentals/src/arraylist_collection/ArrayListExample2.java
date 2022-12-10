package arraylist_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("King Kochar");
		arrayList.add("Sarah Bowling");
		arrayList.add("Shreya Sharma");
		arrayList.add("Roger Lee");
		arrayList.add("John Smith");
		
		System.out.println("---Using FOR LOOP---");
		for(int i=0 ; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("");
		System.out.println("---Using FOR EACH LOOP---");
		for(String str : arrayList) {
			System.out.println(str);
		}
		System.out.println("");
		System.out.println("---Using WHILE LOOP---");
		int count = 0 ;
		while(count < arrayList.size()) {
			System.out.println(arrayList.get(count));
			count++;
		}
		System.out.println("");
		System.out.println("---Using ITERATOR---");
		Iterator<String> itr = arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
