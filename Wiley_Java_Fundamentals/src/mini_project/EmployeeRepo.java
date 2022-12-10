package mini_project;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MyException extends Exception {

	MyException(){
		super("InvalidEmployeeException : ID not present in the list");
		
	}
}

interface IOperation{
	void getEmpDetails();
	void getEmpById() throws MyException;
	void addNewEmp();
	void updateEmpDetails() throws MyException;
	void deleteEmpDetails() throws MyException;
}

public class EmployeeRepo  implements IOperation, Serializable{
	
	Scanner scan = new Scanner(System.in);
	List<Employee> list = new ArrayList<Employee>();
	
	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}
	
	@Override
	public void getEmpDetails() {
		for(Employee e : list ) {
			e.display();
		  }
	}

	@Override
	public void getEmpById() throws MyException {
		
		System.out.print("Enter the id to be searched :");
		 int id = scan.nextInt();
		 boolean idFound = false;
		 
		 for(Employee e : list) {
			
			 if(e.getEmpId() == id) {
				 idFound = true;
				 e.display();
			 }
		 }
		 
		 try {
			if(idFound == false) {
				throw new MyException();
			} 
		 }catch(MyException ex) {
			 System.out.println(ex.getMessage());
		 }
		 
		 
	}

	@Override
	public void addNewEmp() {
		Employee emp = new Employee();
		
		 System.out.print("Enter employee Id :");
		 emp.setEmpId(scan.nextInt());
		 
		 System.out.print("Enter employee Name :");
		 emp.setEmpName(scan.next());
		 
		 System.out.print("Enter employee Salary :");
		 emp.setEmpSalary(scan.nextDouble());
		 
		 System.out.print("Enter employee Designation :");
		 emp.setEmpDesignation(scan.next());
		 
		 list.add(emp);
	}

	@Override
	public void updateEmpDetails() throws MyException {
		System.out.print("Enter the Id to update the existing employee :");
 		int id = scan.nextInt();
 		boolean idFound = false;
 		for(Employee e : list) {
 			if(e.getEmpId() == id) {
 				 idFound = true;
 				 System.out.print("Enter employee Name :");
				 e.setEmpName(scan.next());
 				 
 				 System.out.print("Enter employee Salary :");
				 e.setEmpSalary(scan.nextDouble());
				 
				 System.out.print("Enter employee Designation :");
				 e.setEmpDesignation(scan.next());
 			}
 		}
 		 try {
			if(idFound == false) {
				throw new MyException();
			} 
		 }catch(MyException ex) {
			 System.out.println(ex.getMessage());
		 }
	}

	@Override
	public void deleteEmpDetails() throws MyException {
		System.out.print("Enter the id to be deleted :");
		int id = scan.nextInt();
		boolean idFound = false;
		for(Employee e : list) {
			if(id == e.getEmpId())
				idFound = true;
				list.remove(e);
		}
		try {
			if(idFound == false) {
				throw new MyException();
			} 
		 }catch(MyException ex) {
			 System.out.println(ex.getMessage());
		 }

	}

	public void Serialize() throws IOException {
		//Serialize
		FileOutputStream outStream = new FileOutputStream("C:\\Users\\HP\\Desktop\\Wiley-OOPS Notes\\serialize\\EmployeeManagement.txt");
		ObjectOutputStream out = new ObjectOutputStream(outStream);
		out.writeObject(list);
		out.flush();
		out.close();
		outStream.close();
		System.out.println("Object serialized successfully.");
				
	}
	
	public void Deserialize() throws ClassNotFoundException, IOException {
		//Deserialize
		FileInputStream inStream = new FileInputStream("C:\\Users\\HP\\Desktop\\Wiley-OOPS Notes\\serialize\\EmployeeManagement.txt");
		ObjectInputStream in = new ObjectInputStream(inStream);
		list = (List<Employee>) in.readObject();
		System.out.println(list);
		in.close();
		inStream.close();
	}

	
}
