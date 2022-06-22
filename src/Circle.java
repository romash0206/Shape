public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return 3.14*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*3.14*radius;
    }
}
