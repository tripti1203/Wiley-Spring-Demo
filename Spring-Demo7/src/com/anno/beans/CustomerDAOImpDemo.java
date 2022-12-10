package com.anno.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerDAOImpDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAOImp");
		
		//Inserting new record
		
		/*Customer c1 = new Customer(105,"Rohan K");
		int ans = customerDAO.addCustomer(c1);
		if(ans > 0) 
			System.out.println("Record added successfully!!");
		
		//Updating existing record
		
		int ans2 = customerDAO.updateCustomer("Priya",102);
		if(ans2 > 0) 
			System.out.println("Record updated successfully!!");
		
		
		//Delete from table
		
		int ans3 = customerDAO.deleteCustomer(105);
		if(ans3 > 0)
			System.out.println("One record successfully deleted !!");*/
		
		//Using JdbcDAOSupport Class
		
		/*Customer c2 = new Customer(107,"Pooja");
		int ans4 = customerDAO.addCustomer(c2);
		if(ans4 > 0)
			System.out.println("Record Inserted !!");*/
		
		/*int ans4 = customerDAO.updateCustomer("Pooja Singh",107);
		if(ans4 > 0)
			System.out.println("Record Updated !!");*/
		
		//Using NamedParameter 
		
		/*Customer c3 = new Customer(108,"Arnav");
		int ans5 = customerDAO.addCustomer(c3);
		if(ans5>0)
			System.out.println("Record Inserted !!");*/
	}

}
