package collections;
import java.util.*;

class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private int empAge;
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
	}
	@Override
	public int compareTo(Employee p) {
		return this.getEmpId()-p.getEmpId();
	}
	public static Comparator<Employee> idCompare = new Comparator<Employee>() {

		@Override
		public int compare(Employee p1, Employee p2) {
			return p1.getEmpId()-p2.getEmpId();
		}
		
	};
	public static Comparator<Employee> nameCompare = new Comparator<Employee>() {

		@Override
		public int compare(Employee p1, Employee p2) {
			return p1.getEmpName().compareTo(p2.getEmpName());
		}
		
	};
	
}

public class CollectionUtilityComparatorExample2 {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<Employee>();
		
		Employee person1 = new Employee();
		person1.setEmpId(100);
		person1.setEmpName("Ishika");
		person1.setEmpAge(20);
		emp.add(person1);
		
		Employee person2 = new Employee();
		person2.setEmpId(110);
		person2.setEmpName("Arnav");
		person2.setEmpAge(23);
		emp.add(person2);
		
		Employee person3 = new Employee();
		person3.setEmpId(111);
		person3.setEmpName("Kajal");
		person3.setEmpAge(17);
		emp.add(person3);
		
		System.out.println("Original Collection : "+ emp);
		
		//Collections.sort(persons);
		
		//Sorting list by person compare method.
		//comparing is a method which implicitly calls compareTo method
		System.out.println("Comparing using Emp ID : ");
		Collections.sort(emp,Employee.idCompare);
		System.out.println(emp);
		
		System.out.println("---------------------------------");
		
		System.out.println("Comparing using Emp Name : ");
		Collections.sort(emp,Employee.nameCompare);
		System.out.println(emp);
		
	}

}
