package com.prowings.immutablity;

public final class Student {
	private final int rollNo;
	private final String name;
	private final Address address;

	public Student(int rollNo, String name, Address address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Student rollNo=" + rollNo + ", name=" + name + ", address=" + address;
	}

}
