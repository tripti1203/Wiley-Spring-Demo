package Encapsulation;

class Student {
	private static int number;
	private String name;
	private String course;
	private int age;
	private static String schoolName;
	static {
		Student.schoolName = "ABC School";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	public void setAge(int age) {
		if(age>=18)
			this.age = age;
		else
			System.out.println("You can't get enrollment for this course.");
	}
	public int getAge() {
		return age;
	}
	public static String getSchoolName() {
		return schoolName;
	}
	
	public static void setNumber(int number) {
		Student.number = number;
	}
	public static int getNumber() {
		return number;
	}
}

public class GetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setName("Tripti");
		student.setCourse("Java");
		student.setAge(22);
		
		System.out.println("Name : " + student.getName());
		System.out.println("Course : " + student.getCourse());
		System.out.println("Age: " + student.getAge());
		System.out.println("School Name : " + Student.getSchoolName());
	
	}

}
