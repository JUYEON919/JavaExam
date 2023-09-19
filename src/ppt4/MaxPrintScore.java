package ppt4;

import java.util.Scanner;

public class MaxPrintScore {
	
	public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
			int students = 10; // 학생 수를 10명으로 지정

	        int maxScore = 0; 
			
			for (int i = 1; i <= students; i++) {
			    System.out.print("학생 " + i + "의 점수를 입력하세요: ");
			    int score = scanner.nextInt();

			    if (score > maxScore) {
			        maxScore = score; // 최대값 갱신
			    }
			}

			System.out.println("최대 점수는 " + maxScore + "입니다.");
			scanner.close();
	}
}
