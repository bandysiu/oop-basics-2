package It.itacademy.java.oop.basics3;

public class CreditCard extends Card {

    private double interest;
    private double credit;

    public CreditCard(double balance, String name, String number){
        this.balance = balance;
        this.cardHolderName = name;
        this.cardNumber = number;
    }

    public String getCardHolderName(){
        return this.cardHolderName;
    }

    public String getCardNumber(){
        return this.cardNumber;
    }

    @Override
    double credit() {
        return 0;
    }

    @Override
    double debit() {
        return 0;
    }
}
