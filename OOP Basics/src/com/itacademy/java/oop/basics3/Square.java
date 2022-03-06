package com.itacademy.java.oop.basics3;

public class Square {
    private double length;
    private double width;

    public Square() {}

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void isValid(int k)
    {
        if ( length > 0 && width > 0 ) System.out.println("Square " + k + " area is: " + area(length,width) + " perimeter is: " + perimeter(length,width));
        else System.out.println("Square " + k + " is invalid. Length: " + length + " , width: " + width);
    }

    public double area(double x, double y)
    {
        return x*y;
    }

    public double perimeter(double x, double y)
    {
        return 2*x + 2*y;
    }
}
