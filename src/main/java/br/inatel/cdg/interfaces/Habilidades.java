package br.inatel.cdg.interfaces;

import br.inatel.cdg.pokemon.Pokemon;

public interface Habilidades {
	
	
	public void lutar (Pokemon atacando, Pokemon defendendo);
	
	public void tomarDano (Pokemon poke, int dano);
	
	public void restauraVida ();

	
		
	
	
	
}
