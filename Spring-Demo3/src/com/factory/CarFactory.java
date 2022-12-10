package com.factory;

import com.beans.Car;

public class CarFactory {
	private static Car car = new Car();
	
	public Car buildCar() {
		System.out.println("Building Car ....");
		return car;
	}

}
