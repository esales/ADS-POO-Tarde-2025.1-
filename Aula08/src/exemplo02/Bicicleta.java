package exemplo02;

public class Bicicleta extends Veiculo {
	
	public double calcularPrecoCorrida(int distancia) {
		double precoCorrida = 0.0;
		
		precoCorrida = distancia*1.5;
		
		System.out.println(precoCorrida);
		
		return precoCorrida;
	}
}