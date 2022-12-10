package com.example.demo;

import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	List<Student> studentList = new ArrayList<Student>(
			Arrays.asList(
					new Student("1","King","35",new Course("Java","J123")),
					new Student("2","Sarah","25",new Course("Spring","S223")),
					new Student("3","John","32", new Course("CPP","C322"))
					)
			);
	
	public List<Student> getAllStudent(){
		return studentList;
	}
	
	public void createStudent(Student s) {
		studentList.add(s);
	}
	
	public Student getStudentById(String id) {
		/*Student student=null;
		for(Student s : studentList) {
			if(s.getId().equals(id))
				student = s;
		}
		return student;*/
		return studentList.stream().filter(student -> student.getId().equals(id)).findAny().get();
	}
	
	public void updateStudentById(String id , Student student) {
		int counter = 0 ;
		for(Student s : studentList) {
			if(s.getId().equals(id))
				studentList.set(counter, student);
			counter++;
		}
	}
	
	public void deleteStudent(String id) {
		/*int counter = 0 ;
		for(Student s : studentList) {
			if(s.getId().equals(id))
				studentList.remove(counter);
			counter++;
		}*/
		
		studentList = studentList.stream().filter(student -> !student.getId().equals(id)).toList();
	}
}
