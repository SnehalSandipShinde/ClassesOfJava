package com.prowings.stringclass;

public class StringPalindrome2 {
	public static void main(String[] args) {
		String str = "madamm";
		String rev = "";
		boolean s = str.equals(rev);
		System.out.println(s);
		for (int i = str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
			System.out.println(rev);

		}
		
		if(str.equals(rev)) {
			System.out.println("Palindrome...");
		}
		else {
			System.out.println("not palindrome");
		}
	}
		
}
