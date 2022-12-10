package fuctional_interface;

import java.util.function.BinaryOperator;

public class FunctionalInterfaceExample2 {

	public static void main(String[] args) {
		BinaryOperator<Integer> addition = (num1,num2) -> num1+num2;
		var res = addition.apply(100, 200);
		System.out.println(res);
	}

}
