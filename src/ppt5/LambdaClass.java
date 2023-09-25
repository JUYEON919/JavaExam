package ppt5;

import java.util.function.Predicate;

interface MathOperation{
	int operate(int a, int b);
	//int test();
}//(a,b)->a+b;이걸람다함수로구현한거임
//함수형 인터페이스
//추상메서드를 딱하나만 가지고있는 인터페이스->함수형 인터페이스 라고함
//함수만쓰고싶을때


public class LambdaClass {

	public static void main(String[] args) {
		MathOperation add = (a,b)->a+b;
		MathOperation sub = (a,b)->a-b;
		MathOperation mul = (a,b)->a*b;
		MathOperation div = (a,b)->a/b;
		MathOperation rem = (a,b)->a%b;
		
		System.out.println(add.operate(10, 20));
		System.out.println(sub.operate(10, 20));
		System.out.println(mul.operate(10, 20));
		System.out.println(rem.operate(10, 20));
		
		//Integer받아서 짝수 홀수반환
		//Predicate사용
		
		int number = 15; //변수이름 조심해서!!!!!!!!!!
		Predicate<Integer> isEven = (Number) -> Number % 2 == 0; // 변수 이름을 소문자로 변경

        if (isEven.test(number)) {
            System.out.println(number + "는 짝수입니다.");
        } else {
            System.out.println(number + "는 홀수입니다.");
        }
		
		//Runnable
	}
	
	
	
}
