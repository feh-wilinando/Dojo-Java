package com.fws.dojo.anagrams;

import java.util.ArrayList;
import java.util.List;

public class Anagram {

	private final String base;
	private Integer totalMatchers;
	private List<String> anagrams = new ArrayList<String>();

	public Anagram(String base) {
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
		anagrams.add(base);
	}

}
