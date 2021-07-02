package br.inatel.cdg.arena;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;

import br.inatel.cdg.pokemon.Pokemon;
import br.inatel.cdg.treinador.Treinador;

public class Arena {
	
	
	Path arquivo = Paths.get("duelos.txt");
	
	private int num_rounds = 1;
	

	// mensagem antes de inicar a luta
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
			
			String ginasio1 = "Iniciando batalha no " + t1.getArena();
			System.out.println(ginasio1);
			
			try {
				Files.writeString(arquivo, ginasio1 + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		
		else {
			
			String ginasio2 = "Iniciando batalha no " + t2.getArena();
			System.out.println(ginasio2);
			
			try {
				Files.writeString(arquivo, ginasio2 + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println( t1.getNome() + " x " + t2.getNome());
		System.out.println(atacando.getNome() + " x " + defendendo.getNome());

		String trainers = t1.getNome() + " x " + t2.getNome();
		String pokes = atacando.getNome() + " x " + defendendo.getNome();
		
		
		try {
			Files.writeString(arquivo, trainers + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			Files.writeString(arquivo, pokes + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// Chamando o metodo privado lutar
		lutar(atacando, defendendo);
		

	}

	//REALIZA O COMBATE ENTRE OS POKEMONS 
	private void lutar(Pokemon atacando, Pokemon defendendo) {

		while (atacando.getVida() > 0 && defendendo.getVida() > 0) {

			if (atacando.getAtaque() < defendendo.getDefesa() && defendendo.getAtaque() < atacando.getDefesa()) {
				System.out.println("As Defesas de ambos os Pokemons são maiores que seus poderes de Ataque");
				break;
			}

			else {

				System.out.println("Round " + num_rounds);
				
				if (atacando.getAtaque() > defendendo.getDefesa()) {
					defendendo.tomarDano(defendendo, Math.abs((defendendo.getDefesa()) - atacando.getAtaque()));
					System.out.println(defendendo.getNome() + " tomou "
							+ (atacando.getAtaque() - defendendo.getDefesa()) + " de dano");
				} else {
					System.out.println("Ataque do " + atacando.getNome() + " sem efeito! Defesa maior que o dano de ataque");
				}

				// QUEM ATACOU PRIMEIRO, AGORA TOMA DANO

				if (defendendo.getAtaque() > atacando.getDefesa()) {
					atacando.tomarDano(atacando, Math.abs((atacando.getDefesa()) - defendendo.getAtaque()));
					System.out.println(atacando.getNome() + " tomou " + (defendendo.getAtaque() - atacando.getDefesa())
							+ " de dano");
				} else {
					System.out.println("Ataque do " + defendendo.getNome() + " sem efeito! Defesa maior que o dano de ataque");
				}

				
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

			if (defendendo.getVida() <= 0) {
				
				String teste = "O Pokemon " + defendendo.getNome() + " perdeu a batalha!";
				
				try {
					Files.writeString(arquivo, teste + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
					Files.writeString(arquivo, " " + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);		//PULA LINHA
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
				
				System.out.println("O Pokemon " + defendendo.getNome() + " perdeu a batalha!");
				System.out.println("O Pokemon " + atacando.getNome() + " evoluiu");
				//atacando.setNome("Graveler"); 	//atacando.evoluir
				//System.out.println("Pokemon: " + atacando.getNome() + " apos evolucao");
			
			} 
			
			
			else if (atacando.getVida() <= 0) {
				
				String teste = "O Pokemon " + atacando.getNome() + " perdeu a batalha!";
				
				
				//ESCREVE NO ARQUIVO
				try {
					Files.writeString(arquivo, teste + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
					Files.writeString(arquivo, " " + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);		//PULA LINHA
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
				//PRINTA NO
				System.out.println("O Pokemon " + atacando.getNome() + " perdeu a batalha!");
				System.out.println("O Pokemon " + defendendo.getNome() + " evoluiu");
				//defendendo.setNome("Seaking");	//defendendo.evoluir
				//System.out.println("Pokemon: " + defendendo.getNome() + " apos evolucao");
			}

	
			System.out.println(""); //PULA LINHA

	}
	
	
}
