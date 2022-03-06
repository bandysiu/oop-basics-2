package It.itacademy.java.oop.basics3;

public abstract class Card {

    double balance;
    String cardHolderName;
    String cardNumber;

    abstract void credit(double amount);

    abstract void debit(double amount);

}
