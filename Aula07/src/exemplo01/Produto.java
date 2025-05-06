package exemplo01;

public class Produto {
	private String nome;
	private double preco;
	
	public Produto() {
		nome = "";
		preco = 0;
	}
	
	public Produto(String nome) {
		this.nome = nome;
		preco = 0;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(double preco, String nome) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(String marca, String nome) {
		this.nome = marca+" "+nome;
	}
	
	
	
	public void imprime() {
		System.out.println("_____");
		System.out.println("Nome: " + this.nome);
		System.out.println("Preço: " + this.preco);
		System.out.println("_____");
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}