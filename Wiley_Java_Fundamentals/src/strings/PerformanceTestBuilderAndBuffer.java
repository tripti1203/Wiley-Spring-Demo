package strings;

public class PerformanceTestBuilderAndBuffer {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer sb1 =  new StringBuffer("Java");
		for(int i=0 ; i<100000 ; i++) {
			sb1.append("Fundamentals");
		}
		System.out.println("Performance Test(StringBuffer) : " + (System.currentTimeMillis()-startTime));
		
		startTime = System.currentTimeMillis();
		StringBuilder sb2 =  new StringBuilder("Java");
		for(int i=0 ; i<100000 ; i++) {
			sb2.append("Fundamentals");
		}
		System.out.println("Performance Test(StringBuilder) : " + (System.currentTimeMillis()-startTime));
	}

}
