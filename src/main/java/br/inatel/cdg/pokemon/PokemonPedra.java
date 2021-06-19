package br.inatel.cdg.pokemon;

public class PokemonPedra extends Pokemon {

	public PokemonPedra(String nome, int nivel, int id_pokedex) {
		super(nome, nivel, id_pokedex);

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
	public void calculaAtaque() {
		super.calculaAtaque();
		this.ataque += this.nivel * 0;
	}

	@Override
	public void calculaDefesa() {
		super.calculaDefesa();
		this.defesa += this.nivel * 10;
	}
	
	@Override
	public void calculaVida() {
		super.calculaVida();
		this.vida += this.nivel * 7;
	}

}
