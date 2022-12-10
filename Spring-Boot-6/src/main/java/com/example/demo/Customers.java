package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;


@NamedNativeQuery(name="Customers.firstNameQuery",query="",resultClass=Customers.class)
@NamedNativeQuery(name="Customers.updateCustomer",query="update customers set last_name=? where first_name=?",resultClass=Customers.class)
@NamedNativeQuery(name="Customers.lastNameQuery",query="Select * from customers where lastName=?",resultClass=Customers.class)
@NamedNativeQuery(name="Customers.deleteCustomer",query="delete from customers where id=?",resultClass=Customers.class)
@Entity
public class Customers {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private int phoneNo;
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customers(int id, String firstName, String lastName, int phoneNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Customers [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo=" + phoneNo
				+ "]";
	}
}
