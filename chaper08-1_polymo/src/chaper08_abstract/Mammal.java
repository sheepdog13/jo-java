package chaper08_abstract;

public abstract class Mammal extends Animal {
	public abstract void sound();
	
	public void move() {
		System.out.println("이동한다");
	}
}
