package toeknizer;

import java.util.StringTokenizer;

public class tokenizing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo1
		
		/*StringTokenizer message = new StringTokenizer("Learning Java Fundamentals");
		while(message.hasMoreTokens()) {
			System.out.println(message.nextToken());
		}*/
		
		//Demo2 --> printing strings seperated by delimeter
		
		/*StringTokenizer message = new StringTokenizer("Learning,Java,Fundamentals");
		while(message.hasMoreTokens()) {
			System.out.println(message.nextToken(","));
		}*/
		
		//Demo3 --> Delimeter as a token
		
		/*StringTokenizer message = new StringTokenizer("Learning,Java,Fundamentals",",",true);
		while(message.hasMoreTokens()) {
			System.out.println(message.nextToken().trim());
		}*/
		
		//Demo4 --> iterating using count tokens and printing the tokens
		StringTokenizer message = new StringTokenizer("Learning,Java,Fundamentals",",",true);
		int count = message.countTokens();
		for(int i=0; i<count; i++) {
			System.out.println("Token at "+ i + " : " + message.nextToken());
		}
		
		
	}

}
