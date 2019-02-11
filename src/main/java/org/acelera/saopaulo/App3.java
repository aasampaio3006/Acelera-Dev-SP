package org.acelera.saopaulo;

import java.util.HashMap;
import java.util.Map;

public class App3 {

	public static void main(String[] args) {

		Map<String, Integer> estoque = new HashMap<String, Integer>();

		estoque.put("Banana", 3);
		estoque.put("Cerveja", 5);
		estoque.put("Ovo", 7);
		estoque.put("Coca Cola", 10);
		estoque.put("Melao", 5);

		// System.out.println("quantidade de banana: " + estoque.get("Banana"));

		for (Map.Entry<String, Integer> tupla : estoque.entrySet()) {
			System.out.println("Chave = " + tupla.getKey());
			System.out.println("Valor = " + tupla.getValue());

		}
		
//		for (Map.Entry<String, Integer> tupla : estoque.entrySet()) {
//			
//			if (tupla.getKey().equals("Melao")) {				
//				tupla.setValue(tupla.getValue() - 3);				
//			}
//
//			if (tupla.getKey().equals("Coca Cola")) {				
//				tupla.setValue(tupla.getValue() - 9);
//				
//			}
//			System.out.println("Chave= " + tupla.getKey()  + "  Valor= "+ tupla.getValue());
//		}

		//estoque.put("Banana", estoque.get("Banana") - 2 );
		//System.out.println("quantidade de banana: " + estoque.get("Banana"));
		//estoque.computeIfPresent(key, remappingFunction)
	}

}
