package Exception;

class ArithmeticTest5{
	public static void division(int num1 , int num2) {
		int res =0;
		try {
			res = num1/num2;
			System.out.println("Division: "+ res);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
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

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticTest5.division(10, 0);
	}

}
