package exemplo01;

public class Principal {

	public static void main(String[] args) {
		
		GerenciadorArquivos gerenciador = new GerenciadorArquivos();
		ArquivoExecutavel exe = new ArquivoExecutavel();
		ArquivoTexto txt = new ArquivoTexto();
		ArquivoSistema sys = new ArquivoSistema();
		
		gerenciador.deletar(exe);
		gerenciador.editar(txt);
		
		gerenciador.deletar(txt);
		
	}
}