package ppt5;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Thread timerThread = new Thread(new TimerRunnable());
		timerThread.start();
		
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("숫자 입력");
			int input = scanner.nextInt();
			System.out.println("입력된 숫자는" + input + "입니다");
			timerThread.interrupt();
		}
		
		
	}//main
}//class

class TimerRunnable implements Runnable{
	
	@Override
	public void run() {
		try {
			Thread.sleep(10000);
			System.out.println("시간이 초과했슴돠");
			
			System.exit(0);
		}catch (InterruptedException e) {
			System.out.println("10초안에 입력하였으므로 스레드 종료");
		}
	}
}

class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		for(int i = 0; i < 100 ; i++) {
			System.out.print(2);
		}
		
//		int cnt = 1;
//		int multipl = 1;
//		
//		while(cnt <=10) {
//			multipl = multipl * cnt;
//			System.out.println("x" + cnt++ + "=" + multipl);
//		}

	}//run
}


class MyThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 0; i < 100 ; i++) {
			System.out.print(1);
		}
		
		
	}//run
	
}//MyThread