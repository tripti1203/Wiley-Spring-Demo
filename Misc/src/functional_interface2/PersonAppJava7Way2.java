package functional_interface2;

import java.util.Arrays;
import java.util.List;

public class PersonAppJava7Way2 {

	public static void main(String[] args) {
		List<Person> person = Arrays.asList(
				new Person("John","Doe",25),
				new Person("Sarah","Bowling",23),
				new Person("William","Smith",42),
				new Person("David","Soneta",34)
				);
		System.out.println("Persons details whose lastname starts with 'S' : ");
		printConditionally(person,new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("S");
			}
			
		});
		
		System.out.println("\nPersons details whose firstname starts with 'J' : ");
		printConditionally(person,new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("J");
			}
			
		});
	}

	private static void printConditionally(List<Person> person, Condition condition) {
		for(Person p : person) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
	}

}
