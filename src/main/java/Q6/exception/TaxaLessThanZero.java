package Q6.exception;

public class TaxaLessThanZero extends RuntimeException {
    public TaxaLessThanZero() {
        super("O valor da taxa não pode ser menor do que zero");
    }
}
