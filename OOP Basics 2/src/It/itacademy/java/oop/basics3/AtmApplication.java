package It.itacademy.java.oop.basics3;

import java.util.concurrent.ExecutionException;

public class AtmApplication {
    public static void main(String[] args) {

        Card creditCard = new CreditCard(1000, "Igor Shishkin", "5412754863148523", 5, 2000);
        Card debitCard = new DebitCard(1000, "Paulius Arsauskas", "5412967165792345");

        MyBankAtm myBankAtm = new MyBankAtm(2000);

        try {
            myBankAtm.withdraw(debitCard, 1100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            myBankAtm.withdraw(creditCard, 2100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            myBankAtm.deposit(debitCard, 500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            myBankAtm.withdraw(creditCard, 2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            myBankAtm.withdraw(debitCard, 1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
