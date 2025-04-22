package exemplo10;

public class CalculadoraMulta {
	
	public void calcularMulta(int velocidadeMaxima, int velocidadeVeiculo) {
		String infracao = "";
		double valor = 0;
		
		if (velocidadeVeiculo > velocidadeMaxima*1.5) {
			infracao = "Gravíssima";
			valor = 880.41;
		} else if (velocidadeVeiculo > velocidadeMaxima*1.2){
			infracao = "Grave";
			valor = 195.23;
		} else if (velocidadeVeiculo > velocidadeMaxima) {
			infracao = "Média";
			valor = 130.16;
		}
		
		if (valor > 0) {
			System.out.println("Infração: " + infracao);
			System.out.println("Valor: " + valor);
		} else {
			System.out.println("Velocidade dentro do permitido.");
		}
	}

}
