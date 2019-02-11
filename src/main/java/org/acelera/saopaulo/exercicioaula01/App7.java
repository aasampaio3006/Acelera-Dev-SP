package org.acelera.saopaulo.exercicioaula01;

public class App7 {

	public static void main(String[] args) {
//	
     	int dividir = new Dividir().operar(10, 9);
     	int somar = new Somar().operar(10, 0);     	
     	int subtrair = new Subtrair().operar(10, 0);     	
     	int multiplicar = new Multiplicar().operar(10, 0);
     	
     	
        System.out.println("Resultado da somar = " + somar);
		System.out.println("Resultado da subtrair = " + subtrair);
		System.out.println("Resultado da dividir = " + dividir);
		System.out.println("Resultado da multiplicar = " + multiplicar);

	}

}
