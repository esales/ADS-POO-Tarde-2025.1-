package exemplo03;

public class Veiculo {
	String cor;
	int velocidade;
	int numeroRodas;
	
	public void acelerar(int incremento) {
		this.velocidade += incremento;
	}
	
	public void imprimirDados() {
		System.out.println("Cor: " + this.cor);
		System.out.println("Número rodas: " + this.numeroRodas);
		System.out.println("Velocidade: " + this.velocidade);
	}
}