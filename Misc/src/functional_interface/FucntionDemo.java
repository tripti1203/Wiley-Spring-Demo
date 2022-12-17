package functional_interface;

import java.util.function.Function;

public class FucntionDemo {

	public static void main(String[] args) {
		Function<String,String> myFunction = new Function<String,String>(){

			@Override
			public String apply(String t) {
				
				return t.toLowerCase();
			}
			
		};
		System.out.println(myFunction.apply("IBM"));
		
		//Using lambdas
		
		Function<String,String> company = (name)->name.toLowerCase();
		System.out.println(company.apply("Deloitte"));
	}

}
