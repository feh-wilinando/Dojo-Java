package com.fws.dojo.permutacao;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class PermutacaoTest {

	@Test
	public void dadoUmConjuntoComDoisElementosDeveGerarDuasPermutacoes() {
		List<Integer> list = Arrays.asList(1,2);
						
		Permutacao<Integer> permutacao = new Permutacao<>(list);
		
		Map<Integer, List<Integer>> permutado = permutacao.permutar();
		
		assertThat(permutado,  allOf( 	hasEntry(1, Arrays.asList(1,2)),
										hasEntry(2, Arrays.asList(2,1)) 
									));
		
		
	}
	
	
	@Test
	@SuppressWarnings("unchecked")
	public void dadoUmConjuntoComQuatroElementosDeveGerarVinteEQuatroPermucaoes(){
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		
		Permutacao<Integer> permutacao = new Permutacao<>(list);
		
		Map<Integer, List<Integer>> permutado = permutacao.permutar();
		

		assertThat(permutado, 
							allOf(hasEntry(1,Arrays.asList(1,2,3,4)), 
								 hasEntry( 2,Arrays.asList(1, 2, 4, 3)), 
								 hasEntry( 3,Arrays.asList(1, 3, 2, 4)), 
								 hasEntry( 4,Arrays.asList(1, 3, 4, 2)), 
								 hasEntry( 5,Arrays.asList(1, 4, 2, 3)), 
								 hasEntry( 6,Arrays.asList(1, 4, 3, 2)), 
								 hasEntry( 7,Arrays.asList(2, 1, 3, 4)), 
								 hasEntry( 8,Arrays.asList(2, 1, 4, 3)), 
								 hasEntry( 9,Arrays.asList(2, 3, 1, 4)), 
								 hasEntry(10,Arrays.asList(2, 3, 4, 1)), 
								 hasEntry(11,Arrays.asList(2, 4, 1, 3)), 
								 hasEntry(12,Arrays.asList(2, 4, 3, 1)), 
								 hasEntry(13,Arrays.asList(3, 1, 2, 4)), 
								 hasEntry(14,Arrays.asList(3, 1, 4, 2)), 
								 hasEntry(15,Arrays.asList(3, 2, 1, 4)), 
								 hasEntry(16,Arrays.asList(3, 2, 4, 1)), 
								 hasEntry(17,Arrays.asList(3, 4, 1, 2)), 
								 hasEntry(18,Arrays.asList(3, 4, 2, 1)), 
								 hasEntry(19,Arrays.asList(4, 1, 2, 3)), 
								 hasEntry(20,Arrays.asList(4, 1, 3, 2)), 
								 hasEntry(21,Arrays.asList(4, 2, 1, 3)), 
								 hasEntry(22,Arrays.asList(4, 2, 3, 1)), 
								 hasEntry(23,Arrays.asList(4, 3, 1, 2)), 
								 hasEntry(24,Arrays.asList(4, 3, 2, 1))
							));
		
		
	}

}
