package misc;

public class StaticFinalVariable {
	
	static final int count = 100;
	static final int maxInt;
	
	static {
		maxInt = 200;
	}
	public void count() { 
		System.out.println(this.count);
		System.out.println(this.maxInt);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticFinalVariable obj = new StaticFinalVariable();
		obj.count();
	}

}
