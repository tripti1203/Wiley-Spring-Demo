package Examples;

import java.util.Scanner;


class Car{
	private int speed;
	protected double regularPrice;
	private String color;
	Scanner scan = new Scanner(System.in);
	
	public void takeData() {
		System.out.print("Enter speed:");
		this.speed = scan.nextInt();
		System.out.print("Enter regularPrice: ");
		this.regularPrice = scan.nextDouble();
		System.out.print("Enter color: ");
		this.color = scan.next();
	}
	
	public void displayData() {
		System.out.println("Speed: " + speed);
		System.out.println("RegularPrice: " + regularPrice);
		System.out.println("Color: " + color);
	}
	
	public double getSalePrice() {
		return regularPrice;
	}
}
class Truck extends Car{
	int weight;
	
	public void takeData() {
		super.takeData();
		System.out.print("Enter weight: ");
		this.weight = scan.nextInt();
	}
	public double getSalePrice() {
		double price = super.getSalePrice();
		if(this.weight > 2000) {
			return (price*0.1);
		}
		else {
			return (price*0.2);
		}
	}
	public void displayData() {
		super.displayData();
		System.out.println("Weight: " + weight);
	}
	
}
class Ford extends Car{
	int year;
	int manufacturerDiscount;
	public void takeData() {
		super.takeData();
		System.out.print("Enter the year: ");
		this.year = scan.nextInt();
		System.out.print("Enter the manufacturer discount: ");
		this.manufacturerDiscount = scan.nextInt();
	}
	public double getSalePrice() {
		double price = super.getSalePrice();
		return (price - this.manufacturerDiscount);
	}
	public void displayData() {
		super.displayData();
		System.out.println("Year: " + year);
		System.out.println("Manufacturer Discount: " + manufacturerDiscount);
	}
	
}
class Sedan extends Car{
	int length;
	public void takeData() {
		super.takeData();
		System.out.print("Enter the length: ");
		this.length = scan.nextInt();
	}
	public double getSalePrice() {
		double price = super.getSalePrice();
		if(this.length > 20 ) {
			return price*0.05;
		}
		else {
			return price*0.1;
		}
	}
	public void displayData() {
		super.displayData();
		System.out.println("Length: " + length);
	}
}

public class InheritancePractice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Ford();
		car1.takeData();
		System.out.println("Details : ");
		car1.displayData();
		System.out.println("Price: " + car1.getSalePrice());
		System.out.println("------------------");
		
		Car car2 = new Truck();
		car2.takeData();
		System.out.println("Details : ");
		car2.displayData();
		System.out.println("Price: " + car2.getSalePrice());
		System.out.println("------------------");
		
		Car car3 = new Sedan();
		car3.takeData();
		System.out.println("Details : ");
		car3.displayData();
		System.out.println("Price: " + car3.getSalePrice());
		System.out.println("------------------");
		
		
	}

}
