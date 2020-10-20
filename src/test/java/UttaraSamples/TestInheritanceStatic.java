package UttaraSamples;

public class TestInheritanceStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		InheritanceStatic iobj = new InheritanceStaticBull();
		iobj.print();		// Compiler replace iobj reference with <parent class name> for Static methods.
							// Since static methods don't participate in DMD/RTP and Polymorphism, the parent's print method is called and LSP doesn't apply here.
	}
}
