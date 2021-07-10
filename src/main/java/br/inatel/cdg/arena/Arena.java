package br.inatel.cdg.arena;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;

//import org.junit.Test;

import br.inatel.cdg.pokemon.Pokemon;
import br.inatel.cdg.treinador.Treinador;


public class Arena {
	
	
	Path arquivo = Paths.get("duelos.txt");
	
	private int num_rounds = 1;
	

	// MENSAGEM PRINTADA ANTES DE INICIAR A LUTA
	public static void screen() {
		System.out.println("Batalha                            ,'\\\n"
				+ "    _.----.        ____         ,'  _\\   ___    ___     ____\n"
				+ "_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\n"
				+ "\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\n"
				+ " \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\n"
				+ "   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\n"
				+ "    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\n"
				+ "     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\n"
				+ "      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\n"
				+ "       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\n"
				+ "        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\n"
				+ "                                `'                            '-._|");
		System.out.println();
	}

	
	//INICIA A BATALHA, MOSTRANDO OS DETALHES DA LUTA E DEPOIS CHAMA A FUNÇÃO LUTAR
	public void iniciarBatalha(Treinador t1, Pokemon atacando, Treinador t2, Pokemon defendendo) {

		Random rand = new Random();
		int ginasio = rand.nextInt(2) + 1;
		
		if(ginasio == 1) {
			
			//PRINTA NO CONSOLE
			String ginasio1 = "Iniciando batalha no " + t1.getArena();
			System.out.println(ginasio1);
			
			//ESCREVE NO ARQUIVO INICIO DE CADA LUTA COM O NOME DO GINASIO
			try {
				Files.writeString(arquivo, ginasio1 + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		
		else {
			
			//PRINTA NO CONSOLE
			String ginasio2 = "Iniciando batalha no " + t2.getArena();
			System.out.println(ginasio2);
			
			
			//ESCREVE NO ARQUIVO INICIO DE CADA LUTA COM O NOME DO GINASIO
			try {
				Files.writeString(arquivo, ginasio2 + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		//PRINTA NO CONSOLE OS 2 TREINADORES E SEUS POKEMONS QUE IRÃO LUTAR
		System.out.println( t1.getNome() + " x " + t2.getNome());
		System.out.println(atacando.getNome() + " x " + defendendo.getNome());

		
		//ARMAZENA O CONTEUDO QUE VAI SER ESCRITO NO ARQUIVO DENTRO DE STRINGS
		String trainers = t1.getNome() + " x " + t2.getNome();
		String pokes = atacando.getNome() + " x " + defendendo.getNome();
		
		
		//ESCREVE NO ARQUIVO
		try {
			Files.writeString(arquivo, trainers + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			Files.writeString(arquivo, pokes + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//CHAMANDO O METODO PRIVADO PARA REALIZAR A LUTA
		lutar(atacando, defendendo);
		

	}

	//REALIZA O COMBATE ENTRE OS POKEMONS 
	private void lutar(Pokemon atacando, Pokemon defendendo) {

		//ENQUANTO A VIDA DOS DOIS POKEMONS POSSUIREM VIDA ( VIDA > 0 )
		while (atacando.getVida() > 0 && defendendo.getVida() > 0) {

			
			// SE AS DEFESAS FOREM MAIORES QUE OS PODERES DE ATAQUE
			if (atacando.getAtaque() < defendendo.getDefesa() && defendendo.getAtaque() < atacando.getDefesa()) {
				System.out.println("As Defesas de ambos os Pokemons são maiores que seus poderes de Ataque");
				
				// ESCREVE NO ARQUIVO QUE AS DEFESAS SÃO MAIORES QUE OS PODERES DE ATAQUE
				try {
					Files.writeString(arquivo, "As Defesas de ambos os Pokemons são maiores que seus poderes de Ataque \n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
					Files.writeString(arquivo, " " + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);		//PULA LINHA
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				// SAI DO WHILE UTILIZANDO O BREAK
				break;
			}

			else {

				// PRINTA EM QUAL ROUND SE ENCONTRA A BATALHA
				System.out.println("Round " + num_rounds);
				
				if (atacando.getAtaque() > defendendo.getDefesa()) {
					defendendo.tomarDano(defendendo, Math.abs((defendendo.getDefesa()) - atacando.getAtaque()));
					System.out.println(defendendo.getNome() + " tomou "
							+ (atacando.getAtaque() - defendendo.getDefesa()) + " de dano");
				} else {
					System.out.println("Ataque do " + atacando.getNome() + " sem efeito! Defesa maior que o dano de ataque");
				}

				// QUEM ATACOU PRIMEIRO, EM SEGUIDA É ATACADO

				if (defendendo.getAtaque() > atacando.getDefesa()) {
					atacando.tomarDano(atacando, Math.abs((atacando.getDefesa()) - defendendo.getAtaque()));
					System.out.println(atacando.getNome() + " tomou " + (defendendo.getAtaque() - atacando.getDefesa())
							+ " de dano");
				} else {
					System.out.println("Ataque do " + defendendo.getNome() + " sem efeito! Defesa maior que o dano de ataque");
				}

				
				// SE APÓS UM DETERMINADO ROUND A VIDA DE ALGUM POKEMON SE TORNE NEGATIVA ELA É SETADA PARA ZERO
				if (defendendo.getVida() < 0)
					defendendo.setVida(0);
				else if (atacando.getVida() < 0)
					atacando.setVida(0);
				
				
				
				System.out.println("Vida dos Pokemons após o " + num_rounds + "° round");
				System.out.println(atacando.getNome() + " hp: " + atacando.getVida());
				System.out.println(defendendo.getNome() + " hp: " + defendendo.getVida());
				System.out.println("");	//pula linha
				
				num_rounds ++;

			}
			
		}

		// APOS SAIR DO WHILE RETORNA O cont DO N° DE ROUNDS DE VOLTA PARA 1
		num_rounds = 1;	
		
		
		//POKEMON DEFENDENDO PERDEU A BATALHA
		if (defendendo.getVida() <= 0) {
				
				//SALVA O CONTEUDO QUE SERÁ ESCRITO NO ARQUIVO DENTRO DE STRINGS
				String temp1 = "O Pokemon " + defendendo.getNome() + " perdeu a batalha!";
				String evo1 = "O Pokemon " + atacando.getNome() + " evolui para ";
				
				
				
				//PRINTA NO CONSOLE
				System.out.println("O Pokemon " + defendendo.getNome() + " perdeu a batalha!");
				System.out.println("O Pokemon " + atacando.getNome() + " evoluiu");
				atacando.evoluir(atacando);
				System.out.println("Pokemon: " + atacando.getNome() + " apos evolucao");
				
				
				//SALVA O CONTEUDO QUE SERÁ ESCRITO NO ARQUIVO DENTRO DE STRING
				String evo2 = atacando.getNome();
				
				
				//ESCREVE NO ARQUIVO
				try {
					Files.writeString(arquivo, temp1 + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
					Files.writeString(arquivo, evo1 + evo2 + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
					Files.writeString(arquivo, " " + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);		//PULA LINHA
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			} 
			
			
		//POKEMON ATACANDO PERDEU A BATALHA
			else if (atacando.getVida() <= 0) {
				
				//SALVA O CONTEUDO QUE SERÁ ESCRITO NO ARQUIVO DENTRO DE STRINGS
				String temp = "O Pokemon " + atacando.getNome() + " perdeu a batalha!";
				String evo1 = "O Pokemon " + defendendo.getNome() + " evolui para ";
				
				
				//PRINTA NO CONSOLE
				System.out.println("O Pokemon " + atacando.getNome() + " perdeu a batalha!");
				System.out.println("O Pokemon " + defendendo.getNome() + " evoluiu");
				defendendo.evoluir(defendendo);
				System.out.println("Pokemon: " + defendendo.getNome() + " apos evolucao");
				
				
				//SALVA O CONTEUDO QUE SERÁ ESCRITO NO ARQUIVO DENTRO DE STRING
				String evo2 = defendendo.getNome();
				
				
				//ESCREVE NO ARQUIVO
				try {
					Files.writeString(arquivo, temp + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
					Files.writeString(arquivo, evo1 + evo2 + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
					Files.writeString(arquivo, " " + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);		//PULA LINHA
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			}

			System.out.println(""); //PULA LINHA

	}
	
}
