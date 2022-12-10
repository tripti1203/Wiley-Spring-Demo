package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Person{
	private int id;
	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

public class StreamTester {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person(101,"Shreya",23));
		personList.add(new Person(102,"Gautam",33));
		personList.add(new Person(103,"Krish",20));
		personList.add(new Person(104,"Deepti",35));
		personList.add(new Person(105,"Sakshi",39));
		
		Stream<Person> personStream = personList.stream();
		personStream.forEach(ele -> {
			System.out.println(ele);
		});
		
		System.out.println("----------------------------");
		
		personList.stream().filter(person -> (person.getName().equals("Shreya")|| person.getAge()>=30))
		.forEach(System.out::println);
		
		System.out.println("-----------------------");
		
		//Map & Reduce
		Integer totalAge = personList.stream().map(Person::getAge).reduce((total,age)->(total+age)).get();
		System.out.println("Total Age : " +  totalAge);
	}

}
