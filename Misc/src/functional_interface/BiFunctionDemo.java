package functional_interface;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> myFucntion1 = new BiFunction<Integer,Integer,Integer>(){

			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
			
		};
		System.out.println(myFucntion1.apply(10,40));
		
		//using lambdas
		BiFunction<Double,Double,Double> myFunction2 =(val1,val2)->val1+val2;
		double res = myFunction2.apply(30.5,45.5);
		System.out.println(res);
	}

}
