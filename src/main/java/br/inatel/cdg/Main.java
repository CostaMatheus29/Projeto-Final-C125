
/**********************************************************************************************************************************************
Simulação de um jogo baseado em Pokemons, 

ESPAÇO PARA DESCREVER O PROJETO

1- Boas práticas de desenvolvimento: O projeto deve estar organizado conforme o estilo e
recomendações da tecnologia ou framework usado (se for Java, por exemplo, é necessário
usar packages), as classes, métodos e membros devem ter bons nomes e significativos. As
classes devem estar devidamente modularizadas e o código estar organizado e
compreensível.
2- Classes: O código deve possuir classes com membros, métodos e construtores.
3- Herança: O código deve possuir alguma hierarquia de classes utilizando herança.
4- Polimorfismos: O código deve possuir algum uso de polimorfismo.
5- Uso de interfaces/classes abstratas: O código deve possuir algum uso de interface e/ou
classe abstrata.
6- Tratamento de erros: o código deve ter tratamento de exceções/erros.
7- Repositório : O projeto deve ser colocado em algum repositório com serviço Git (GitHub
ou GitLab)
8- Leitura e escrita de arquivos: O código deve possuir alguma funcionalidade de leitura e
escrita de arquivos.

***********************************************************************************************************************************************/

package br.inatel.cdg;

//import java.util.Random;
//import java.util.Scanner;

import br.inatel.cdg.pokemon.Pokemon;
import br.inatel.cdg.pokemon.PokemonFogo;
import br.inatel.cdg.treinador.Treinador;

public class Main {
	

	
	// SE FOR FAZER POR ENTRADA DE DADOS
	//private static String menu = " 1. Add a trainer\n 2. Add a Pokemon to a trainer\n 3. Display a trainer and his/her pokemon\n 4. Display all trainers and their pokemon\n 5. Let's Battle!\n 6. Sair do programa :(";
	//static Random rand = new Random();
	
	
	
	
	
	public static void main(String[] args) {
		
				
		Treinador treinador1 = new Treinador("Ash","Pallet", 2);	
		Treinador treinador2 = new Treinador("Misty","Pallet", 2);
		Treinador treinador3 = new Treinador("Clemont","Lumiose", 2);
		Treinador treinador4 = new Treinador("James","Rocket", 2);

		
		treinador1.addPokemon(new PokemonFogo("Pikachu", 6, 1));
		treinador1.addPokemon(new PokemonFogo("Charizard", 8, 2));
		//treinador1.mostraPokemons(treinador1);
		
		treinador2.addPokemon(new PokemonFogo("Staryu", 5, 3));
		treinador2.addPokemon(new PokemonFogo("Psyduck", 4, 4));
		//treinador2.mostraPokemons(treinador2);
		
		treinador3.addPokemon(new PokemonFogo("Magneton", 7, 5));
		treinador3.addPokemon(new PokemonFogo("Magnemite", 5, 6));
		//treinador3.mostraPokemons(treinador2);
		
		treinador4.addPokemon(new PokemonFogo("Weezing", 6, 7));
		treinador4.addPokemon(new PokemonFogo("Victreebel", 7, 8));
		//treinador4.mostraPokemons(treinador2);
		
	
		
		// SE FOR FAZER POR ENTRADA DE DADOS, MAS TÁ ERRADO AQUI AINDA
	
//			//TrainerCollection trainColl = new TrainerCollection();
//
//			Treinador trainer1; // for temporary use
//			Pokemon pokemon1;// for temporary use
//			
//			System.out.println("Bem vindo ao torneio de Pokemon!");
//			while(true){
//				
//				int pin;
//				System.out.println(menu);
//				Scanner entrada = new Scanner(System.in);
//				pin = entrada.nextInt();
//				
//				while(pin < 1 || pin > 6){
//					System.out.println("Value must be between 1 and 6. Please try again.");
//					pin = entrada.nextInt();
//				}
//				
//				switch (pin){
//				case 1:	// Add treinador					
//					System.out.println("Nome / Cidade / quantidade de Pokemons");
//					String nome = entrada.next();
//					String cidade = entrada.next();
//					int qtdPokemon = entrada.nextInt();
//					
//					Treinador trein1 = new Treinador(nome,cidade,qtdPokemon);
//					
//					System.out.println(trein1.getNome());
//					System.out.println(trein1.getCidade());
//					System.out.println(trein1.getQtdPokemon());
//					
//					
//					break;
//				
//				
//				case 2:
//					System.out.println("Give me a trainer's name");
//					String nomeTreinador = entrada.next();
//					
//					for(int i = 0; i < 10; i++) {
//					if (Treinador.){
//						trainColl.getTrainer(nomeTreinador);
//					
//					}
//					}
//		
//		
//				}
//		
//		
//		
//	
//			}
	
	
	
	
	}
			
	}

	

