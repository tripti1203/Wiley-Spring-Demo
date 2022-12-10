package com.anno.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImp implements CustomerDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int addCustomer(Customer customer) {
		
		int rows=0;
		String insertQuery = "insert into customer values(?,?)";
		rows = jdbcTemplate.update(insertQuery,customer.getCustomerID(),customer.getCustomerName());
		System.out.println("Inserted record is : " + customer.getCustomerID() + " " + customer.getCustomerName());
		return rows;
	}

	@Override
	public int updateCustomer(String name,int id) {
		int rows =0;
		String updateQuery = "update customer set customerName= ? where customerId = ?";
		rows = jdbcTemplate.update(updateQuery,name,id);
		System.out.println("Update Record is : " + id);
		return rows;
	}

	@Override
	public int deleteCustomer(int id) {
		int rows =0;
		String updateQuery = "delete from customer where customerId = ?";
		rows = jdbcTemplate.update(updateQuery,id);
		System.out.println("Deleted Record is : " + id);
		return rows;
	}

}
