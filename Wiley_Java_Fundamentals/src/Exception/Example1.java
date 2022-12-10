package Exception;

class ArithmeticTest1{
	public static void division(int num1 , int num2) {
		int res = num1/num2;
		System.out.println("Division: "+ res);
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticTest1.division(10, 0);
	}

}
