package misc;

class Brand { 
	private String brandName;
	class Product{
		String productName;
		float productPrice;
		public float getProductPrice() {
			return 2000;
		}
		public void display() {
			System.out.println(brandName);
		}
	}
	
	protected class AnotherProduct{
		String productDesc;
		int productQuantity;
		public int getProductQuantity() {
			return productQuantity;
		}
		
	}
}
public class InnerClassExample {
	public static void main(String[] args) {
		Brand brand = new Brand();
		Brand.Product product = brand.new Product();
		Brand.AnotherProduct anotherProduct = brand.new AnotherProduct();
		
		System.out.println(product.getProductPrice());
		System.out.println(anotherProduct.getProductQuantity());
		product.display();
	}
}
