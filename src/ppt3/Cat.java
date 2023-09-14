package ppt3;

public class Cat extends Animal {
	public Cat() {}
		
	public Cat(String name) {
			super(name);
	}
	
		@Override
	public void sound() {
		System.out.println("Cat meow");
	}
		
	public void punch() {
		System.out.println("Cat punch");
	}
}
