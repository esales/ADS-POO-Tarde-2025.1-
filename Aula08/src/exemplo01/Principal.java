package exemplo01;

public class Principal {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo();
		VeiculoTerrestre v2 = new VeiculoTerrestre();
		
		System.out.println("v1 é Veiculo? " + (v1 instanceof Veiculo));
		System.out.println("v1 é VeiculoTerrestre? " + (v1 instanceof VeiculoTerrestre));
		System.out.println("v2 é Veiculo? " + (v2 instanceof Veiculo));
		System.out.println("v2 é VeiculoTerrestre? " + (v2 instanceof VeiculoTerrestre));
		
		v1.setMarca("Honda");
		
		v2.setMarca("Toyota");
		v2.setNumeroRodas(4);
		
		Veiculo v3 = new VeiculoTerrestre();
		v3.setMarca("Fiat");
		
		VeiculoTerrestre v4 = (VeiculoTerrestre)v3;
		v4.setNumeroRodas(4);
		
		System.out.println(v4.getMarca());
		System.out.println(v4.getNumeroRodas());
		
//		v3.setNumeroRodas(4);
		
//		VeiculoTerrestre v4 = new Veiculo();
		

	}
}