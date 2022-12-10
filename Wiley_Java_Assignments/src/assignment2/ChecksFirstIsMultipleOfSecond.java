package assignment2;

import java.util.Scanner;

public class ChecksFirstIsMultipleOfSecond {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		boolean res = isFirstMultipleOFSecond(num1,num2);
		System.out.println(res);
	}

	public static boolean isFirstMultipleOFSecond(int num1, int num2) {
		if(num1%num2 == 0)
			return true;
		return false;
	}
	
}
