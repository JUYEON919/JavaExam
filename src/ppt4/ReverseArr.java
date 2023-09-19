package ppt4;

import java.util.Scanner;

public class ReverseArr {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        String reversed = ReverseArr.reverseString(input); // 다른 클래스의 메소드 호출
        System.out.println("뒤집힌 문자열: " + reversed);
        
        scanner.close();
    }
	
	public static String reverseString(String input) {
		StringBuffer stringBuffer = new StringBuffer(input);
        stringBuffer.reverse(); // 문자열 뒤집기

        return stringBuffer.toString();

    }
}

