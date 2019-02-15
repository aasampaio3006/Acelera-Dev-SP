package org.acelera.saopaulo;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class App2 {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<Integer>();

		for (int i = 0; i <= 1000; i++) {
			numeros.add(i);
		}
		System.out.println(numeros);
		
		List<Integer> pares = new ArrayList<Integer>();
		List<Integer> impar = new ArrayList<Integer>();

		for (int i = 1; i < numeros.size(); i++) {
			if (i % 2 == 0) {
				// System.out.println("numero par: " + numeros.get(i));
				pares.add(i);
			} else {
				//System.out.println("numero impar: " + numeros.get(i));
				impar.add(i);
			}
		}
       // impar.forEach(i -> System.out.print(i+","));
        //0u
        impar.forEach(System.out::print);
        
		//System.out.println(pares);
		//System.out.println(impar);
	}

//		//lista + tipo + nome
//		List<String> frutas =  new ArrayList<String>();
//		frutas.add("Melao");
//		frutas.add("Morango");
//		frutas.add("Banana");
//		frutas.add("Melancia");
//		
//		frutas.remove("Banana");
//		System.out.println(frutas.indexOf("Banana"));
//		
//		for (String fruta : frutas) {
//			System.out.println(fruta);
//			
//		}
//		System.out.println("###########################################");
//		//nao aceita tipo primitivo
//		//nao aceita objeto repitido
//		//nao mantem a orden dos objetos 
//		Set<String> produtos = new LinkedHashSet();
//		produtos.add("Lapis");
//		produtos.add("Caneta");
//		produtos.add("Mesa");
//		produtos.add("Lapis");
//		
//		for (String produto : produtos) {
//			System.out.println(produto);
//			
//		}
//		

}

//}
