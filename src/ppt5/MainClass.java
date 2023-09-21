package ppt5;


public class MainClass {

	public static void main(String[] args) {
		
		//Runnable r = new MyRunnable();
		//t.start();
		Thread t1 = new MyThread();
		Thread t2 = new Thread(new MyRunnable());
		
		t1.start();
		try {
			//t1 thread가 종료될때까지 대기
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		
		for(int i = 0; i < 100 ; i++) {
			System.out.print(3);
		}
		
//		int cnt = 1;
//		int sum = 0;
//		while(cnt <=10) {
//			sum = sum+cnt;
//			System.out.println("+" + cnt++ + "=" + sum);
//		}
		
		
		
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