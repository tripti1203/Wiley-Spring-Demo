package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");
		Customer customer1 = (Customer) context.getBean("cust1");
		System.out.println(customer1);
		
		Customer customer2 = (Customer) context.getBean("cust2");
		System.out.println(customer2);
		
		
	}

}
