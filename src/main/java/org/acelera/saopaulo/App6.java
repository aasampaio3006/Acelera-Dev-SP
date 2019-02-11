package org.acelera.saopaulo;

public class App6 {
	
	public static void main(String[] args) {
		
		Estoque estoque = new Estoque();
		estoque.criar("Bahia" , 10);
		estoque.criar("Cerveja" , 9);
		estoque.criar("Melao" , 11);
		estoque.criar("Caneta" , 13);
		estoque.criar("Lapis" , 4);
		
		System.out.println(estoque.getController());
		estoque.remove("Cerveja", 9);
		estoque.add("Melao" , 14);
		estoque.add("Uva" , 14);
		estoque.add("Ovo", 100);
		System.out.println(estoque.getController());
		estoque.remove("Ovo", 10);
		System.out.println(estoque.getController());
		
		
	}

}
