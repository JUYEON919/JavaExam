package ppt4;

import java.util.Scanner;

public class SmallLetter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("소문자 알파벳 하나를 입력하세요: ");
        char input = scanner.next().charAt(0);

        if (input < 'a' || input > 'z') {
            System.out.println("올바른 소문자 알파벳을 입력하세요.");
        } else {
            for (char ch = input; ch >= 'a'; ch--) {
                for (char letter = 'a'; letter <= ch; letter++) {
                    System.out.print(letter);
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
