package com.anno.beans;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpJdbcSupport extends JdbcDaoSupport implements CustomerDAO{

	public CustomerDAOImpJdbcSupport(JdbcTemplate jdbcTemplate) {
		setJdbcTemplate(jdbcTemplate);
	}
	@Override
	public int addCustomer(Customer customer) {
		int rows=0;
		String insertQuery = "insert into customer values(?,?)";
		rows = getJdbcTemplate().update(insertQuery,customer.getCustomerID(),customer.getCustomerName());
		return rows;
	}

	@Override
	public int updateCustomer(String name, int id) {
		int rows = 0;
		String updateQuery = "update customer set customerName=? where customerId=?";
		rows=getJdbcTemplate().update(updateQuery,name,id);
		return rows;
	}

	@Override
	public int deleteCustomer(int id) {
		int rows =0;
		String updateQuery = "delete from customer where customerId = ?";
		rows = getJdbcTemplate().update(updateQuery,id);
		return rows;
	}

}
