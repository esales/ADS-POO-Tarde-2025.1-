package exercicio09;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] gabarito = new char[4];
		
		for(int i=0; i<=gabarito.length-1; i++) {
			int questao = i+1;
			System.out.println("Digite a questao " + questao);
			gabarito[i] = scanner.next().toLowerCase().charAt(0);
		}
		
		VerificadorGabarito verificador = new VerificadorGabarito();
		verificador.verificar(gabarito);

	}

}
