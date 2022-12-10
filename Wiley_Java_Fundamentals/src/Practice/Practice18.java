package Practice;

import java.util.Scanner;

public class Practice18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] grades = new int[20];
		int i=0 , count = 0; 
		while( i < 20 ) {
			System.out.print("Enter the grades :");
			int input = scan.nextInt();
			if(input == -1) {
				break;
			}else {
				grades[i] = input;
			}
			i++;
		}
		double avg = average(grades);
		System.out.print("Average value  : " + avg);
	}
	public static double average(int[] grades) {
		int sum = 0;
		for(int i=0 ; i<grades.length; i++) {
			sum += grades[i];
		}
		double avg = sum/grades.length;
		return avg;
		
	}

}
