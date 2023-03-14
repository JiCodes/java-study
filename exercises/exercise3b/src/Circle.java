import java.io.Serializable;

public class Circle extends Shape implements Serializable {
    // Field
    private double radius;
    private static final double PI = 3.14;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Override method for calculating area of circle
    @Override
    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }

    // Override method for calculating perimeter of circle
    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
