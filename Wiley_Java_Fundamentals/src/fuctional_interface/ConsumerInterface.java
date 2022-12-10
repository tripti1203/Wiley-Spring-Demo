package fuctional_interface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {
		List<String> names = List.of("King","Kochhar","Sarah","Bowling");
		Consumer<String> printNames = item -> System.out.println(item);
		Consumer<String> printNamesUpperCase = item -> System.out.println(item);
		
		names.forEach(printNames);
		System.out.println("-------------");
		names.forEach(printNamesUpperCase);
		System.out.println("-------------");
		names.forEach((printNamesUpperCase).andThen(printNames));
		System.out.println("-------------");
	}

}
