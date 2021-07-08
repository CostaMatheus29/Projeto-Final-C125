
/**********************************************************************************************************************************************
Simulação de um jogo baseado em Pokemons, 


	Brock -			lider do Ginasio de Pewter (Ginasio da Pedra) - Insignia da Rocha
	Misty -			lider do Ginasio de Cerulean (Ginasio da Agua) - Insignia da Agua
	Tenente Surge - lider do Ginasio de Vermilion (Ginasio Eletrico) - Insignia do Trovao
	Erika - 		lider do Ginasio de Celadon (Ginasio de Planta) - Insignia do Arco Iris
	
	link do site com o decorrer da historia de Ash pelos ginasios em busca de suas insignias
	https://blogcelebi.webnode.com.br/o-anime/ginasios-torneios/lideres-de-ginasio/
	
	Pokemons e suas evoluções
		
	Geodude (74) - Graveler (75) - Golem (76)
	Onix (95) - Steelix (208)
	Staryu (120) - Starmie (121)
	Goldeen (118) - Seaking (119)
	Elekid (239) - Electabuzz (125) - Electivire (466)
	Pichu (172) - Pikachu (25) - Raichu (26)
	Tangela (114) - Tangrowth (465)
	Bellsprout (69) - Weepinbell (70) - Victreebel (71)


ORIENTAÇÕES PROJETO
	1- Boas práticas de desenvolvimento: O projeto deve estar organizado conforme o estilo e
	recomendações da tecnologia ou framework usado (se for Java, por exemplo, é necessário
	usar packages), as classes, métodos e membros devem ter bons nomes e significativos. As
	classes devem estar devidamente modularizadas e o código estar organizado e
	compreensível.
	2- Classes: O código deve possuir classes com membros, métodos e construtores.
	3- Herança: O código deve possuir alguma hierarquia de classes utilizando herança.
	4- Polimorfismos: O código deve possuir algum uso de polimorfismo.
	5- Uso de interfaces/classes abstratas: O código deve possuir algum uso de interface e/ou
	classe abstrata.
	6- Tratamento de erros: o código deve ter tratamento de exceções/erros.
	7- Repositório : O projeto deve ser colocado em algum repositório com serviço Git (GitHub
	ou GitLab)
	8- Leitura e escrita de arquivos: O código deve possuir alguma funcionalidade de leitura e
	escrita de arquivos.

***********************************************************************************************************************************************/

package br.inatel.cdg;



import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import br.inatel.cdg.arena.Arena;
import br.inatel.cdg.pokemon.PokemonAgua;
import br.inatel.cdg.pokemon.PokemonEletrico;
import br.inatel.cdg.pokemon.PokemonGrama;
import br.inatel.cdg.pokemon.PokemonPedra;
import br.inatel.cdg.treinador.Treinador;
import br.inatel.cdg.util.POKEUtils;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		
		//ARQUIVO TXT COM OS POKEMONS A SEREM CRIADOS 
		Path arquivotxt = Paths.get("POKE.txt");
			
		
		//Array de treinadores de tamanho 4 
		Treinador t [] = new Treinador [4];
		
		// NOME, CIDADE - GINASIO, QUANTIDADE DE POKEMON
		t [0] = new Treinador("Brock","Ginasio de Pewter", 2);	
		t [1] = new Treinador("Misty","Ginasio de Cerulean", 2);
		t [2] = new Treinador("Tenente Surge","Ginasio de Vermilion", 2);
		t [3] = new Treinador("Erika","Ginasio de Celadon", 2);
		
		
		//INSTNANCIA DE ARENA PARA INVOCAR OPERAÇÕES SCREEN E COMBATE
		Arena arena = new Arena();
			
		
		//CRIA 4 LISTAS DE POKEMONS, ADICIONA OS POKEMONS DE CADA TIPO DENTRO DE SUA LISTA UTILIZANDO A CLASSE PokeUtils
		List<PokemonAgua> pokemonsAgua = POKEUtils.leAguaTXT(arquivotxt);
		List<PokemonEletrico> pokemonsEletrico = POKEUtils.leEletricoTXT(arquivotxt);
		List<PokemonGrama> pokemonsGrama = POKEUtils.leGramaTXT(arquivotxt);
		List<PokemonPedra> pokemonsPedra = POKEUtils.lePedraTXT(arquivotxt);

		
		//ADD OS POKEMONS DE PEDRA AO TREINADOR t[0] - BROCK
		for(PokemonPedra poke:pokemonsPedra) {
			if (poke.getId_pokedex() == 74) {
				t[0].addPokemon(poke);
			}
			else if (poke.getId_pokedex() == 95) {
				t[0].addPokemon(poke);
			}
		}
		
		
		//ADD OS POKEMONS DE AGUA AO TREINADOR t[1] - MISTY
		for(PokemonAgua poke:pokemonsAgua) {
			if (poke.getId_pokedex() == 118) {
				t[1].addPokemon(poke);
			}
			else if (poke.getId_pokedex() == 120) {
				t[1].addPokemon(poke);
			}
		}
		
		//ADD OS POKEMONS ELETRICOS AO TREINADOR t[2] - T. SURGE
		for(PokemonEletrico poke:pokemonsEletrico) {
			if (poke.getId_pokedex() == 125) {
				t[2].addPokemon(poke);
			}
			else if (poke.getId_pokedex() == 25) {
				t[2].addPokemon(poke);
			}
		}
		
		//ADD OS POKEMONS DE GRAMA AO TREINADOR t[3] - ERIKA
		for(PokemonGrama poke:pokemonsGrama) {
			if (poke.getId_pokedex() == 70) {
				t[3].addPokemon(poke);
			}
			else if (poke.getId_pokedex() == 114) {
				t[3].addPokemon(poke);
			}
		}
		
		
		
	
		
		//PRINTA A MENSAGEM DE BATALHA POKEMON
		Arena.screen();
				
		
		// MOSTRA INFO DE TODOS OS POKEMONS DO TREINADOR DESEJADO
		t[0].mostraPokemons(t[0]);
		t[1].mostraPokemons(t[1]);
		t[2].mostraPokemons(t[2]);
		t[3].mostraPokemons(t[3]);
		
		
		
		
		//PASSA O TREINADOR 1 E 2 E SEUS POKEMONS PARA INICIAR A BATALHA
		arena.iniciarBatalha(t[0], t[0].getPokemons(0), t[1], t[1].getPokemons(0));
		arena.iniciarBatalha(t[1], t[1].getPokemons(1), t[2], t[2].getPokemons(0));
		arena.iniciarBatalha(t[2], t[2].getPokemons(1), t[3], t[3].getPokemons(0));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	}
			
	

	

