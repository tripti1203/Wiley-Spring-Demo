package functional_interface2;
import java.util.*;
public class PersonAppJava7 {

	public static void main(String[] args) {
		List<Person> person = Arrays.asList(
				new Person("John","Doe",25),
				new Person("Sarah","Bowling",23),
				new Person("William","Smith",42),
				new Person("David","Soneta",34)
				);
		displayAllPerson(person);
		sortPersonByLastName(person);
		displayAllPersonWithLastNameS(person);
	}

	private static void displayAllPersonWithLastNameS(List<Person> persons) {
		System.out.println("\nPersons with lastName starting with 'S' --> ");
		for(Person p : persons) {
			if(p.getLastName().startsWith("S")) {
				System.out.println(p);
			}
		}
	}

	private static void displayAllPerson(List<Person> persons) {
		System.out.println("\nDetails of All Person -->");
		for(Person p : persons) {
			System.out.println(p);
		}
	}

	private static void sortPersonByLastName(List<Person> persons) {
		System.out.println("\nPersons details sorted by their lastName -->");
		Collections.sort(persons,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		for(Person p : persons) {
			System.out.println(p);
		}
	}

}
