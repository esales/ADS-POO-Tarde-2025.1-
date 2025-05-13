package exemplo01;

public class Veiculo {
	private String marca;
	
	public Veiculo(String marca) {
		this.marca = marca;
	}
	
	public Veiculo() {
		this.marca = "";
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}