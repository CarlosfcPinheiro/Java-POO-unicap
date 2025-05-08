package Q18;

import Q18.entity.Alimento;
import Q18.entity.Eletronico;
import Q18.entity.Fornecedor;

public class Main {
    public static void main(String[] args) {
        Alimento alimento = new Alimento("Pão", 1.50);
        Eletronico eletronico = new Eletronico("PC", 2300);

        Fornecedor fornecedor = new Fornecedor("Carlos");
        fornecedor.adicionarProduto(alimento);
        fornecedor.adicionarProduto(eletronico);

        fornecedor.listarProdutos();
    }
}
