package misc;

class Person{
	public void displayDetails() {
		System.out.println("Displaying Person details");
	}
}
class Student extends Person{
	
	//if the above class method is made final it will show error that cannot be overriden.
	public void displayDetails() {
		System.out.println("Displaying Students details");
	}
}

public class FinalMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Student();
		p.displayDetails();
	}

}
