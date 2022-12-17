package functional_interface2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PersonAppJava8Way {

	public static void main(String[] args) {
		List<Person> person = Arrays.asList(
				new Person("John","Doe",25),
				new Person("Sarah","Bowling",23),
				new Person("William","Smith",42),
				new Person("David","Soneta",34)
				);
		System.out.println("Persons details whose firstname starts with 'S' : ");
		printConditionally(person,new Predicate<Person>() {

			@Override
			public boolean test(Person t) {
				return t.getLastName().startsWith("S");
			}
			
		});
		
		System.out.println("\nDisplay Person Details : ");
		printConditionally(person,new Consumer<Person>() {

			@Override
			public void accept(Person t) {
				System.out.println(t);
			}
			
		});
		
		System.out.println("\nSort Person Details According to First Name :");
		person.stream().sorted((p1,p2)->p1.getFirstName().compareTo(p2.getFirstName())).forEach(s->System.out.println(s));
		
		System.out.println("\nSort Person Details According to age :");
		person.stream().sorted((p1,p2)->p1.getAge()-p2.getAge()).forEach((p)->System.out.println(p));
		
		System.out.println("\nFilter by age between 25 and 35");
		person.stream().filter((p)->p.getAge()>=25).filter((p)-> p.getAge()<35).forEach((p)->System.out.println(p));
		
		/*System.out.println("\n Get Person details whose age is 42 : ");
		printConditionally(person,new Supplier<Person>() {

			@Override
			public Person get() {
				return null;
			}
			
		});*/
		
	}
	private static void printConditionally(List<Person> person, Predicate<Person> predicate) {
		for(Person p : person) {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}
	}
	
	private static void printConditionally(List<Person> person, Consumer<Person> consumer) {
		for(Person p : person) {
			consumer.accept(p);
		}
	}
}