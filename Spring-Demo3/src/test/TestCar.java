package test;

import com.beans.Car;
import com.factory.CarFactory;

public class TestCar {

	public static void main(String[] args) {
		CarFactory cf = new CarFactory();
		Car c = cf.buildCar();
		System.out.println(c);
	}

}
