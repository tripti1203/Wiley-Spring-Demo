package assignment2;

import java.util.Scanner;

public class DMASOperation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		addition(num1,num2);
		substraction(num1,num2);
		multiplication(num1,num2);
		division(num1,num2);
	}

	public static void addition(int a, int b) {
		System.out.println("Addition : " + (a+b));
	}

	public static void substraction(int a, int b) {
		System.out.println("Substraction : " + (a-b));
	}

	public static void multiplication(int a, int b) {
		System.out.println("Multiplication : " + (a*b));
	}

	public static void division(int a, int b) {
		System.out.println("Division : " + (a/b));
	}
}
