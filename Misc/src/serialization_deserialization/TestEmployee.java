package serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployee {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp1 = new Employee(101,"John Doe",43000,new Date(3,11,2012));
		
		System.out.println("Before Serialization :");
		emp1.printDetails();
		
		System.out.println("------------------------");
		
		FileOutputStream fos = new FileOutputStream("employee.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		System.out.println("Object Serialized !!");
		
		FileInputStream fis = new FileInputStream("employee.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 =(Employee)ois.readObject();
		System.out.println("After Serialization :");
		emp2.printDetails();
		
		
		
	}

}
