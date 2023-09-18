package ppt4;

public class MainClass {
    public static void main(String[] args) {
    	
    	int result = 0;
    	
    	try {
    		
    		throw new MyCustomException("사용자 정의 예외 발생");
    	}catch (Exception e) {
    		System.out.println("catch : " + e);
    	}finally {
    		System.out.println("result : " + result);
    		//db연결종료
    	}
    }
}
