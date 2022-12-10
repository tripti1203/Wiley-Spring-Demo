package Exception;

class ArithmeticTest4{
	public static void division(int num1 , int num2) {
		int res =0;
		try {
			res = num1/num2;
			System.out.println("Division: "+ res);
		}finally{
			System.out.println("Division: " + res);
		}
		System.out.println("Remaining code here..");
	}
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticTest4.division(10, 0);
	}

}
