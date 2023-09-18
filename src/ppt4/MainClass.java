package ppt4;

import java.time.LocalDate;

public class MainClass {

	public static void main(String[] args) {

		String strJava = "Java";
		String strJava2 = new String("Java");
		
		if(strJava == strJava2) {
			System.out.println("== 비교연산으로 " + strJava + "와" + strJava2 + " 는 같다");
		}else {
			System.out.println("== 비교연산으로 " + strJava + "와" + strJava2 + " 는 다르다");
		}
		
		if(strJava.equals(strJava2)) {
			System.out.println("equals 비교연산으로 " + strJava + "와" + strJava2 + " 는 같다");
		}else {
			System.out.println("equals 비교연산으로 " + strJava + "와" + strJava2 + " 는 다르다");
		}
		
	}

}

