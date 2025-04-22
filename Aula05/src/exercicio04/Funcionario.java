package exercicio04;

public class Funcionario {
	private String nome;
	private int idade;
	private double salario;
	
	public Funcionario(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	public void imprimirInfo() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Salário: " + this.salario);
	}

	public double getSalario() {
		return salario;
	}
}