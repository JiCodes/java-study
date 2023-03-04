public class Main {
    public static void main(String[] args) {
        // Polymorphism: the same method name but the implementation varies
        Shape triangle = new Triangle("green",3, 4, 5, 2.4 );
        System.out.println("Triangle color: " + triangle.getColor());
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());

        Shape rectangle = new Rectangle( "black", 4, 5);
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        Shape circle = new Circle("red", 2);
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        Shape square = new Square("yellow", 4);
        System.out.println("Square color: " + square.getColor());
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());
    }
}




