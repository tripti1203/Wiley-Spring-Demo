package fuctional_interface;

import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		Predicate<String> isLongerThan5 = (str) -> str.length() > 5;
		if(isLongerThan5.test("Hello Everyone")) {
			System.out.println("Nice");
		}
		else
			System.out.println("length is short..");
	}

}
