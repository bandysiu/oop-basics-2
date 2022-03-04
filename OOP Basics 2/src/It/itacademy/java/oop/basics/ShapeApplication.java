package It.itacademy.java.oop.basics;

public class ShapeApplication {

    public static void main(String[] args) {

        Shape square = new Square(6, 4);
        Shape circle = new Circle(3);

        System.out.println(square.toString());
        System.out.println(circle.toString());
    }
}
