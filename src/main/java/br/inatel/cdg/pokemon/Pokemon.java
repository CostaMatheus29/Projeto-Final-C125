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
	
	
	

	//FUNÇÃO RESPONSAVEL EM EVOLUIR O POKEMON QUANDO GANHAR A LUTA
	@Override
	public void evoluir(Pokemon poke) {
		int id = poke.getId_pokedex();
		
		switch(id) {
		
		case 74: //Geodude
			poke.setNome("Graveler");
			poke.setId_pokedex(75);
			poke.setNivel(2);
			break;
			
		case 95: //Onix
			poke.setNome("Steelix");
			poke.setId_pokedex(208);
			poke.setNivel(2);
			break;
			
		case 120: //Staryu
			poke.setNome("Starmie");
			poke.setId_pokedex(121);
			poke.setNivel(2);
			break;
			
		case 118: //Goldeen
			poke.setNome("Seaking");
			poke.setId_pokedex(119);
			poke.setNivel(2);
			break;
		
		case 25: //Pikachu
			poke.setNome("Raichu");
			poke.setId_pokedex(26);
			poke.setNivel(2);
			break;
			
		case 125: //Pikachu
			poke.setNome("Electivire");
			poke.setId_pokedex(466);
			poke.setNivel(3);
			break;
			
		case 114: //Tangela
			poke.setNome("Tangrowth");
			poke.setId_pokedex(465);
			poke.setNivel(2);
			break;
			
		case 70: //Weepinbell
			poke.setNome("Victreebel");
			poke.setId_pokedex(71);
			poke.setNivel(3);
			break;	
				
		}
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

	public void setId_pokedex(int id_pokedex) {
		this.id_pokedex = id_pokedex;
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
}
