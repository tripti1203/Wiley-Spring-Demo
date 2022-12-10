package Practice;
import java.util.Scanner;
class Car{
	private int speed;
	double regularPrice;
	private String color;
	Scanner scan = new Scanner(System.in);

	Car(int speed , double regularPrice , String color) {
		
		this.speed = speed;
		
		this.regularPrice = regularPrice;
		
		this.color = color;
	}
	
	public void displayData() {
		System.out.println("Speed: " + speed);
		System.out.println("regularPrice: " + regularPrice);
		System.out.println("Color: " + color);
	}
	
	public double getSalePrice() {
		return regularPrice;
	}
}
class Truck extends Car{
	int weight;
	
	Truck(int speed , double regularPrice , String color , int weight) {
		super(speed,regularPrice ,color);
		
		this.weight = weight;
	}
	public double getSalePrice() {
	
		if(this.weight > 2000) {
			return (super.getSalePrice()-super.getSalePrice()*0.1);
		}
		else {
			return (super.getSalePrice()-super.getSalePrice()*0.2);
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
	Ford(int speed , double regularPrice , String color , int year , int manufacturerDiscount) {
		super(speed,regularPrice ,color);
		
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	public double getSalePrice() {
		
		return (super.getSalePrice() - this.manufacturerDiscount);
	}
	public void displayData() {
		super.displayData();
		System.out.println("Year: " + year);
		System.out.println("Manufacturer Discount: " + manufacturerDiscount);
	}
	
}
class Sedan extends Car{
	int length;
	Sedan(int speed , double regularPrice , String color , int length) {
		super(speed,regularPrice,color);
		
		this.length = length;
	}
	public double getSalePrice() {
		
		if(this.length > 20 ) {
			return super.getSalePrice()-super.getSalePrice()*0.05;
		}
		else {
			return super.getSalePrice()-super.getSalePrice()*0.1;
		}
	}
	public void displayData() {
		super.displayData();
		System.out.println("Length: " + length);
	}
}

public class Practice12 {

	public static void main(String[] args) {
		
		
		Sedan sedan = new Sedan(120, 5000,"blue", 200);
		
		Ford ford = new Ford(200,6000,"black",2000,1234);
		
		Truck truck = new Truck(172,6748,"yellow",2765);
		
		Car car = new Car(200,9000,"Purple");
		
		System.out.println(car.getSalePrice());
		
		System.out.println(sedan.getSalePrice() );
		
		System.out.println(ford.getSalePrice());
		
		System.out.println(truck.getSalePrice());
		
	}

}
