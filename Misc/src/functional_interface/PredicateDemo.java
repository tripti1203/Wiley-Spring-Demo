package functional_interface;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<String> predicate1 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length()<10;
			}
			
		};
		
		System.out.println(predicate1.test("tripti Kushwaha"));
		
		//Finding even odd using lambdas
		
		Predicate<Integer> predicate2 = (val)-> val%2==0;
		System.out.println(predicate2.test(20));
		System.out.println(predicate2.test(15));
		
	}

}
