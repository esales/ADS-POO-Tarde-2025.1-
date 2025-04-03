package exercicio01;

public class Calculadora {
	private double numeroA;
	private double numeroB;
	
	public Calculadora(double numeroA, double numeroB) {
		this.numeroA = numeroA;
		this.numeroB = numeroB;
	}

	public void somar() {
		double resultado = numeroA + numeroB;
		System.out.println("Soma: " + resultado);
	}
	
	public void subtrair() {
		double resultado = numeroA - numeroB;
		System.out.println("subtrair: " + resultado);
	}
	
	public void dividir() {
		double resultado = numeroA / numeroB;
		System.out.println("dividir: " + resultado);
	}
	
	public void multiplicar() {
		double resultado = numeroA * numeroB;
		System.out.println("multiplicar: " + resultado);
	}
}