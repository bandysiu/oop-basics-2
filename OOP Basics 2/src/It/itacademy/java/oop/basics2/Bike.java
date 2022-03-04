package It.itacademy.java.oop.basics2;

public enum Bike {
    MOUNTAIN("MB"),
    ROAD("RB");

    public final String bike;

    Bike(String bikeType) {
        this.bike = bikeType;
    }

    public static Bike contractType(String bikeType) {
        for (Bike e : values()) {
            if (e.bike.equals(bikeType)) {
                return e;
            }
        }
        return null;
    }
}
