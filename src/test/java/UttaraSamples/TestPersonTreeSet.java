package UttaraSamples;

import java.util.*;

public class TestPersonTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStringLengthComparator slc = new MyStringLengthComparator();
		
		TreeSet strcol = new TreeSet(slc);
		String s1 = new String("Dabbang2");
		String s2 = new String("Don2");
		String s3 = new String("Murder400");
		String s4 = new String("AgneePath");
		
		strcol.add(s1); strcol.add(s2); strcol.add(s3); strcol.add(s4);
		
		//System.out.println("Hashcodes for s1 and s2 are: " + s1.hashCode() + " " + s2.hashCode() );
		System.out.println("String's TreeSet collection is: " + strcol);
		
		System.exit(0);
				
		TreeSet col = new TreeSet(slc);
		
		Person p1 = new Person("Dabbang2", 3);
		Person p2 = new Person("Don2", 3);
		Person p3 = new Person("Murder400", 3);
		Person p4 = new Person("AgneePath", 3);
		
		System.out.println("Is p1 same as p2? Answer is: " + p1.equals(p2));
		System.out.println("Is p3 same as p1? Answer is: " + p3.equals(p1));
		
		System.out.println("Adding p1 to TreeSet...Result is: " + col.add(p1));
//		System.out.println("Adding p2 to TreeSet...Result is: " + col.add(p2));
//		System.out.println("Adding p3 to TreeSet...Result is: " + col.add(p3));
//		System.out.println("Adding p4 to TreeSet...Result is: " + col.add(p4));
//		System.out.println("Person's collection is: " + col);
		
		//System.out.println("Hashcodes for p1 and p2 are: " + p1.hashCode() + " " + p2.hashCode() );
		
	}

}
