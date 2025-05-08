package Q6.entity;

public class CartaoCredito extends MetodoPagamento{

    public CartaoCredito(double taxa) {
        super(taxa);
    }

    @Override
    public boolean processarPagamento(double valor){
        if (getTaxa() < 0.02) return true;

        return false;
    }
}
