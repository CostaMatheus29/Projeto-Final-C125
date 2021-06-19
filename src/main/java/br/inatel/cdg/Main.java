
/**********************************************************************************************************************************************
Simulação de um jogo baseado em Pokemons, 

ESPAÇO PARA DESCREVER O PROJETO

O jogo terá 4 treinadores e cada treinador 2 Pokemons registrados
Semifinal 1 será disputada treinador 1 x treinador 3
Semifinal 2 será disputada treinador 2 x treinador 4
Os vencedores das semi disputarão a Final
se ganhar a luta o Pokemon passa de nivel

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

//import java.util.Random;
//import java.util.Scanner;

import br.inatel.cdg.pokemon.Pokemon;
import br.inatel.cdg.pokemon.PokemonAgua;
import br.inatel.cdg.pokemon.PokemonEletrico;
import br.inatel.cdg.pokemon.PokemonFogo;
import br.inatel.cdg.treinador.Treinador;

public class Main {
	
	
	
	public static void main(String[] args) {
		
				
		Treinador treinador1 = new Treinador("Ash","Pallet", 2);	
		Treinador treinador2 = new Treinador("Misty","Pallet", 2);
		Treinador treinador3 = new Treinador("Clemont","Lumiose", 2);
		Treinador treinador4 = new Treinador("James","Rocket", 2);

		
		treinador1.addPokemon(new PokemonEletrico("Pikachu", 6, 1));
		treinador1.addPokemon(new PokemonFogo("Charizard", 8, 2));
		//treinador1.mostraPokemons(treinador1);
		
		treinador2.addPokemon(new PokemonAgua("Staryu", 5, 3));
		treinador2.addPokemon(new PokemonAgua("Psyduck", 4, 4));
		//treinador2.mostraPokemons(treinador2);
		
		treinador3.addPokemon(new PokemonEletrico("Magneton", 7, 5));
		treinador3.addPokemon(new PokemonEletrico("Magnemite", 5, 6));
		//treinador3.mostraPokemons(treinador3);
		
		treinador4.addPokemon(new PokemonAgua("Gyarados", 6, 7));
		treinador4.addPokemon(new PokemonFogo("Victreebel", 7, 8));
		//treinador4.mostraPokemons(treinador4);
		
		
		
		treinador1.mostraInfoPokemons(treinador1);
	
		
		}
	
	}
			
	

	

