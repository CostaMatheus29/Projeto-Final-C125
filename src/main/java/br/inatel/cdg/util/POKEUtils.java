package br.inatel.cdg.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import br.inatel.cdg.pokemon.PokemonAgua;
import br.inatel.cdg.pokemon.PokemonEletrico;
import br.inatel.cdg.pokemon.PokemonGrama;
import br.inatel.cdg.pokemon.PokemonPedra;

public class POKEUtils {
	
	public static List<PokemonAgua> leAguaTXT(Path arquivo){
		
		List<PokemonAgua> pokemonsAgua = new ArrayList<>();		
		
		try {
			List<String> linhas = Files.readAllLines(arquivo);
			linhas.remove(0);
			
			linhas.forEach((linha) ->{
				
			String[] linhaSplit = linha.split(",");
				
			
				
				if (linhaSplit[2].equals("Agua")) {
					
					pokemonsAgua.add(new PokemonAgua(linhaSplit[1], Integer.parseInt(linhaSplit[3]), 
	                		Integer.parseInt(linhaSplit[0])));
				        }
				
			});
		} catch (IOException e) {
			System.out.println("Erro no arquivo!");;
		}
		
		return pokemonsAgua;
	}
	
	public static List<PokemonPedra> lePedraTXT(Path arquivo){
		
		List<PokemonPedra> pokemonsPedra = new ArrayList<>();
		
		try {
			List<String> linhas = Files.readAllLines(arquivo);
			linhas.remove(0);
			
			linhas.forEach((linha) ->{
				
			String[] linhaSplit = linha.split(",");
			
			if (linhaSplit[2].equals("Pedra")) {
				pokemonsPedra.add(new PokemonPedra(linhaSplit[1], Integer.parseInt(linhaSplit[3]), 
                		Integer.parseInt(linhaSplit[0])));
				}
			
			});
		} catch (IOException e) {
			System.out.println("Erro no arquivo!");;
		}
			
		
		return pokemonsPedra;
	}
	
	public static List<PokemonGrama> leGramaTXT(Path arquivo){
		
		List<PokemonGrama> pokemonsGrama = new ArrayList<>();
		
		try {
			List<String> linhas = Files.readAllLines(arquivo);
			linhas.remove(0);
			
			linhas.forEach((linha) ->{
				
			String[] linhaSplit = linha.split(",");
			
			if (linhaSplit[2].equals("Grama")) {
				pokemonsGrama.add(new PokemonGrama(linhaSplit[1], Integer.parseInt(linhaSplit[3]), 
                		Integer.parseInt(linhaSplit[0])));
				}
			
			});
		} catch (IOException e) {
			System.out.println("Erro no arquivo!");;
		}
			
		
		return pokemonsGrama;
	}
	
	public static List<PokemonEletrico> leEletricoTXT(Path arquivo){
		
		List<PokemonEletrico> pokemonsEletrico = new ArrayList<>();
		
		try {
			List<String> linhas = Files.readAllLines(arquivo);
			linhas.remove(0);
			
			linhas.forEach((linha) ->{
				
			String[] linhaSplit = linha.split(",");
			
			if (linhaSplit[2].equals("Eletrico")) {
				pokemonsEletrico.add(new PokemonEletrico(linhaSplit[1], Integer.parseInt(linhaSplit[3]), 
                		Integer.parseInt(linhaSplit[0])));
				}
			
			});
		} catch (IOException e) {
			System.out.println("Erro no arquivo!");;
		}
			
		
		return pokemonsEletrico;
	}
	

}
