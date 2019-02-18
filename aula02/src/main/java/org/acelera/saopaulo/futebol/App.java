package org.acelera.saopaulo.futebol;

import java.util.Arrays;
import java.util.List;

import org.acelera.saopaulo.futebol.Jogador.JogadorBuilder;

public class App {
	public static void main(String[] args) {
		
		List<Jogador> jogadores = Arrays.asList(
				new JogadorBuilder().addNome("Romario").addPosicao(Posicao.GOLEIRO).addCidade("Sao Paulo").addPais("Brasil").addGols(1).build(),
				new JogadorBuilder().addNome("Pele").addPosicao(Posicao.ATAQUE).addCidade("Santos").addPais("Brasil").addGols(3).build(),
				new JogadorBuilder().addNome("Junior").addPosicao(Posicao.GOLEIRO).addCidade("Minas Gerais").addPais("Brasil").addGols(1).build(),
				new JogadorBuilder().addNome("Falcao").addPosicao(Posicao.DEFESA).addCidade("Olinda").addPais("Brasil").addGols(3).build());
		
		
		Time timeSpfc = Time.of("Sao Paulo");
		jogadores.forEach(j -> {
			timeSpfc.addJogador(j);
		});
		
		
		
		
		//System.out.println(timeSpfc);
	//	System.out.println(timeSpfc.getJogadoresOrderByPosicao());
	//	System.out.println(timeSpfc.removeJogador(jogadores.get(0)));
		
		
		
		
	}

}
