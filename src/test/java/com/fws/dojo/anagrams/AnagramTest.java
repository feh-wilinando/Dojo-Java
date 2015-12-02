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
		
		anagram.generateMatchers();
		
		List<String> matchers = anagram.getMatchers();
		
		assertThat(1, is(equalTo(totalMatchers)) );
		assertThat(matchers.size(), is(equalTo(1)));
		assertThat(matchers, containsInAnyOrder("a") );
		
		
	}
	
	
	@Test
	public void UmAnagramaDeDuasLetrasDeveGerarDuasCombinacoes(){
		Anagram anagram = new Anagram("ab");				
		Integer totalMatchers = anagram.getTotalMatchers();
		
		anagram.generateMatchers();
		
		List<String> matchers = anagram.getMatchers();
		
		assertThat(2, is(equalTo(totalMatchers)) );
		assertThat(matchers.size(), is(equalTo(2)) );
		assertThat(matchers, containsInAnyOrder("ab", "ba") );
		
	}
	
	
	@Test
	public void UmAnagramDeTresLetrasDeveGerarSeisCombinacoes(){
		Anagram anagram = new Anagram("bio");				
		Integer totalMatchers = anagram.getTotalMatchers();
		
		anagram.generateMatchers();
		
		List<String> matchers = anagram.getMatchers();
		
		assertThat(6, is(equalTo(totalMatchers)) );
		assertThat(matchers.size(), is(equalTo(6)) );
		assertThat(matchers, containsInAnyOrder("bio", "boi", "iob", "ibo", "obi", "oib") );
		
	}

	
	
	
	@Test
	public void UmAnagramDeQuareoLetrasDeveGerarVinteEQuatroCombinacoes(){
		Anagram anagram = new Anagram("biro");				
		Integer totalMatchers = anagram.getTotalMatchers();
		
		anagram.generateMatchers();
		
		List<String> matchers = anagram.getMatchers();
		
		assertThat(24, is(equalTo(totalMatchers)) );
		assertThat(matchers.size(), is(equalTo(24)) );
		assertThat(matchers, containsInAnyOrder(	
													"biro", "bior", "bori", "boir", "broi", "brio",
													"irob", "irbo", "ibor", "ibro", "iorb", "iobr",
													"robi", "roib", "ribo", "riob", "rbio", "rboi",
													"obir", "obri", "orib", "orbi", "oibr", "oirb"
												) );
		
	}
	
	
	
	@Test
	public void UmAnagramDeCincoLetrasDeveGerarCentoEVinteCombinacoes(){
		Anagram anagram = new Anagram("geral");				
		Integer totalMatchers = anagram.getTotalMatchers();
		
		anagram.generateMatchers();
		
		List<String> matchers = anagram.getMatchers();
		
		assertThat(120, is(equalTo(totalMatchers)) );
		assertThat(matchers.size(), is(equalTo(120)) );
		assertThat(matchers, containsInAnyOrder(
												"geral","gerla","gearl","gealr","gelra","gelar",
												"greal","grela","grael","grale","grlea","grlae",
												"gaerl","gaelr","garel","garle","galer","galre",
												"glera","glear","glrea","glrae","glaer","glare",
												"egral","egrla","egarl","egalr","eglra","eglar",
												"ergal","ergla","eragl","eralg","erlga","erlag",
												"eagrl","eaglr","eargl","earlg","ealgr","ealrg",
												"elgra","elgar","elrga","elrag","elagr","elarg",
												"rgeal","rgela","rgael","rgale","rglea","rglae",
												"regal","regla","reagl","realg","relga","relag",
												"ragel","ragle","raegl","raelg","ralge","raleg",
												"rlgea","rlgae","rlega","rleag","rlage","rlaeg",
												"agerl","agelr","agrel","agrle","agler","aglre",
												"aegrl","aeglr","aergl","aerlg","aelgr","aelrg",
												"argel","argle","aregl","arelg","arlge","arleg",
												"alger","algre","alegr","alerg","alrge","alreg",
												"lgera","lgear","lgrea","lgrae","lgaer","lgare",
												"legra","legar","lerga","lerag","leagr","learg",
												"lrgea","lrgae","lrega","lreag","lrage","lraeg",
												"lager","lagre","laegr","laerg","large","lareg" 
												) );
										
	}
	
}
