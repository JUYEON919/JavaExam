package ppt4;


public class MainClass {

	public static void main(String[] args) {
		
		String strJava = "Hello";
		
		System.out.println("String before    :" + strJava.hashCode() + " : " + strJava);

		strJava += " Java";
		System.out.println("String after    :" + strJava.hashCode() + " : " + strJava);
		System.out.println();
		
		StringBuffer strbJava = new StringBuffer("Hello");
		System.out.println("StringBuffer before    :" + strbJava.hashCode() + " : " + strbJava);
		System.out.println(strbJava.capacity());
		
		strbJava.append(" Java!!");
		System.out.println("StringBuffer after    :" + strbJava.hashCode() + " : " + strbJava);
		System.out.println(strbJava.capacity());
	
	}
	
	

}

