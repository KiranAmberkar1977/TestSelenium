package UttaraSamples;

public class Dog extends Canine {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Dog of name " + name + " is eating...");
	}
	
	public void bark() {
		System.out.println("Dog of name " + name + " is barking...");
	}
}
