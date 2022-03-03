package It.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetics {

    Scanner scanner = new Scanner(System.in);
    String x;

    public String getX() {
        return x = scanner.nextLine();
    }

    public void F(String x)
    {
        int y = Integer.parseInt(x);

        System.out.println("Cube's volume: " + y*y*y + "cm3.");
        System.out.println("Cube's perimeter: " + 4*y + "cm.");
    }


    String feet, inches;
    public String getFeet() {
        return feet = scanner.nextLine();
    }

    public String getInches() {
        return inches = scanner.nextLine();
    }

    public void F2(String x, String y)
    {
        float x1 = Float.parseFloat(x);
        float y1 = Float.parseFloat(y);
        System.out.println(x1 + " feet and " + y1 + " inches = " + x1*12*2.54 + y1*2.54 + " cm");
    }
}
