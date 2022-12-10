package Practice;

import java.util.Scanner;

public class Practice16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int counter = 0;
		int largest = 0;
		int[] number = new int[10];
		for(counter = 0 ; counter<10; counter++) {
			number[counter] = scan.nextInt();
			largest = Math.max(largest, number[counter]);
		}
		System.out.println(largest);
	}

}
