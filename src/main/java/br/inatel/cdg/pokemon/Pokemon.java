package br.inatel.cdg.pokemon;

import java.util.Random;

import br.inatel.cdg.interfaces.Atributos;
import br.inatel.cdg.interfaces.Habilidades;

public abstract class Pokemon implements Habilidades, Atributos {

	protected String nome;
	protected int nivel;
	protected int id_pokedex;
	protected int vida;
	protected int ataque;
	protected int defesa;

	// CONSTRUTOR DA SUPERCLASSE
	public Pokemon(String nome, int nivel, int id_pokedex) {
		this.nome = nome;
		this.nivel = nivel;
		this.id_pokedex = id_pokedex;

		//Ataque, defesa são gerados aleatoriamente de 0 a 50
		Random rand = new Random();
		this.ataque = rand.nextInt(50) + 1;
		this.defesa = rand.nextInt(50) + 1;
		this.vida = 100;

	}

	@Override
	public void lutar(Pokemon atacando, Pokemon defendendo) {


		while (atacando.getVida() > 0 && defendendo.getVida() > 0) {

		
		if (defendendo.getVida() > 0) {
				if (atacando.getAtaque() > defendendo.getDefesa()) {
					tomarDano(defendendo,Math.abs((defendendo.getDefesa()) - atacando.getAtaque()));
					System.out.println(defendendo.getNome() + " tomou " + (atacando.getAtaque() - defendendo.getDefesa()) + " de dano");
				} else {
					System.out.println("Ataque sem efeito!");
				}
			} else if (defendendo.getVida() <= 0) {
				System.out.println("O Pokemon " + defendendo.getNome() + " está morto!");
			}

			// QUEM ATACOU PRIMEIRO, AGORA TOMA DANO

			if (atacando.getVida() > 0) {
				if (defendendo.getAtaque() > atacando.getDefesa()) {
					tomarDano(atacando, Math.abs(( atacando.getDefesa()) - defendendo.getAtaque()));
					System.out.println(atacando.getNome() + " tomou " + (defendendo.getAtaque() - atacando.getDefesa()) + " de dano");
				} else {
					System.out.println("Ataque sem efeito!");
				}
			} else if (atacando.getVida() <= 0) {
				System.out.println("O Pokemon " + atacando.getNome() + " está morto!");
			}

			System.out.println(atacando.getNome() + " hp: " + atacando.getVida());
			System.out.println(defendendo.getNome() + " hp: " + defendendo.getVida());
			
		}

	}

	

	@Override
	public void tomarDano(Pokemon poke, int dano) {
		poke.vida -= dano;
		

	}

	
	
	
	
	
	
	
	
	// Getters

	public int getAtaque() {
		return ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public int getId_pokedex() {
		return id_pokedex;
	}

	public int getNivel() {
		return nivel;
	}

	public String getNome() {
		return nome;
	}

	public int getVida() {
		return vida;
	}

	//Setters
	
	public void setVida(int vida) {
		this.vida = vida;
	}

}
