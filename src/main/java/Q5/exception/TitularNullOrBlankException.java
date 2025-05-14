package Q5.exception;

public class TitularNullOrBlankException extends RuntimeException {
    public TitularNullOrBlankException() {
        super("O titular não pode ser nulo ou em branco");
    }
}
