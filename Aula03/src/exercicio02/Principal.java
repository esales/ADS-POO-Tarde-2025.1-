package exercicio02;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		int valor = scanner.nextInt();
		
			
		ValorNumerico valorNumerico = new ValorNumerico(valor);
		
		valorNumerico.incrementar(150);
		valorNumerico.decrementar(40);
		valorNumerico.exibirValor();
		
		valorNumerico.decrementar(300);
		valorNumerico.exibirValor();
		
		valorNumerico.multiplicar(3);
		valorNumerico.exibirValor();
		
		valorNumerico.zerar();
		valorNumerico.exibirValor();
		
	}
}