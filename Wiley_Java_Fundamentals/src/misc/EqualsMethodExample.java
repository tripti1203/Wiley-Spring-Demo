package misc;
import java.util.*;

class Employee {
	private int id;
	private String firstName;
	private String lastName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(obj == this)
			return true;
		if(getClass() != obj.getClass())
			return false;
		
		Employee emp = (Employee) obj;
		return (this.getId() == emp.getId());
	}
	
	/*public int hashCode() {
		int PRIME = 31;
		
	}*/
	
}

public class EqualsMethodExample {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setFirstName("King");
		emp1.setLastName("Kochar");
		
		Employee emp2 = new Employee();
		emp2.setId(101);
		emp2.setFirstName("Sarah");
		emp2.setLastName("Bowling");
		
		System.out.println(emp1.getId() == emp2.getId());
		/*if we do not define this equals method then we will get false as answer
		because the emp1 and emp2 object will be in different memory location in heap 
		so the id of emp1 will be different from emp2.*/
		
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.hashCode() == emp2.hashCode());
		
		/*
		 * If both emp objects are equal, in a set collection
		 * there must be on object inside hashset gets created because both 
		 * objects refers to the same employee.*/
		
		Set<Employee> emp = new HashSet<Employee>();
		emp.add(emp1);
		emp.add(emp2);
		System.out.println(emp);
	}

}
