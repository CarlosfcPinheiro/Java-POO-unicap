package Q1.exceptions;

public class AgeLessThanZeroException extends RuntimeException {
    public AgeLessThanZeroException() {
        super("A idade é menor do que zero!");
    }
}
