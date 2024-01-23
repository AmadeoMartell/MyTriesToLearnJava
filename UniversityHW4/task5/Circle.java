package UniversityHW4.task5;

public class Circle extends Shape {
    private double R;

    public Circle(double r) {
        R = r;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }
    @Override
    public double CalculateArea() {
        return Math.PI * Math.pow(R,2);
    }
}
