package Q6.entity;

public class Boleto extends MetodoPagamento {
    private double taxa = 0.05;

    public Boleto(double taxa) {
        super(taxa);
    }

    @Override
    public boolean processarPagamento(double valor) {
        return true;
    }

}