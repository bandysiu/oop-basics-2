package It.itacademy.java.oop.basics2;

public interface Bicycle {

    void changeGear(int newGear);

    void speedUp(int increment);

    void applyBrakes(int decrement);

    int getSpeed();

    Bike getBike();
}
