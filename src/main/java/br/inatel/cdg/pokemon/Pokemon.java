package br.inatel.cdg.pokemon;

import br.inatel.cdg.habilidades.Habilidades;
import br.inatel.cdg.treinador.Treinador;

public abstract class Pokemon implements Habilidades {
	
	protected String nome;
	protected int nivel;
	protected int id_pokedex ;
	protected int vida;
	protected int ataque;
	protected int defesa;
	
	
//	//protected Type type;
//	public enum Type
//	{
//		FIRE, WATER, GRASS, ELECTRIC
//	}

	public Pokemon(String nome, int nivel, int id_pokedex) {
		this.nome = nome;
		this.nivel = nivel;
		this.id_pokedex = id_pokedex;


		
		//vida, ataque, defesa serão definidos de acordo com o nivel e tipo do Pokemon
			
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
