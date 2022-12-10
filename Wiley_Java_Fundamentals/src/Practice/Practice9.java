package Practice;

public class Practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* <----------------------------------------------------- Sum of array elements using different loops ------------------------------------------------------------> */
//FOR LOOP ----------------------------------->
		int[] num = {100,43,23,50,60};
		int sum =0;
		for(int i=0 ; i<num.length ; i++) {
			sum += num[i]; 
		}
		System.out.println(sum);
		
//WHILE LOOP --------------------------------->
		
		/*int[] num = {100,43,23,50,60};
		int sum =0;
		int i=0;
		while(i<num.length) {
			sum += num[i];
			i++;
		}
		System.out.println(sum);*/

//DO WHILE LOOP ------------------------------->
		
		/*int[] num = {100,43,23,50,60};
		int sum =0;
		int i = 0;
		do{
			sum += num[i];
			i++;
		}while(i<num.length);
		System.out.println(sum);*/
		
//FOR EACH LOOP ----------------------------->
		
		/*int[] num = {100,43,23,50,60};
		int sum =0;
		for(int i : num) {
			sum += i; 
		}
		System.out.println(sum);*/
	}

}
