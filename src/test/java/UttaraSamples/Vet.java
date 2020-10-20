package UttaraSamples;

public class Vet {
	String name;
	
	public Vet(String name) {
		this.name = name;
	}
	
	public void treat(Animal a) {
		System.out.println("Vet of name " + name + " treating animal of name " + a.name);
		a.eat();					// Verify which eat() method will be dispatched @ run-time.
		a.sleep();					// Verify which sleep() method will be dispatched @ run-time.
		System.out.println("");
	}

}
