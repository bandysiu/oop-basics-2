package It.itacademy.java.oop.basics3;

public class DebitCard extends Card{

    public DebitCard(double balance, String name, String number){
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
    double debit() {
        return 0;
    }

    @Override
    double credit() {
        return 0;
    }

}
