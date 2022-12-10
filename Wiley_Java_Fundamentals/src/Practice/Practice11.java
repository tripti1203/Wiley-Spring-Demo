package Practice;

import java.util.Scanner;

class StudentDetails{
	private int admno;
	private String sname;
	private float eng = 0, math = 0, science = 0;
	private float total;
	private static String universityName;
	private static String courseName;
	Scanner scan = new Scanner(System.in);
	
	static {
		universityName = "ABC University";
		courseName = "Science";
	}
	
	private float cTotal() {
		total = this.eng + this.math + this.science;
		return total;
	}
	
	public void takeData() {
		System.out.print("Enter AdmsNo. : ");
		this.admno = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter Student Name. : ");
		this.sname = scan.nextLine();
		System.out.print("Enter Marks Of Eng : ");
		this.eng = scan.nextFloat();
		System.out.print("Enter Marks Of Math : ");
		this.math = scan.nextFloat();
		System.out.print("Enter Marks Of Science : ");
		this.science = scan.nextFloat();
		cTotal();
	}
	public void showData() {
		System.out.println("Admission No : " + admno);
		System.out.println("University Name : " + StudentDetails.universityName);
		System.out.println("Student Name : " + sname);
		System.out.println("Course Name : " + StudentDetails.courseName);
		System.out.println("Marks in Eng : " + eng);
		System.out.println("Marks in Math : " + math);
		System.out.println("Marks in Science : " + science);
		System.out.println("Total marks obtained : " + total);
	}
}

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails[] student = new StudentDetails[5] ; 
		for(int i=0 ; i<student.length ; i++) {
			System.out.println("Enter the new Student details : ");
			student[i] = new StudentDetails();
			student[i].takeData();
		}
		System.out.println("------------------------------");
		
		for(int i=0 ; i<student.length ; i++) {
			System.out.println("Details of all Student : ");
			student[i].showData();
			System.out.println();
		}
	}

}
