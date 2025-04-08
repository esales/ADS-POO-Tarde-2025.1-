package exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		
		System.out.println("Digite o nota 1: ");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Digite o nota 2: ");
		double nota2 = scanner.nextDouble();
		
		CalculadoraMedia calc = new CalculadoraMedia(nota1, nota2);
		
		calc.exibirMedia();
		
		calc.setNota1(10);
		
		calc.setNota2(6.5);
		
		calc.exibirMedia();
		
	}
}