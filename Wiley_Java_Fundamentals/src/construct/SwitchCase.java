package construct;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Select options below : ");
		System.out.println("1. Deposit");
		System.out.println("2. Withdrawal");
		System.out.println("3. Balance");
		
		System.out.println("Choice : ");
		int choice = scan.nextInt();
		
		switch(choice){
			case 1 : System.out.println("Deposit");
			break;
			case 2 : System.out.println("Withdrawal");
			break;
			case 3 : System.out.println("Balance");
			break;
			default : System.out.println("Invalid choice");
		}
		scan.close();
	}

}
