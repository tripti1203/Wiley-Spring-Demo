package Practice;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isLoggedIn = true;
		boolean isEmailValid = true;
		boolean isCardInfoValid = false;
		
		if(isLoggedIn && isEmailValid && isCardInfoValid) {
			System.out.println("User allowed to purchase");
		}
		else {
			System.out.println("User Not allowed to purchase");
		}
	}

}
