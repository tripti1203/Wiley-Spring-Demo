package serialization_deserialization2;

public class Course extends Student {
	String courseName;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int roll, String name,String courseName) {
		super(roll, name);
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", roll=" + roll + ", name=" + name + "]";
	}

	
}
