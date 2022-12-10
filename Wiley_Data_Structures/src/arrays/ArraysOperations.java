package arrays;

public class ArraysOperations {
	
	 static int findElement(int arr[], int n, int key)
	    {
	        for (int i = 0; i < n; i++) {
	            if (arr[i] == key) {
	                return i;
	            }
	        }
	 
	         // If the key is not found
	        return -1;
	    }
	 
	 static void insertElement(int arr[], int n, int x, int pos)
	 {
		 //inserting at a specific position
		 for (int i = n - 1; i >= pos; i--) {
			 arr[i + 1] = arr[i];
		 	 arr[pos] = x;
		 }
	 	
	 }
	 
	 static int deleteElement(int arr[], int n, int key)
	    {
	        
	        int pos = findElement(arr, n, key);
	 
	        if (pos == -1) {
	            System.out.println("Element not found");
	            return n;
	        }
	 
	        // Deleting element
	        for (int i = pos; i < n - 1; i++) {
	            arr[i] = arr[i + 1];
	    	}
	        return n - 1;
	    }
	 

	public static void main(String[] args) {
		int arr[] = { 12, 34, 10, 60, 40 };
        int n = arr.length;
 
        int key = 40;
       
          // Function call
        int position = findElement(arr, n, key);
 
        if (position == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element Found at Position: "
                               + (position + 1));
        
        int newSize = deleteElement(arr,n,12);
        System.out.println("Element Deleted.. New Size Of an Array : " + newSize);
        
        
	}

}
