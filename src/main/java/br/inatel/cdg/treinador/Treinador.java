package br.inatel.cdg.treinador;
import br.inatel.cdg.pokemon.Pokemon;

public class Treinador  {
	
	private String nome;
	private String arena;
	private int qtdPokemon;
	private Pokemon pokemons [];
	
	
	//CONSTRUTOR
	public Treinador(String nome, String cidade, int qtdPokemon) {
		
		this.nome = nome;
		this.arena = cidade;
		this.qtdPokemon = qtdPokemon;
		this.pokemons = new Pokemon [this.qtdPokemon];
		
	}
	
	
	


	
	//ADICIONA POKEMONS AO TREINADOR
	public void addPokemon (Pokemon poke) {
		for(int i =  0; i < pokemons.length ; i++) {
			if(this.pokemons [i] == null) {			
				this.pokemons [i] = poke;			
				break;									
			}	
		}
	}
	

	//MOSTRA AS CARACTERISTICAS DE CADA POKEMON
	public void mostraInfoPokemons (Treinador treinador_x) {
			for (Pokemon pokes : treinador_x.pokemons) {
				
				try {
				
					System.out.println("Pokemon: " + pokes.getNome());		
					System.out.println("Vida: " + pokes.getVida() + " Ataque: " + pokes.getAtaque() + " Defesa: " + pokes.getDefesa());			
			
				} catch (NullPointerException e) {
				System.out.println("Nao existe Pokemon nessa posicao");
			}
	}
	}
	
	
	//MOSTRA OS TREINADORES E SEUS RESPECTIVOS POKEMONS
	public void mostraPokemons (Treinador treinador_x) {
		System.out.println("Pokemons do treinador: " + treinador_x.getNome());
			
		for (Pokemon pokes : treinador_x.pokemons) {
			
			try {
				System.out.println("Nome: " + pokes.getNome() + " - ID Pokedex: " + pokes.getId_pokedex());
				
			} catch (NullPointerException e) {
				System.out.println("Nao existe Pokemon nessa posicao");
			}
	}
	}
	
	
	
	

	//Getters
	 public String getArena() {
		return arena;
	}
	 public String getNome() {
		return nome;
	}



	
}
