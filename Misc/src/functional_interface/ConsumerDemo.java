package functional_interface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> myConsumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		};
		
		myConsumer.accept("Tripti Kushwaha");
		
		//Using lambdas
		Consumer<String> myConsumer2 = (val)->System.out.println(val.toUpperCase());
		myConsumer2.accept("Tripti");
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("abc");
		arr.add("xyz");
		arr.add("pqr");
		
		//using lambdas iterating through list
		arr.forEach((name)->System.out.println(name.toUpperCase()));
	}

}
