package ppt5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class MainClass{
	
	private static Vector<Account> accounts = new Vector<Account>(); // 계좌를 저장하는 벡터
	Random rand = new Random(); // 랜덤 값을 생성하기 위한 랜덤 객체
	
	public static void main(String[] args) {
		
		// 객체를 만들어야 하는 경우
		// 스레드(계좌 개설) 
		
		// 계좌 10개 개설
		Thread thread;
		for(int i=0; i<10;i++) {
			thread = new Thread(()->{
				accounts.add(new Account()); //새계좌 생성해서 저장
			});
			thread.start();
		}
		
		try {
			Thread.sleep(3000); //3초대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Account.getCNT()); //계좌수출력

		try {
			Thread.sleep(1000); //결과볼려고1초대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 스레드(입급/출금)
		MainClass myBank = new MainClass();
		List<Thread> deposits = new ArrayList<>();
		List<Thread> withdraws = new ArrayList<>();
		
		for(int i=0; i<10;i++) {
			deposits.add(myBank.new Deposit()); //입금스레드생성
			withdraws.add(myBank.new Withdraw());//출금스레드생성
		}
		
		for(var desposit:deposits) {
			desposit.start(); //입금스레드시작
		}
		
		for(var withdraw:withdraws) {
			withdraw.start(); //출금스레드시작
		}
		
		try {
			Thread.sleep(3000); //3초대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(var account:accounts) {
			System.out.println(account.getAccountNo() + " 계좌의 잔액 : " + account.getBalance());
		}

	}
	
	class Deposit extends Thread{
		@Override
		public void run() {
			// 입금
			int account;
			int amount;
			
			account = rand.nextInt(10);//랜덤계좌선택
			amount = rand.nextInt(10000) + 1; //랜덤금액생성(입금해줄거)
			
			Account target = accounts.get(account);
			target.deposit(amount); // 입금
			System.out.println(target.getAccountNo() + ", " + amount + "원 입금 완료 : 잔액(" + target.getBalance() + ")");
		}
	}
	
	
	class Withdraw extends Thread{
		@Override
		public void run() {
			// 출금
			int account;
			int amount;
			 
			account = rand.nextInt(10); //램덤계좌선택
			amount = rand.nextInt(10000) + 1;//랜덤금액생성(출금할거)
			
			Account target = accounts.get(account);
			if(target.withdraw(amount)) { // 출금
				System.out.println(target.getAccountNo() + ", " + amount + "원 출금 완료 : 잔액(" + target.getBalance() + ")");
			} else {
				System.out.println(target.getAccountNo() + ", " + amount + "원 출금 실패 : 잔액(" + target.getBalance() + ") 잔액부족" );
			}
		}
	}
	
}