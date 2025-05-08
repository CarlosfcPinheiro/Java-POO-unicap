package Q2.exceptions;

public class YearLessThanZeroException extends RuntimeException {
    public YearLessThanZeroException() {
        super("O ano do veículo é menor do que zero");
    }
}