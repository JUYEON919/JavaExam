package ppt5;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		//선언/생성
		Vector<Integer> intVec = new Vector<Integer>();
		List<Integer> intVec2 = new Vector<Integer>();
		
		//생성과 동시에 초기화
		Vector<Integer> intVec3 = new Vector<>(Arrays.asList(1,2,3,4,5));
		
		Vector<Integer> intVec4 = new Vector<>(List.of(10,20,30));
		
		System.out.println(intVec3.size());
		
		//값 대입
		//intVec.add(10);
		//System.out.println(intVec.size());
		
		intVec3.addAll(Arrays.asList(6,7)); //그냥 add는안된다
		//범위기반
		for(var elem: intVec3) {
			System.out.println(elem);
		}
		
		for(int i = 0; i < intVec4.size(); i++) {
			System.out.println(intVec4.get(i));
		}
		
		
		
	}
}

