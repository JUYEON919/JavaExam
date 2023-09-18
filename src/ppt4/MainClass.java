package ppt4;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int [] arr = {10,30,20,40,50,100,70,33};
		//String [] arrStr = {"banana", "kiwi", "strawberry", "pineapple"};
		//정렬 전
		for(var value:arr) {
			System.out.print(value + " ");		
		}
		System.out.println();		
				
		
		//for(var value:arrStr) {
		//	System.out.print(value + " ");
		//}
		//System.out.println();		
		
		//정렬
		Arrays.sort(arr);
		//정렬 후
		for(int value:arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

}

