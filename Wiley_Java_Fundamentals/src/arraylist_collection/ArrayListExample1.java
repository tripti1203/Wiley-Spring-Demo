package arraylist_collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("King Kochar");
		arrayList.add("Sarah Bowling");
		arrayList.add("Shreya Sharma");
		arrayList.add("Roger Lee");
		arrayList.add("John Smith");
		
		System.out.println(arrayList);
		
		arrayList.remove(1);
		arrayList.remove("King Kochar");
		arrayList.add(0, "King K");
		System.out.println(arrayList);
		
		System.out.println("Index of a specific element : " + arrayList.indexOf("Roger Lee"));
		System.out.println("Element of specific index : " + arrayList.get(1));
		System.out.println("Size of list : " + arrayList.size());
		System.out.println("Contains the specific element : " + arrayList.contains("John"));
		arrayList.clear();
		System.out.println(arrayList);
		System.out.println(arrayList.isEmpty());
	}

}
