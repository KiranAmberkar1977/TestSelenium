package UttaraSamples;

public class TestConstructors {

	public TestConstructors(int intArg) {
		System.out.println("Int constructor invoked...");
		return;
	}
	
	public TestConstructors(double intArg) {
		System.out.println("Double constructor invoked...");
		return;
	}
	
	public long InstMethod(double intArg, double intArg2) {
		long l1 = 10;
		return l1;
	}
	
	public int InstMethod(double intArg) {
		int l1 = 10;
		return l1;
	}
//	public TestConstructors(long intArg) {
//		System.out.println("Long constructor invoked...");
//		return;
//	}
	
	public static void main(String[] args) {
		
		// Integer object pooling occurs for ByteSize that is -128 to +127 values. So same reference of object is returned.
		Integer i1 = 127;
		Integer i2 = 127;
		//System.out.println("I1 == I2 is: " + (i1==i2));
		
		TestConstructors t1 = new TestConstructors(5);
		TestConstructors t2 = new TestConstructors(5.5);
		
		// Compiler does upcasting here from float to Double implicitly and hence the double accepting constructor gets called.
		TestConstructors t3 = new TestConstructors(5.5f);
		
		// Compiler does upcasting here from Long to float then to Double implicitly and hence the double accepting constructor gets called.
		TestConstructors t4 = new TestConstructors(5L);
	
	}

}
