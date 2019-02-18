package org.acelera.saopaulo;

import java.util.Objects;

public class Pessoa {

	// default que visivel
	// private que dentro da classe
	// protected por heranca e pacote

	private String nome;
	private String sobreNome;
	private int idade;
	private String cidade;

	Pessoa(String nome, String sobreNome, int idade, String cidade) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
		this.cidade = cidade;
	}

	

	public String getNome() {
		return Objects.requireNonNull(nome);
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public int getIdade() {
		return idade;
	}

	public String getCidade() {
		return cidade;
	}

	public static class PessoaBuilder {

		private String nome;
		private String sobreNome;
		private int idade;
		private String cidade;

		public PessoaBuilder addNome(String nome) {
			this.nome = Objects.requireNonNull(nome, "Esse campo nao pode se null");
			return this;
		}

		public PessoaBuilder addSobreNome(String sobreNome) {
			this.sobreNome = Objects.requireNonNull(sobreNome);
			return this;
		}

		public PessoaBuilder addIdade(int idade) {
			this.idade = idade;
			return this;
		}

		public PessoaBuilder addCidade(String cidade) {
			this.cidade = Objects.requireNonNull(cidade);
			return this;
		}

		public Pessoa buid() {
			return new Pessoa(this.nome, this.sobreNome, this.idade, this.cidade);

		}
		
		
		}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobreNome=" + sobreNome + ", idade=" + idade + ", cidade=" + cidade + "]";
	}
}


