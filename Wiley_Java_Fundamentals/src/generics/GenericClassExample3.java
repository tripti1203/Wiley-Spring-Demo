package generics;
//Home task addition of two values T value1 & T value2
class MyClass<E>{

	public static <E> void display(E[] value) {
		for(int i=0 ; i<value.length ; i++) {
			System.out.println(value[i]);
		}
	}
	
	/*public static <T> void  display(T value1) {
		System.out.println(value1.getClass().getName()+ " : " +  value1);
	}*/
	
}

public class GenericClassExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MyClass.display(100);
		MyClass.display("King");*/
		
		Integer[] arr = {10,20,30,40};  
		MyClass.display(arr);
		
	}

}
