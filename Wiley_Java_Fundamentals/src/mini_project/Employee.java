package mini_project;

import java.io.Serializable;

public class Employee implements Serializable {
	private int empId;
	private String empName;
	private double empSalary;
	private String empDesignation;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, double empSalary, String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	@Override
	public String toString() {
		return "EmployeeClass [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary
				+ ", empDesignation=" + empDesignation + "]";
	}
	
	public void display() {
		System.out.println("Employee Id : " + getEmpId());
		System.out.println("Employee Name : " + getEmpName());
		System.out.println("Employee Salary : " + getEmpSalary());
		System.out.println("Employee Designation : " + getEmpDesignation());
		
		System.out.println("--------------------");
	}
	
}
