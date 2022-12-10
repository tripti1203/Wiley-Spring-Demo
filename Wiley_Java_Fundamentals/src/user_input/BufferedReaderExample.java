package user_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your Name : ");
		String name = reader.readLine();
		
		System.out.print("Enter your Age : ");
		int age = Integer.parseInt(reader.readLine());
		
		System.out.println(name);
		System.out.println(age);
		
	}

}
