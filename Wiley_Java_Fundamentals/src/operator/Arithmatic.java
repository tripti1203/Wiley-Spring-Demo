package operator;

public class Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100 , num2 = 200;
		num1 = num2;
		System.out.println(num1);
		System.out.println(num2);
		
		num1 += num2;
		System.out.println(num1);
		System.out.println(num2);
		
		num1 -= num2;
		System.out.println(num1);
		System.out.println(num2);
		
		num1 *= num2;
		System.out.println(num1);
		System.out.println(num2);
				
		num1 /= num2;
		System.out.println(num1);
		System.out.println(num2);
		
		num1 %= num2;
		System.out.println(num1);
		System.out.println(num2);
	}

}
