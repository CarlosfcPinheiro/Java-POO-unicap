package Q6;

import Q6.entity.Boleto;
import Q6.entity.CartaoCredito;
import Q6.entity.SistemaPagamento;
import Q6.exception.TaxaLessThanZero;

public class Main {
    public static void main(String[] args) {
        try{
            Boleto boleto = new Boleto(0.02);
            CartaoCredito cartaoCredito = new CartaoCredito(0.01);

            SistemaPagamento.efetuarPagamento(boleto, 200);
            SistemaPagamento.efetuarPagamento(cartaoCredito, 500);
        } catch(TaxaLessThanZero e){
            System.out.println(e.getMessage());
        }
    }
}
