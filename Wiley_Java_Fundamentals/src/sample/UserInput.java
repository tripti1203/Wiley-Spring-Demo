package sample;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Employee First Name : ");
		String employeeFirstName = scan.nextLine();
		
		System.out.print("Enter Employee Last Name : ");
		String employeeLastName = scan.nextLine();
		
		System.out.print("Enter Employee Id : ");
		int employeeId = scan.nextInt();
		
		System.out.print("Enter Employee Salary : ");
		float employeeSalary = scan.nextFloat();
		
		System.out.println("EmployeeDetails");
		System.out.println(" EmployeeFirstName : " + employeeFirstName);
		System.out.println(" EmployeeLastName : " + employeeLastName);
		System.out.println(" EmployeeID : " + employeeId);
		System.out.println(" EmployeeSalary : " + employeeSalary);
		
		scan.close();
		
	}

}
