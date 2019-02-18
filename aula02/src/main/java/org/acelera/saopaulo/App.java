package org.acelera.saopaulo;

import org.acelera.saopaulo.Pessoa.PessoaBuilder;

public class App {

    public static void main(String[] args) {

    	Pessoa pessoa = new PessoaBuilder().addIdade(18)
    			 .addNome("Douglas")
    			 .addSobreNome("Souza")
    			 .addCidade("Paris")
    			 .buid();
    	
    	System.out.println(pessoa.toString());
    }
}
