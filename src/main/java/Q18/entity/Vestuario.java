package Q18.entity;

public class Vestuario extends Produto{

    public Vestuario(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return getPreco()*0.15;
    }
}
