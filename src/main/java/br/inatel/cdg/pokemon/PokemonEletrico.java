package br.inatel.cdg.pokemon;

public class PokemonEletrico extends Pokemon {

	public PokemonEletrico(String nome, int nivel, int id_pokedex) {
		super(nome, nivel, id_pokedex);
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
	public void calculaAtaque() {
		this.ataque += this.nivel * 10;
	}

	@Override
	public void calculaDefesa() {
		this.defesa += this.nivel * 10;
	}
	
	@Override
	public void calculaVida() {
		this.vida += this.nivel * 10;
	}

}
