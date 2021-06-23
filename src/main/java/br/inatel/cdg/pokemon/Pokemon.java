package br.inatel.cdg.pokemon;

import java.util.Random;

import br.inatel.cdg.interfaces.Atributos;
import br.inatel.cdg.interfaces.Habilidades;

public abstract class Pokemon implements Habilidades, Atributos {
	
	protected String nome;
	protected int nivel;
	protected int id_pokedex ;
	protected int vida;
	protected int ataque;
	protected int defesa;
	
	
	// CONSTRUTOR DA SUPERCLASSE
	public Pokemon(String nome, int nivel, int id_pokedex) {
		this.nome = nome;
		this.nivel = nivel;
		this.id_pokedex = id_pokedex;
	
		Random rand = new Random();
		this.ataque = rand.nextInt(50) + 1;
		this.defesa = rand.nextInt(50) + 1;
		this.vida = 100;
		
	}
	
	
	
	//TESTANDO
	
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
	public void tomarDano(Pokemon defende) {
		//defende.vida -= 
		
	}	

	
	
	
	
	
	//Getters
	
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
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	

	
}
