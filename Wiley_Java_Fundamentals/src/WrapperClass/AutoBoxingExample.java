package WrapperClass;

public class AutoBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		
		//Converting P to Object (Boxing)
		
		Integer number1 = Integer.valueOf(num);
		System.out.println(num);
		System.out.println(number1);
		System.out.println(number1.getClass().getSimpleName());
		
		System.out.println("-------------------------");
		
		//AutoBoxing
		
		Integer number2 = num;
		System.out.println(num);
		System.out.println(number2);
		System.out.println(number2.getClass().getSimpleName());
		
		System.out.println("-------------------------");
		
		//Unboxing
		
		int number3 = number1;
		System.out.println(number1);
		System.out.println(number3);
		
		//Converting Object to P
		
		int number4 = number1.intValue();
		System.out.println(number4);
	}

}
