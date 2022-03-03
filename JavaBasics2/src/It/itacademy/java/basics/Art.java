package It.itacademy.java.basics;

import java.util.Scanner;

public class Art {

    Scanner scanner = new Scanner(System.in);
    String height;

    public String getHeight() {
        return height = scanner.nextLine();
    }

    public void art(String x)
    {
        int height = Integer.parseInt(x);

        for(int level = 0; level < height * 2; level += 2)
        {
            for(int spaces = (height * 2 - level) / 2; spaces >= 0; spaces--) System.out.print(" ");

            for(int leaf = 0; leaf <= level; leaf++) System.out.print("#");

            System.out.println(" ");
        }

        for(int i = 0; i < height+1; i++)
            System.out.print(" ");

        System.out.print("#");
    }
}
