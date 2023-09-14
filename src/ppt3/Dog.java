package ppt3;

public class Dog extends Animal {
	
	public Dog() {}
	
	public Dog(String name) {
		super(name);
	}

	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
	
	public void jump() {
		System.out.println("Dog jump");
	}

}
