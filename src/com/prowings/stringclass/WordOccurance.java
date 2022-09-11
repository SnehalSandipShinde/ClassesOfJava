package com.prowings.stringclass;

public class WordOccurance {
	public static void main(String[] args) {
		String string = "Java is a most powerfull language."
				+ " It is also object oriented programming language";
		String word = "is";
		
		String[] temp = string.split(" ");
		System.out.println(temp);
		int count = 0;
		
		for(int i=0; i< temp.length; i++) {
			
			if(word.equals(temp[i])) {
				count ++;
			}
		}
		System.out.println("the word "+ word + " occurs "+ count + ""
				+ " times in the above string");
	}

}
