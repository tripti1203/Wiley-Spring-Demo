package singleton_class;

class SingletonThread{

	private static SingletonThread single_instance = null;
	
	private String str;

	private SingletonThread() {
		str = "Hello from private constructor";
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public static synchronized SingletonThread getInstance() {
		if(single_instance == null)
			single_instance = new SingletonThread();
		return single_instance;
	}

}

public class SingletonThreadSafeClass {

	public static void main(String[] args) {
		SingletonThread obj1 = SingletonThread.getInstance();
		SingletonThread obj2 = SingletonThread.getInstance();
		SingletonThread obj3 = SingletonThread.getInstance();
		System.out.println(obj1.getStr());
		//Object Comparison
		
		if(obj1 == obj2 && obj2 == obj3)
			System.out.println("All objects point to the same memory location");
		else
			System.out.println("All objects point doen't to the same memory location");
	}

}
