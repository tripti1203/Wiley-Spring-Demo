package assignment2;

import java.util.Scanner;

public class StringOutput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = scan.next();
		
		String res = str.toUpperCase()+str.toLowerCase();
		System.out.println(res);
		
	}

}
