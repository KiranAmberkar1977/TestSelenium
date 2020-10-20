package UttaraSamples;

public class AnonInnerClass {
	static int outerVar;
	
	public AnonInnerClass(int outerVar) {
		super();
		AnonInnerClass.outerVar = outerVar;
	}
	
	public void getContent() {
		System.out.println("This is outer class getContent...");
	}

	public int getOuterVar() {
		return outerVar;
	}

	public void setOuterVar(int outerVar) {
		AnonInnerClass.outerVar = outerVar;
	}
	
}

