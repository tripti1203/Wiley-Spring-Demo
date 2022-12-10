package Practice;

import java.util.Scanner;

public class Practice17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		double radius = scan.nextInt();
		sphereVolume(radius);
	}
	public static void sphereVolume(double radius ) {
		double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		System.out.println("Volume of the sphere is : " + volume);
	}

}
