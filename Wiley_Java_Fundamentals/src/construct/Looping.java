package construct;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//<------------------------- For Loop --------------------------------->
		
		/*for(int i=1 ; i<=10 ; i++) {
			System.out.println("Hello World : " + i);
		}*/
		
		/*for(int i=1 ; i<=5 ; i++) {
			System.out.print("Enter the value : ");
			int num = scan.nextInt();
			if(num % 5 == 0)
				System.out.println("Divisible");
			else
				System.out.println("Not Divisible");
		}*/
		
//<------------------------- While Loop ---------------------------->
		/*int i=1;
		while(i <= 5) {
			System.out.print("Enter the value : ");
			int num = scan.nextInt();
			if(num % 5 == 0)
				System.out.println("Divisible");
			else
				System.out.println("Not Divisible");
			
			i++;
		}*/
		
		/*String choice = "y";
		while(choice.equals("y") || choice.equals("Y") || choice.equals("Yes") || choice.equals("yes")) {
			System.out.print("Enter the value : ");
			int num = scan.nextInt();
			if(num % 5 == 0)
				System.out.println("Divisible");
			else
				System.out.println("Not Divisible");
			System.out.println("Do you want to continue :");
			choice = scan.next();
		}*/

//<--------------------------- Do While --------------------------------->
		/*String choice = "y";
		do {
			System.out.print("Enter the value : ");
			int num = scan.nextInt();
			if(num % 5 == 0)
				System.out.println("Divisible");
			else
				System.out.println("Not Divisible");
			System.out.println("Do you want to continue :");
			choice = scan.next();
		}while(choice.equals("y") || choice.equals("Y") || choice.equals("Yes") || choice.equals("yes"));
		*/
		
		/*int choice = 1;
		do {
			System.out.print("Enter the value : ");
			int num = scan.nextInt();
			if(num % 5 == 0)
				System.out.println("Divisible");
			else
				System.out.println("Not Divisible");
			
			choice++;
		}while(choice <= 5);
		*/
		
/* <------------------------------------------------------ Practice --------------------------------------------------------------------->*/
//FOR LOOP---------------->
		/*int arr[] = {100,23,43,50,60};
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}*/
		
//While LOOP ----------------->
		
		/*int arr[] = {100,23,43,50,60};
		int i=0;
		while(i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}*/
//Do While Loop----------------------->
		
		/*int arr[] = {100,23,43,50,60};
		int i=0;
		do {
			System.out.println(arr[i]);
			i++;
		}
		while(i<arr.length);*/
			
//<------------------------------ For each loop ------------------------->
		/*int arr[] = {100,23,43,50,60};
		for(int i : arr) {
			System.out.println(i);
		}*/
		
		scan.close();
	}

}
