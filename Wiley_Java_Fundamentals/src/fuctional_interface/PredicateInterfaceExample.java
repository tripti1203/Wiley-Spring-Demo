package fuctional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee{
	private Integer Id;
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer id, String firstName, String lastName, String gender, Integer age) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", age=" + age + "]";
	}
	
}

class EmployeePredicates{
	public static  Predicate<Employee> isAdultFemale(){
		return e -> e.getAge() > 18 && e.getGender().equalsIgnoreCase("Female");
	}
	public static  Predicate<Employee> isAdultMale(){
		return e -> e.getAge() > 21 && e.getGender().equalsIgnoreCase("Male");
	}
	public static  Predicate<Employee> isAgeMoreThan(Integer age){
		return e -> e.getAge() > age;
	}
	public static List<Employee> filterEmployees(List<Employee>employees,Predicate<Employee> predicate){
		return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
	}
}

public class PredicateInterfaceExample {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(101,"Karik","Kapoor","Male",43));
		employees.add(new Employee(102,"Sarah","Bowling","Female",22));
		employees.add(new Employee(103,"King","Kochhar","Male",18));
		employees.add(new Employee(104,"John","Doe","Male",17));
		employees.add(new Employee(105,"Roger","Lee","Male",23));
		
		System.out.println(EmployeePredicates.filterEmployees(employees,EmployeePredicates.isAdultFemale() ));
		System.out.println(EmployeePredicates.filterEmployees(employees,EmployeePredicates.isAdultMale() ));
		System.out.println(EmployeePredicates.filterEmployees(employees,EmployeePredicates.isAgeMoreThan(25) ));
	}

}
