package com.prowings.immutablity;

public class TestImmutability {
	public static void main(String[] args) {
		Address ad = new Address(416405, "Sangli");
		Student s1 = new Student(10 , "Vijay" , ad);
		
		System.out.println("Before changing s1:"+ s1);
		//s1.rollNo = 20;
		ad.city = "Pune";
		s1.getAddress().city = "Dubai";
		
		System.out.println("Before changing s1:"+ s1);
		
	}

}
