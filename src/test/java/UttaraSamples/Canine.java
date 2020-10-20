package UttaraSamples;

public class Canine extends Animal{
	
	public Canine(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void sleep() {
		System.out.println("Canine of name " + name + " is sleeping...");
	}
	
	public void roam() {
		System.out.println("Canine of name " + name + " is roaming...");
	}

}
