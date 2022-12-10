package treeset_collection;
import java.util.*;

class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
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


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}


	@Override
	public int compareTo(Employee o) {
		return 0;
	}
	
	public static Comparator<Employee> nameComparator = new Comparator<Employee>(){

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getEmpName().compareTo(o2.getEmpName());
		}
		
	};
	
	
}

public class TreeSetPractice {

	public static void main(String[] args) {
		
		TreeSet<Employee> emp = new TreeSet<Employee>();
		
		Employee emp1 = new Employee();
		emp1.setEmpId(101);
		emp1.setEmpName("Shreya Sharma");
		
		Employee emp2 = new Employee();
		emp2.setEmpId(101);
		emp2.setEmpName("King Kochar");
	
		Employee emp3 = new Employee();
		emp3.setEmpId(101);
		emp3.setEmpName("John Doe");
		
		Employee emp4 = new Employee();
		emp4.setEmpId(101);
		emp4.setEmpName("John Smith");
		
		Employee emp5 = new Employee();
		emp5.setEmpId(101);
		emp5.setEmpName("Sarah Bowling");
		
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		
		//System.out.println("Comparing using name");
		//Collections.sort(emp,Employee.nameComparator);  ----> sort not applicable for treeset
		System.out.println(emp);
		
	}

}
