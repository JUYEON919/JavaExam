package ppt5;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ThreadSafetyExam {

    public static void main(String[] args) {
        int num = 3; // 스레드 개수

        List<Integer> threadUnsafe = new ArrayList<>(); // 스레드 안전하지 않은 ArrayList
        List<Integer> threadSafe = new Vector<>(); // 스레드 안전한 Vector

        List<Thread> threads = new ArrayList<>(); // 스레드들을 저장할 리스트

        for (int i = 0; i < num; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    threadUnsafe.add(j); // 스레드 안전하지 않은 ArrayList에 요소 추가
                    threadSafe.add(j); // 스레드 안전한 Vector에 요소 추가
                }
            });
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.start(); // 스레드 실행
        }

        for (Thread thread : threads) {
            try {
                thread.join(); // 모든 스레드가 종료될 때까지 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("ArrayList의 사이즈 : " + threadUnsafe.size()); // 스레드 안전하지 않은 ArrayList의 크기 출력
        System.out.println("Vector의 사이즈 : " + threadSafe.size()); // 스레드 안전한 Vector의 크기 출력

    }// main

}// ThreadSafetyExam
