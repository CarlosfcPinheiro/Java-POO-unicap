package Q3.exceptions;

public class baseSalaryException extends RuntimeException {
    public baseSalaryException() {
        super("O salário base deve ser maior do que 1000");
    }
}
