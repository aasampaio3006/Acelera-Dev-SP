package futebol;

import java.util.Arrays;
import java.util.List;

import org.acelera.saopaulo.futebol.Jogador;
import org.acelera.saopaulo.futebol.Posicao;
import org.acelera.saopaulo.futebol.Time;
import org.acelera.saopaulo.futebol.Jogador.JogadorBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTime {

	private final Time timeSpfc = Time.of("Sao Paulo");
	private static List<Jogador> jogadores;

	@BeforeEach
	public void setUp() {
		
		jogadores = Arrays.asList(
				new JogadorBuilder().addNome("Romario").addPosicao(Posicao.ATAQUE).addCidade("Sao Paulo")
						.addPais("Brasil").addGols(1).build(),
				new JogadorBuilder().addNome("Pele").addPosicao(Posicao.ATAQUE).addCidade("Santos").addPais("Brasil")
						.addGols(3).build(),
				new JogadorBuilder().addNome("Junior").addPosicao(Posicao.GOLEIRO).addCidade("Minas Gerais")
						.addPais("Brasil").addGols(1).build(),
				new JogadorBuilder().addNome("Falcao").addPosicao(Posicao.DEFESA).addCidade("Olinda").addPais("Brasil")
						.addGols(4).build());
		jogadores.forEach(j -> {
			timeSpfc.addJogador(j);
		});

	}
	
	
    @Test
    @DisplayName("Deve criar uma instancia de time")
    void deveCriarTime() {     
        assertThat(timeSpfc, is(notNullValue()));
    }

    @Test
    @DisplayName("Quais jogadores têm direito ao gol no fantástico?")
    void golFantastico() {
    	int esperado = 2;
        assertEquals(esperado, timeSpfc.getGolFantatisco().size());
    }
    
    @Test
    @DisplayName("Quem é o artilheiro do time?")
    void artilheiro() {
    	String esperado = "Falcao";
        assertEquals(esperado, timeSpfc.getArtilheiro().get().getNome());
    }
    
    @Test
    @DisplayName("Ordenar os jogadores pelo número de gols")
    void orderByNome() {
    	int esperado = 4;
        assertEquals(esperado, timeSpfc.getOrdenarPorGols().size());
    }
    
    @Test
    @DisplayName("Agrupe os jogadores pela posição")
    void agrupeByPosicao() {
    	int esperado = 4;
        assertEquals(esperado, timeSpfc.getJogadoresOrderByPosicao().size());
    }
    
    @Test
    @DisplayName("Agrupe os jogadores pela posição")
    void removeJogador() {
    	boolean esperado = true;
        assertEquals(esperado, timeSpfc.removeJogador("Pele"));
    }
    
}
