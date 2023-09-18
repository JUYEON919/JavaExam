package han_jy_updown;
import java.util.Random;
import java.util.Scanner;

class UserQuitException extends Exception {
    public UserQuitException(String message) {
        super(message);
    }
}

public class MainClass {
    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(100) + 1;
        int attempts = 0; //시도횟수
        long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.print("정답을 추측해 보세요 (1~100): ");
                String input = scanner.nextLine();

                // 사용자 입력이 비어 있는지 확인하여 게임 종료
                if (input.isEmpty()) {
                    System.out.println("게임을 종료합니다.");
                    break;
                }

                int guess;
                try {
                    guess = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("올바른 숫자가 아닙니다. 1부터 100 사이의 숫자를 입력하세요.");
                    continue;
                }

                attempts++;

                if (guess < 1 || guess > 100) {
                    System.out.println("입력 범위를 초과하였습니다. 1부터 100 사이의 숫자를 입력하세요.");
                    continue;
                }

                if (guess == answer) {
                    long endTime = System.currentTimeMillis();
                    long elapsedTime = endTime - startTime;
                    System.out.println("정답입니다!");
                    System.out.println("시도 횟수: " + attempts);
                    System.out.println("경과 시간 (밀리초): " + elapsedTime);
                    break;
                } else if (guess < answer) {
                    System.out.println("up");
                } else {
                    System.out.println("down");
                }

                if (attempts >= 10) {
                    System.out.println("탈락! 10회 시도 제한을 초과하였습니다.");
                    break;
                }
            }
        } finally {
            scanner.close();
        }
    }
}
