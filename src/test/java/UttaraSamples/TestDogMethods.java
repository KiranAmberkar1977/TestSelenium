package UttaraSamples;

public class TestDogMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MariDog m = new MariDog("Tuffy");
		m.play();
		m.sleep();
		m.eat();
		m.bark();
		m.roam();
		
		System.out.println("\n");
	
		Dog d = new MariDog("d-tuffy");
		d.eat();
		d.bark();
		d.sleep();
		
		System.out.println("\n");
		
		Canine c = new MariDog("C-tuffy");
		c.sleep();
		c.roam();
		c.eat();
		
		System.out.println("\n");
		
		Dog d2 = new Dog("d2-tuffy");
		d2.eat();
		d2.bark();
		d2.sleep();
		
		System.out.println("\n");
		
		Canine c2 = new Canine("C2-tuffy");
		c2.sleep();
		c2.roam();
		c2.eat();
		
		System.out.println("\n");
		
//		MariDog m2 = (MariDog) new Canine("m2-tuffy");	// This code won't compile since we can't assign a Child D.T. reference as a reference to any of Parent objects.
//		m2.sleep();
//		m2.roam();
//		m2.eat();
	}

}
