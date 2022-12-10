package misc;

public class BlankFinalVariable {
	
	final int count;
	
	BlankFinalVariable(){
		this.count = 100;  //final variable can only be initialized in he constructor.
	}
	public void count() {
		//count = 100;  //error final variable cannot be initialized in the method
		System.out.println(this.count);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlankFinalVariable obj = new BlankFinalVariable();
		obj.count();
	}

}
