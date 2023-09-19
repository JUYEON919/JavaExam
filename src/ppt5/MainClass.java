package ppt5;

public class MainClass {

	public static void main(String[] args) {
		Box<Integer> myBox1 = new Box<>(10);
		Box<String> myBox2 = new Box<>("Java");
		
		System.out.println(myBox1.getValue());
		System.out.println(myBox2.getValue());
		
	}

}

class Box<T>{
	private T value;
	public Box(T value) {
		this.value = value;
	}
	public T getValue() {
		return value;
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
