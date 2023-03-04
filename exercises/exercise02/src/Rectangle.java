public class Rectangle extends Shape {
    // Fields
    private double length;
    private double width;

    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Override method for calculating area of rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Override method for calculating perimeter of rectangle
    @Override
    public double calculatePerimeter() {
        return (length + width) * 2;
    }
}