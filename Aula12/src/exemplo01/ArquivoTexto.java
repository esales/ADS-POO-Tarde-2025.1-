package exemplo01;

public class ArquivoTexto implements Editavel, Deletavel {

	@Override
	public void editar() {
		System.out.println("editar arquivo texto.");

	}

	@Override
	public void deletar() {
		System.out.println("deletar arquivo texto.");
	};
}