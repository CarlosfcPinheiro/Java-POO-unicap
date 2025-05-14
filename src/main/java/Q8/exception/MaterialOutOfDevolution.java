package Q8.exception;

public class MaterialOutOfDevolution extends RuntimeException {
    public MaterialOutOfDevolution() {
        super("A data de devolução está fora do prazo máximo");
    }
}
