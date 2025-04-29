package exercicio01;

public class Funcionario {
	private String nome;
	private int idade;
	private double salario;
	
	public Funcionario(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	public void imprimirDados() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.salario);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
