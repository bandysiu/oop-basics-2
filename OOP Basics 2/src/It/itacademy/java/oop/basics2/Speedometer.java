package It.itacademy.java.oop.basics2;

public class Speedometer {

    public static void chooseWinner(Bicycle mountainBike, Bicycle roadBike) {
        if (chooseWinner(mountainBike.getSpeed(), roadBike.getSpeed()) == 0) {
            System.out.println("It's a draw");
        } else if (chooseWinner(mountainBike.getSpeed(), roadBike.getSpeed()) == mountainBike.getSpeed()) {
            System.out.println(mountainBike.getBike() + " Bike Wins!");
        } else {
            System.out.println(roadBike.getBike() + " Bike Wins!");
        }
    }

    public static int chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) {
        if (mountainBikeSpeed == roadBikeSpeed) {
            return 0;
        } else if (mountainBikeSpeed > roadBikeSpeed) {
            return mountainBikeSpeed;
        } else {
            return roadBikeSpeed;
        }
    }
}
