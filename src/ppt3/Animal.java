package ppt3;

/**
 * 동물들의 상위 클래스 (부모 클래스)
 */
public class Animal {
	
	private String name;
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void sound() {
		System.out.println("Animal make sound");
	}
	
}
