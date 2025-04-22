package exercicio01;

public class Principal {

	public static void main(String[] args) {
		ContaBancaria conta01 = new ContaBancaria(100.5, 1234, "João");
		ContaBancaria conta02 = new ContaBancaria(444.44, 5678, "Maria");
		
		conta01.imprimeInfo();
		conta02.imprimeInfo();
	}
}