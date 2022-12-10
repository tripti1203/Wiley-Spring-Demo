package Exception;

import java.util.Scanner;

public class ScannerDemostration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 String message;
		 Scanner scan = new Scanner(System.in);
		 message = scan.nextLine();
		 System.out.println("Message : " + message);
		 scan.close();
		 */
		
		String message;
		try(Scanner scan = new Scanner(System.in)){
			System.out.print("Enter message : ");
			message = scan.nextLine();
			System.out.println("Message : " + message);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
