package UniversityHW3;
/*
Creating a Triangle Class:
Implement a Triangle class that stores information about the sides of a triangle.
Add a method to calculate the perimeter and area of the triangle.
 */
public class task13 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.Perimeter();
        triangle.Area();
    }
}
class Triangle{
    private int a,b,c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void Perimeter(){
        System.out.println(a+b+c);
    }
    public void Area(){
        System.out.println(a*b*c);
    }
}
