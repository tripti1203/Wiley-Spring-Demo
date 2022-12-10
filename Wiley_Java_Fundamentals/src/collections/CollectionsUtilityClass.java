package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityClass {

	public static void main(String[] args) {
		
		List<String> studentNames = new ArrayList<String>();
		studentNames.add("King Kochar");
		studentNames.add("Sarah Bowling");
		studentNames.add("Shreya Sharma");
		studentNames.add("Roger Lee");
		studentNames.add("John Smith");
		
		System.out.println("Original Collection : "+ studentNames);
		//Sort the list into ascending order
		Collections.sort(studentNames);
		System.out.println("List Sorted in Ascending Order : " + studentNames);
		
		Collections.reverse(studentNames);
		System.out.println("List Sorted in Decending Order : " + studentNames);
		
		/*//Reverse the list
		Collections.reverse(studentNames);
		System.out.println("Reversed Collection : " + studentNames);
		
		//Shuffled elements in collection in random order
		Collections.shuffle(studentNames);
		System.out.println("Shuffled Collection : " + studentNames);
		
		//Frequency of an element
		System.out.println("Number of Occurence of Specific Element in Collection: " + Collections.frequency(studentNames, "Roger Lee"));
		*/
	}

}
