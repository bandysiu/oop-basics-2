package It.itacademy.java.oop.basics3;

public class InsufficientAtmFundsException extends RuntimeException {

    public InsufficientAtmFundsException() {
    }

    public InsufficientAtmFundsException(String message) {
        super(message);
    }

}
