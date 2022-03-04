package com.itacademy.java.oop.basics2;

public class LoansApplication {

    public static class Main {

        public static void main(String[] args) {

            Loan[] loans = new Loan[10];

            Customer customer1 = new Customer("Bob", "Big", 49, 12346, loans);

            loans[0] = new Loan(01,10000,LoanType.CONSUMERLOAN, "2032-01-01");
            loans[1] = new Loan(02,9000,LoanType.LEASING, "2032-01-03");

            customer1.addLoans(loans[0]);
            customer1.addLoans(loans[1]);

            customer1.printInfo();

            // I found this task way harder than it should be
            // Just because I'm not yet used to Java syntax
            // But you guys do an amazing job, so it'll come in no time
        }
    }
}
