package ppt5;

public class MainClass {

	public static void main(String[] args) {
		Box<Integer> myBox1 = new Box<>(10);
		System.out.println(myBox1.getValue());
		System.out.println(Box.getCnt());

		Box<String> myBox2 = new Box<>("Java");
		System.out.println(myBox2.getValue());
		//System.out.println(Box<T>.getCnt());
		System.out.println(Box.getCnt());
		
		Box<Integer> myBox3 = new Box<>(20);
		System.out.println(myBox3.getValue());
		System.out.println(Box.getCnt());
		
	}
}

class Box<T>{
	private static int cnt;
	private T value;
	public Box(T value) {
		cnt++;
		this.value = value;
	}
	public T getValue() {
		return value;
	}
	public static int getCnt() {
		return cnt;
	}
}



class IntegerBox{
	private Integer value;
	
	public IntegerBox(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}
}
class StringBox{
	private String value;
	
	public StringBox(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	
}
