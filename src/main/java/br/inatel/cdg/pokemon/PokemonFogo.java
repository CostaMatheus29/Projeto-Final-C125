package br.inatel.cdg.pokemon;

import java.util.Random;

public class PokemonFogo extends Pokemon {

	public PokemonFogo(String nome, int nivel, int id_pokedex) {
		super(nome, nivel, id_pokedex );
		
		calculaAtaque();
		calculaDefesa();
		calculaVida();
		
		
	}
	
	
	
	
	@Override
	public void atacar() {
		
		
	}

	@Override
	public void tomarDano() {
		
		
	}

	@Override
	public void restauraVida() {
		
	}




	@Override
	public void calculaDefesa() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void calculaAtaque() {
		super.calculaAtaque();
		this.ataque += this.nivel * 2;
	}

	


	@Override
	public void calculaVida() {
		// TODO Auto-generated method stub
		
	}

}
