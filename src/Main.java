public class Main {


    public static void main(String[] args) {
        Shape squareSquare = new Square(5.5);
        Shape perimetrSquare = new Square(5.5);

        System.out.println("Квадрат: площадь = "+squareSquare.square()+", периметр = "+perimetrSquare.perimeter());

        Shape squareTriangle = new Triangle (1, 5, 4, 3);
        Shape perimetrTriangle = new Triangle(1,5,4,3);

        System.out.println("Треугольник: площадь = "+squareTriangle.square()+", периметр = "+perimetrTriangle.perimeter());

        Shape squareCircle = new Circle(5.3);
        Shape perimetrCircle = new Circle(5.3);

        System.out.println("Круг: площадь = "+squareCircle.square()+", окружность = "+perimetrCircle.perimeter());

        Shape squareTrapezoid = new Trapezoid(2, 4, 3, 2.5);
        Shape perimetrTrapezoid = new Trapezoid(2, 4, 4, 2.5);

        System.out.println("Трапеция: площадь = "+squareTrapezoid.square()+", окружность = "+perimetrTrapezoid.perimeter());




    }
}
