package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("emp.xml");
		System.out.println("ApplicationContext is instantiated !!");
		//appContext.getBean("emp1");
		
		
	}

}
