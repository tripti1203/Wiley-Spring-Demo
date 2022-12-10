package com.anno.beans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpNamedParameter implements CustomerDAO {

	@Autowired
	NamedParameterJdbcTemplate namedTemplate;
	
	@Override
	public int addCustomer(Customer customer) {
		String insertQuery = "insert into customer values(::customerId,::customerName)";
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("customerID",customer.getCustomerID());
		params.put("customerName",customer.getCustomerName());
		
		int rows = namedTemplate.update(insertQuery, params);
		
		return rows;
	}

	@Override
	public int updateCustomer(String name, int id) {
		String updateQuery = "update customer set (::customerName) where (::customerId)";
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("customerID",id);
		params.put("customerName",name);
		int rows = namedTemplate.update(updateQuery, params);
		
		return rows;
	}

	@Override
	public int deleteCustomer(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
