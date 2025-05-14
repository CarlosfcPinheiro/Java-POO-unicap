package Q7.exception;

public class DistanceOutOfLimitException extends RuntimeException {
    public DistanceOutOfLimitException() {
        super("A distância excede o limite");
    }
}
