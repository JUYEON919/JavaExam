package ppt5;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		Queue<Integer> que1 = new LinkedList<>();
		Queue<Integer> que2 = new PriorityQueue<>();
		
		que1.offer(20);
		que1.offer(50);
		que1.offer(30);
		
		while(!que1.isEmpty()) {
			System.out.print(que1.poll() + " ");
		}
		System.out.println();
		
		//
		que2.offer(20);
		que2.offer(50);
		que2.offer(30);
		
		while(!que2.isEmpty()) {
			System.out.print(que2.poll() + " ");
		}
		
		
	}
}

