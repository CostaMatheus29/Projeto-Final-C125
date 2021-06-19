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
		this.ataque += this.nivel * 2;
	}

	@Override
	public void calculaDefesa() {
		// TODO Auto-generated method stub
		super.calculaDefesa();
	}
	
	@Override
	public void calculaVida() {
		// TODO Auto-generated method stub
		super.calculaVida();
	}

}
