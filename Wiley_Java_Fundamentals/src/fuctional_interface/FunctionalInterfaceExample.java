package fuctional_interface;

import java.util.HashMap;
import java.util.function.Function;

class Student {
	static HashMap<Integer,String> students = new HashMap<>();
	
	public static void addStudent(String studentName,int studentId) {
		if(!students.containsKey(studentId)) {
			students.put(studentId, studentName);
		}
		else {
			System.out.println("Student already exists");
		}
	}
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Function<Integer,String> getDetails = (Integer id)->{
			if(Student.students.containsKey(id)) {
				return Student.students.get(id);
			}
			else {
				return "Student doesn't exists";
			}
		};
		Student.addStudent("Tripti", 1);
		Student.addStudent("King", 2);
		Student.addStudent("Sarah", 3);
		Student.addStudent("Joe", 4);
		
		System.out.println(getDetails.apply(1));
	}

}
