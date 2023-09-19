package ppt5;

import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		Integer[] intArr = new Integer[] {1,2,3};
		printArray(intArr);
		
		String[] strArr = new String[] {"banana", "kiwi", "melon"};
		printArray(strArr);
		*/
		
		List<MyParent> parent = Arrays.asList(new MyParent());
		List<Me> me = Arrays.asList(new Me());
		List<MyChild> child = Arrays.asList(new MyChild());
		
		printSuperList(parent);
		printSuperList(me);
		//printSuperList(child);

		//printExtendsList(parent);
		printExtendsList(me);
		printExtendsList(child);
		
		
	}
	static void printSuperList(List<? super Me> c) {
		c.add(new Me());
	}
	static void printExtendsList(List<? extends Me> c) {
		//c.add(new Me());
	}
}
	class MyParent{}
	class Me extends MyParent{}
	class MyChild extends Me{}


