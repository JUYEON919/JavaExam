package han_jy;

public class Square_inf implements Shape_Interface {
	private double width; // 너비
    private double height; // 높이

    public Square_inf(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height; // 사각형의 면적 계산
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height); // 사각형의 둘레 계산
    }

}
