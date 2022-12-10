package ObjectOrientedProgramming;

/*
 * Constructor Chaining - A constructor is invoked from another constructor
 * */
class Person{
	String name;
	String city;
	String country;
	
	//Default Constructor
	Person(){
		this("Ananya");
		this.name = "Tripti";
		this.city = "Kolkata";
		this.country = "India";
	}
	//Parameterized with one Parameters
	Person(String name){
		this("Durgapur","India");
		this.name = name;
		
	}
	//Parameterized Constructor with two parameters
	Person(String city, String country){
		this.city = city;
		this.country = country;
	}
	//Display Details
	public void displayDetails() {
		System.out.println("Name : " + name);
		System.out.println("City : " + city);
		System.out.println("Country : " + country);
	}
	
	
}
public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.displayDetails();
	}

}
