package idk_1;


public class CounterExam {
	
	public static int counter = 0; // 공유 변수로 사용할 카운터
	public static int incCnt = 0; // 증가 스레드의 작업 횟수를 저장하는 변수
	public static int decCnt = 0; // 감소 스레드의 작업 횟수를 저장하는 변수
	private static final Object obj = new Object(); // 스레드 동기화를 위한 락 객체
	
	public static void main(String[] args) {
		Thread incrementT = new Thread(new IncrementThread()); // 증가 스레드 생성
		Thread decrementT = new Thread(new DecrementThread()); // 감소 스레드 생성
		
		incrementT.start(); // 증가 스레드 시작
		decrementT.start(); // 감소 스레드 시작
		
		try {
			incrementT.join(); // 증가 스레드가 종료될 때까지 대기
			decrementT.join(); // 감소 스레드가 종료될 때까지 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(3000); // 3초 동안 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Counter: " + counter + ", intCnt" + incCnt + ", decCnt" + decCnt);
	}// main
	
	static class IncrementThread implements Runnable {
		@Override
		public void run() {
			synchronized(obj) { // 락 객체를 사용하여 동기화
				for(int i = 0; i < 10; i++) {
					if(i == 5) {
						try {
							obj.wait(); // 스레드를 대기 상태로 전환
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					incCnt++;
					System.out.println("(+)" + ++counter + " "); // 카운터 증가 및 출력
				}
				obj.notify(); // 대기 중인 다른 스레드를 깨움
			}
		}
	}
	
	static class DecrementThread implements Runnable {
		@Override
		public void run() {
			synchronized(obj) { // 락 객체를 사용하여 동기화
				for(int i = 0; i < 10; i++) {
					if(i == 7) {
						obj.notify(); // 대기 중인 다른 스레드를 깨움
						try {
							obj.wait(); // 스레드를 대기 상태로 전환
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					decCnt++;
					System.out.println("(-)" + --counter + " "); // 카운터 감소 및 출력
				}
				obj.notify(); // 대기 중인 다른 스레드를 깨움
			}
		}
	}
}// class
