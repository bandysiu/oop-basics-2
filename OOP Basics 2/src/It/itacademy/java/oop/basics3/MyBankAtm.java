package It.itacademy.java.oop.basics3;

public class MyBankAtm implements Atm {

    private double balance;

    public MyBankAtm(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(Card card, double amount) {
        if (this.balance - amount < 0)
        {
            throw new InsufficientAtmFundsException("ERROR | Insufficient ATM funds.");
        }
        else
        {
            System.out.println("WITHDRAW " + amount);
            card.debit(amount);
            this.balance -= amount;
            System.out.println("ATM | New Atm balance after withdrawal: " + this.balance);
        }
    }

    @Override
    public void deposit(Card card, double amount) {
        System.out.println("DEPOSIT " + amount);
        card.credit(amount);
        this.balance += amount;
        System.out.println("ATM | New Atm balance after deposit: " + this.balance);
    }
}
