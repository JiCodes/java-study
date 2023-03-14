import java.io.Serializable;

public abstract class Shape implements Serializable {

    // Static field
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Abstract methods
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}