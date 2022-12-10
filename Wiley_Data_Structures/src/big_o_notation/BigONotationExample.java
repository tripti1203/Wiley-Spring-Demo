package big_o_notation;

class Dummy{
	public void print1(int[] num) {
		/*O(1) + O(1)
		 * O(2) => O(1) Constant Big O Notation */
		System.out.println(num[0]);   //O(1)
		System.out.println(num[0]);   //O(1)
	}
	public void print2(int[] num) {
		for(int i=0 ; i<num.length; i++) {  
			//Linear Big Oh Notation => O(n) 
			System.out.println("Hello"+i);   
		}
		
		System.out.println("--------------------"); //O(1)
		
		for(int n : num) {
			//Linear Big Oh Notation => O(n) 
			System.out.println(n);    
		}
		
		//Total complexity => O(n)+O(1)+O(1) => O(n)+O(2) => O(n)
		
		System.out.println("--------------------"); //O(1)
	}
	public void print3(int[] num, String[] names) {
		/*
		 * O(n)+ O(m)
		 * O(n) => Linear Big O Notation
		 */
		
		for(int n : num) {
			System.out.println(n);
		}
		for(String str : names) {
			System.out.println(str);
		}
	}
	public void print4(int[]num , String[] names) {
		/*
		 *O(n)*O(n) => O(n^2) --> Quadratic Big Oh Notation
		 */
		
		for(int first : num) {
			for(String str: names) {
				System.out.print(first + " , " + str);
			}
		}
		/*
		 * O(n)*O(n)*O(n) => O(n^3) --> For instance cubic Notation 
		 * -->O(n^2) => Quadratic Big Oh Notation as there is no such n-cube notation to last 
		 * O(n) will be unfixed*/
		
		for(int first : num) {
			for(String str: names) {
				for(int n : num) {
					System.out.print(first + "--" + str + "--"+ n);
				}
			}
		}
	}
}
public class BigONotationExample {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {10,20,30,40,50,60,70,80,90,100};
		String[] str = {"ABC","XYZ","MNO","PQR"};
		Dummy d = new Dummy();
		d.print1(arr1);
		d.print2(arr2);
		d.print3(arr1,str);
	}

}
