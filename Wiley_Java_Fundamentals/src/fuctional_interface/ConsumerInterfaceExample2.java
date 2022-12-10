package fuctional_interface;

import java.util.function.BiConsumer;

public class ConsumerInterfaceExample2 {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> checkCriteria = (age,marks) -> {
			if(age >= 18 && marks >= 75) {
				System.out.println("Congratulation Shortlisted..");
			}
			else {
				System.out.println("Better Luck Next Time..");
			}
		};
		checkCriteria.accept(25, 79);
	}

}
