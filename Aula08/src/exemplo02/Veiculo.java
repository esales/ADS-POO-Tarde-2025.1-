package exemplo02;

public class Veiculo {
	private String codigo;
	private String modelo;
	
	public double calcularPrecoCorrida(int distancia, int tempo) {
		double precoCorrida = 0.0;
		double valorBase = 4.5;
		
		precoCorrida = valorBase + distancia*1.5 + tempo*0.3;
		
		System.out.println(precoCorrida);
		
		return precoCorrida;
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}