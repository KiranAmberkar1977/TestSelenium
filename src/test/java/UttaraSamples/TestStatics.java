package UttaraSamples;

public class TestStatics {
	private int count;
	private static int count_static;
	
	public TestStatics() {
		count++; count_static++;
	}
	
	public static void getCount() {
		TestStatics obj = new TestStatics();
		System.out.println("count Count is: " + obj.count);
		System.out.println("count_static Count is: " + obj.count_static);
	}
	
	public static void main(String[] args) {
		System.out.println("In first main method...");
		TestStatics.getCount();
		TestStatics.getCount();
		TestStatics.getCount();
	}
	
	public static void main() {
		System.out.println("In second main method...");
		TestStatics.getCount();
	}
}
