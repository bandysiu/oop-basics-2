package It.itacademy.java.oop.basics;

public class Square extends Shape {

    private final double length;
    private final double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea(double x, double y) {
        return x * y;
    }

    double calculatePerimeter(double x, double y) {
        return 2 * x + 2 * y;
    }

    @Override
    public String toString() {
        return "Square{" +
                ", length=" + length +
                ", width=" + width +
                ", area=" + calculateArea(length, width) +
                ", perimeter=" + calculatePerimeter(length, width) +
                '}';
    }
}
