package exemplo01;
public class Principal {
	public static void main(String[] args) {
		Veiculo veiculo1 = new Veiculo();
		veiculo1.cor = "Verde";
		veiculo1.velocidade = 30;
		veiculo1.numeroRodas = 4;
		
		Veiculo veiculo2 = new Veiculo();
		veiculo2.cor = "Vermelho";
		veiculo2.velocidade = 100;
		veiculo2.numeroRodas = 2;
		
//		System.out.println("Veiculo1");
//		veiculo1.imprimirDados();
//		
//		System.out.println("\n");
//		
//		System.out.println("Veiculo2");
//		veiculo2.imprimirDados();
//		
//		System.out.println("---------");
//		
//		veiculo2 = new Veiculo();
//		
//		System.out.println("Veiculo2");
//		veiculo2.imprimirDados();
//		
//		veiculo1.imprimirDados();
//		
//		veiculo1.acelerar(35);
//		
//		veiculo1.imprimirDados();
		
		Veiculo veiculo3 = new Veiculo();
		
		veiculo3.imprimirDados();
	}
}