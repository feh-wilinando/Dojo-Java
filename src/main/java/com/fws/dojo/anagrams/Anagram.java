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
		case 3:	
			int length = base.length();
			
			for (int i = 0; i < length; i++) {
				
				char letra = base.charAt(i);
				String restante = ""; 
				
				int contador = i+1;
				
				do {
					
					if (contador == (length) ) {
						contador = 0;
					}
					
					restante += base.charAt(contador++);
					
				} while (contador != i && restante.length() < (length - 1) );
				
				anagrams.add(letra + restante);
				anagrams.add(letra + new StringBuilder(restante).reverse().toString());
			}
			
			break;
			
		default:
			break;
		}
		
	}

}
