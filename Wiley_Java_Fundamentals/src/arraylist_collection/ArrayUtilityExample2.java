package arraylist_collection;

import java.util.Arrays;

public class ArrayUtilityExample2 {
	public static void main(String[] args) {
		
		Integer num1[]	= {10,40,30,20,5};
		Integer num2[]  = {10,40,30,20};
		
		
		System.out.println("Array : " +Arrays.equals(num1, num2));
 		
 		Arrays.fill(num2, 25); //--> Add the new value to whole array.
		System.out.println("Array with fill : " + Arrays.toString(num2));
	}
}
