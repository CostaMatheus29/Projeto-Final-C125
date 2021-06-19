package br.inatel.cdg.treinador;
import br.inatel.cdg.pokemon.Pokemon;

public class Treinador  {
	
	private String nome;
	private String arena;
	private int qtdPokemon;
	private Pokemon pokemons [];
	public Treinador treinadores [] = new Treinador [10] ;
	
	int i = 1;
	
	public Treinador(String nome, String cidade, int qtdPokemon) {
		
		
		this.nome = nome;
		this.arena = cidade;
		this.qtdPokemon = qtdPokemon;
		this.pokemons = new Pokemon [qtdPokemon];

	}
	
	
	


	
	//Adiciona Pokemons ao treinador
	public void addPokemon (Pokemon poke) {
		for(int i =  0; i < pokemons.length ; i++) {
			if(this.pokemons [i] == null) {			
				this.pokemons [i] = poke;			
				break;									
			}	
		}
	}
	
	
	
	
	
	
	
	public void mostraPokemons (Treinador treinador_x) {
		//Pokemons
		System.out.println("Pokemons do treinador: " + treinador_x.getNome());
			for (Pokemon pokes : treinador_x.pokemons) {
				if (pokes == null)
					break;
		System.out.println("Nome: " + pokes.getNome() + " ID Pokedex: " + pokes.getId_pokedex());			
			}
	}
	
	
	

	
	// função para verificar se o nome digitado é corresponde a de um treinador existente
	public boolean temTreinador(String name) {
		
		for (int i=0; i < 10; i++)
			if (treinadores[i].getNome().equalsIgnoreCase(nome)){
				return true;
			}
		return false;
	}
	
		
		

	//Getters
	 public String getArena() {
		return arena;
	}
	 public String getNome() {
		return nome;
	}
	 public Pokemon[] getPokemons() {
		return pokemons;
	}
	public int getQtdPokemon() {
		return qtdPokemon;
	}
	public Treinador[] getTreinadores() {
		return treinadores;
	}
	
}
