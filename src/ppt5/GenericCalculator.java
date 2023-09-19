package ppt5;

import java.util.Scanner;

public class GenericCalculator<T extends Number> {
    private T num1;
    private T num2;

    public GenericCalculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // 더하기 메서드
    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    // 빼기 메서드
    public double sub() {
        return num1.doubleValue() - num2.doubleValue();
    }

    // 곱하기 메서드
    public double mul() {
        return num1.doubleValue() * num2.doubleValue();
    }

    // 나누기 메서드
    public double div() {
        if (num2.doubleValue() == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 (예: 5 10): ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        GenericCalculator<Double> calculator = new GenericCalculator<>(num1, num2);

        System.out.println("더하기 결과: " + calculator.add());
        System.out.println("빼기 결과: " + calculator.sub());
        System.out.println("곱하기 결과: " + calculator.mul());
        System.out.println("나누기 결과: " + calculator.div());

        scanner.close();
    }
}
