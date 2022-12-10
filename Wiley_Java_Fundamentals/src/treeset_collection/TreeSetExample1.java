package treeset_collection;
import java.util.*;
public class TreeSetExample1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(60);
		treeSet.add(80);
		treeSet.add(30);
		//treeSet.add(null); --> not allowed
		System.out.println(treeSet);
		
		Iterator<Integer> itr = treeSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		if(treeSet.isEmpty())
			System.out.println("Empty");
		else
			System.out.println("Not Empty");
		
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		
	}

}
