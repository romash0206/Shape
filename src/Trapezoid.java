public class Trapezoid extends Shape{
    private double sideUp;
    private double sideDown;
    private double sidelong;
    private double height;

    public Trapezoid(double sideUp, double sideDown, double sidelong, double height) {
        this.sideUp = sideUp;
        this.sideDown = sideDown;
        this.sidelong = sidelong;
        this.height = height;
    }

    @Override
    public double square() {
        return (sideDown+sideUp)*height/2;
    }

    @Override
    public double perimeter() {
        return sideUp+sideDown+sidelong+sidelong;
    }
}
