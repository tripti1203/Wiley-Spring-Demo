package externalizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestCountry {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Country country = new Country();
		country.setName("India");
		country.setCode(91);
		country.setClimate("Tropical");
		country.setPopulation(139.34);
		
		System.out.println("Before Serialization : ");
		country.printDetails();
		
		FileOutputStream fos = new FileOutputStream("country.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(country);
		oos.close();
		fos.close();
		System.out.println("Object is serialized!!");
		
		System.out.println("----------------------------------");
		
	
		
		FileInputStream fis = new FileInputStream("country.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Country c = (Country) ois.readObject();
		ois.close();
		fis.close();
		System.out.println("After Serialization : ");
		c.printDetails();
	}

}
