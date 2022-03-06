package It.itacademy.java.oop.basics3;

public class NotEnoughtCreditException extends RuntimeException{

    public NotEnoughtCreditException () {

    }

    public NotEnoughtCreditException(String message) { super(message);}
}
