package exemplo02;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numeroA = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numeroB = scanner.nextInt();
		
		int soma = numeroA + numeroB;
		
		System.out.println("Soma: " + soma);
		
		scanner.close();
	}
}