package org.acelera.saopaulo.futebol;

import java.util.Objects;

public class Jogador {
	
	private final String nome;
    private final String cidade;   
	private final String pais;
    private final Posicao posicao;
    private int gols;    
    
   Jogador(String nome, String cidade, String pais, Posicao posicao, int gols) {
		this.nome = nome;
		this.cidade = cidade;
		this.pais = pais;
		this.posicao = posicao;
		this.gols = gols;
	}
	public String getNome() {
		return nome;
	}
	public String getCidade() {
		return cidade;
	}
	public String getPais() {
		return pais;
	}
	public Posicao getPosicao() {
		return posicao;
	}
	public int getGols() {
		return gols;
	}
	public void fezGol() {
        gols++;
    }
	
	
	public static class JogadorBuilder{
		
		private  String nome;
	    private  String cidade;   
		private  String pais;
	    private  Posicao posicao;
	    private  int gols;    
	    
	    public JogadorBuilder addNome(String nome) {
	    	this.nome=Objects.requireNonNull(nome, "Nome nao pode ser vazio");
	    	return this;
	    }
	    
	    public JogadorBuilder addCidade(String cidade) {
	    	this.cidade=Objects.requireNonNull(cidade, "Cidade nao pode ser vazio");
	    	return this;
	    }
	    
	    public JogadorBuilder addPais(String pais) {
	    	this.pais=Objects.requireNonNull(pais, "Cidade nao pode ser vazio");
	    	return this;
	    }
	    
	    public JogadorBuilder addPosicao(Posicao posicao) {
	    	this.posicao=posicao;
	    	return this;
	    }
	    
	    public JogadorBuilder addGols(int gols) {
	    	this.gols=gols;
	    	return this;
	    }
	    
	    public Jogador build() {
	    	return new Jogador(this.nome, this.cidade, this.pais, this.posicao, this.gols);
	    }
		
		
	}


	@Override
	public String toString() {
		return "nome=" + nome + ", cidade=" + cidade + ", pais=" + pais + ", posicao=" + posicao + ", gols="
				+ gols + "";
	}
	
	

	
	

}
