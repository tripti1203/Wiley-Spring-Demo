package Practice;

class Employee{
	private String firstname;
	private String lastname;
	private double salary;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(String firstname, String lastname, double salary) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		
		if(this.salary < 0) {
			this.salary = 0.0;
		}
		else {
			this.salary = salary;
		}
	}



	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary + "]";
	}
	
	
}

public class Practice19 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.setSalary(30000);
		emp2.setSalary(40000);
		
		System.out.println("Employee1 Salary : " + emp1.getSalary());
		System.out.println("Employee2 Salary :" + emp2.getSalary());
		
		System.out.println("------------");
		
		emp1.setSalary(emp1.getSalary()+0.1*emp1.getSalary());
		emp2.setSalary(emp2.getSalary()+0.1*emp2.getSalary());
		
		System.out.println("After 10% raise : ");
		System.out.println("Employee1 salary : " + emp1.getSalary());
		System.out.println("Employee2 salary : " + emp2.getSalary());
	}

}
