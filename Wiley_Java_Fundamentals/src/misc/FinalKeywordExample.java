package misc;

public class FinalKeywordExample {
	
	final int count = 100;
	public void count() {
		System.out.println(this.count);
	}

	public static void main(String[] args) {
		
		FinalKeywordExample obj = new FinalKeywordExample();
		obj.count();
	}

}
