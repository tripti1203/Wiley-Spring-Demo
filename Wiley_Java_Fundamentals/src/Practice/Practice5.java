package Practice;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1 , b = 2;
		int c , d;
		
		c = --b; //c = 1 , b = 1
		d = a--; //d = 1 , a = 0
		c--; // c = 0
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
	}

}
