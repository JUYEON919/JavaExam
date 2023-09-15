package han_jy.Shape;

public class MainClass {

    public static void main(String[] args) {
        // 원, 삼각형, 사각형 객체 생성
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(4.0, 3.0);
        Square square = new Square(6.0, 8.0); 

        // 각 도형의 면적 계산 및 출력
        System.out.println("원의 면적: " + circle.calculateArea());
        System.out.println("삼각형의 면적: " + triangle.calculateArea());
        System.out.println("사각형의 면적: " + square.calculateArea());
    }
}