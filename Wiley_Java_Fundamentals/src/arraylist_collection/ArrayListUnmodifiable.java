package arraylist_collection;
import java.util.*;


class Student {
	private int studentId;
	private String studentName;
	private String studentCourse;
	
	public Student() {
		super();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCourse=" + studentCourse
				+ "]";
	}
		
}

public class ArrayListUnmodifiable {

	public static void main(String[] args) {
		try {
			List<Student> student = new ArrayList<Student>();
		
			Student stud1 = new Student();
			stud1.setStudentId(101);
			stud1.setStudentName("King Kochar");
			stud1.setStudentCourse("Advanced Java");
			student.add(stud1);
		
			Student stud2 = new Student();
			stud2.setStudentId(121);
			stud2.setStudentName("Sarah Bowling");
			stud2.setStudentCourse("SQL");
			student.add(stud2);
		
			Student stud3 = new Student();
			stud3.setStudentId(131);
			stud3.setStudentName("John Smith");
			stud3.setStudentCourse("Core Java");
			student.add(stud3);
			
			
			//Displaying student details
			System.out.println("Iterating through ArrayList : ");
			Iterator<Student> itr1 = student.iterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			
			//manipulating the ArrayList
			student.remove(0);
			System.out.println(student);
			System.out.println("Size of the arrayList : "+ student.size());
			student.add(stud1);
			System.out.println(student);
			System.out.println("Size of the arrayList : "+ student.size());
			
			List<Student> unmodifiedList = Collections.unmodifiableList(student);            //stored the unmodifiable view of the student in this list
			
			System.out.println("Iterating through read-only ArrayList : ");
			Iterator<Student> itr2 = unmodifiedList.iterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}
			
			//trying to manipulate unmodified list
			Student stud4 = new Student();
			stud4.setStudentId(131);
			stud4.setStudentName("John Smith");
			stud4.setStudentCourse("Core Java");
			unmodifiedList.add(stud4);
			
			System.out.println(unmodifiedList);
			
			
		}catch(UnsupportedOperationException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
