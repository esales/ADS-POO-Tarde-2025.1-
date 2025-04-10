package exemplo01;

public class Exemplo01 {

	public static void main(String[] args) {
		
		int[] vetor = new int[5];
		
		vetor[0] = 55;
		vetor[1] = 66;
		vetor[2] = 77;
		vetor[3] = 88;
		vetor[4] = 99;
		
//		System.out.println( vetor[3] );
				
		int[] vetor2 = {1, 2, 3, 4, 5, 6};
		
//		System.out.println(vetor2[4]);
//		
//		System.out.println("Vetor 1");
//		for(int i=0; i <= vetor.length-1; i++) {
//			System.out.println(vetor[i]);
//		}
//		
//		System.out.println("Vetor 2");
//		for(int i=0; i <= vetor2.length-1; i++) {
//			System.out.println(vetor2[i]);
//		}
		
//		for(int elemento : vetor2) {
//			System.out.println(elemento);
//		}
		
		String[][] exemplo = new String[5][8];
		
		exemplo[3][5] = "teste 1";
		exemplo[2][0] = "teste 2";
		
		System.out.println(exemplo[3][5]);
		System.out.println(exemplo[2][0]);
		System.out.println(exemplo[4][5]);
//		System.out.println(exemplo[10][5]);
		

	}
}