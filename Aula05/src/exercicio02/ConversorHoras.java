package exercicio02;

public class ConversorHoras {
	private int horas;
	private int minutos;
	
	public ConversorHoras(int horas, int minutos) {
		this.horas = horas;
		
		if (minutos > 59)
			this.minutos = 59;
		else 
			this.minutos = minutos;
	}
	
	public void imprimirMinutos() {
		int total = this.horas*60 + this.minutos;
		System.out.println("Total em minutos: " + total);
	}
	
	public void imprimirSegundos() {
		int total = this.horas*60*60 + this.minutos*60;
		System.out.println("Total em segundos: " + total);
	}
	
	

}
