package assignment2;

import java.util.Scanner;

public class VolumeOfSphere {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		double radius = scan.nextDouble();
		
		volumeOfSphere(radius);
	}

	public static void volumeOfSphere(double radius) {
		double res = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
		System.out.println("Volume of the sphere is : " + res);
	}

}
