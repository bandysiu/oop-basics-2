package com.itacademy.java.oop.basics2;

public class Loan {
    private int id;
    private int amount;
    private LoanType loanType;

    //could've been a LocalDate
    private String terminationDate;

    public Loan() {}
    public Loan(int id, int amount, LoanType loanType, String terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public String getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(String terminationDate) {
        this.terminationDate = terminationDate;
    }
}
