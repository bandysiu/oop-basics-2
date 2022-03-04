package com.itacademy.java.oop.basics3;

import java.util.Random;

public class ShapeApplication {

    public static void main(String[] args) {

        Random rand = new Random();

        int number = 10;

        Square[] squares = new Square[number];

        // random lenght ir width cause why not
        // -4 yra tam, kad butu negative skaiciu
        for ( int i = 0; i < number; i++)
        {
            squares[i] = new Square(rand.nextDouble(10) - 4 , rand.nextDouble(10) - 4 );
        }

        // galima ir vienam for'e, bet task'e "iterrate through array" soo..

        for ( int i = 0; i < number; i++)
        {
            squares[i].isValid(i+1);
        }
    }
}

