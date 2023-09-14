package ppt3;

/**
 * 추상클래스와 추상 메서드를 실습하기위한 클래스
 */
public abstract class Shape {
	
	protected int cnt;
	public Shape() {
		System.out.println("Shape()의 생성자");
	}
	
	//추상메서드정의, 구현되지않음
	//자식 클래스에서 반드시 재정의해야한다!!!!!!
	public abstract double calculateArea();
	
	public void print() {
		System.out.println("Shape Class");
	}
	
}
