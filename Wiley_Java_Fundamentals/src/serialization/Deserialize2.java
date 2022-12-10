package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize2 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileInputStream inStream = new FileInputStream("C:\\Users\\HP\\Desktop\\Wiley-OOPS Notes\\serialize\\employeeData.txt");
		ObjectInputStream in = new ObjectInputStream(inStream);
		Employee emp = (Employee)in.readObject();
		System.out.println(emp);
		in.close();
		inStream.close();
	}

}
