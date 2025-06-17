package exercicio01;

public class Podcast 
	extends Conteudo
	implements Compartilhavel, Reproduzivel {

	public Podcast(String titulo) {
		super(titulo);
	}

	@Override
	public void reproduzir() {
		System.out.println("Reproduzindo podcast " + this.titulo);
	}

	@Override
	public void compartilhar(String redeSocial) {
		System.out.println("Compartilhando podcast " + this.titulo + " no " + redeSocial);
	}
	
	public String toString() {
		return "Podcast: " + this.titulo;
	}
}