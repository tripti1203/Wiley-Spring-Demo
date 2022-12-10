package Practice;
import java.util.*;
public class Practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Given Role : ");
		System.out.println("1. Admin");
		System.out.println("2. SubAdmin");
		System.out.println("3. TestPrep");
		System.out.println("4. User");
		
		System.out.println("Select your role :");
		String choice = scan.nextLine();
		
		switch(choice) {
			case "Admin": System.out.println("Get full access");
			break;
			case "SubAdmin" : System.out.println("Get access to create/delete courses");
			break;
			case "TestPrep" : System.out.println("Get access to create/delete tests");
			break;
			case "User" : System.out.println("Get access to consume content");
			break;
			default : System.out.println("Invalid selection");
		}
		scan.close();
	}

}
