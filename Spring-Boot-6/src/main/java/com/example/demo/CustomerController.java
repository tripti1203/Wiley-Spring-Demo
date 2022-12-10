package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;


	@GetMapping("/customers/{id}")
	public Optional<Customers> getBook(@PathVariable int id){
		Optional<Customers> b = customerRepository.findById(id);
		if(b.isPresent())
			return b;
		return b;
	}
}
