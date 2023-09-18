package ppt4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		int[] arr = new int[10000000];
		Random random = new Random();
		
		for(int i = 0; i < 10000000; i++) {
			arr[i] = random.nextInt();
		}
		
		long sTime = System.nanoTime();
		Arrays.sort(arr);
		long eTime = System.nanoTime();
		System.out.println("sort 시간 : " + (eTime - sTime) + "ns");
		
		sTime = System.nanoTime();
		for (int i = 0; i < arr.length ; i++) {
			if(arr[i] == arr[3000]) break;
		}
		eTime = System.nanoTime();
		System.out.println("소요시간 : " + (eTime - sTime) + "ns");
		
		sTime = System.nanoTime();
		Arrays.binarySearch(arr, arr[3000]);
		eTime = System.nanoTime();
		System.out.println("소요시간 : " + (eTime - sTime) + "ns");
		
		
	}

}

