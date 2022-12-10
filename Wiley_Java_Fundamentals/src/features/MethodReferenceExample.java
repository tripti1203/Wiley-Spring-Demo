package features;

import java.util.function.BiFunction;

interface Printer {
	void print();
}

class ConsolePrinter {
	
	public ConsolePrinter() {
		System.out.println("Constructor of console printer");
	}
	//Instance Method
	public void printMessage() {
		System.out.println("Print message method");
	}
	//static method
	public static void printSomething() {
		System.out.println("Printing Something method");
	}
	//static method
	public static int addition(int num1 , int num2) {
		return num1+num2;
	}
}

public class MethodReferenceExample {

	public static void main(String[] args) {
		//Reference to static method
		Printer printer = ConsolePrinter::printSomething;
		printer.print();
	
		//Reference to static method
		BiFunction<Integer,Integer,Integer> additionCall = ConsolePrinter::addition;
		int result = additionCall.apply(100, 200);
		System.out.println(result);
		
		//Reference to intance method
		ConsolePrinter ref = new ConsolePrinter();
		Printer printer1 = ref::printMessage;
		printer1.print();
		
		//Reference to a constructor method
		Printer printer2 = ConsolePrinter::new;
		printer2.print();
	}

}
