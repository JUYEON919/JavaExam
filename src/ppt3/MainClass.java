package ppt3;
/**
 * JAVA-PPT3실습용 메인 클래스
 * 이클래스에만 main 메서드 가지도록 구현해볼예정
 */

public class MainClass {
	
	public static void main(String[] args) {
		
		Person han = new Person("han", 26 , "960000-2000000");
		Student cho = new Student("cho", 21, "910000-1000000", "한직교", 1, 3);
		
		han.greeting();
		System.out.println("-------------------------------");

		cho.greeting();
		System.out.println("-------------------------------\n\n");
		
		cho.changeName("Cho Young Ja");
		han.greeting();
		System.out.println("-------------------------------");
		
		cho.greeting();
		System.out.println("-------------------------------");
		
		
	}
}

