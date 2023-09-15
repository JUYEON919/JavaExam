package han_jy.Shape;

public class Triangle extends Shape_abstract {

	private double base; // 밑변
    private double height; // 높이

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height; // 삼각형의 면적 계산
    }
 
}
