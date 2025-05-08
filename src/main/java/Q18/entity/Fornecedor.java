package Q18.entity;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private String nome;
    private List<Produto> produtos;

    public Fornecedor(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void listarProdutos() {
        produtos.forEach(produto -> System.out.println(produto + "\n"));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
