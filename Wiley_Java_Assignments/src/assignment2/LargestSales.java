package assignment2;

import java.util.Scanner;

public class LargestSales {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[10];
		int largest = 0;
		for(int count = 0 ; count < arr.length ; count++) {
			int num = scan.nextInt();
			largest = Math.max(largest, num);
		}
		System.out.println("Largest number found : " + largest);
			
	}

}
