package exercicio01;

public class ContaBancaria {
	private Double saldo;
	private int numero;
	private String nome;
	
	public ContaBancaria(Double saldo, int numero, String nome) {
		this.saldo = saldo;
		this.numero = numero;
		this.nome = nome;
	}
	
	public void imprimeInfo() {
		System.out.println("Conta: " + this.numero);
		System.out.println("Nome: " + this.nome);
		System.out.println("Saldo: " + this.saldo);
	}
}