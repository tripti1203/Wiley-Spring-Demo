package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person>{
	private int personID;
	private String personName;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int personID, String personName) {
		super();
		this.personID = personID;
		this.personName = personName;
	}
	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [personID=" + personID + ", personName=" + personName + "]";
	}
	@Override
	public int compareTo(Person p) {
		return this.getPersonID()-p.getPersonID();
	}
	
	
}

public class CollectionUtilityComparatorExample1 {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<Person>();
		
		Person person1 = new Person();
		person1.setPersonID(100);
		person1.setPersonName("Ishika");
		Person person2 = new Person();
		person2.setPersonID(30);
		person2.setPersonName("Aman");
		Person person3 = new Person();
		person3.setPersonID(200);
		person3.setPersonName("Gautam");
		
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		
		System.out.println("Original Collection : "+ persons);
		
		//Collections.sort(persons);
		
		//Sorting list by person compare method.
		//comparing is a method which implicitly calls compareTo method
		
		Collections.sort(persons,Comparator.comparing(Person::getPersonID) );
		System.out.println("Sorted Collection : " + persons);

	}

}
