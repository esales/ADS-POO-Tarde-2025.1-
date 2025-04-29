package exemplo01;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Teste A");
		lista.add("Teste B");
		
		String texto = "Teste C";
		
		lista.add(texto);
		
		System.out.println("Lista contem objeto texto? " + 
							lista.contains(texto));
		
		System.out.println("Lista contem String vazia? " + 
				lista.contains(""));
		
		System.out.println(lista.get(1));
		
		lista.remove(1);
		
		System.out.println(lista.get(1));
		
		System.out.println("\nListar todos");
		for(String item:lista) {
			System.out.println(item);
		}
		
		lista.remove(texto);
		
		System.out.println("\nListar todos");
		for(String item:lista) {
			System.out.println(item);
		}
		
		lista.clear();
		
		System.out.println("\nListar todos");
		for(String item:lista) {
			System.out.println(item);
		}
		
	}
}