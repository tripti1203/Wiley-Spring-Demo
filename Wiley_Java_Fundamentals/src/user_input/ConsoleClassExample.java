package user_input;
//working on online compiler (GDB)--

public class ConsoleClassExample {

	public static void main(String[] args) {
		
		System.out.print("Enter username : ");
		String username = System.console().readLine();
		
		System.out.print("Enter password : ");
		
		char[] password = System.console().readPassword();
	
		System.out.println("Your username : " + username);
		System.out.printf("Your name is %s", username);
		System.out.println();
		System.out.println("Your password : " + String.valueOf(password));
	}

}
