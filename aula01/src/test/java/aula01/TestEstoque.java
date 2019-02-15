package aula01;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.acelera.saopaulo.Estoque;
import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;

public class TestEstoque {

	@Test
	public void addTest() {

		Estoque estoque = new Estoque();
		estoque.criar("Bahia", 10);
		estoque.criar("Cerveja", 9);
		estoque.criar("Melao", 11);
		estoque.criar("Caneta", 13);
		estoque.criar("Lapis", 4);

		Estoque expected = new Estoque();
		expected.criar("Bahia", 10);
		expected.criar("Cerveja", 9);
		expected.criar("Melao", 11);
		expected.criar("Caneta", 13);
		expected.criar("Lapis", 4);

		// 1. Se são igual
		assertThat(estoque.getController(), is(expected.getController()));

		// 2. Tamanho
		assertThat(estoque.getController(), is(expected.getController()));

		// 4. Se contem Key
		assertThat(estoque.getController(), IsMapContaining.hasKey("Caneta"));

	}

	
	@Test
	public void testRemove() {

		Estoque estoque = new Estoque();
		estoque.criar("Bahia", 100);
		estoque.remove("Bahia", 1200);		
	}

	@Test(expected = IllegalArgumentException.class)
	public void testValor() {

		Estoque estoque = new Estoque();
		estoque.criar("Bahia", 10);
		estoque.criar("Cerveja", 9);
		estoque.criar("Melao", 11);
		estoque.criar("Caneta", 13);
		estoque.criar("Lapis", 4);

	}

}
