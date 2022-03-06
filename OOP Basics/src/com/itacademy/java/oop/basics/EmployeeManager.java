package com.itacademy.java.oop.basics;

public class EmployeeManager {

    public static class Main {

        public static void main(String[] args) {

        Employee employee1 = new Employee("Bob", "Big", ContractType.FullTime, "2022-01-01", 2481.46, "Manager");

        employee1.displayInfo();
        }
    }
}
