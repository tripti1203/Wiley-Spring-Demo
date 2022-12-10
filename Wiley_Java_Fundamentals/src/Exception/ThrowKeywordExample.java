package Exception;

class Calculate{
	public static void validate(int age) {
		if(age >= 18) {
			System.out.println("You can come for voting window");
		}
		else {
			throw new ArithmeticException("You are not valid to vote");
		}
	}
}

public class ThrowKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Calculate.validate(17);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
