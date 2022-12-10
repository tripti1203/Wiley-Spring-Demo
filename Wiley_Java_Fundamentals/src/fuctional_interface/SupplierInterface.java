package fuctional_interface;
import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		Supplier<Double> getRandom = () -> Math.random();
		var res = getRandom.get();
		System.out.println(res);
	}

}
