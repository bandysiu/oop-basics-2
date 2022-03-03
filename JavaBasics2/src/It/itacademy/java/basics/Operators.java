package It.itacademy.java.basics;

import java.util.Scanner;

public class Operators {
    String a, b ,c;

    Scanner scanner = new Scanner(System.in);
    String x;

    public String getA() {
        return a = scanner.nextLine();
    }

    public String getB() {
        return b = scanner.nextLine();
    }

    public String getC() {
        return c = scanner.nextLine();
    }

    public void F(String a, String b, String c)
    {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);

        if ( x == y && x == z && y == z ) System.out.println("Triangle is Equilateral. Sides: " + a + " " + b + " " + c);
        else if ( x == y && x+y > z || x == z && x+z > y || z == y && z+y > x ) System.out.println("Triangle is Isosceles. Sides: " + a + " " + b + " " + c);
        else if ( x+y > z && x+z > y && y+z > x) System.out.println("Triangle is Scalene. Sides: " + a + " " + b + " " + c);
        else System.out.println("Triangle is invalid. Sides: " + a + " " + b + " " + c);

    }
}
