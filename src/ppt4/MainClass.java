package ppt4;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		double target = -10.5;
		
		System.out.println("abs : " + Math.abs(target));			//절대값
		System.out.println("ceil : " + Math.ceil(target));			//올림 (주어진 수보다 크거나 같은 최소의 정수)
		System.out.println("floor : " + Math.floor(target));			//내림 (주어진 수보다 작거나 같은 최대의 정수)
		System.out.println("round : " + Math.round(target));			//반올림 (주어진 수 반올림하여 가까운 정수)
		System.out.println("pow : " + Math.pow(target, target));	//반올림 (주어진 수 반올림 하여 가까운 정수)
		System.out.println("sqrt : " + Math.sqrt(target));			//주어진 값의 제곱근 반환
		System.out.println("sin : " + Math.sin(target));			//주어진 각도의 사인 값
		System.out.println("log : " + Math.log(target));			//주어진 값의 자연로그 값
	}

}

