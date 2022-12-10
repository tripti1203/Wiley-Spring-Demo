package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContext {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("emp.xml");
		System.out.println("ApplicationContext is instantiated !!");
		//appContext.getBean("emp1");
		
		//setter injection
		Employee e1 = (Employee)appContext.getBean("emp1");
		e1.displayEmployee();
		
		Employee e2 = (Employee)appContext.getBean("emp2");
		e2.displayEmployee();
		
		//constructor injection
		
		Employee emp = (Employee)appContext.getBean("empconst");
		System.out.println(emp);
		
		//Using multiple descriptor files with same object will override the value of and will print the last insert value in descriptor file.
		
		/*ApplicationContext appContext2 = new ClassPathXmlApplicationContext("emp.xml","emp2.xml","emp3.xml");
		Employee e1 = (Employee)appContext2.getBean("emp1");
		e1.displayEmployee();
		
		Employee e2 = (Employee)appContext2.getBean("emp2");
		e2.displayEmployee();*/
		
		/*ApplicationContext appContext3 = new ClassPathXmlApplicationContext(new String[] {"emp.xml","emp2.xml","emp3.xml"});
		Employee e11 = (Employee)appContext3.getBean("emp1");
		e11.displayEmployee();
		
		Employee e22 = (Employee)appContext3.getBean("emp2");
		e22.displayEmployee();*/
		
	}

}
