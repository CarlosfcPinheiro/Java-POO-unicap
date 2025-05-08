package Q18.entity;

public class Alimento extends Produto{
    public Alimento(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return getPreco()*0.05;
    }
}
