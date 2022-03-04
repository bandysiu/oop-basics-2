package com.itacademy.java.oop.basics2;

public class Customer {

    private String name;
    private String surname;
    private int age;
    private int personalNumber;
    private Loan[] loan;

    private int loanAmount = 0;
    private int loanAmountMax = 10;

    public Customer() {}

    public Customer(String name, String surname, int age, int personalNumber, Loan[] loan) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
        this.loan = loan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(short personalNumber) {
        this.personalNumber = personalNumber;
    }

    public Loan[] getLoan() {
        return loan;
    }

    public void setLoan(Loan[] loan)
    {
        this.loan = loan;
    }

    public void addLoans(Loan loan)
    {
        if (loanAmount < loanAmountMax ) {
            this.loan[loanAmount] = loan;
            loanAmount++;
        }
        else System.out.println("Maximum loans reached");
    }

    public int countLoans()
    {
        int loanSum = 0;
        for ( int i = 0; i < loanAmount; i++)
        {
            loanSum += loan[i].getAmount();
        }
        return loanSum;
    }

    public void printInfo()
    {
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("age: " + age);
        System.out.println("personal number: " + personalNumber);
        System.out.println("loans: " + loanAmount);
        System.out.println("all loan sum: " + countLoans());
    }
}
