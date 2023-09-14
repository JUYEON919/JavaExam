package han_jy;

public class MainClass {

	public static void main(String[] args) {
        //원
        Circle_inf circle = new Circle_inf(3.0);//객체생성
        
        double area = circle.calculateArea();//면적
        double perimeter = circle.calculatePerimeter();//둘레
        System.out.println("원의 면적: " + area);
        System.out.println("원의 둘레: " + perimeter);
        
        System.out.println("");
        
        //삼각형
        Triangle_inf trianglearea = new Triangle_inf(4, 3);//면적
        Triangle_inf triangleWithSides = new Triangle_inf(5, 6, 7);//둘레
        
        double triangleArea = trianglearea.calculateArea();//면적
        double trianglePerimeter = triangleWithSides.calculatePerimeter();//둘레
        System.out.println("삼각형의 면적: " + triangleArea);
        System.out.println("삼각형의 둘레: " + trianglePerimeter);
        
        System.out.println("");
        
        //사각형
        Square_inf square = new Square_inf(4.0, 4.0);
        
        double squareArea = square.calculateArea();//면적
        double squarePerimeter = square.calculatePerimeter();//둘레
        System.out.println("사각형의 면적: " + squareArea);
        System.out.println("사각형의 둘레: " + squarePerimeter);
        
	}

}
