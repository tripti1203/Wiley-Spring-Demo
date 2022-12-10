package com.beans;

public class Car {
	String chasisNo;
	String color;
	String fuelType;
	long price;
	double average;
	
	public Car() {
		this.chasisNo = "Eng1001";
		this.color = "Black";
		this.fuelType = "Diesal";
		this.price = 800000;
		this.average = 15.0;
	}

	@Override
	public String toString() {
		return "Car [chasisNo=" + chasisNo + ", color=" + color + ", fuelType=" + fuelType + ", price=" + price
				+ ", average=" + average + "]";
	}
	
	
}
