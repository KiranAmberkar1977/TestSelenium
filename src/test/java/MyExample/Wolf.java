package MyExample;

public class Wolf extends Canine{
	
	public Wolf(String N) {
		super(N);
		// TODO Auto-generated constructor stub
	}

	public void roam() {
			System.out.println("Wolf with name of " + name + " is roaming...");
	}

	public void eat() {
		System.out.println("Wolf with name " + name + " is eating...");
	}
	
	public void sleep() {
		System.out.println("Wolf with name " + name + " is sleeping...");
	}
	
	public String dance() {		// Classic example of Co-variant in play here. We can make return DT of overridden method a child object of parent method return DT.
		System.out.println("Wolf with name " + name + " is dancing...");
		return "wolf";
	}

}
