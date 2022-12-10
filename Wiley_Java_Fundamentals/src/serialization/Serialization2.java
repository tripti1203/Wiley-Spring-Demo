package serialization;

import java.io.*;

public class Serialization2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee emp = new Employee(101,"Kartik Sharma","Software Developer",60000);
		FileOutputStream outStream = new FileOutputStream("C:\\Users\\HP\\Desktop\\Wiley-OOPS Notes\\serialize\\employeeData.txt");
		ObjectOutputStream out = new ObjectOutputStream(outStream);
		out.writeObject(emp);
		out.flush();
		out.close();
		outStream.close();
		System.out.println("Employee object serialized successfully.");
	}

}
