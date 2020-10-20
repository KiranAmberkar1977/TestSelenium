package UttaraSamples;

public class TestPolym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new MariDog("m-tuffy");
		Animal a2 = new Dog("d-tuffy");
		Canine c1  = new Canine("c-tuffy");
				
		Vet v = new Vet("Dr. Vet1");
		
		v.treat(a1);	// Using a common 'Parent object reference', i can pass any 'Child object reference' to v.treat() function.
		v.treat(a2);	// JVM will perform DMD on this which uses LSP Algo to use the most feature-rich object reference.
		v.treat(c1);	// We can pass a non-Animal reference also like reference of any Child object. This is true Polymorphism in play.
		
		Rhino r = new Rhino("r-tuffy");
		v.treat(r);  	// Since Rhino child-class doesn't override any Parent methods, Parent methods are dispatched here.
	}
}
