package DZ1;

public class DZ45 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Circle");
        System.out.println("Периметр " + circle.calculatePerimeter());
        System.out.println("Площадь " + circle.calculateArea() + "\n");

        System.out.println("Rectangle");
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Периметр " + rectangle.calculatePerimeter());
        System.out.println("Площадь " + rectangle.calculateArea() + "\n");

        System.out.println("Square");
        Square square = new Square(10);
        System.out.println("Периметр " + square.calculatePerimeter());
        System.out.println("Площадь " + square.calculateArea() + "\n");
    }

    }
    

