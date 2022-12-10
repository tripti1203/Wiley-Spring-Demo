package assignment2;

import java.util.Scanner;

public class PrinValUsingLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		
		for(int i=1 ; i<= n ; i++) {
			System.out.println(i + "\t" + (10*i) + "\t" + (100*i) + "\t" + (1000*i));
		}
	}

}
