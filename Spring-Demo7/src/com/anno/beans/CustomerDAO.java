package com.anno.beans;

public interface CustomerDAO {
	public int addCustomer(Customer customer);
	public int updateCustomer(String name,int id);
	public int deleteCustomer(int id);
}
