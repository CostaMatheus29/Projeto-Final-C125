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

		//ATAQUE - DEFESA SÃO GERADOS DE FORMA ALEATORIA (1 - 50)
		Random rand = new Random();
		this.ataque = rand.nextInt(50) + 1;
		this.defesa = rand.nextInt(50) + 1;
		this.vida = 100;

	}



	
	//FUNÇÃO RESPONSAVEL POR CAUSAR DANO A UM POKEMON QUANDO O MESMO FOR ATACADO
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
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}

}
