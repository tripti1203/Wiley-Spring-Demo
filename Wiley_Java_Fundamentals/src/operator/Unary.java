package operator;

public class Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num = 100;
		int res = 0;
		
		res = ++num;
		System.out.println(res);
		num++;
		System.out.println(num);
		
		res = --num;
		System.out.println(res);
		num--;
		System.out.println(num);
		*/
		
		int res = 0 , num = 100;
		
		res = num++;
		System.out.println(num); //101
		System.out.println(res); //100
		
		res = ++num;
		System.out.println(num); //102
		System.out.println(res); //102
		
		res = num--;
		System.out.println(num); //101
		System.out.println(res); //102
		
		res = --num;
		System.out.println(num); //100
		System.out.println(res); //100
		
		
		
		
	}

}
