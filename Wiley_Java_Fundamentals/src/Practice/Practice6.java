package Practice;
import java.util.Scanner;
public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the selling price : ");
		int sellingPrice = scan.nextInt();
		System.out.print("Enter the cost price : ");
		int costPrice = scan.nextInt();
		
		if(costPrice < sellingPrice)
			System.out.println("Profit");
		if(costPrice > sellingPrice)
			System.out.println("Loss");
		if(costPrice == sellingPrice)
			System.out.println("No Profit No loss");
		
		
		String res = (costPrice < sellingPrice)? "Profit" :(costPrice > sellingPrice)? "Loss" : "No Profit No Loss";
		System.out.println(res);
		
		scan.close();
		
	}

}
