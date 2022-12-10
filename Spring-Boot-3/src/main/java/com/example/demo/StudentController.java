package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/students")
	public List<Student> getAllStudent(){
		return service.getAllStudent();
	}
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable("id") String id) {
		return service.getStudentById(id);
	}
	
	@PostMapping("/students")
	public void createStudent(@RequestBody Student student) {
		service.createStudent(student);
	}
	
	@PutMapping("/students/{id}")
	public void updateStudentById(@PathVariable("id") String id ,@RequestBody Student student) {
		service.updateStudentById(id, student);
	}
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable("id") String id) {
		service.deleteStudent(id);
	}
}

