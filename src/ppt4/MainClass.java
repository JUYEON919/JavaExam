package ppt4;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		int[] arrInt = {1,2,3,4,5};
		int[] arrInt2 = new int[] {10,20,30,40,50};
		
		int[] arrInt3 = new int[5];
		int[] arrInt4 = new int[6];
		
		System.out.println(arrInt3.hashCode());
		//대상 배열의 크기를 변경하지 않음
		System.arraycopy(arrInt, 2, arrInt3, 1, 3);
		System.out.println(arrInt3.hashCode());
		System.out.println();
		
		//대상 배열의 크기가 변경됨
		System.out.println(arrInt4.hashCode());
		arrInt4 = Arrays.copyOf(arrInt2, 5);
		System.out.println(arrInt4.hashCode());
		
		for(int value:arrInt3) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		for(int value:arrInt4) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		
	}
	
	

}

