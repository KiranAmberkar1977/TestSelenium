package MyExample;

public abstract class AbstractAnimal {
	String name;
	
	public AbstractAnimal(String N) {
		name = N;
	}
	
	public abstract void eat();
	
	public abstract void sleep();
	
	public Object dance() {
		System.out.println("Animal with name of " + name + " is dancing...");
		return "done";
	}
	
}
