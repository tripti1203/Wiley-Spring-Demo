package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Cars;

public class TestCarApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");
		Cars myCar1 = (Cars) context.getBean("cars");
		System.out.println(myCar1);
		
		Cars myCar2 = (Cars) context.getBean("cars");
		System.out.println(myCar2);
		
	}

}
