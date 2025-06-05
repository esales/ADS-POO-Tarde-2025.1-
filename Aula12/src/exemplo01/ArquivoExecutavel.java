package exemplo01;

public class ArquivoExecutavel implements Deletavel {

	@Override
	public void deletar() {
		System.out.println("deletar arquivo executável.");
	}
}