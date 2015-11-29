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
		
		if (num <= 2) return num;
		
		return null;
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
