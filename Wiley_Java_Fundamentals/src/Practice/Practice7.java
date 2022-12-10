package Practice;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sellingPrice = 24000;
		float costPrice = 14000;
		
		if(sellingPrice >= costPrice) {
			if(sellingPrice == costPrice) {
				System.out.println("No Profit No Loss");
			}
			else {
				System.out.println("Profit");
			}
		}
		else {
			System.out.println("Loss");
		}
		
		
	}

}
