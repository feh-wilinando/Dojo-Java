package com.fws.dojo.anagrams;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;


public class AnagramTest {

	@Test
	public void UmAnagramaDeUmaLetraDeveGerarUmaUnicaCombinacao(){
		Anagram anagram = new Anagram("a");				
		Integer totalMatchers = anagram.getTotalMatchers();
		Integer lenth = anagram.getLength();
		
		assertThat(1, is(equalTo(lenth)) );
		assertThat(1, is(equalTo(totalMatchers)) );
		
		
		
	}
	
}
