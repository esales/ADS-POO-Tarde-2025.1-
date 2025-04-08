package exercicio01;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		String nome = scanner.next();
		
		System.out.println("Digite o esporte: ");
		String esporte = scanner.next();
		
		Atleta atleta = new Atleta(nome, esporte);
		
		atleta.exibirInformacoes();
		
		atleta.incrementarMedalhas();
		atleta.incrementarMedalhas();
		atleta.decrementarMedalhas();
		atleta.exibirInformacoes();
		
		atleta.decrementarMedalhas();
		atleta.decrementarMedalhas();
		atleta.exibirInformacoes();
	}
}