package Polymorphism;

class Person{
	String name;
	String city;
	
	Person(String name , String city){
		this.name = name;
		this.city = city;
	}
	public void showData() {
		System.out.println("Name: " + this.name);
		System.out.println("City: " +  this.city);
	}
}

class Employee extends Person{
	String designation;
	float salary;

	Employee(String name, String city, String designation , float salary) {
		super(name, city);
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public void showData() {
		super.showData();
		System.out.println("Designation: " + this.designation);
		System.out.println("Salary: " + this.salary);
	}
	
}

class Student extends Person{
	String course;
	int courseFee;

	Student(String name, String city, String course , int courseFee) {
		super(name, city);
		this.course = course;
		this.courseFee = courseFee;
	}
	@Override
	public void showData() {
		super.showData();
		System.out.println("Course Name : " + this.course);
		System.out.println("Course Fee : " + this.courseFee );
	}
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Tripti","Kolkata","Software Developer",60000);
		emp1.showData();
		System.out.println("----------------");
		Student student1 = new Student("Priya","Ranchi","Java",3000);
		student1.showData();

	}

}
