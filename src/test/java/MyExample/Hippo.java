package MyExample;

public class Hippo extends AbstractAnimal {
	
	public Hippo (String N) {
		super(N);
	}

	public void eat() {
		System.out.println("Hippo with name " + name + " is eating...");
	}
	
	public void sleep() {
		System.out.println("Hippo with name " + name + " is sleeping...");
	}

}
