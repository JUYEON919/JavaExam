package han_jy.Shape;

public class Circle_inf implements Shape_Interface, Shape_perimeter {
    private double radius;

    public Circle_inf(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

