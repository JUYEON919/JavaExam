package ppt3;

public class OuterClass {
	
	//필드
	public int 				oPublicF = 10;
	protected int 			oProtectedF = 20;
	int 					oDefaultF = 30;
	private int 			oPrivateF = 40;
	public static int 		oStaticF = 50;
	private int 			cnt = 0;
	
	//메서드
	public void 		fnPublic() 		{System.out.println("public");}
	protected void 		fnProtected() 	{System.out.println("protected");}
	void 				fnDefault() 	{System.out.println("default");}
	private void 		fnPrivate() 	{System.out.println("private");}
	public static void 	fnStatic() 		{System.out.println("static");}
	
	public static void fnTest() {
		System.out.println("정적메서드 테스트");
	}
	public static void fnTest2() {
		System.out.println("일반메서드 테스트");
	}
	
	
	
	
	//정적 중첩 클래스
	//외부 클래스의 인스턴스와 별도로. 독립적으로 동작
	//외부클래스의 정적멤버에만 접근가능
	public static class StaticNestedClass{
		//메서드
		void display() {
			System.out.println(oStaticF);
			fnStatic();
		}
	}
	//비정적 중첩클래스
	//외부클래스의 인스턴스와 관련하여 동작
	// 외부 클래스의 모든 멤버에 접근가능.
	public class NonStaticNestedClass{
		
		private String name;
		
		public NonStaticNestedClass(String n) {
			cnt++;
			name = n;
		}
		void display() {
			System.out.println(name);
//	         System.out.println(oPublicF);
//	         System.out.println(oPrivateF);
//	         System.out.println(oStaticF);
//	         fnPublic();
//	         fnPrivate();
//	         fnStatic();
		}
	}
	public int getCnt() {
		return cnt;
	}
	
}
