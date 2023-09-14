package ppt3;

public class Circle extends Shape {

	private double radius;
	
	public Circle(double radius) {
		cnt++;
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		System.out.println("cnt : " + cnt);
		return Math.PI * radius * radius;
	}

}
