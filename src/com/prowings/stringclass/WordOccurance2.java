package com.prowings.stringclass;

import java.util.HashMap;

public class WordOccurance2 {
	
	public static void wordOccuranceTime(String str) {
		
		HashMap<String, Integer> words = new HashMap<String, Integer>();

		for(String word : str.split(" "))
		{
			if(words.containsKey(word)) 
			{
				words.put(word, words.get(word) + 1);
			}
			else
			{
				words.put(word, 1);
			}
		}
		System.out.println(words);
	}
	
	public static void main(String[] args) {
		
		wordOccuranceTime("java has a most powerfull features ,"
				+ " java has a polymrphism");
	}
}
