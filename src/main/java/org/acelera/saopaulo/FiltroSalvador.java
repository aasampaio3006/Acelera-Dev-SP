package org.acelera.saopaulo;

public class FiltroSalvador implements Filtro {
	
	public boolean atende(Pessoa pessoa) {
		return "Salvador".equals(pessoa.getCidade());
	}

}
