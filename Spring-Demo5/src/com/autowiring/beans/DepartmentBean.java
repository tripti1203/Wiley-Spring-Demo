package com.autowiring.beans;

public class DepartmentBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DepartmentBean(String name) {
		super();
		this.name = name;
	}
	
}
