package ppt4;

import java.util.Scanner;

public class SplitString {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();
        
        System.out.print("구분자를 입력하세요: ");
        String delimiter = scanner.nextLine();
        
        // 문자열을 구분자로 분리하여 배열에 저장
        String[] parts = input.split(delimiter);
        
        // 분리된 문자열 출력
        System.out.println("분리된 문자열:");
        for (String part : parts) {
            System.out.println(part);
        }
        scanner.close();
    }
}
