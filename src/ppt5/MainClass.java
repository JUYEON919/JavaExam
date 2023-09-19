package ppt5;

public class MainClass {

	public static void main(String[] args) {
		Box<Integer> box1 = new Box<Integer>(10);	
		
		System.out.println(Box.getValue("String Element"));
		System.out.println(Box.getValue(100));
		
	}
}

class Box<T>{
	//private static int cnt;
	private T value;
	
	public Box(T value) {
		//cnt++;
		this.value = value;
	}
	public T getValue() {
		return value;
	}
	//public static int getCnt() {
		//return cnt;
	//}
	static <E> E getValue(E element) {
		return element;
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
