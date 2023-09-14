package ppt3;
/**
 * 기본적인 상속을 실습하기위한
 * 기초클래스(부모클래스, 슈퍼클래스)
 */
public class Person {

	    //field(=멤버변수) : 보통 프라이빗으로 선언하여 보호
		//외부에서접근불가능. 내부의 메서드를 통하여 접근.
		protected String name;
		private int age;
		private String rrn;
		
		//default constructor()
		//기본생성자가 부모클래스에 없을 경우에는 , 자식클래스에서 부모의 생성자를 무조건 명시하여 호출해야한다.
		//기본생성자가 부모클래스에 있는 경우에는 , 자식클래스에서 부모의 생성자 호출을 생략해도 , 자동으로 기본 생성자를 호출해준다.
		public Person() {}
		//constructor
		public Person(String name, int age, String rrn) {
			this.name = name;
			this.age = age;
			this.rrn = rrn;
		}
	
	void greeting() {
		System.out.println("안녕하세요 저는" + name + "입니다.");
	}

}
