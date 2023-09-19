package ppt4;

import java.util.Scanner;

public class MulThreePrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10]; // 10개의 정수를 저장할 배열

        // 10개의 정수 입력 받기
        for (int i = 0; i < 10; i++) {
            System.out.print("양의 정수를 입력하세요: ");
            int input = scanner.nextInt();
            num[i] = input;
        }

        // 배열에 있는 정수 중 3의 배수 출력
        System.out.println("입력한 배열 중 3의 배수는 다음과 같습니다:");
        for (int number : num) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}

