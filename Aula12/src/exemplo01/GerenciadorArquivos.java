package exemplo01;

public class GerenciadorArquivos {
	
	public void editar(Editavel arquivo) {
		arquivo.editar();
	}
	
	public void deletar(Deletavel arquivo) {
		arquivo.deletar();
	}
}