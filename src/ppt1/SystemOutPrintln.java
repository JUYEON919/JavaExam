package ppt1;


//클래스의 접근제어자는 public/default
public class SystemOutPrintln {

	//메서드의 접근제어자는 퍼블릭/프로텍티드/디폴트/프라이빗
	public void test1() {
		System.out.println("test1");
	}
	protected void test2() {
		System.out.println("test2");
	}
	void test3() {
		System.out.println("test3");
	}
	private void test4() {
		System.out.println("test4");
	}
}

class Class2{
	public Class2() {
		
	}
}
