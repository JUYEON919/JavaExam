package han_jy;

public class Circle_inf implements Shape_Interface {

	private double radius; // 반지름

    public Circle_inf(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // 원의 면적 계산
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // 원의 둘레 계산
    }

}
