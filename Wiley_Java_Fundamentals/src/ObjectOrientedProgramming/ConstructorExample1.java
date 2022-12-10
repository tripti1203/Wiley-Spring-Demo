package ObjectOrientedProgramming;

import java.util.Scanner;

class Student {
	
	//Data Members
	int studentId;
	String studentName;
	int studentAge;
	Scanner scan = new Scanner(System.in);
	//Parameterized
	public Student(int studentId , String studentName , int studentAge) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	//ParameterLess Constructor
	public Student() {
		this.studentId = 10;
		this.studentName = "Tripti";
		this.studentAge = 22;
	}
	
	//Copy Constructor
	public Student(Student stuObj) {
		this.studentId = stuObj.studentId;
		this.studentName = stuObj.studentName;
		this.studentAge = stuObj.studentAge;
	}
	
	
	public void displayDetails() {
		System.out.println("Student Id : " + this.studentId);
		System.out.println("Student Name : " + this.studentName);
		System.out.println("Student Age : " + this.studentAge);
	}
}

public class ConstructorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student();
		student1.displayDetails();
		System.out.println("----------");
		
		Student student2 = new Student();
		student2.displayDetails();
		System.out.println("----------");
		
		Student student3 = new Student(12,"Priya",23);
		student3.displayDetails();
		System.out.println("----------");
		
		Student student4 = new Student(13,"Arav",24);
		student4.displayDetails();
		System.out.println("----------");
		
		Student student5 = new Student(student3);
		student5.displayDetails();
		System.out.println("----------");

	}

}
