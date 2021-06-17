package br.inatel.cdg.pokemon;

public class PokemonFogo extends Pokemon {

	public PokemonFogo(String nome, int nivel, int id_pokedex ) {
		super(nome, nivel, id_pokedex);
		
		this.ataque = nivel * 5;
		this.defesa = nivel * 3;
		this.vida = nivel * 10;
	}

	@Override
	public void atacar() {
		
		
	}

	@Override
	public void tomarDano() {
		
		
	}

	@Override
	public void restauraVida() {
		// TODO Auto-generated method stub
		
	}

}
