package misc;

final class Persons{
	public void displayDetails() {
		System.out.println("Displaying Person details");
	}
}
/*class Students extends Persons{
	
	//if the above class is made final it will show error that cannot be extended.
	public void displayDetails() {
		System.out.println("Displaying Students details");
	}
}*/

public class FinalClassExample {

	public static void main(String[] args) {
		
		Persons p = new Persons();
		p.displayDetails();

	}

}
