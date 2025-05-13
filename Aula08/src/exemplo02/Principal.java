package exemplo02;

public class Principal {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		Automovel v2 = new Automovel();
		Motocicleta v3 = new Motocicleta();
		Bicicleta v4 = new Bicicleta();
		
		v1.calcularPrecoCorrida(10, 20);
		v2.calcularPrecoCorrida(10, 20);
		v3.calcularPrecoCorrida(10, 20);
		v4.calcularPrecoCorrida(10);
	}
}