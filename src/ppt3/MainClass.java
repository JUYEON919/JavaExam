package ppt3;
/**
 * JAVA-PPT3실습용 메인 클래스
 * 이클래스에만 main 메서드 가지도록 구현해볼예정
 */

public class MainClass {
	
	//메서드
	public static void main(String[] args) {
		
		MyImplements imp = new MyImplements();
		
		//imp.method1();
		//imp.methmod2();
		
		System.out.println(imp.VALUE1);
		System.out.println(imp instanceof MyImplements);
		System.out.println(imp instanceof Myinterface);
		
	}
	
}

