package idk_1;

import java.util.ArrayList;
import java.util.List;
//import java.util.Vector;
class BankAccount {
    private String accountNumber; //계좌번호
    private int balance; //잔액
    
    // 생성자: 계좌 번호를 받아 초기화
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    //입금(deposit)
    public void deposit(int amount) {
        synchronized (this) {
            balance += amount;
            System.out.println("계좌번호 " + accountNumber + " 입금 : + " + amount + "  잔액 : " + balance);
        }
    }
    //출금(withdraw)
    public boolean withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("계좌번호 " + accountNumber + " 출금 : - " + amount + " 잔액 : " + balance);
                return true;
            } else {
                System.out.println("계좌번호 " + accountNumber + " 출금 실패 : 잔액부족");
                return false;
            }
        }
    }
    //조회
    //잔액
    public int getBalance() {
        synchronized (this) {
            return balance;
        }
    }
    //계좌번호
    public String getAccountNumber() {
        synchronized (this) {
            return accountNumber;
        }
    }
}//class BankAccount

public class BankSystem {
//	private Vector<BankAccount> accounts = new Vector<>();
//
//    public void createAccount(String accountNumber, double initialBalance) {
//        //새 통장을 생성 Vector추가합니다.
//        BankAccount account = new BankAccount(accountNumber, initialBalance);
//        accounts.add(account);
//    }
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>(); // 계좌 목록을 저장하는 리스트
        List<Thread> threads = new ArrayList<>(); // 모든 스레드를 저장하는 리스트

        // 여러 개의 계좌를 생성하고 리스트에 추가
        for (int i = 0; i <= 50; i++) {
            BankAccount account = new BankAccount("Account " + i);
            accounts.add(account);
        }

        // 입금 스레드 생성 및 시작
        for (int i = 0; i <= 50; i++) {
            Thread depositThread = new Thread(() -> {
                for (int j = 0; j <= 10; j++) {
                    BankAccount account = accounts.get((int) (Math.random() * accounts.size()));
                    int amount = (int) (Math.random() * 1000);
                    account.deposit(amount);
                }
            });

            depositThread.start();
            threads.add(depositThread);
        }

        // 출금 스레드 생성 및 시작
        for (int i = 0; i <= 50; i++) {
            Thread withdrawThread = new Thread(() -> {
                for (int j = 0; j <= 10; j++) {
                    BankAccount account = accounts.get((int) (Math.random() * accounts.size()));
                    int amount = (int) (Math.random() * 1000);
                    account.withdraw(amount);
                }
            });

            withdrawThread.start();
            threads.add(withdrawThread);
        }

        // 모든 스레드가 종료될 때까지 대기
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("");
        // 각 계좌의 잔액을 출력
        for (BankAccount account : accounts) {
            System.out.println("계좌번호 : " + account.getAccountNumber() + " , 최종잔액 : " + account.getBalance());
        }
    }//main
}//class BankSystem
