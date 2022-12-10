package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot5Application implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot5Application.class, args);
		System.out.println("Application is running !!");
	}

	@Override
	public void run(String... args) throws Exception {
		bookRepository.save(new Book(1L,"Thinking With Java","J123"));
		bookRepository.save(new Book(2L,"Learn Java","JL123"));
		bookRepository.save(new Book(3L,"Advanced Java","AJ123"));
		System.out.println("Data inserted !!");
		
		System.out.println("All books in database --> ");
		for(Book b : bookRepository.findAll()) {
			System.out.println(b);
		}
		
		Book book1 = bookRepository.findByIsbn("JL123");
		System.out.println("Book matching : " + book1.getTitle());
		
		Book book2 = bookRepository.findByTitle("Advanced Java");
		System.out.println(book2);
		
	}

}
