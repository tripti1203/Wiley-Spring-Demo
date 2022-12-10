package assignment2;

import java.util.Scanner;

public class BasicOperations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		addition(num1,num2);
		maxOfTwo(num1,num2);
		multiplication(num1,num2);
		average(num1,num2);
	}
	
	public static void average(int num1, int num2) {
		float avg = (num1+num2)/2;
		System.out.println("Average of two number : " + avg);
	}

	public static void addition(int a, int b) {
		System.out.println("Addition : " + (a+b));
	}
	
	public static void multiplication(int a, int b) {
		System.out.println("Multiplication : " + (a*b));
	}
	
	public static void maxOfTwo(int a , int b) {
		if(a > b) {
			System.out.println(a + " is larger.");
		}
		else if(a < b) {
			System.out.println(b + " is larger.");
		}
		else {
			System.out.println("These numbers are equal.");
		}
	}
}
