package exemplo01;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Opções");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Listar Pessoas");
            System.out.println("3 - Remover Pessoa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome");
                    String nome = scanner.next();
                    Pessoa pessoa = new Pessoa(nome);
                    pessoas.add(pessoa);
                    
                    break;
                case 2:
                    System.out.println("Opção 2");
                    break;
                case 3:
                    System.out.println("Opção 3");
                    
                    break;
                case 0:
                    System.out.println("Opção 0");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

            System.out.println();
        } while (opcao != 0);
        
        scanner.close();
	}
}