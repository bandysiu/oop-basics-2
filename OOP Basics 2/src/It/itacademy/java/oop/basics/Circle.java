package It.itacademy.java.oop.basics;

public class Circle extends Shape {

    private final double radius;

    private double area;
    private double perimeter;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea(double x, double y) {
        return Math.PI * x * x;
    }

    double calculatePerimeter(double x, double y) {
        return 2 * Math.PI * x;
    }

    @Override
    public String toString() {
        return "Circle{" +
                ", radius=" + radius +
                ", area=" + calculateArea(radius, 0) +
                ", perimeter=" + calculatePerimeter(radius, 0) +
                '}';
    }

}
