package UttaraSamples;

import java.util.*;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet strcol = new HashSet();
		String s1 = new String("String1");
		String s2 = new String("String1");
		String s3 = new String("String2");
		
		strcol.add(s1); strcol.add(s2); strcol.add(s3);
		
		System.out.println("Hashcodes for s1 and s2 are: " + s1.hashCode() + " " + s2.hashCode() );
		
		HashSet col = new HashSet();
		
		Person p1 = new Person("Buntu", 3);
		Person p2 = new Person("Buntu", 3);
		Person p3 = new Person("Chintu", 3);
		
		System.out.println("Is p1 same as p2? Answer is: " + p1.equals(p2));
		System.out.println("Is p3 same as p1? Answer is: " + p3.equals(p1));
		
		System.out.println("Adding p1 to Hashset...Result is: " + col.add(p1));
		System.out.println("Adding p2 to Hashset...Result is: " + col.add(p2));
		System.out.println("Adding p3 to Hashset...Result is: " + col.add(p3));
		System.out.println("Person's collection is: " + col);
		
		System.out.println("Hashcodes for p1 and p2 are: " + p1.hashCode() + " " + p2.hashCode() );
		
	}

}
