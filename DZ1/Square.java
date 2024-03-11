package DZ1;

public class Square {
    private final double side;
    public Square(double side) {
        
        super(side, side);

        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
    
}
