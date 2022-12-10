package arraylist_collection;

import java.util.Arrays;
import java.util.List;

public class ArrayUtilityExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numbers[] = {10,40,30,20,5,70};
		
		/*List<Integer> arr = Arrays.asList(numbers);
		System.out.println(arr);
		System.out.println("-----------");
		Arrays.sort(numbers);
		for(int num : numbers) {
			System.out.println(num);
		}*/
		
		/*Arrays.sort(numbers);
		List<Integer> arrayList = Arrays.asList(numbers);
		System.out.println(arrayList);
		System.out.println("Element Found : " + Arrays.binarySearch(numbers,40));
		*/
		
		
		System.out.println("Original Array : " + Arrays.toString(numbers));
		Integer newNumber[] = Arrays.copyOf(numbers,10);
		newNumber[6] =66;
		System.out.println("New Integer Array : " + Arrays.toString(newNumber));
		Integer nNumber[] = Arrays.copyOfRange(numbers,0,3);
		System.out.println("New Integer Array of Range : " + Arrays.toString(nNumber));
		
	}

}
