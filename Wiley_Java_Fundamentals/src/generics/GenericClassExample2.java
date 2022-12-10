package generics;

class Calculation<T,U>{
	T value1;
	U value2;
	
	Calculation(){
		
	}
	Calculation(T value1 , U value2){
		this.value1 = value1;
		this.value2 = value2;
	}
	public void display() {
		System.out.println("Value 1 : " + this.value1);
		System.out.println("Value 2 : " + this.value2);
	}
}

public class GenericClassExample2 {

	public static void main(String[] args) {
		
		Calculation<Integer,String> calc = new Calculation<>(100,"Bye");
		calc.display();
	}

}
