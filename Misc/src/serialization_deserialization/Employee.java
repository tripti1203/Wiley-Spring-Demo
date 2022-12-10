package serialization_deserialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Employee implements Serializable {

	int empId;
	String empName;
	int empSalary;
	transient Date datOfJoining;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, int empSalary, Date datOfJoining) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.datOfJoining = datOfJoining;
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
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public Date getDatOfJoining() {
		return datOfJoining;
	}
	public void setDatOfJoining(Date datOfJoining) {
		this.datOfJoining = datOfJoining;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", datOfJoining="
				+ datOfJoining + "]";
	}
	public void printDetails() {
		System.out.println("Employee Id : " + this.empId);
		System.out.println("Employee Name : " + this.empName);
		System.out.println("Employee Salary : " + this.empSalary);
		System.out.println("Date Of Joining : " + this.datOfJoining.getDd() +"-"+ this.datOfJoining.getMm() +"-"+ this.datOfJoining.getYy());
	}
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		oos.writeInt(this.getDatOfJoining().getDd());
		oos.writeInt(this.getDatOfJoining().getMm());
		oos.writeInt(this.getDatOfJoining().getYy());
	}
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		this.datOfJoining=new Date(ois.readInt(),ois.readInt(),ois.readInt());
	}
}
