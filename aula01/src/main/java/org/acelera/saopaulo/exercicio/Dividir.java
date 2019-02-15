package org.acelera.saopaulo.exercicio;

public class Dividir implements Operacao{

	@Override
	public int operar(int a, int b) {
		int resultado = 0;		
		if (b <= 0) {
			throw new ArithmeticException("Nao eh possivel dividir por zero!");           			
		}		
		return a/b;
	}

}
