package It.itacademy.java.oop.basics3;

public class DebitCard extends Card {

    public DebitCard(double balance, String name, String number) {
        this.balance = balance;
        this.cardHolderName = name;
        this.cardNumber = number;
    }

    public String getCardHolderName() {
        return this.cardHolderName;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    @Override
    void debit(double amount) {
        if (this.balance - amount < 0) {
            throw new NotEnoughBalanceException("ERROR | Not enough money in balance.");

        } else {
            this.balance -= amount;
            System.out.println("DEBIT | New card balance after withdrawal: " + this.balance);
        }
    }

    @Override
    void credit(double amount) {
        this.balance += amount;
        System.out.println("DEBIT | New card balance after deposit: " + this.balance);
    }

}
