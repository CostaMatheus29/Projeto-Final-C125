
/**********************************************************************************************************************************************
Simulação de um jogo baseado em Pokemons, 

ESPAÇO PARA DESCREVER O PROJETO

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

import br.inatel.cdg.pokemon.Pokemon;
import br.inatel.cdg.pokemon.PokemonFogo;
import br.inatel.cdg.treinador.Treinador;

public class Main {
	
	
	public static void main(String[] args) {
		
				
		Treinador treinador1 = new Treinador("Ash","Pallet", 2);
		Treinador treinador2 = new Treinador("Misty","Konoha", 2);
		
		treinador1.addPokemon(new PokemonFogo("Charmander", 7, 2));
		treinador1.addPokemon(new PokemonFogo("Charizard", 10, 3));
		treinador1.mostraPokemons(treinador1);
		
		System.out.println("");		// pula linha
		
		treinador2.addPokemon(new PokemonFogo("Bulbassaur", 7, 2));
		treinador2.addPokemon(new PokemonFogo("Squirtle", 10, 3));
		treinador2.mostraPokemons(treinador2);
		
	}

}
