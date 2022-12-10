package serialization_deserialization2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudent {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Course course = new Course(1,"King Kochhar","Java");
		
		System.out.println("Before Serialization : ");
		System.out.println(course);
		
		FileOutputStream fos = new FileOutputStream("student.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(course);
		oos.close();
		fos.close();
		System.out.println("Object Serialized !!");
		
		FileInputStream fis = new FileInputStream("student.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Course c = (Course)ois.readObject();
		ois.close();
		fis.close();
		System.out.println("After Serialization : ");
		System.out.println(c);
	}

}
