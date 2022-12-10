package map_collection;
import java.util.*;
import java.util.Map.Entry;

class Employee{
	private int empId;
	private String empName;
	private double empSalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
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
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
}
public class MapPractice {

	public static void main(String[] args) {
		
		Map<Integer,Employee> map = new HashMap<>();
		
		Employee emp1 = new Employee(101,"King Kochar",60250.0);
		map.put(emp1.getEmpId(),emp1);
		
		Employee emp2 = new Employee(102,"Sarah Bowling",65302.5);
		map.put(emp2.getEmpId(),emp2);
		
		Employee emp3 = new Employee(103,"Vikram Singh",60000.53);
		map.put(emp3.getEmpId(),emp3);
		
		Employee emp4 = new Employee(104,"Tripti Kushwaha",80300.93);
		map.put(emp4.getEmpId(),emp4);
		
		Employee emp5 = new Employee(105,"John Smith",75430.7);
		map.put(emp5.getEmpId(),emp5);
		
		Set<Entry<Integer, Employee>> entrySet = map.entrySet();
		Iterator<Entry<Integer, Employee>> itr = entrySet.iterator();
		while(itr.hasNext()) {
			Entry<Integer, Employee> entry = itr.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
