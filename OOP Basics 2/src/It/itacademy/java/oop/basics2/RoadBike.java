package It.itacademy.java.oop.basics2;

public class RoadBike implements Bicycle {

    private int gear;
    private int speed;
    private Bike bike;

    private int minSpeed = 0;
    private int maxSpeed = 50;
    private int minGear = 0;
    private int maxGear = 10;

    public RoadBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
        this.bike = Bike.ROAD;
    }

    public int getSpeed() {
        return speed;
    }

    public Bike getBike() {
        return bike;
    }

    public void changeGear(int newGear) {
        if (newGear == 1 || newGear == -1 || newGear == 2 || newGear == -2) {
            if (this.gear + newGear < this.minGear) {
                throw new ToFastException("Road Bike Gears can't be negative");
            } else if (this.gear + newGear > this.maxGear) {
                throw new ToFastException("Road Bike Gear maximum is 20.");
            } else {
                this.gear += newGear;
                System.out.println("New Road Bike gear is " + this.gear);
            }
        } else {
            throw new ToFastException("Can't change gears by: " + newGear + ". Try 1, -1 or 2, -2.");
        }
    }

    public void speedUp(int increment) {
        if (increment < 0) {
            throw new ToFastException("Negative number supplied, try using positive number");
        } else if (this.speed + increment > this.maxSpeed) {
            int temp;
            temp = this.maxSpeed - this.speed;
            throw new ToFastException("Maximum Road Bike speed is 100. Try increasing by " + temp);
        } else {
            this.speed += increment;
            System.out.println("New Road Bike speed: " + this.speed);
        }
    }

    public void applyBrakes(int decrement) {
        if (decrement > 0) {
            throw new ToFastException("Positive number supplied, try using negative number");
        } else if (this.speed - decrement < this.minSpeed) {
            int temp;
            temp = this.minSpeed - this.speed;
            throw new ToFastException("Minimum Road Bike speed is 0. Try decreasing by " + temp * -1);
        } else {
            this.speed -= decrement;
            System.out.println("New Road Bike speed: " + this.speed);
        }
    }
}
