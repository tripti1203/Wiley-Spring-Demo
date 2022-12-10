package singleton_class;

class Singleton {
	//Static variable reference of the same class (Type Singleton)
	private static Singleton single_instance = null;
	
	private String str;
	
	//Private constructor to restrict class instantiation
	private Singleton() {
		str = "Hello from private constructor";
	}
	
	
	//Method that return single object of the class
	
	public static Singleton getInstance() {
		if(single_instance == null)
			single_instance = new Singleton();
		return single_instance;
	}


	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
	}
}

public class SingletonClassExample1 {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
		System.out.println(obj1.getStr());
		//Object Comparison
		
		if(obj1 == obj2 && obj2 == obj3)
			System.out.println("All objects point to the same memory location");
		else
			System.out.println("All objects point doen't to the same memory location");
	}

}
