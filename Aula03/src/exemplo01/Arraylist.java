package exemplo01;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("teste");
		lista.add("teste 2");
		lista.add(0, "novo teste");
		
		lista.forEach( e -> System.out.println(e) );
		
		System.out.println(lista.get(2));
		
		lista.set(0, "1111");
		lista.remove(2);
		
		lista.forEach( e -> System.out.println(e) );
		
		System.out.println( lista.contains("1111"));
		System.out.println( lista.contains("2222"));
	}

}
