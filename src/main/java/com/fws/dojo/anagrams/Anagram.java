package com.fws.dojo.anagrams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fws.dojo.permutacao.Permutacao;

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
	



	public List<String> getMatchers() {
		return anagrams  ;
	}

	public void generateMatchers() {
		
		List<Character> listaDeCaracteres = new ArrayList<>();
		
		for (int i = 0; i < base.length(); i++) {
			listaDeCaracteres.add(base.charAt(i));
		}
		
		Permutacao<Character> permutacao = new Permutacao<>(listaDeCaracteres);
		
		Map<Integer, List<Character>> mapResult = permutacao.permutar();
		
		for (Integer index : mapResult.keySet()) {
			
			String resultadoPermutado = "";
			
			for (Character character : mapResult.get(index)) {
				resultadoPermutado += character;
			}
			
			anagrams.add(resultadoPermutado);
		}
		
		
	}

	
	private Integer factor( Integer num ){
		int factor = 1;
		
		if (num <= 2) return num;
		
		for (int i = num; i > 1; i--) {
			factor *= i;
		}
		
		return factor;
	}
	
}
