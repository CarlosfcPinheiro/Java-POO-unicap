package Q4.entity;

import Q4.exception.PriceLessThanZeroException;

public abstract class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        if (preco < 0){
            throw new PriceLessThanZeroException();
        }

        this.nome = nome;
        this.preco = preco;
    }

    public int calcularGarantia(){
        return 1;
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
