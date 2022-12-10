package serialization;

import java.io.*;

public class Serialization {

	public static void main(String[] args) throws IOException {
		Student student = new Student(101,"Kartik Sharma");
		FileOutputStream outStream = new FileOutputStream("C:\\Users\\HP\\Desktop\\Wiley-OOPS Notes\\serialize\\studentData.txt");
		ObjectOutputStream out = new ObjectOutputStream(outStream);
		out.writeObject(student);
		out.flush();
		out.close();
		outStream.close();
		System.out.println("Student object serialized successfully.");
	}

}
