package Practice;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isLoggedInEmail = true;
		boolean isLoggedInGoogle = true;
		boolean isLoggedInFb = false;
		
		if(isLoggedInEmail || isLoggedInGoogle || isLoggedInFb) {
			System.out.println("Allowed to access");
		}
		else {
			System.out.println("Not allowed to access");
		}
		
	}

}
