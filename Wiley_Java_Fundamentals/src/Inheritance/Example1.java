package Inheritance;

import java.util.Scanner;

class Student{
	private int id;
	private String name;
	private String course;
	private static String schoolName;
	static {
		schoolName = "XYZ School";
	}
	Scanner scan = new Scanner(System.in);
	public void acceptDetails() {
		System.out.print("Enter student id: ");
		this.id = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter student name: ");
		this.name = scan.nextLine();
		System.out.print("Enter student course: ");
		this.course = scan.nextLine();
	}
	public void displayDetails() {
		System.out.println("Student ID : " + this.id);
		System.out.println("Student Name : " + this.name);
		System.out.println("Student Course : " + this.course);
		System.out.println("School Name : " + Student.schoolName);
	}
}
class Marks extends Student{
	protected float objectiveMarks;
	protected float subjectiveMarks;
	Scanner scan = new Scanner(System.in);
	
	public void acceptDetails() {
		super.acceptDetails();   //calls the student class accept method
		System.out.print("Enter the objectiveMarks: ");
		this.objectiveMarks = scan.nextFloat();
		System.out.print("Enter the subjectiveMarks: ");
		this.subjectiveMarks = scan.nextFloat();
	}
	public void displayDetails() {
		super.displayDetails();     //calls the student class display method
		System.out.println("Marks Scored");
		System.out.println("Objective Marks : " + this.objectiveMarks);
		System.out.println("Subjective Marks : " + this.subjectiveMarks);
	}
	
}
class Sports extends Marks{
	protected float score;
	public void acceptDetails() {
		super.acceptDetails();      //calls the marks class accept method
		System.out.print("Enter the sports score : ");
		this.score = scan.nextFloat();
	}
	public void displayDetails() {
		super.displayDetails();   //calls the marks class display method
		System.out.println("Sports score : " + this.score);
	}
}
class Result extends Sports{
	float totalMarks , averageMarks;
	public void calculateResult() {
		this.totalMarks = this.objectiveMarks + this.subjectiveMarks + this.score;
		this.averageMarks = this.totalMarks/3;
		System.out.println("Total Marks : " + this.totalMarks);
		System.out.println("Average Marks : " + this.averageMarks);
		if(this.averageMarks >=75 && this.objectiveMarks >=70 && this.subjectiveMarks >=70) {
			System.out.println("Congratulations!! You are Selected");
		}
		else {
			System.out.println("You are not Selected");
		}
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result res = new Result();
		res.acceptDetails();     
		
		res.displayDetails();
		
		res.calculateResult();
	}

}
