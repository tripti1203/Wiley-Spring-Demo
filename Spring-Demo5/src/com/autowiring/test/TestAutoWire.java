package com.autowiring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowiring.beans.EmployeeBean;

public class TestAutoWire {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeBean eb = (EmployeeBean) context.getBean("emp");
		System.out.println(eb.getFullName());
		System.out.println(eb.getDepartmentBean().getName());
	}

}
