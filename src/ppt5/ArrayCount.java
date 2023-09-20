package ppt5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayCount {//대소문자 구별안함

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: "); //입력
        String input = scanner.nextLine();
        scanner.close(); // 스캐너 닫기

        Map<Character, Integer> countMap = new HashMap<>(); //빈도저장

        input = input.toLowerCase(); //입력한걸 소문자로

        //문자열 문자빈도를 계산
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (Character.isLetter(c)) {// 알파벳 문자인 경우에만 처리
            	countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            	// 해당 문자가 이미 Map에 존재하는 경우, 빈도수를 1 증가.
                // 없는 경우, 새로운 값을 Map에 추가하고 빈도를 1로 설정.
            }
        }//for

        //결과 출력.
        System.out.println("문자열에서 각 문자의 빈도:");
        System.out.println(countMap);
        /*for (char key : countMap.keySet()) {
            int count = countMap.get(key);
            System.out.print(key + " = " + count + " ");
        }*/
		
	}//main

}//class
/**
 * 자바덕에서 Character검색 (lower-소문자/upper-대문자)
 * (file:///C:/Users/Administrator/Downloads/jdk-17.0.8_doc-all/docs/api/java.base/java/lang/Character.html#isAlphabetic(int))
 * Map검색(getOrDefalut)
 * (file:///C:/Users/Administrator/Downloads/jdk-17.0.8_doc-all/docs/api/java.base/java/util/Map.html#getOrDefault(java.lang.Object,V))
**/
