package It.itacademy.java.oop.basics2;

public class MountainBike implements Bicycle {

    private int gear;
    private int speed;
    private Bike bike;

    private int minSpeed = -10;
    private int maxSpeed = 100;
    private int minGear = 0;
    private int maxGear = 10;

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
        this.bike = Bike.MOUNTAIN;
    }

    public int getSpeed() {
        return speed;
    }

    public Bike getBike() {
        return bike;
    }

    public void changeGear(int newGear) {
        if (newGear == 1 || newGear == -1) {
            if (this.gear + newGear < this.minGear) {
                throw new ToFastException("Mountain Bike Gears can't be negative");
            } else if (this.gear + newGear > this.maxGear) {
                throw new ToFastException("Mountain Bike Gear maximum is 20.");
            } else {
                this.gear += newGear;
                System.out.println("New Mountain Bike gear is " + this.gear);
            }
        } else {
            throw new ToFastException("Can't change gears by: " + newGear + ". Try 1 or -1.");
        }
    }

    public void speedUp(int increment) {
        if (increment < 0) {
            throw new ToFastException("Negative number supplied, try using positive number");
        } else if (this.speed + increment > this.maxSpeed) {
            int temp;
            temp = this.maxSpeed - this.speed;
            throw new ToFastException("Maximum Mountain Bike speed is 100. Try increasing by " + temp);
        } else {
            this.speed += increment;
            System.out.println("New Mountain Bike speed: " + this.speed);
        }
    }

    public void applyBrakes(int decrement) {
        if (decrement < 0) {
            throw new ToFastException("Negative number supplied, try using positive number");
        } else if (this.speed - decrement < this.minSpeed) {
            int temp;
            temp = this.minSpeed - this.speed;
            throw new ToFastException("Minimum Mountain Bike speed is -10. Try decreasing by " + temp * -1);
        } else {
            this.speed -= decrement;
            System.out.println("New Mountain Bike speed: " + this.speed);
        }
    }
}
