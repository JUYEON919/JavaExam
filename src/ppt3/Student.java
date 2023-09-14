package ppt3;

/**
 * Person클래스를 상속받은 클래스
 */

public class Student extends Person {
	//field
	private String school;
	private int grade;
	private int s_class;
	
	//constructor
	public Student(String name, int age, String rrn, String school, int grade, int s_class) {
		super(name,age,rrn);
		this.school = school;
		this.grade = grade;
		this.s_class = s_class;
	}
	public void greeting() {
		super.greeting();
		System.out.println("현재" + school +"에 재학중이고, "+ grade + "학년" + s_class + "반입니다.");
	}
	//default :내클래스, 같은패키지
	void study() {
		System.out.println(name + "이(는) 공부중 입니다");
	}
	void changeName(String name) {
		this.name = name;
	}
}
