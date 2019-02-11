package org.acelera.saopaulo;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App5 {

	public static void main(String[] args) {
			
		Pessoa  p1 = new  Pessoa("Mario", "Sao Paulo", 30);
		Pessoa  p2 = new  Pessoa("Caio", "Piaui", 33);
		Pessoa  p3 = new  Pessoa("Souza", "Salvador", 20);
		Pessoa  p4 = new  Pessoa("Andre", "Minas Gerais", 18);
		Pessoa  p5 = new  Pessoa("Maria", "Sao Paulo", 19);
		Pessoa  p6 = new  Pessoa("Antonio", "Rio de Janeiro", 22);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		pessoas.add(p5);
		pessoas.add(p6);	
		
		//List<Pessoa> maior = filtar(pessoas, new FiltroMaior());
		//List<Pessoa> salvador = filtar(pessoas, new FiltroSalvador());	
		
		//lambda
		//List<Pessoa> maior = filtar(pessoas, p -> p.getIdade() > 18);
		//List<Pessoa> maior = new ArrayList<>();
		Predicate<Pessoa> maiorFiltro = p -> p.getIdade() > 18;
		Predicate<Pessoa> cidadeFiltro = p -> "Salvador".equals(p.getCidade());
		
		List<Pessoa> maior1 = pessoas.stream()
				.filter(maiorFiltro.or(cidadeFiltro))
				.collect(Collectors.toList());
		
		List<Pessoa> maior = pessoas.stream()
				.filter(p -> p.getIdade() > 18)
				.collect(Collectors.toList());
		
		List<String> nomes = pessoas.stream()
				.map(p -> p.getNome())
		        .collect(Collectors.toList());
		
		String nomesVirgulas = pessoas.stream()
				 .map(p -> p.getNome())
		        .collect(Collectors.joining(","));
		
		int sun = pessoas.stream()
				.mapToInt(p -> p.getIdade()).sum();
		
		Optional<Integer> reduce = pessoas.stream()
				.map(p -> p.getIdade())
				.reduce((a, b) -> Integer.sum(a, b));
		if (reduce.isPresent()) {
			Integer somatorio = reduce.get();			
		}
		//ou
		reduce.ifPresent(s -> System.out.println(s));
	
		
				
	//	System.out.println(maior.toString());
    //	System.out.println(salvador.toString());		
	//List<Pessoa> maior = new ArrayList<Pessoa>();
//		for (Pessoa pessoa : pessoas) {
//			if (pessoa.getIdade() > 21) {
//				maior.add(pessoa);
//				
//			}
//		}
				
//	  List<Pessoa> salvador = new ArrayList<Pessoa>();
//			for (Pessoa pessoa1 : pessoas) {
//		pessoa.getCidade("salvador")
//				if ("Salvador".equals(pessoa1.getCidade())) {
//					salvador.add(pessoa1);
//					
//				}
//			
//		}
		
//		for (int i = 0; i < pessoas.size(); i++) {
//			if (pessoas.get(i).getIdade() > 30 ) {
//				System.out.println(pessoas.get(i));				
//			}			
//		}
		


}
	
	public static List<Pessoa> filtar(List<Pessoa> pessoa, Filtro filtro){
		List<Pessoa> grupo = new ArrayList<Pessoa>();
		
		for (Pessoa pessoas : pessoa) {
			if (filtro.atende(pessoas)) {
				grupo.add(pessoas);
			}
			
		}
		return grupo;
		
	}

}
