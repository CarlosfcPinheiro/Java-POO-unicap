package Q13;

import Q13.entity.ProcessadorBoleto;
import Q13.entity.ProcessadorCartao;
import Q13.entity.SistemaPagamento;

public class Main {
    public static void main(String[] args) {
        ProcessadorCartao pc = new ProcessadorCartao();
        ProcessadorBoleto pb = new ProcessadorBoleto();

        SistemaPagamento.realizarPagamento(pc, 300);
        SistemaPagamento.realizarPagamento(pb, 5);
    }
}
