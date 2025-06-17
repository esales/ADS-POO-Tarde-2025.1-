package exercicio01;

public class Serie 
	extends Conteudo
	implements Favoritavel, Reproduzivel {

	public Serie(String titulo) {
		super(titulo);
	}

	@Override
	public void reproduzir() {
		System.out.println("Reproduzindo série " + this.titulo);
	}

	@Override
	public void favoritar() {
		System.out.println("Série " + this.titulo + " adicionada aos favoritos.");
	}
	
	
	public String toString() {
		return "Série: " + this.titulo;
	}

}
