package UttaraSamples;

public class StringImmutability {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = "abc";
		String s3 = "abc";
		String s4 = "abc ";
		String s5 = s4.trim();
		String s6 = "abc ";
		
		System.out.println("Value of s2.equals of s1 is: " + s2.equals(s1) );
		System.out.println("Value of s1==s2 is: " + (s1==s2) );
		System.out.println("Value of s2==s3 is: " + (s2==s3) );
		System.out.println("S2 value is: " + System.identityHashCode(s2) + " and s3 value is: " + System.identityHashCode(s3));
		System.out.println("Value of s3.equals of s5 " + s3.equals(s5) );
		System.out.println("Value of s3==s5 " + (s3==s5) );
		System.out.println("Value of s4==s6 " + (s4==s6) );
		
		String s7= "abc";
	    String s8 = new String("abc");
	    String s9= "abc";

	    System.out.println(Integer.toHexString(s7.hashCode()));
	    System.out.println(Integer.toHexString(s8.hashCode()));
	    System.out.println(Integer.toHexString(s9.hashCode()));
	    System.out.println(System.identityHashCode(s7));
	    System.out.println(System.identityHashCode(s8));
	    System.out.println(System.identityHashCode(s9));

	}
}
