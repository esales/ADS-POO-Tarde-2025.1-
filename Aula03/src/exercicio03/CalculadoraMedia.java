package exercicio03;

public class CalculadoraMedia {
	double nota1;
	double nota2;
	
	public CalculadoraMedia(double nota1, double nota2) {
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public void exibirMedia() {
		double media = (nota1 + nota2)/2;
		System.out.println("Média: " + media);
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
}