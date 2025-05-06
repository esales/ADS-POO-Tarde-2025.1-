package exemplo02;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Luis", "Farias");
		
		Fone f1 = new Fone("081", "999999999", true);
		
		p1.setFone(f1);
		f1.setDono(p1);
		
		Operadora o1 = new Operadora("Tim");
		f1.setOperadora(o1);
		
		Fone f2 = new Fone("081", "222222222", false);
		
		Pessoa p2 = new Pessoa("Isabelly", "Remígio", f2);
		
		f2.setDono(p2);
		f2.setOperadora(o1);
		
		System.out.println(p2.getFone().getNumero());
		
		System.out.println(f1.getDono().getNome());
		
		System.out.println(p2.getFone().getOperadora().getNome());

	}
}