package assignment1;
/*
 * Define a class named as circle that contains two private instance variables: radius (of type double) and color (of type String),
 * with default value of 1.0 and "red", respectively.
 * Create two overloaded constructors one with default values and another for assigning radius using parameterized constructor. 
 * Also define two public methods display() and getArea() to display the details of Circle and calculate the area.*/

class Circle{
	private double radius = 1.0;
	private String color = "red";
	public Circle() {
		super();
	}
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void display() {
		System.out.println("Radius : " + this.radius);
		System.out.println("Color : " + this.color);
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
}

public class AreaOFCircle {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle(5,"Blue");
	    circle1.display();
		System.out.println("Area of circle : " + circle1.getArea());
	}

}
