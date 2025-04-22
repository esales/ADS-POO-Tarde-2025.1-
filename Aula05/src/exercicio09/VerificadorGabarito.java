package exercicio09;

public class VerificadorGabarito {
	private char[] gabaritoOficial = {'a','b','c','d'};
	
	public void verificar(char[] gabarito) {
		int acertos = 0;
		int erros = 0;
		
		for(int i=0; i<=this.gabaritoOficial.length-1; i++) {
			
			if(this.gabaritoOficial[i] == gabarito[i])
				acertos++;
			else
				erros++;
				
		}
		
		System.out.println("Acertos: " +acertos);
		System.out.println("Erros: " + erros);
	}
}