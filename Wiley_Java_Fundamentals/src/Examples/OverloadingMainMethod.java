package Examples;
/*
 * - JVM only looks for main method with string array as the entry point of any program
 * - A class can have only one main method with parameter String[] args.
 * - A class can have multiple main method with concept of overloading.  
 * */
class Test1{
	public static void main(String[] args) {
		System.out.println("Another main method from different class Test1");
	}
}
class Test2{
	public static void main(String[] args) {
		System.out.println("Another main method from different class Test2");
	}
}
public class OverloadingMainMethod {

	public static void main(String[] args) {
		System.out.println("Inside the main method");
		Test1.main(args);
		Test2.main(args);
		main("abc");
		main(3);
	}
	public static void main(String str) {
		System.out.println("Inside string main method calling from main method : " + str);
	}
	public static void main(int num) {
		System.out.println("Inside int main method calling from main method : " + num);
	}
}
