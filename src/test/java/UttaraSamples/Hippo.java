package UttaraSamples;

public class Hippo {
	public String name;
	public int size;
	
	public Hippo(String name, int size) {
		this.name = name;
		this.size = size;
		System.out.println("Constructor getting called...");
	}
	
	public void dance () {
		System.out.println("Hippo with name of " + name + " and size " + size + " is dancing");
	}
}
