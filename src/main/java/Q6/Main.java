package Q6;

import Q6.entity.Boleto;
import Q6.entity.CartaoCredito;
import Q6.entity.SistemaPagamento;

public class Main {
    public static void main(String[] args) {
        Boleto boleto = new Boleto(0.02);
        CartaoCredito cartaoCredito = new CartaoCredito(0.01);

        SistemaPagamento.efetuarPagamento(boleto, 200);
        SistemaPagamento.efetuarPagamento(cartaoCredito, 500);
    }
}
