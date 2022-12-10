package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.LifeCycleBean;
import com.beans.UtilityBean;

public class TestLifeCycleBean {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		LifeCycleBean lcb = (LifeCycleBean)context.getBean("life");
		System.out.println("Bean Loaded !!");
		
		//stopping spring container
		((AbstractApplicationContext)context).registerShutdownHook();
	}

}
