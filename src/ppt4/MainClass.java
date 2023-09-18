package ppt4;
import java.util.Scanner;

public class MainClass {
	
    public static void main(String[] args) {
    
    	try {
    		
    		exceptionTest();
    		System.out.println("예외처리 다음 main");
    		
    	} catch (Exception e) {
    		System.out.println("Main Catch : " + e);
    	}

    }
    
    static void exceptionTest() throws Exception {
    	
    	Scanner scann = new Scanner(System.in);
    	int input = scann.nextInt();
    	int result = 10 / input;
    	System.out.println("결과는 " + result + "입니다");
    	
    
    }
}