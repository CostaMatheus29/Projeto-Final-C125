package br.inatel.cdg.pokemon;

public class PokemonEletrico extends Pokemon {

	public PokemonEletrico(String nome, int nivel, int id_pokedex) {
		super(nome, nivel, id_pokedex);
		
		calculaAtaque();
		calculaDefesa();
		calculaVida();
	}

	
	
	@Override
	public void atacar(Pokemon ataca, Pokemon defende) {
		
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
		this.vida += (this.nivel - 1) * 10;
	}

}
