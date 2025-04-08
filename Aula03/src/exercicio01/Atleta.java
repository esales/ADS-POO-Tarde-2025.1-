package exercicio01;

public class Atleta {
	private String nome;
	private String esporte;
	private int medalhas;
	
	public Atleta(String nome, String esporte) {
		this.nome = nome;
		this.esporte = esporte;
		this.medalhas = 0;
	}
	
	public String getNome() {
	    return nome;
	}
	
	public String getEsporte() {
		return esporte;
	}
	
	public int getMedalhas() {
		return medalhas;
	}
	
	public void incrementarMedalhas() {
		medalhas++;
	}
	
	public void decrementarMedalhas() {
		if (medalhas > 0) {
			medalhas--;
		}
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Esporte: " + esporte);
		System.out.println("Medalhas: " + medalhas);
	}
}