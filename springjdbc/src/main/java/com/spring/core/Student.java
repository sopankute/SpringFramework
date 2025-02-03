package com.spring.core;

public class Student {

	int id;
	String name;
	String college;
	Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", address=" + address + "]";
	}

	public Student(int id, String name, String college, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.address = address;
	}

	public Student() {
		super();
	}
}
