package mini_project;

import java.io.IOException;
import java.util.*;

public class MainMenu {
	public static void main(String[] args) throws IOException, ClassNotFoundException, MyException {
		Scanner scan = new Scanner(System.in);
		EmployeeRepo empRepo = new EmployeeRepo();
		int choice;
		do {
			System.out.println("Employee Management System");
			System.out.println("1. Get All Employees.");
			System.out.println("2. Get Employee By Id.");
			System.out.println("3. Add New Employee.");
			System.out.println("4. Update Existing Employee.");
			System.out.println("5. Delete Existing Employee.");
			
			System.out.print("Enter the choice : ");
			choice = scan.nextInt();
			
			
			switch(choice) {
			case 1 :  empRepo.Deserialize();
					  empRepo.getEmpDetails();
					  System.out.println("------------");
			break;
			case 2 : empRepo.Deserialize();
					 empRepo.getEmpById();
					 System.out.println("------------");
			break;
			case 3 : empRepo.addNewEmp();
			 		 empRepo.Serialize();
			 		System.out.println("------------");
			break;
			case 4: empRepo.updateEmpDetails();
			        empRepo.Serialize();
			        System.out.println("------------");
			break;
			case 5: empRepo.deleteEmpDetails();
					empRepo.Serialize();
					System.out.println("------------");
			break;
			default: System.out.println("Exit");
			}
			
		}while(choice != 0);
		
		scan.close();
	}
}
