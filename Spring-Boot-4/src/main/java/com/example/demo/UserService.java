package com.example.demo;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	private JdbcTemplate jdbcTemplate = null;

	public UserService(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insert(UserDto userDto) {
		String insert = "insert into user values(?,?,?)";
		int row = jdbcTemplate.update(insert, userDto.getId(),userDto.getFirst_name(),userDto.getLast_name());
		System.out.println("Rows inserted : " + row);
	}
	
	public void update(int id , String first_name) {
		String update = "Update user set first_name=? where id = ?";
		int row = jdbcTemplate.update(update, id,first_name);
		System.out.println("Rows updated : " + row);
	}
	
	public void delete(int id) {
		String delete = "delete from user where id = ?";
		int row = jdbcTemplate.update(delete, id);
		System.out.println("Rows deleted : " + row);
	}
}
