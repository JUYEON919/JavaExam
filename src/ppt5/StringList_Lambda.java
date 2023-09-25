package ppt5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//글자수체크해볼려고
import java.util.HashMap;
import java.util.Map;

public class StringList_Lambda {

    public static void main(String[] args) {
    	// 문자열 리스트 생성
        List<String> strList = new ArrayList<>();
     try (// 사용자로부터 문자열 입력 받기
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("문자열을 입력하세요. 입력을 마치려면 write end을 입력하세요.");

			while (true) {
			    System.out.print("입력: ");
			    String input = scanner.nextLine();

			    if (input.equals("write end")) {
			        break; // 빈 문자열 입력 시 입력 종료
			    }

			    strList.add(input);
			}
		}
        /*
 * strList.add("flkjanslhdfldcnxjla");38
        strList.add("flkjanwlhdfldcnxjla");19
        strList.add("flkjanslhdfldcnxjla");38 오류찾기
 */
        // 람다 표현식을 사용한 문자열 정렬
        Collections.sort(strList, (s1, s2) -> {
        	// 문자열 길이를 비교하여 오름차순 정렬
            int lengthComparison = Integer.compare(s1.length(), s2.length());

            // 문자열 길이가 같으면 알파벳순으로 정렬
            if (lengthComparison == 0) {
                return s1.compareTo(s2);
            } else {
                return lengthComparison;
            }
        });//람다

        //글자수체크
        // 글자수를 저장할 맵을 생성
        Map<String, Integer> alphabetCountMap = new HashMap<>();

        // 글자수 카운트를 계산합니다.
        for (String str : strList) {
           str = str.toLowerCase();
            for (char c : str.toCharArray()) {
                if (Character.isLetter(c)) {
                    alphabetCountMap.put(str, alphabetCountMap.getOrDefault(str, 0) + 1);
                }
            }
        }

        
        
        // 출력
        for (String str : strList) {
            System.out.println(str);
        	 //int count = alphabetCountMap.get(str);
             //System.out.println(str + " (글자수: " + count + ")");

        }
        
    }//main
}//ArrayList_Lambda
