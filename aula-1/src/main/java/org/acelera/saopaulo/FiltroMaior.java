package org.acelera.saopaulo;

public class FiltroMaior implements Filtro{

	public boolean atende(Pessoa pessoa) {
		return pessoa.getIdade() >30;
	}

}
