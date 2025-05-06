package exemplo02;

public class Fone {
	private String codigo;
	private String numero;
	private boolean celular;
	private Pessoa dono;
	private Operadora operadora;
	
	public Fone(String codigo, String numero, boolean celular) {
		this.codigo = codigo;
		this.numero = numero;
		this.celular = celular;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNumero() {
		return numero;
	}

	public boolean isCelular() {
		return celular;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}
	
	
}