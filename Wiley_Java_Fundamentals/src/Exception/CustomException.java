package Exception;

class MyException extends Exception{
	public MyException() {
		super("Not valid to vote");
	}
	public MyException(String message) {
		super(message);
	}
}

class CalculateAge{
	public static void validate(int age) throws MyException {
		if(age >= 18) {
			System.out.println("You can come for voting window");
		}
		else {
			//throw new MyException("You are not valid to vote");
			throw new MyException();
		}
	}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CalculateAge.validate(17);
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
