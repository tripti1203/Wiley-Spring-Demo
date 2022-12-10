package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customers,Integer> {
	
	/*@Query(name="Customers.firstNameQuery")
	Customers findByfirstName(String fname);
	
	@Query(name="Customers.lastNameQuery")
	Customers findBylastName(String lname);*/
	
	List<Customers> findByFirstName(String fname);

	List<Customers> findByLastName(String lname);
	
	//List<Customers> findAllOrderByFirstNameAsc();
	
	@Transactional
	@Modifying
	@Query(name="Customers.updateLastName")
	int updateCustomer(String lastName,String firstName);
	
	//List<Customers> OrderByfirst_nameAsc();

	
}
