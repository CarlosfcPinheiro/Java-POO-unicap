package Q6.entity;

import Q6.exception.TaxaLessThanZero;

public abstract class MetodoPagamento {
    private double taxa;

    public MetodoPagamento(double taxa){
        if (taxa < 0) throw new TaxaLessThanZero();

        this.taxa = taxa;
    }

    public abstract boolean processarPagamento(double valor);

    public double calcularTaxa(double valor){
        return valor * taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
