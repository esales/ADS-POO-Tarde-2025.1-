package exercicio02;

public class ValorNumerico {
	private int valor;
	
	public ValorNumerico(int valor) {
		this.valor = valor;
	}
	
	public void incrementar(int incremento) {
		this.valor += incremento;
	}
	
	public void decrementar(int decremento) {
		if (this.valor - decremento >= 0) {
			this.valor -= decremento;
		} else {
			System.out.println("O valor a decrementar é maior do que o total atual.");
		}
	}
	
	public void zerar() {
		this.valor = 0;
	}
	
	public void multiplicar(int multiplicador) {
		this.valor *= multiplicador;
	}
	
	public void exibirValor() {
		System.out.println("O valor atual é " + this.valor);
	}
}