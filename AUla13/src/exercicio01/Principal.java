package exercicio01;

public class Principal {

	public static void main(String[] args) {
		PlataformaStreaming ps = new PlataformaStreaming();
		
		Filme f1 = new Filme("Bastardos Inglórios");
		
		Serie s1 = new Serie("Dark");
		
		Podcast p1 = new Podcast("Inteligência ltda");
		
//		ps.reproduzirMidia(f1);
//		ps.compartilharMidia(f1, "Instagram");
//		ps.favoritarMidia(f1);
//		
//		ps.reproduzirMidia(s1);
////		ps.compartilharMidia(s1, "Facebook");
//		ps.favoritarMidia(s1);
//		
//		ps.reproduzirMidia(p1);
//		ps.compartilharMidia(p1, "Linkedin");
////		ps.favoritarMidia(p1);
		
		Usuario u1 = new Usuario();
		ps.compartilharMidia(u1, "Whatsapp");
	}
}