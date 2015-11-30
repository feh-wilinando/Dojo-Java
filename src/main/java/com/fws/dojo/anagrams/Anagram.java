package com.fws.dojo.anagrams;

import java.util.ArrayList;
import java.util.List;

public class Anagram {

	private final String base;
	private Integer totalMatchers;
	private List<String> anagrams;

	public Anagram(String base) {
		this.anagrams = new ArrayList<String>();
		this.base = base;
		this.totalMatchers = factor(base.length());
	}

	public Integer getTotalMatchers() {
		return totalMatchers;
	}
	
	private Integer factor( Integer num ){
		int factor = 1;
		
		if (num <= 2) return num;
		
		for (int i = num; i > 1; i--) {
			factor *= i;
		}
		
		return factor;
	}

	public Integer getLength() {
		return base.length();
	}

	public List<String> getMatchers() {
		return anagrams  ;
	}

	public void generateMatchers() {
		
		switch (getLength()) {
		case 1:
			anagrams.add(base);			
			break;

		case 2:
			anagrams.add(base);
			anagrams.add(new StringBuilder(base).reverse().toString());
			break;
		case 3:	{
			int length = this.base.length();
			
			for (int i = 0; i < length; i++) {

				StringBuilder subAnagram = generateAnagramsByIndex(i);

				anagrams.add(subAnagram.toString());
				anagrams.add(subAnagram.reverse().toString());
			}
			
			break;
		}
		case 4:{
			
			
			break;
		}
		default:
			break;
		}
		
	}

	private StringBuilder generateAnagramsByIndex( int index) {
		int length = base.length();
		
		String base = scrollAnagramBaseAtIndex(index);

		StringBuilder anagram = new StringBuilder();
		
		anagram.append(base.charAt(0));			

		int contador = 1;
		
		do {

			if (contador == (length)) {
				contador = 0;
			}
			
			anagram.append(base.charAt(contador++));

		} while (anagram.length() < length);
		
		return anagram;
	}

	
	private String scrollAnagramBaseAtIndex( int index ){
		String invert = "";
		int length = base.length();
		int counter = index+1;
		
		invert += base.charAt(index);
		
		
		do {
			
			if (counter == (length) ) {
				counter = 0;
			}
			
			invert += base.charAt(counter++);
			
		} while (counter != index && invert.length() < (length) );
		
		return invert;
	}
	
}
