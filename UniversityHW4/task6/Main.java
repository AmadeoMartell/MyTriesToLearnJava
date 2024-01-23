package UniversityHW4.task6;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle area before resizing: " + circle.CalculateArea());
        circle.resize(20);
        System.out.println("Circle area after resizing: " + circle.CalculateArea());

        Rectangle rectangle = new Rectangle(4, 3);
        System.out.println("Rectangle area before resizing: " + rectangle.CalculateArea());
        rectangle.resize(50);
        System.out.println("Rectangle area after resizing: " + rectangle.CalculateArea());

    }
}
