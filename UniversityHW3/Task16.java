package UniversityHW3;
/*
Working with Shapes: Design classes Square and Circle.
Square should store information about the side length,
 and Circle about the radius.
Add methods to calculate the area and perimeter for each shape.
 */
public class Task16 {
    public static void main(String[] args) {
        Square square = new Square(4);
        Circle circle = new Circle(3);

        System.out.println("Square: ");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        System.out.println("\nCircle: ");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getPerimeter());

    }
}
class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
