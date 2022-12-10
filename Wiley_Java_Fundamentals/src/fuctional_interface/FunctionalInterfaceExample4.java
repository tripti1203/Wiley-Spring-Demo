package fuctional_interface;

import java.util.function.UnaryOperator;

public class FunctionalInterfaceExample4 {

	public static void main(String[] args) {
		UnaryOperator<Integer> square = (num) -> num * num;
		var result = square.apply(10);
		System.out.println(result);
	}

}
