package Q6.entity;

public class SistemaPagamento {
    public static boolean efetuarPagamento(MetodoPagamento metodo, double valor){
        double taxa = metodo.calcularTaxa(valor);
        double valorTotal = valor + taxa;
        System.out.println("VALOR TOTAL: " + valorTotal + ", TAXA: " + taxa);

        return true;
    }
}
