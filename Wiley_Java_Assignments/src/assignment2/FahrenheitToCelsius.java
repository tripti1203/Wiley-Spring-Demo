package assignment2;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit : ");
		double fahrenheit = scan.nextFloat();
		
		double celcius = ((fahrenheit - 32)*5)/9;
		
		System.out.println("Temperature in Celcius is : " + celcius);
	}

}
