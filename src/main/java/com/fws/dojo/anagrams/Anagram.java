package com.fws.dojo.anagrams;

public class Anagram {

	private final String base;
	private Integer totalMatchers;

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

}
