package han_jy.Shape;

public class Triangle_inf implements Shape_Interface, Shape_perimeter {
	//면적구할거
	private double base; // 밑변
    private double height; // 높이
	//둘레구할거
	private double side1; // 변1
    private double side2; // 변2
    private double side3; // 변3
    

    //면적
    public Triangle_inf(double base, double height) {
        this.base = base;
        this.height = height;
    }
    //둘레
    public Triangle_inf(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height; // 삼각형의 면적 계산
    }
    
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3; // 삼각형의 둘레 계산/그냥 세변주어진다생각
    }
    //side3 = side1*side1 + side2*side2
}
