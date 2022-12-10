package com.example.demo;

public class Course {
	private String courseName;
	private String courseId;
	public Course(String courseName, String courseId) {
		this.courseName = courseName;
		this.courseId = courseId;
	}
	public Course() {
		super();
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseId=" + courseId + "]";
	}
}
