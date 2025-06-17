package exercicio01;

public class PlataformaStreaming {
	
	public void reproduzirMidia(Reproduzivel conteudo) {
		conteudo.reproduzir();
	}
	
	public void favoritarMidia(Favoritavel conteudo) {
		conteudo.favoritar();
	}
	
	public void compartilharMidia(Compartilhavel conteudo, String redeSocial) {
		conteudo.compartilhar(redeSocial);
	}
	
	
//	private ArrayList<Conteudo> conteudos;
//	
//	public PlataformaStreaming() {
//		this.conteudos = new ArrayList<Conteudo>();
//	}
//	
//	public void adicionarConteudo(Conteudo conteudo) {
//		this.conteudos.add(conteudo);
//	}
}