package ppt5;

import java.util.Scanner;
import java.util.Vector;

public class CommonExamStudent {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Vector<Integer> infoProcExamStudents = new Vector<>();		//정보처리기사응시학생
        Vector<Integer> securityExamStudents = new Vector<>();		//보안기사시험응시학생
        Vector<Integer> commonStudents = new Vector<>();			//공통응시학생
        
     // 정보처리 기사 응시 학생번호 입력
        System.out.println("정보처리 기사 응시 학생번호를 입력하세요 (1~30), 입력 종료 시 '00' 입력");
        int studentNum; //학생번호
        while (true) {
            studentNum = scanner.nextInt();
            if (studentNum == 00) {//00입력시 입력멈춤
                break;
            }
            if (studentNum >= 1 && studentNum <= 30) {//응시번호1~30제한
                infoProcExamStudents.add(studentNum);
            } else {
                System.out.println("학생 번호는 1부터 30까지만 입력 가능합니다.");
            }
        }
     // 보안 기사 응시 학생번호 입력
        System.out.println("보안 기사 응시 학생번호를 입력하세요 (1~30), 입력 종료 시 '00' 입력");
        while (true) {
            studentNum = scanner.nextInt();
            if (studentNum == 00) {
                break;
            }
            if (studentNum >= 1 && studentNum <= 30) { //응시번호1~30제한
                securityExamStudents.add(studentNum);
            } else {
                System.out.println("학생 번호는 1부터 30까지만 입력 가능합니다.");
            }
        }
        
     // 공통 응시 학생 번호 찾기
        for (int student : infoProcExamStudents) {
            if (securityExamStudents.contains(student)) {
                commonStudents.add(student);
            }
        }  
     // 공통 응시 학생 번호 출력
        if (commonStudents.isEmpty()) {
            System.out.println("두 개의 시험 모두 응시한 학생이 없습니다.");
        } else {
            System.out.println("두 개의 시험 모두 응시한 학생 번호:");
            for (int student : commonStudents) {
                System.out.println(student + "번 학생 ");
            }
        }
        
        scanner.close();
	}//main
}//class
/**
 * 자바덕 vector 클래스검색
 */
