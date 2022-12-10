package construct;

public class ElseIfElseIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sellingPrice = 12000;
		float costPrice = 14000;
		
		if(sellingPrice > costPrice) {
			System.out.println("Profit");
		}
		else if(costPrice > sellingPrice) {
			System.out.println("Loss");
		}
		else{
			System.out.println("No Profit No Loss");
		}
	}

}
