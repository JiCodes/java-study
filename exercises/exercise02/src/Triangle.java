public class Triangle extends Shape {
    // Fields
    private double base;
    private double side1;
    private double side2;
    private double height;

    // Constructor
    public Triangle(String color, double base, double side1, double side2, double height) {
        super(color);
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    // Override method for calculating area of triangle
    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    // Override method for calculating perimeter of triangle
    @Override
    public double calculatePerimeter() {
        return base + side1 + side2;
    }
}
