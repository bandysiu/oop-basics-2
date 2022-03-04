package com.itacademy.java.oop.basics;

import java.util.Date;

public class Employee {
    private String name;
    private String surname;
    private ContractType contractType;

    //could've been a LocalDate
    private String contractStartDate;
    private double salary;
    private String position;

    public Employee() {}

    public Employee(String name, String surname, ContractType contractType, String contractStartDate, double salary, String position) {
        this.name = name;
        this.surname = surname;
        this.contractType = contractType;
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.position = position;
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

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void displayInfo()
    {
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("contract type: " + contractType);
        System.out.println("contract start date: " + contractStartDate);
        System.out.println("salary: " + salary);
        System.out.println("position: " + position);
    }
}
