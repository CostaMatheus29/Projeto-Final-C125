package br.inatel.cdg.pokemon;

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

	// ATAQUE, VIDA, DEFESA definidos separadamente pra cada classe especifica de Pokemon
		
	}
		

	public void calculaAtaque() {
		this.ataque = this.nivel * 7;
	}
	

	public void calculaDefesa() {
		this.defesa = this.nivel * 6;
	}
	
	public void calculaVida() {
		this.vida = this.nivel * 50;
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
	
	
}
