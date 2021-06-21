
/**********************************************************************************************************************************************
Simulação de um jogo baseado em Pokemons, 

ESPAÇO PARA DESCREVER O PROJETO

O jogo terá 4 treinadores e cada treinador 2 Pokemons registrados
Semifinal 1 será disputada treinador 1 x treinador 3
Semifinal 2 será disputada treinador 2 x treinador 4
Os vencedores das semi disputarão a Final
se ganhar a luta o Pokemon 

O histórico da partida juntamente com o resultado das lutas será salvo no arquivo de texto


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



import br.inatel.cdg.pokemon.PokemonAgua;
import br.inatel.cdg.pokemon.PokemonEletrico;
import br.inatel.cdg.pokemon.PokemonGrama;
import br.inatel.cdg.pokemon.PokemonPedra;
import br.inatel.cdg.treinador.Treinador;

public class Main {
	
	
	
	public static void main(String[] args) {
		
				
		// NOME, CIDADE - GINASIO, QUANTIDADE DE POKEMON
		Treinador treinador1 = new Treinador("Brock","Ginasio de Pewter", 2);	
		Treinador treinador2 = new Treinador("Misty","Ginasio de Cerulean", 2);
		Treinador treinador3 = new Treinador("Tenente Surge","Ginasio de Vermilion", 2);
		Treinador treinador4 = new Treinador("Erika","Ginasio de Celadon", 2);
		

		
		
/**********************************************************************************************************************************************
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
		Pichu (172) - Pikachu (25) - Raichu (26)
		Tangela (114) - Tangrowth (465)
		Bellsprout (69) - Weepinbell (70) - Victreebel (71)
		

***********************************************************************************************************************************************/
		

		
		treinador1.addPokemon(new PokemonPedra("Geodude", 1, 74));
		treinador1.addPokemon(new PokemonPedra("Onix", 1, 95));
		//treinador1.mostraPokemons(treinador1);
		
		//System.out.println();
		
		treinador2.addPokemon(new PokemonAgua("Staryu", 1, 120));
		treinador2.addPokemon(new PokemonAgua("Goldeen", 1, 118));
		//treinador2.mostraPokemons(treinador2);
		
		//System.out.println();
		
		treinador3.addPokemon(new PokemonEletrico("Raichu", 2, 26));
		treinador3.addPokemon(new PokemonEletrico("Pikachu", 1, 25));
		//treinador3.mostraPokemons(treinador3);
		
		//System.out.println();
		
		treinador4.addPokemon(new PokemonGrama("Tangela", 1, 114));
		treinador4.addPokemon(new PokemonGrama("Weepinbell", 2, 70));
		//treinador4.mostraPokemons(treinador4);
		
		//System.out.println();
		
		treinador1.mostraInfoPokemons(treinador1);
		System.out.println();
		treinador2.mostraInfoPokemons(treinador2);
		System.out.println();
		treinador3.mostraInfoPokemons(treinador3);
		System.out.println();
		treinador4.mostraInfoPokemons(treinador4);
		
		
		
		
		}
	
	}
			
	

	

