package UttaraSamples;

public class TestInitializers {
	
	{														// Instance Initializer
		System.out.println("In TestIni Instance init body...");
	}
	
	static {												// Static Initializer
		System.out.println("In TestIni Static init body...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Initializers iobj = new Initializers();
		System.out.println("Instance member value is: " + iobj.getName());
	}

}
