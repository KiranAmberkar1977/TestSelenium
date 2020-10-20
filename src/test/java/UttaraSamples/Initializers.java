package UttaraSamples;

public class Initializers {
	public String name = "kiran1";										// Field Initializer		
	{														// Instance Initializer 1
		System.out.println("In instance init 1 body...");
		name = "kiran2";
	}
	
	static {												// Static Initializer
		System.out.println("In Static init body...");
	}
	
	public Initializers() {									// Class constructor
		this.name = name;
		System.out.println("In class constructor body...");
		name = "kiran4";
	}
	
	{														// Instance Initializer 2
		System.out.println("In instance init 2 body...");
		name = "kiran3";
	}
	
	public String getName() {
		return this.name;
	}
}
