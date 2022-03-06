package com.itacademy.java.oop.basics4;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {


        // viskas galejo buti klaseje ir metoduose - lazy, behold the spaghetti code.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Password must contain 10 characters, 1 lower case letter, 1 upper case letter, 2 numbers, 1 special character.");
        System.out.println("Enter password:");
        String password = scanner.nextLine();;

        //char charPass[] = password.toCharArray();

        int numbers = 0;
        int lowers = 0;
        int uppers = 0;
        int symbols = 0;

        if (password.length() < 10)
        {
            System.out.println("Password is invalid. Not enough characters.");
            return;
        }


        for (int i = 0; i < password.length(); i++)
        {
            if ( Character.isSpaceChar(password.charAt(i)))
            {
                System.out.println("Password is invalid. Contains a 'space'.");
                return;
            }

            if ( Character.isLowerCase(password.charAt(i)))
            {
                lowers++;
            }
            else if ( Character.isDigit(password.charAt(i)))
            {
                numbers++;
            }
            else if ( Character.isUpperCase(password.charAt(i)))
            {
                uppers++;
            }
            // neveikia sita funkcija :( don't know what's wrong?
//            else
//            {
//                String specialChars = "*!@#$%^&*(){}[]|?<>";
//                for (int k = 0; k < specialChars.length(); k++) {
//                    if (specialChars.contains(password.substring(k, 1))) {
//                        symbols++;
//                    }
//                }
//            }
        }

        if ( lowers < 1 )
        {
            System.out.println("Password is invalid. Not enough lower letters.");
        }
        else if ( uppers < 1 )
        {
            System.out.println("Password is invalid. Not enough capital letters.");
        }
        else if ( numbers < 2 )
        {
            System.out.println("Password is invalid. Not enough numbers.");
        }
        //else if ( symbols < 1 )
        // {
        // System.out.println("Password is invalid. Not enough symbol characters.");
        // }
        else
        {
            System.out.println("Password is valid: " + password);
        }
    }
}
