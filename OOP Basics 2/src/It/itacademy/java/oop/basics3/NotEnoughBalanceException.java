package It.itacademy.java.oop.basics3;

public class NotEnoughBalanceException extends RuntimeException {
    public NotEnoughBalanceException() {
    }

    public NotEnoughBalanceException(String message) {
        super(message);
    }
}
