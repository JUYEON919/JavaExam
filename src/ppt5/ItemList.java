package ppt5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ItemList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		List<String> itemsList = new ArrayList<>(); 	//물건목록
        Set<String> overlapItems = new HashSet<>(); 	//중복물건
        
        while (true) {
            System.out.println("물건의 이름을 입력하세요 (exit 또는 q로 종료): "); //입력받기
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("q")) {
                break;
            }//사용자가 "exit" 또는 "q"를 입력하면 입력 반복문을 종료

            //입력값이 비어있지 않은 경우에만 처리
            if (!input.isEmpty()) {
                
                itemsList.add(input);		//입력된 물건의 이름을 리스트에 추가

                
                overlapItems.add(input);	//중복된 물건의 이름 저장
            }
        }
        
         //입력된 모든 물건의 이름을 출력
            System.out.println("입력된 물건의 이름:");
            for (String item : itemsList) {
                System.out.println(item);
            }
        
         //중복된 물건의 이름을 출력
            System.out.println("중복된 물건 이름 정리:");
            for (String item : overlapItems) {
                System.out.println(item);
            }
          
        scanner.close();

	}//main
}//class

