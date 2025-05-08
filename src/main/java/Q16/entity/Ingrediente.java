package Q16.entity;

public abstract class Ingrediente {
    private String nome;
    private double quantidade;

    public Ingrediente(String nome, double quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public abstract String informar();

    @Override
    public String toString(){
        return "NOME DO INGREDIENTE: " + nome + "\n QUANTIDADE: " + quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
