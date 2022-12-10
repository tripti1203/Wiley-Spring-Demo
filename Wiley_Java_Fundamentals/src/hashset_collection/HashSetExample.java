package hashset_collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("King Kochar");
		set.add("Sarah Bowling");
		set.add("Shreya Sharma");
		set.add("Roger Lee");
		set.add("John Smith");
		
		System.out.println(set);
		set.add(null);
		set.add(null);
		set.add("King Kochar");
		System.out.println(set);
		
	}

}
