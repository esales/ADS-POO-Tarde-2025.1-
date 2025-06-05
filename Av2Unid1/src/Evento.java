public class Evento {
    private String nome;
    private String data;
    private double preco;
    private boolean presencial;

    public Evento() {
        this.nome = "";
        this.data = "";
        this.preco = 0;
        this.presencial = false;
    }

    public Evento(String nome, String data, double preco, boolean presencial) {
        this.nome = nome;
        this.data = data;
        this.preco = preco;
        this.presencial = presencial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isPresencial() {
        return presencial;
    }

    public void setPresencial(boolean presencial) {
        this.presencial = presencial;
    }
}