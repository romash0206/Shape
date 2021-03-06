public class Square extends Shape {
private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double square() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }
}
