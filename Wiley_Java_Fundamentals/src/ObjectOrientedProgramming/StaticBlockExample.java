package ObjectOrientedProgramming;

import java.util.Scanner;

class Studentss {
	
	//Data Members
	int studentId;
	String studentName;
	int studentAge;
	static String universityName;
	Scanner scan = new Scanner(System.in);
	
	//class can have only one static block
	static {
		universityName = "XYZ University";
	}
	
	public Studentss() {
		this.studentId = 1000;
		this.studentName = "Aryan";
		this.studentAge = 23;
	}
	public void displayDetails() {
		System.out.println("Student Id : " + this.studentId);
		System.out.println("Student Name : " + this.studentName);
		System.out.println("Student Age : " + this.studentAge);
		System.out.println("University Name : "+ Studentss.universityName);
	}
}


public class StaticBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentss s1 = new Studentss();
		s1.displayDetails();
		System.out.println("----------------");
		Studentss.universityName = "ABC University";
		
		Studentss s2 = new Studentss();
		s2.displayDetails();
		System.out.println("----------------");
	}

}
