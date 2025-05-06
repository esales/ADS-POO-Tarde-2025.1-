package exemplo01;

public class Principal {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		
		produto1.imprime();
		
		Produto produto2 = new Produto("Garrafa", 15);
		
		produto2.imprime();
		
		Produto produto3 = new Produto("Caneta");
		
		produto3.imprime();
		
		Produto produto4 = new Produto("Dell","Notebook");
		
		produto4.imprime();
		
		

	}

}
