package Q6.entity;

public abstract class MetodoPagamento {
    private double taxa;

    public MetodoPagamento(double taxa){
        if (taxa < 0) throw new IllegalArgumentException("Taxa invalida");

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
