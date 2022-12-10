package com.beans;

public class Customer {
	int customerId;
	String adhaarId;
	String customerName;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public Customer(String adhaarId, String customerName) {
		this.adhaarId = adhaarId;
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", adhaarId=" + adhaarId + ", customerName=" + customerName + "]";
	}
	

}
