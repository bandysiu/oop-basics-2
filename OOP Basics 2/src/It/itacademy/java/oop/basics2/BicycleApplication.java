package It.itacademy.java.oop.basics2;

import java.util.Scanner;

public class BicycleApplication {
    public static void main(String[] args) {

        Bicycle mountainBike = new MountainBike(1, 0);
        Bicycle roadBike = new RoadBike(1, 0);

        mountainBike.speedUp(10);
        mountainBike.applyBrakes(5);
        mountainBike.changeGear(1);

        roadBike.speedUp(10);
        roadBike.applyBrakes(-3);
        roadBike.changeGear(2);

        Speedometer.chooseWinner(mountainBike, roadBike);
    }
}
