package hashset_collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		set.add(600);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(100);
		set2.add(200);
		set2.add(300);
		set2.add(400);
		set2.add(500);
		set2.add(700);
		
		//Find union between two sets
		Set<Integer> unionSet = new HashSet<>(set);
		//unionSet.addAll(set);
		unionSet.addAll(set2);
		System.out.println(unionSet);
		
		//intersection between two set
		Set<Integer> intersectionSet = new HashSet<>(set);
		intersectionSet.retainAll(set2);
		System.out.println(intersectionSet);
		
		//to find symmetric difference between two sets
		Set<Integer> differenceSet = new HashSet<>(set);
		differenceSet.removeAll(set2);
		System.out.println(differenceSet);
	}

}
