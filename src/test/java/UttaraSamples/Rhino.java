package UttaraSamples;

public class Rhino extends Animal {

	String alias; 
	
	public Rhino(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	// Only inherits existing states and behaviors of Animal and doesn't add any new ones.
	
	public void eat(Pen p1) {
		//p1 = null;			// Option 1: Set the value of the copy of reference variable passed to null.
		p1 = new Pen("Ballpoint", 10.0);	// Option 2: Set the value to a new reference variable.
		p1.brand = "Cellotip";				// Option 3: Update the instance member using the passed reference.
	}
}
