package han_jy;

public class Circle extends Shape_abstract {

	 private double radius; // 반지름

	 public Circle(double radius) {
	     this.radius = radius;
	 }

	 @Override
	 double calculateArea() {
	     return Math.PI * radius * radius; // 원의 면적 계산
	 }
	 
}
