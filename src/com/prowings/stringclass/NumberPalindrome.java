package com.prowings.stringclass;

public class NumberPalindrome {
	public static void main(String[] args) {
		NumberPalindrome obj = new NumberPalindrome();
		int num = 12121;
		int rev = 0;
		int temp = num;
		rev = obj.reverseNumber(rev, temp);
		
		isPalindrome(num, rev);
	}
	public int reverseNumber(int rev, int temp) {
		int rem;
		while(temp>0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		}
		System.out.println(rev);
		return rev;
	}
	public static void isPalindrome(int num, int rev) {
		
		if(num == rev) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
	}
}
