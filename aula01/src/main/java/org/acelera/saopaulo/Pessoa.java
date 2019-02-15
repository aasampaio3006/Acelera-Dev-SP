package org.acelera.saopaulo;

public class Pessoa {
	
	private String nome;
	private String cidade;
	private Integer idade;
	//private boolean bahia;
	
	//private visivel mais seguro
	//default visivel pacote 
	//protected visivel por pacote ou heran�a
	//public visivel para todos
	
	//metoto construtor responsavel por criar uma instancia da classe 
	
	
	
	void andar() {
		System.out.println("Eu estou anadando");
	}
	
	
	public Pessoa(String nome, String cidade, Integer idade, boolean bahia) {
		this.nome = nome;
		this.cidade = cidade;
		this.idade = idade;
		//this.bahia = bahia;
	}


//	public boolean isBahia() {
//		return bahia;
//	}
//
//	public void setBahia(boolean bahia) {
//		this.bahia = bahia;
//	}

	public Pessoa(String nome, String cidade, Integer idade) {
		this.nome = nome;
		this.cidade = cidade;
		this.idade = idade;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cidade=" + cidade + ", idade=" + idade + "]";
	}
}
