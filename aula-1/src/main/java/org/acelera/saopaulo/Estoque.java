package org.acelera.saopaulo;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
	
	private static Map<String, Integer> controller = new HashMap<String, Integer>();

	public void criar(String produto, int quantidade) {	
		if (quantidade < 0) {
			throw new IllegalArgumentException("Para adicionar so positivo");
		}
		
		this.controller.put(produto, quantidade);
	}

	public void remove(String produto , int quantidade) {		
		
		if (quantidade <= 0) {
			throw new IllegalArgumentException("Valor nao pode se negativo");
		}
		Integer quantidadeEstoque = controller.getOrDefault(produto, 0);
		if (quantidade > quantidadeEstoque ) {
			throw new IllegalArgumentException("Quantidade mior que no estoque");
		}
		this.controller.put(produto, controller.get(produto) - quantidade );

	}
	
	
	public void add(String produto , int quantidade) {
		
		if (quantidade < 0) {
			throw new IllegalArgumentException("Para adicionar so positivo");
		}		
	
		try {
		this.controller.put(produto, controller.get(produto) + quantidade );
		}catch (Exception e) {
			 this.controller.put(produto, quantidade);
		}
        	}	
	
	public static Map<String, Integer> getController() {
		return controller;
	}

	
	
	


}
