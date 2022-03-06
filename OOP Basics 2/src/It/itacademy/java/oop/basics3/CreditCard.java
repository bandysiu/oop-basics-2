package It.itacademy.java.oop.basics3;

public class CreditCard extends Card {

    private final double interest;
    private final double credit;

    public CreditCard(double balance, String name, String number, double interest, double credit) {
        this.balance = balance;
        this.cardHolderName = name;
        this.cardNumber = number;
        this.interest = interest;
        this.credit = credit;
    }

    public String getCardHolderName() {
        return this.cardHolderName;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    @Override
    void debit(double amount) {
        if (this.balance - amount < -this.credit || amount > this.credit) {
            throw new NotEnoughtCreditException("ERROR | Not enough Credit.");
        } else {
            this.balance -= amount + this.interest;
            System.out.println("CREDIT | New card balance after withdrawal: " + this.balance);
            System.out.println("Fee paid: " + (amount * (this.interest / 100)));
        }
    }

    @Override
    void credit(double amount) {
        this.balance += amount;
        System.out.println("CREDIT | New card balance after deposit: " + this.balance);
    }
}
