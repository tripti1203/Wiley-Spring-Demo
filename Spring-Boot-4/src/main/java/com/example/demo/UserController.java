package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public void insertUSer(@RequestBody UserDto userDto) {
		userService.insert(userDto);
	}
	@PutMapping("/user/{id}")
	public void updateUser(@PathVariable("id") int id ,@RequestBody String first_name) {
		userService.update(id, first_name);
	}
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		userService.delete(id);
	}
}
