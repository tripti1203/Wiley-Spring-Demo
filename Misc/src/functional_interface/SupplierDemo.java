package functional_interface;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Integer> mySupplier = new Supplier<Integer>() {

			@Override
			public Integer get() {
				int a = 10;
				int b = 20;
				return a+b;
			}
		};
		System.out.println(mySupplier.get());
	}

}
