package exercicio01;

public class Usuario implements Compartilhavel{

	@Override
	public void compartilhar(String redeSocial) {
		System.out.println("Compartilhando usuário");
	}
}