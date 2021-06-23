package br.inatel.cdg.pokemon;

public class PokemonGrama extends Pokemon {

	public PokemonGrama(String nome, int nivel, int id_pokedex) {
		super(nome, nivel, id_pokedex);
		
		calculaAtaque();
		calculaDefesa();
		calculaVida();
	}

	
	
	@Override
	public void atacar(Pokemon defende) {
		
		if(defende.getVida() > 0) {
			if(this.ataque > defende.defesa) {
			defende.setVida(Math.abs((defende.vida + defende.defesa) - this.ataque));
			}else {
				System.out.println("Ataque sem efeito!");
			}
		}else if (defende.getVida() <= 0) {
			System.out.println("O Pokemon " + defende.nome + " está morto!");
		}
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



	@Override
	public void tomarDano(Pokemon defende) {
		// TODO Auto-generated method stub
		
	}

}
