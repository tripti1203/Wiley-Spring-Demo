package com.anno.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.bean.Customer;

public class TestCustomerApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//Customer c = (Customer) context.getBean("customer");
		Customer c = (Customer) context.getBean("cust1");
		System.out.println(c);
		System.out.println(c.getCustomerAddress().getCity());
		System.out.println(c.getCustomerAddress().getState());
	}

}
