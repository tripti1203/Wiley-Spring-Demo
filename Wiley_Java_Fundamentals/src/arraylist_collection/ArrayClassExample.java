package arraylist_collection;

public class ArrayClassExample {

	public static void main(String[] args) {
		
		int[] num = {10,20,30,40,50};        //Array initialisation
		for(int i=0 ; i<num.length ; i++) {
			System.out.println(num[i]);
		}
		System.out.println("----------------");
		
		for(int nums : num) {
			System.out.println(nums);
		}
	}

}
