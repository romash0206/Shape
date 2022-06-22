public class Triangle extends Shape{
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private double height;

    public Triangle(double sideOne, double sideTwo, double sideThree, double height) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        this.height = height;
    }

    @Override
    public double square() {
        return sideOne*height/2;
    }

    @Override
    public double perimeter() {
        return sideOne+sideTwo+sideThree;
    }
}
