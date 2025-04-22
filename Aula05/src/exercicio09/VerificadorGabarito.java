package exercicio09;

public class VerificadorGabarito {
	private char[] gabarito = {'a','b','c','d'};
	
	public void verificar(char[] gabarito) {
		int acertos = 0;
		int erros = 0;
		
		for(int i =0; i<=this.gabarito.length-1; i++) {
			if(this.gabarito[i] == gabarito[i])
				acertos++;
			else
				erros++;
				
		}
		
		System.out.println("Acertos: " +acertos);
		System.out.println("Erros: " + erros);
	}
}