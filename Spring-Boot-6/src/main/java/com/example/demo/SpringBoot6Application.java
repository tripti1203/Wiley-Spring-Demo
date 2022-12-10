package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot6Application implements ApplicationRunner {

	@Autowired
	CustomerRepository customerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot6Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		customerRepository.save(new Customers(101,"John","Doe",987624464));
		customerRepository.save(new Customers(102,"Sarah","Bowling",887624464));
		customerRepository.save(new Customers(103,"King","Kochhar",787624464));
		customerRepository.save(new Customers(104,"Queen","Kochhar",787624464));
		System.out.println("Data inserted !!");
		
		System.out.println("Customer Details --> ");
		for(Customers c : customerRepository.findAll()) {
			System.out.println(c);
		}

		System.out.println("--------------------------");	
		
		long numberOfEntity = customerRepository.count();
		System.out.println("Number of entities in the table customer : " + numberOfEntity);
		
		System.out.println("--------------------------");	
		
		boolean val = customerRepository.existsById(5);
		System.out.println("Does Id exists in the table : "+val);
		
		System.out.println("--------------------------");	
		
		/*customerRepository.deleteById(4);
		System.out.println("One row deleted !!");*/
		
		System.out.println("--------------------------");		
		Optional<Customers> cust = customerRepository.findById(4);
		if(cust.isPresent())
			System.out.println("Customer Found : " + cust);
		else
			System.out.println("Customer not found by Id");
		
		
		/*System.out.println("---------------------------");
		Customers cust1 = customerRepository.findByfirstName("King");
		System.out.println("Customer with firstname : " + cust1);
		
		System.out.println("---------------------------");
		Customers cust2 = customerRepository.findBylastName("Bowling");
		System.out.println("Customer with lastname : " + cust2);*/
		
		for(Customers c : customerRepository.findByFirstName("King")) {
			System.out.println(c);
		}
		
		for(Customers c : customerRepository.findByLastName("Doe")) {
			System.out.println(c);
		}
		
		/*for(Customers c : customerRepository.findAllOrderByFirstNameAsc()) {
			System.out.println(c);
		}*/
		
		int row1 = customerRepository.updateCustomer("Bullock", "Sarah");
		if(row1>0)
			System.out.println("One row updated !!");
		
		System.out.println("------------------------------");
		
	}

}
