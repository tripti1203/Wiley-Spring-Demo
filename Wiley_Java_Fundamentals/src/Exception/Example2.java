package Exception;

class ArithmeticTest2{
	public static void division(int num1 , int num2) {
		try {
			int res = num1/num2;
			System.out.println("Division: "+ res);
		}catch(Exception ex) {
			System.out.println("Exception Occurred");
			System.out.println("Exception: " + ex.getMessage());
		}
	}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticTest2.division(10, 0);
	}

}
