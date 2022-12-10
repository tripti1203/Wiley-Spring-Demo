package Polymorphism;

class Calculation{
	public void add(int num1 , int num2) {
		System.out.println("Sum of two integer numbers : " + (num1+num2));
	}
	public void add(float num1 , float num2) {
		System.out.println("Sum of two float numbers : " + (num1+num2));
	}
	public void add(int num1 , int num2 , int num3) {
		System.out.println("Sum of three integer numbers : " + (num1+num2+num3));
	}
	public void add(int num1 , float num2) {
		System.out.println("Sum of int and float numbers : " + (num1+num2));
	}
	public void add(float num1 , int num2) {
		System.out.println("Sum of float and int numbers : " + (num1+num2));
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
	
		Calculation c = new Calculation();
		c.add(250, 250);
		c.add(273.52F, 198.67F);
		c.add(923, 472, 211);
		c.add(654, 345.72F);
		c.add(546.9F,765);
	}

}
