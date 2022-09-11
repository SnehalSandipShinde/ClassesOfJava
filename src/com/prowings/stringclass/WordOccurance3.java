package com.prowings.stringclass;

public class WordOccurance3 {
	public static void main(String[] args) {
		String string = "Java is a most powerfull language. It is also object oriented programming language";
//		String word = "is";
		
		String[] temp = string.split(" ");
		String[] temp1 = string.split(" ");
//		System.out.println(string.length());
//		System.out.println(string.charAt(0));
//		System.out.println(string.substring(0,5));
		System.out.println(string.contains("not"));
		
		int count = 0;
		
		for(int i=0; i< temp.length; i++) {
			for(int j=1;j< temp1.length;j++) {
				if(temp[i].equals(temp1[j])) {
					count++;
				}
			}
//			System.out.println(temp[i].contains(string));
////			if(string.contains(temp[i]))
//			if(temp[i].equals(string)) 
//			{
//				count ++;
//				
//			}
			System.out.println( temp1[1] + " occurs "+ count + ""
					+ " times ");
		}
	}

}
