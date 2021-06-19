package br.inatel.cdg.pokemon;

public class PokemonAgua extends Pokemon {

	public PokemonAgua(String nome, int nivel, int id_pokedex) {
		super(nome, nivel, id_pokedex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void tomarDano() {
		// TODO Auto-generated method stub

	}

	@Override
	public void restauraVida() {
		// TODO Auto-generated method stub

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
