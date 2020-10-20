package MyExample;
import static java.lang.Math.*;

public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractAnimal a = new Hippo("FirstHippy");
		a.eat();
		a.sleep();
		a.dance();
		
		Hippo h = new Hippo("Hippy");
		h.eat();
		h.sleep();
		
		Wolf w = new Wolf("Ruffy");
		w.eat();
		w.sleep();
		w.roam();	
		
		AbstractAnimal animal_ref = new Wolf("Wolffy");
		animal_ref.dance();
		
		System.out.println("Value of Pi is: " + PI);	// Demonstrates Usage of static Class imports.
		System.out.println("Value of Exponent is: " + E);
		System.out.println("Value of cos(45) is: " + cos(0));
	}

}
