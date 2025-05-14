package Q4.exception;

public class PriceLessThanZeroException extends RuntimeException {
    public PriceLessThanZeroException() {
        super("O preço não pode ser menor do que zero");
    }
}
