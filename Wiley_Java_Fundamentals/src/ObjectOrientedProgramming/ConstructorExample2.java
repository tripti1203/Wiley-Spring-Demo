package ObjectOrientedProgramming;

import java.util.Scanner;

class Students {
	
	//Data Members
	int studentId;
	String studentName;
	int studentAge;
	Scanner scan = new Scanner(System.in);
	
	//ParameterLess Constructor
	Students() {
		this.studentId = 10;
		this.studentName = "Tripti";
		this.studentAge = 22;
	}
	
	public void displayDetails() {
		System.out.println("Student Id : " + this.studentId);
		System.out.println("Student Name : " + this.studentName);
		System.out.println("Student Age : " + this.studentAge);
	}
}


public class ConstructorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students();
		s1.displayDetails();
	}

}
