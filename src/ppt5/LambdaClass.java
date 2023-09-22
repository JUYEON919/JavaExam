package ppt5;

interface MathOperation{
	int operate(int a, int b);
	
}//(a,b)->a+b;이걸람다함수로구현한거임
//함수형 인터페이스
//추상메서드를 딱하나만 가지고있는 인터페이스->함수형 인터페이스 라고함
//함수만쓰고싶을때


public class LambdaClass {

	public static void main(String[] args) {
		MathOperation add = (a,b)->a+b;
		System.out.println(add.operate(10, 20));
	}

}
