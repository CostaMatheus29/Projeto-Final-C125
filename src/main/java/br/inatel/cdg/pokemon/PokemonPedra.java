package br.inatel.cdg.pokemon;

public class PokemonPedra extends Pokemon {

	public PokemonPedra(String nome, int nivel, int id_pokedex) {
		super(nome, nivel, id_pokedex);

		calculaAtaque();
		calculaDefesa();
		calculaVida();
		
		
	}
	
	
	@Override
	public void atacar(Pokemon defende) {
		defende.getVida();
		defende.getDefesa();
		
		if(defende.getVida() > 0) {
			if(this.ataque > defende.defesa) {
			defende.setVida(Math.abs((defende.vida + defende.defesa) - this.ataque));
			System.out.println(defende.nome + " tomou " 
					+ (this.ataque - defende.defesa) + " de dano");
			}else {
				System.out.println("Ataque sem efeito!");
			}
		}else if (defende.getVida() <= 0) {
			System.out.println("O Pokemon " + defende.nome + " está morto!");
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
