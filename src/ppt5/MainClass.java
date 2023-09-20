package ppt5;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		HashSet<Integer> scoreSet = new HashSet<>();
		
		scoreSet.add(10);
		scoreSet.add(20);
		scoreSet.add(10);
		
		System.out.println(scoreSet.size());
		
		scoreSet.forEach(score->System.out.print(score + " "));
		
		if(scoreSet.contains(30)) {
			System.out.println("30점 있음");
		}else {
			System.out.println("30점 없음");
		}
		
		
	}
}

