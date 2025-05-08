package Q18.entity;

public class Eletronico extends Produto{

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return getPreco()*0.1;
    }
}
