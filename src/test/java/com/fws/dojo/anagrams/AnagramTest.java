package com.fws.dojo.anagrams;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.junit.Test;


public class AnagramTest {

	@Test
	public void UmAnagramaDeUmaLetraDeveGerarUmaUnicaCombinacao(){
		Anagram anagram = new Anagram("a");				
		Integer totalMatchers = anagram.getTotalMatchers();
		Integer lenth = anagram.getLength();
		
		anagram.generateMatchers();
		
		List<String> matchers = anagram.getMatchers();
		
		assertThat(1, is(equalTo(lenth)) );
		assertThat(1, is(equalTo(totalMatchers)) );
		assertThat(matchers.size(), is(equalTo(1)));
		assertThat(matchers, containsInAnyOrder("a") );
		
		
	}
	
	
	@Test
	public void UmAnagramaDeDuasLetrasDeveGerarDuasCombinacoes(){
		Anagram anagram = new Anagram("ab");				
		Integer totalMatchers = anagram.getTotalMatchers();
		Integer lenth = anagram.getLength();
		
		anagram.generateMatchers();
		
		List<String> matchers = anagram.getMatchers();
		
		assertThat(2, is(equalTo(lenth)) );
		assertThat(2, is(equalTo(totalMatchers)) );
		assertThat(matchers.size(), is(equalTo(2)) );
		assertThat(matchers, containsInAnyOrder("ab", "ba") );
		
	}
	
	
	@Test
	public void UmAnagramDeTresLetrasDeveGerarSeisCombinacoes(){
		Anagram anagram = new Anagram("bio");				
		Integer totalMatchers = anagram.getTotalMatchers();
		Integer lenth = anagram.getLength();
		
		anagram.generateMatchers();
		
		List<String> matchers = anagram.getMatchers();
		
		assertThat(3, is(equalTo(lenth)) );
		assertThat(6, is(equalTo(totalMatchers)) );
		assertThat(matchers, containsInAnyOrder("bio", "boi", "iob", "ibo", "obi", "oib") );
		
	}
	
	
}
