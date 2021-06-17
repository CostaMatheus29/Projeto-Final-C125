
/**********************************************************************************************************************************************
Simulação de um jogo baseado em Pokemons, 

ESPAÇO PARA DESCREVER O PROJETO

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
