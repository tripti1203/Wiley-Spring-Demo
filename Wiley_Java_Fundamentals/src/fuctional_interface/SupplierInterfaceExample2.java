package fuctional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class Employees{
	private Integer Id;
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;
	public Employees() {
		super();
	}
	public Employees(Integer id, String firstName, String lastName, String gender, Integer age) {
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

public class SupplierInterfaceExample2 {

	public static void main(String[] args) {
		System.out.println(populateEmployees().get());
	}
	
	public static Supplier<List<Employees>> populateEmployees() {
		Supplier<List<Employees>> employeeList = () -> {
			ArrayList<Employees> employees = new ArrayList<Employees>();
			employees.add(new Employees(101,"Karik","Kapoor","Male",43));
			employees.add(new Employees(102,"Sarah","Bowling","Female",22));
			employees.add(new Employees(103,"King","Kochhar","Male",18));
			employees.add(new Employees(104,"John","Doe","Male",17));
			employees.add(new Employees(105,"Roger","Lee","Male",23));
			return employees;
		};
		return employeeList;
	}

}
