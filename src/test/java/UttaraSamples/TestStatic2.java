package UttaraSamples;

public class TestStatic2 {
		int x=20;
		static int y = 40;
		
		static {
			y=30;
			System.out.println("y in static initializer is:" + y);
		}
		{
			x=30;
			System.out.println("x in first instance member initializer is:" + x);
		}
		
		public TestStatic2() {
			x=40;		 // Overrides the ‘50’ set by second Inst initializer.
			y=20;		 // Overrides the ‘30’.
			System.out.println("x and y in constructor is:" + x + "," + y);
		}
		{
			x=50;
			System.out.println("x in second instance member initializer is:" + x);
		}
		public int getX() {
			return x;
		}	
	
		public int getY() {
			return y;
		}
	
	public static void main (String[] args) {
		TestStatic2 t = new TestStatic2();
		System.out.println("Final x is: " + t.getX());  	// prints 40 since order is field, instances, constructor.
		System.out.println("Final y is: " + t.getY());    // prints 40 since order is field, instances, constructor.
	}
}
