package idk_1;

import java.util.List;
import java.util.Vector;

public class BankSystem {
	public static void main(String[] args) {
		
	}
}
class BankAccount {
    private String accountNum; //통장계좌번호저장
    private double balance; //통장잔액저장

    public BankAccount(String accountNum, double initialBalance) { //계좌번호,첫금액
        this.accountNum = accountNum;
        this.balance = initialBalance;
    }

    public String getAccountNum() { //계좌번호반환
        return accountNum;
    }

    public double getBalance() { // 통장잔액반환
        return balance;
    }

    public void deposit(double amount) { //입금처리, 입금한금액에 잔액더함
        balance += amount;
    }

    public void withdraw(double amount) {// 출금처리, 출금한금액에 잔액뺌
        if (balance >= amount) {
            balance -= amount;
        }
    }
}