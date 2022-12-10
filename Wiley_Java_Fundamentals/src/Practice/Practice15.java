package Practice;
//Exception Handling

import java.util.Scanner;



class InvalidPriceException extends Exception{
	
	public InvalidPriceException() {
		super("Selling Price and Cost Price cannot be same");
	}
}

class NegativePriceException extends Exception{
	
	public NegativePriceException() {
		super("Prices cannot be negative");
	}
}

public class Practice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sellingPrice , costPrice ;
		try(Scanner scan = new Scanner(System.in)){
			System.out.print("Enter the selling price : ");
			sellingPrice = scan.nextInt();
			System.out.print("Enter the cost price : ");
			costPrice = scan.nextInt();
			if(sellingPrice < 0 || costPrice < 0) {
				throw new NegativePriceException();
			}
			else if(sellingPrice > costPrice) {
				System.out.println("Profit");
			}
			else if(sellingPrice < costPrice) {
				System.out.println("Loss");
			}
			else if(sellingPrice == costPrice) {
				//System.out.println("No Profit No Loss");
				throw new InvalidPriceException();
			}
			
		}catch(InvalidPriceException ex) {
			System.out.println(ex.getMessage());
		}
		catch(NegativePriceException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
