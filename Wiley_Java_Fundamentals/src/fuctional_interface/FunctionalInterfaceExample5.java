package fuctional_interface;
//Unary Operator With Functional Interface Chaining

import java.util.function.UnaryOperator;

public class FunctionalInterfaceExample5 {

	public static void main(String[] args) {
		UnaryOperator<Integer> square = (num) -> num * num;
		UnaryOperator<Integer> increment = (num) -> num + 1;
		var result = square.andThen(increment).apply(10);
		System.out.println(result);
	}

}
