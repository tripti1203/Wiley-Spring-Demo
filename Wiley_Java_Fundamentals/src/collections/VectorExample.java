package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("King Kochar");
		vector.add("Shreya Sharma");
		vector.add("Sarah Bowling");
		vector.add("John Smith");
		
		System.out.println("Original Vector : " + vector);
		System.out.println("Size of vector : " + vector.size());
		System.out.println("Capacity of Vector : " + vector.capacity());
	
		Enumeration<String> enm = vector.elements();
		System.out.println("Vector Elements are : ");
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
		
		Iterator<String> itr = vector.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
