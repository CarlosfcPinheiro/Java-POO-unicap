package Q13.entity;

public interface ProcessadorPagamento {
    boolean autorizarPagamento(double valor);

    boolean processarPagamento(double valor);
}
