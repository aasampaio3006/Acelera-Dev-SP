package org.acelera.saopaulo;


public class App {

	public static void main(String[] args) {
		// primitivo
		int inteiro = 10;
		// aponta para endere�o copia valor
		Integer integer = 10;
		long mario = 2L;
		float varia = 23.2F;
		double varia2 = 23;

		String marioRoberto = "Mario Roberto";

//		System.out.println("o dobro de 2 eh" + dobro(2));
//		System.out.println("o dobro de 4 eh" + dobro(4));
//		System.out.println("o dobro de 6 eh" + dobro(6));

		for (int indice = 1; indice < 100; indice++) {
			// variavel indice faz parte do escopo
			
			if (indice % 5 == 0 && indice % 3 == 0) {
				System.out.println("esse numero eh foo - bar: " + indice);
			}
			else if (indice % 5 == 0) {
				System.out.println("esse numero eh foo: " + indice);
			}
			else if (indice % 3 == 0) {
				System.out.println("esse numero eh bar: " + indice);
			}
		}
		
		for (int indice = 30; indice >= 0; indice--) {
			// variavel indice faz parte do escopo
			if (indice % 5 == 0 && indice % 3 == 0) {
				System.out.println("esse numero eh foo - bar: " + indice);
			}
			else if (indice % 5 == 0) {
				System.out.println("esse numero eh foo: " + indice);
			}
			else if (indice % 3 == 0) {
				System.out.println("esse numero eh bar: " + indice);
			}
			
		}

	}

	public static int dobro(int variavel) {
		return variavel * 2;

	}

	public static int somar(int variavelA, int variavelB) {
		return variavelA + variavelB;

	}

}
