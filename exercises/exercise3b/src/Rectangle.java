public class Rectangle extends Shape {
    // Fields
    private double height;
    private double width;

    // Constructor
    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    // Override method for calculating area of rectangle
    @Override
    public double calculateArea() {
        return height * width;
    }

    // Override method for calculating perimeter of rectangle
    @Override
    public double calculatePerimeter() {
        return (height + width) * 2;
    }
}