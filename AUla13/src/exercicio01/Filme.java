package exercicio01;

public class Filme 
	extends Conteudo
	implements Compartilhavel, Favoritavel, Reproduzivel{

	public Filme(String titulo) {
		super(titulo);
	}

	@Override
	public void reproduzir() {
		System.out.println("Reproduzindo filme " + this.titulo);
	}

	@Override
	public void favoritar() {
		System.out.println("Filme " + this.titulo + " adicionado aos favoritos.");
		
	}

	@Override
	public void compartilhar(String redeSocial) {
		System.out.println("Compartilhando filme " + this.titulo + " no " + redeSocial);
	}
	
	
	public String toString() {
		return "Filme: " + this.titulo;
	}
}
