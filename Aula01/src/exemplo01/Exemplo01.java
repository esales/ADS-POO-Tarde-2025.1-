package exemplo01;
import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
//		int numero = 10;
//		System.out.println(numero);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numeroRecebido = scanner.nextInt();
		
		System.out.println("O número recebido foi " + numeroRecebido);
		
		scanner.close();
	}
}