package Practice;
import java.util.*;
public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int value = 0;
		String choice = "y";
		while(choice.equals("Y") || choice.equals("y") || choice.equals("yes") || choice.equals("YES")) {
			System.out.println("Enter value : ");
			value = scan.nextInt();
			if(value > 100)
				continue;
			else {
				if(value % 5 == 0) {
					System.out.println("Divisible");
				}
				else {
					System.out.println("Not Divisible");
				}
			}
			System.out.println("Do you which to continue : ");
			choice = scan.next();
		}
		scan.close();
	}
}
