package ppt3;
/**
 * JAVA-PPT3실습용 메인 클래스
 * 이클래스에만 main 메서드 가지도록 구현해볼예정
 */

public class MainClass {
	
	//메서드
	public static void main(String[] args) {
		
		//OuterClass.fnStatic();
		
		//OuterClass test = new OuterClass();
		//test.fnTest2();
		
		
		//OuterClass.StaticNestedClass staticClass = new OuterClass.StaticNestedClass();
		//staticClass.display();
		
		
		OuterClass outerClass = new OuterClass();
		
		OuterClass.NonStaticNestedClass nestedClass = outerClass.new NonStaticNestedClass("first");
		OuterClass.NonStaticNestedClass nestedClass2 = outerClass.new NonStaticNestedClass("second");
		OuterClass.NonStaticNestedClass nestedClass3 = outerClass.new NonStaticNestedClass("third");
		
		nestedClass.display();
		nestedClass2.display();
		nestedClass3.display();
		
		System.out.println(outerClass.getCnt());
	}
	
}

