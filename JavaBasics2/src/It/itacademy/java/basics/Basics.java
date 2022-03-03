package It.itacademy.java.basics;

import java.util.Scanner;

public class Basics {
    String name;
    String surname;
    String age;

    Scanner scanner = new Scanner(System.in);
    public String getName() {
        name = scanner.nextLine();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        surname = scanner.nextLine();
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        age = scanner.nextLine();
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
