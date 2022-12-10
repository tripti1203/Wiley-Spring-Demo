package generics;

class Test<T>{
	T value;
	String message;
	Test(){
		
	}
	
	Test(T value,String message)
	{
		this.value = value;
		this.message = message;
	}
	
	public T getValue() {
		return this.value;
	}
	
	public String getMessage() {
		return this.message;
	}
	
}

public class GenericClassExample1 {

	public static void main(String[] args) {
		
		Test<Integer> test1 = new Test<Integer>(100,"Hello to Generics");
		System.out.println(test1.getValue() + " : " + test1.getMessage());
		
	}

}
