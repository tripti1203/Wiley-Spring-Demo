package assignment1;
/*
 * Write a program perform the addition of numbers using two parameters and three parameters then we can write
 *  two separate addition methods with the same name but with different number of parameters.*/
public class AdditionOfNumbers {

	public static void main(String[] args) {
		
		addition(10,50);
		addition(55,74,68);
	}
	
	public static void addition(int a , int b) {
		int sum = a+b;
		System.out.println("Additon of two numbers : " + sum);
	}
	public static void addition(float a , int b, float c) {
		
		float sum = a+b+c;
		System.out.println("Addition of three numbers : " +  sum);
	}

}
