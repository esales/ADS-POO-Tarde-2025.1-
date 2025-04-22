package exercicio04;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome = "";
		int idade = 0;
		double salario = 0;
		
		Funcionario[] funcionarios = new Funcionario[3];
		
		int quantidade = 0;
		double montante = 0;
		double media = 0;
		
		for(int i=0; i<=2; i++) {
			System.out.println("Digite o nome: ");
			nome = scanner.next();
			
			System.out.println("Digite a idade: ");
			idade = scanner.nextInt();
			
			System.out.println("Digite o salário: ");
			salario = scanner.nextDouble();
			
			funcionarios[i] = new Funcionario(nome, idade, salario);
		}
		
		for(Funcionario func:funcionarios) {
			quantidade++;
			montante += func.getSalario();
		}
		
		media = montante/quantidade;
		
		System.out.println("Quantidade: "+ quantidade);
		System.out.println("Média: "+media);
	}
}