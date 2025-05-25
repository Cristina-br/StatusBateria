package statusBateria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] eventos = new int[30];
		Bateria statusbateria = new Bateria();
		int quantidadeEventos = 0;
		int opcao;
		
		do {
			System.out.println("\n---- MENU DE STATUS DA BATERIA ---- \n1. Registrar evento (consumo ou carregamento) "
					+ "\n2. Visualizar status da bateria (% restante) \n3. Sair");
			opcao = sc.nextInt();
			
			switch (opcao) {
				case 1: {
					System.out.println("Digite quantos % da bateria foi consumida (ex.: -10) ou carregada (ex.: 10): ");
					eventos[quantidadeEventos] = sc.nextInt();
					quantidadeEventos++;
					System.out.println("Evento registrado com sucesso");
					break;
				}
				case 2: {
					System.out.println("Status atual da bateria: " + statusbateria.getBattery(eventos) + "%"); 
					break;
				}
				case 3: {
					System.out.println("Encerrando o programa...");
					break;
				}
				default:
					System.err.println("Opção inválida");
			}
			
		} while (opcao != 3);
		
		statusbateria.getBattery(eventos);
		
		sc.close();
	}

}
