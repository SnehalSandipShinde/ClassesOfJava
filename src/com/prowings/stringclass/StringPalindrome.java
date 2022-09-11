package com.prowings.stringclass;

public class StringPalindrome {
	
	public static void main(String[] args) {
		StringPalindrome obj = new StringPalindrome();
		String str = "Radar";
		str = str.toUpperCase();
		obj.isPalindrome(str);
	}

	public void isPalindrome(String str) {
		
		String rev= " ";
		for(int i=str.length()-1; i>=0; --i) {
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
		checkPalindrome(str, rev);
	}

	public void checkPalindrome(String str, String rev) {
		if(str.equals(rev.trim())) 
		{
			System.out.println("palindrome String....");
		}
		else
			System.out.println("String is not palindrome....");
	}
}
