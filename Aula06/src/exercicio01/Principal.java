package exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome = "";
		double salario = 0;
		int idade = 0;
		int continuar = 2;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		do {
			System.out.println("Dados do funcionário");
			System.out.println("Digite o nome:");
			nome = scanner.next();
			
			System.out.println("Digite a idade:");
			idade = scanner.nextInt();
			
			System.out.println("Digite o salário:");
			salario = scanner.nextDouble();
			
			Funcionario funcionario = new Funcionario(nome, idade, salario);
			funcionarios.add(funcionario);
			
			System.out.println("Inserir próximo?");
			System.out.println("1-Sim");
			System.out.println("2-Não");
			continuar = scanner.nextInt();
			
		}while(continuar == 1);
		
		System.out.println("");
		System.out.println("Imprimindo lista de funcionários");
		for(Funcionario f:funcionarios) {
			f.imprimirDados();
		}
	}
}