package construct;

public class SimpleIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sellingPrice = 12000;
		float costPrice = 10000;
		
		if(sellingPrice > costPrice) {
			System.out.println("Profit");
		}
		if(costPrice > sellingPrice) {
			System.out.println("Loss");
		}
		if(sellingPrice == costPrice) {
			System.out.println("No Profit No Loss");
		}
	}

}
