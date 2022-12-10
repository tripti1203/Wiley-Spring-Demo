package Exception;

class ArithmeticTest6{
	public static void division(int num1 , int num2) {
		int res =0;
		try {
			res = num1/num2;
			System.out.println("Division: "+ res);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(Exception ex) {
			System.out.println("Exception Occurred");
			System.out.println("Exception: " + ex.getMessage());
		}finally {
			System.out.println("Division: " + res);
		}
		System.out.println("Remaining code here..");
	}

}

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticTest6.division(100, 0);
	}

}
