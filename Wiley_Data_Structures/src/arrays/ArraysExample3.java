package arrays;

class Array {
	
	public static int maxElement(int[] arr) {
		int max = 0;
		for(int i=0 ; i<arr.length ; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}
	
	public static void intersect(int[] arr1, int[] arr2) {
		for(int i=0 ; i<arr1.length ; i++) {
			for(int j=0; j<arr2.length ; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
	
	public static int[] reverse(int[] arr) {
		int[] tempArray = new int[arr.length];
		int k = 0;
		for(int i=arr.length-1 ; i>=0 ; i--) {
			tempArray[k++] = arr[i];
		}
		return tempArray;
	}
	
	public static int[] insertAt(int[] arr,int pos,int key) {
		int[] newArr = new int[arr.length+1];
		for(int i=0 ; i<newArr.length; i++) {
			if(i<pos) {
				newArr[i] = arr[i];
			}
			else if(i == pos) {
				newArr[i] = key;
			}
			else if(i>pos) {
				newArr[i] = arr[i];
			}
		}
		return newArr;
	}
}

public class ArraysExample3 {

		public static void main(String[] args) {
	
		int[] arr = {12,4,6,11,5,9,7};
		int[] tempArr = {5,13,6,17,19,10};
		
		//Array.insertAt(arr, 2, 10);
		System.out.println("--------------");
		Array.intersect(arr, tempArr);
		System.out.println("--------------");
		int[] temp = Array.reverse(arr);
		System.out.println(temp);
		System.out.println("--------------");
		Array.maxElement(arr);
	}

}
