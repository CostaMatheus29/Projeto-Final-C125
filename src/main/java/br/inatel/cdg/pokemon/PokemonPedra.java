package br.inatel.cdg.pokemon;

public class PokemonPedra extends Pokemon {

	public PokemonPedra(String nome, int nivel, int id_pokedex) {
		super(nome, nivel, id_pokedex);

		calculaAtaque();
		calculaDefesa();
		calculaVida();
		
		
	}
	
	
	@Override
	public void atacar(Pokemon ataca, Pokemon defende) {
		ataca.getAtaque();
		defende.getVida();
		defende.getDefesa();
		
		if(defende.getVida() > 0) {
			defende.setVida(Math.abs((ataca.getAtaque() - (defende.getDefesa() + defende.vida))));
			
			
			
		}
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
