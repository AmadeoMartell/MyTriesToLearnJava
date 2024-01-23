package UniversityHW4.task6;

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

    @Override
    public void resize(double percent) {
        R *= (1 + percent / 100);
    }
}
