package exercicio01;

public class Principal {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora(10, 20);
		
		calc.somar();
		calc.subtrair();
		calc.multiplicar();
		calc.dividir();
	}
}