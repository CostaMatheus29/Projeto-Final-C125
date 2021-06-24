package br.inatel.cdg.interfaces;

import br.inatel.cdg.pokemon.Pokemon;

public interface Habilidades {
	
	
	//HABILIDADES QUE TODOS OS TIPOS DE POKEMONS POSSUEM
	//PORÉM CADA POKEMON IMPLEMENTA DE UMA MANEIRA DIFERENTE
	
	//public void lutar (Pokemon atacando, Pokemon defendendo);
	
	public void tomarDano (Pokemon poke, int dano);
	
	public void restauraVida ();

	
		
	
	
	
}
