package exemplo02;

public class Motocicleta extends Veiculo {
	
	@Override
	public double calcularPrecoCorrida(int distancia, int tempo) {
		double precoCorrida = 0.0;
		
		precoCorrida = distancia*1.5 + tempo*0.3;
		
		System.out.println(precoCorrida);
		
		return precoCorrida;
	}

}
