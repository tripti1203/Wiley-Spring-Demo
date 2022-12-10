package assignment2;

import java.util.Scanner;

public class MaxOFTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		maxOfTwo(num1,num2);
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
