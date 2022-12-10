package big_o_notation;

import java.util.*;

class Calculation{
	
	public boolean isFirstNumberEqualToOne(List<Integer> num) {
		//O(1) => Linear Big Oh Notation ---> as this will execute only once because its checking 
		//for an  element at index 0 of the list.
		return num.get(0)==1;
	}
	public boolean containsNumber(List<Integer> num, int comparisonNumber) {
		/*
		 * O(n) => Linear Big Oh Notation --> It will check through all the n numbers 
		 * to find the compared value.
		 * */
		
		for(Integer n : num) {
			if(n == comparisonNumber) {
				return true;
			}
		}
		return false;
	}
}

public class BigOhNotationExampke2 {

	public static void main(String[] args) {
		Calculation calc = new Calculation();
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		boolean res1 = calc.isFirstNumberEqualToOne(list);
		boolean res2 = calc.containsNumber(list, 40);
		
		System.out.println(res1);
		System.out.println(res2);
	}

}
