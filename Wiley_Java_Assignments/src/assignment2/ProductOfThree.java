package assignment2;

import java.util.Scanner;

public class ProductOfThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the three numbers : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		System.out.println("Product of 3 Integers are : " + num1*num2*num3);
	}

}
