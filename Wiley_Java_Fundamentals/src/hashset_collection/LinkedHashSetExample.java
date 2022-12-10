package hashset_collection;
import java.util.*;
public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> listSet = new LinkedHashSet<>();
		listSet.add("King Kochar");
		listSet.add("Sarah Bowling");
		listSet.add("Shreya Sharma");
		listSet.add("Roger Lee");
		listSet.add("John Smith");
		
		System.out.println(listSet);
		
		//null gets added at the end of the list & no duplicates of null gets added
		listSet.add(null);
		listSet.add(null);
		listSet.add("Roger Lee");
		System.out.println(listSet);
		
		Iterator<String> itr = listSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
