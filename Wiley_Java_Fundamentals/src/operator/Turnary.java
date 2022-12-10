package operator;

public class Turnary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=45;
		/*if(num%5==0)
			System.out.println("Divisible by 5!!");
		else
			System.out.println("Not Divisible by 5!!");*/
	
		String res;
		res = (num % 5 == 0) ? "Divisible" :" Not Divisible";
		System.out.println(res);
	}

}
