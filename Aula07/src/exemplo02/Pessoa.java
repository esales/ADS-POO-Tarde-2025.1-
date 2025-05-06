package exemplo02;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private Fone fone;
	
	public Pessoa(String nome, String sobrenome, Fone fone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.fone = fone;
	}
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Fone getFone() {
		return fone;
	}
	public void setFone(Fone fone) {
		this.fone = fone;
	}
}