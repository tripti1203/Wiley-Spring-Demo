package fuctional_interface;
//Function chaining with BinaryOperator

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FunctionalInterfaceExample3 {

	public static void main(String[] args) {
		BinaryOperator<Integer> addition = (num1,num2) -> num1+num2;
		Function<Integer,Integer> square = num -> num*num;
		var res = addition.andThen(square).apply(100, 200);
		System.out.println(res);
	}

}
