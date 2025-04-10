package exemplo01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int[] numeros = new int[3];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<=2; i++) {
			
			System.out.println("Digite um número: ");
			int numero = scanner.nextInt();
			
			numeros[i] = numero;
		}
		
		System.out.println("Números digitados:");
		for(int numero:numeros) {
			System.out.println(numero);
		}
	}

}
