package org.acelera.saopaulo.futebol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Time {

	private final String nome;
	private final List<Jogador> jogadores;

	private Time(String nome) {
		this.nome = nome;
		this.jogadores = new ArrayList<>();
	}

	public void addJogador(Jogador jogador) {
		if (this.jogadores.size() > 22) {
			throw new  RuntimeException("Número de jogadores no time excedido.");
		}
		this.jogadores.add(Objects.requireNonNull(jogador));
	}
	
	public boolean removeJogador(String nome) {			
		if (this.jogadores.indexOf(nome) != -1) {
			throw new  RuntimeException("Jogadores nao existe no time.");
		}
		
		return jogadores.removeIf(j -> j.getNome().equals(nome));
	}

	public List<Jogador> getJogadores() {
		return Collections.unmodifiableList(jogadores);
	}

	public static Time of(String nome) {
		return new Time(Objects.requireNonNull(nome, "Nome do Time nao pode se vazio"));

	}

	public List<Jogador> getGolFantatisco() {
		return jogadores.stream().filter(j -> j.getGols() >= 3).collect(Collectors.toList());
	}

	public Optional<Jogador> getArtilheiro() {
		
		return jogadores.stream()
				.filter(j -> j.getGols() > 0)
				.sorted(Comparator.comparing(Jogador::getGols).reversed())
				.findFirst();

	}

	public List<Jogador> getOrdenarPorGols() {
		return jogadores.stream().sorted(Comparator.comparing(Jogador::getGols).reversed())
				.collect(Collectors.toList());
	}
	
	public List<Jogador> getJogadoresOrderByPosicao (){
		
		return  jogadores.stream()
				.sorted(Comparator.comparing(Jogador::getPosicao)).collect(Collectors.toList());
		
	}
	
	 public int total() {
	        return jogadores.size();
	    }
	
	@Override
	public String toString() {
		return "Time [" + nome + ", jogadores=" + jogadores + "]";
	}

}
