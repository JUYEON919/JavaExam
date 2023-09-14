package han_jy;

public class Square extends Shape_abstract {
	
	private double width; // 너비
	private double height; // 높이

	public Square(double width, double height) {
	    this.width = width;
	    this.height = height;
	}

	@Override
    double calculateArea() {
        return width * height; // 사각형의 면적 계산
    }

}
