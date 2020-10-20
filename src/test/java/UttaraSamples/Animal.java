package UttaraSamples;

public class Animal {
	public String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("Animal of name " + name + " is eating...");
	}
	
	public void sleep() {
		System.out.println("Animal of name " + name + " is sleeping...");
	}
}
