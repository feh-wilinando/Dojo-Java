package com.fws.dojo.permutacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Permutacao<T> {

	
	
	private List<T> lista;
	private int permutacaoAtual = 0;
	private T[] listaDePermutacoes;
	private Map<Integer, List<T>> mapResult;

	public Permutacao(List<T> lista) {
		this.lista = lista;
	}

	@SuppressWarnings("unchecked")
	public Map<Integer, List<T>> permutar() {
		
		listaDePermutacoes = (T[]) new Object[lista.size()];
		mapResult = new HashMap<>();
		
		permutar(0);
		
		return mapResult;
	}

	private void permutar(int passoDaPermutacao) {
		
		if (passoDaPermutacao == listaDePermutacoes.length) {
			permutacaoAtual++;
			
			
			List<T> listPermutacaoAtual = new ArrayList<>();
			
			for (int i = 0; i < listaDePermutacoes.length; i++) {
				listPermutacaoAtual.add(listaDePermutacoes[i]);
			}
			
			mapResult.put(permutacaoAtual, listPermutacaoAtual );
		}else{
			for (int i = 0; i < listaDePermutacoes.length; i++) {
				
				boolean achou = false;
				
				for (int j = 0; j < passoDaPermutacao; j++) {
					if (listaDePermutacoes[j].equals(lista.get(i))) achou = true;
				}
				
				if (!achou) {
					listaDePermutacoes[passoDaPermutacao] = lista.get(i);
					permutar(passoDaPermutacao+1);
				}
				
			}
		}
		
		
		
	}
	
	
	
}
