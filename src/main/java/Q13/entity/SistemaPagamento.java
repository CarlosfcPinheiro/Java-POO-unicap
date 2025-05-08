package Q13.entity;

public class SistemaPagamento {
    public static boolean realizarPagamento(ProcessadorPagamento processador, double valor){
        return processador.processarPagamento(valor);
    }
}
