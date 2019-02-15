package aula01;

import org.acelera.saopaulo.exercicio.Dividir;
import org.acelera.saopaulo.exercicio.Multiplicar;
import org.acelera.saopaulo.exercicio.Somar;
import org.acelera.saopaulo.exercicio.Subtrair;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestaCalculadora {
	
	@BeforeClass
	public static void testandoBeforeClass() {
	  System.out.println("before class");
	}

	@AfterClass
	public static void testandoAfterClass() {
	  System.out.println("after class");
	}
	
	
	@Test
	public void testDividir() {		
		int dividir = new Dividir().operar(50, 5);     	
     	Assert.assertEquals(11, dividir);     	
		
	}
	
	
	@Test
	public void testMultiplicar() {
		int multiplicar = new Multiplicar().operar(50, 5);     	
     	Assert.assertEquals(50*5, multiplicar); 
     
	}
	
	@Test
	public void testSomar() {
		int multiplicar = new Somar().operar(50, 5);     	
     	Assert.assertEquals(50+5, multiplicar); 
     
	}

	@Test
	public void testSubtrair() {
		int multiplicar = new Subtrair().operar(50, 5);     	
     	Assert.assertEquals(50-5, multiplicar); 
     
	}
	
}
