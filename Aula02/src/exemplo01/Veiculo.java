package exemplo01;
public class Veiculo {
	String cor;
	int velocidade;
	int numeroRodas;
	
	Veiculo(){
		this.cor = "Amarelo";
		this.velocidade = 60;
		this.numeroRodas = 2;
	}
	
	void acelerar(int incremento) {
		this.velocidade += incremento;
	}
	
	void imprimirDados() {
		System.out.println("Cor: " + this.cor);
		System.out.println("Número rodas: " + this.numeroRodas);
		System.out.println("Velocidade: " + this.velocidade);
		System.out.println("\n");
	}
}