package Q4.Entity;

import java.util.List;

public class Loja {
    private List<Produto> produtos;

    public Loja(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void listarGarantias(){
        for(Produto produto : produtos){
            System.out.println("Garaintia de " + produto.getNome() + ": " + produto.calcularGarantia());
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
