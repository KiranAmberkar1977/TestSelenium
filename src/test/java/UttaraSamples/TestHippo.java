package UttaraSamples;

public class TestHippo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Hippo("Hippy1", 20).dance();
		//new Hippo("Hippy2", 30).dance();
		
		Hippo h1 = new Hippo("Hippy", 30);
		h1.dance();
		
		Hippo h2 = h1;
		h2.size = 30;
		
		// Verify if h2 indeed is a reference(or pointer) to the same object as h1.
		h2.dance();
	}
}
