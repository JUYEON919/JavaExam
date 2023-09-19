package ppt4;

public class PrimeNumCheck {
    public static void main(String[] args) {
        int number = 6; // 소수를 판별할 숫자를 지정
	        
        if (isPrime(number)) {
            System.out.println(number + "은(는) 소수입니다.");
        } else {
            System.out.println(number + "은(는) 소수가 아닙니다.");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 1 이하의 숫자는 소수가 아님
        }
        
        // 2는 예외로 소수로 처리
        if (n == 2) {
            return true;
        }
	        
        // 2를 제외한 모든 짝수는 소수가 아님
        if (n % 2 == 0) {
            return false;
        }
	        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false; // 나누어 떨어지면 소수가 아님
            }
        }
        
        return true;
  }

}
