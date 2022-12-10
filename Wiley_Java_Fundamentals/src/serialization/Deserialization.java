package serialization;
import java.io.*;
public class Deserialization {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		FileInputStream inStream = new FileInputStream("C:\\Users\\HP\\Desktop\\Wiley-OOPS Notes\\serialize\\studentData.txt");
		ObjectInputStream in = new ObjectInputStream(inStream);
		Student student = (Student) in.readObject();
		System.out.println(student);
		in.close();
		inStream.close();
	}

}
