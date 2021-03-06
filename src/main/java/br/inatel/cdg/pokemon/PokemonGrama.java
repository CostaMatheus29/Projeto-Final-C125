package br.inatel.cdg.pokemon;

public class PokemonGrama extends Pokemon {

	public PokemonGrama(String nome, int nivel, int id_pokedex) {
		super(nome, nivel, id_pokedex);
		
		calculaAtaque();
		calculaDefesa();
		calculaVida();
	}

	
	
	
	//-----------------------------------------------------------------------------------
	//Metodos para recalcular as caracteristicas do Pokemon, com base no seu tipo
	
	@Override
	public void calculaAtaque() {
		this.ataque += this.nivel * 5;
	}

	@Override
	public void calculaDefesa() {
		this.defesa += this.nivel * 5;
	}
	
	@Override
	public void calculaVida() {
		this.vida += (this.nivel - 1) * 10;
	}

	//-----------------------------------------------------------------------------------

}
