package exemplo01;

public class VeiculoTerrestre extends Veiculo{
	private int numeroRodas;
	
	public VeiculoTerrestre(String marca, int numeroRodas) {
		super(marca);
		
		this.numeroRodas = numeroRodas;
	}
	
	public VeiculoTerrestre() {
		super("");
		this.numeroRodas = 0;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}
}