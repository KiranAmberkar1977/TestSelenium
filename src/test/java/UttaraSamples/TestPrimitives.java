package UttaraSamples;

public class TestPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		int primint1 = i1.intValue();
		int primint2 = i2.intValue();
		
		int i3 = 40;
		int i4 = 40;
		
		Integer i5 = 128;
		Integer i6 = 128;
		
		System.out.println("Sum of 2 ints is: " + (primint1 + primint2) );
		System.out.println("i1 == i2 is : " + (i1==i2) );		
		System.out.println("primiint1 == primint2 is : " + (primint1 == primint2) );		
		
		System.out.println("i3 == i4 is : " + (i3==i4) );
		System.out.println("i5 == i6 is : " + (i5==i6) );
	}
}
