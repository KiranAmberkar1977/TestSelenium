package UttaraSamples;

import java.util.ArrayList;
import java.util.Collections;

public class TestPersonSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonSecond p1 = new PersonSecond("Sharukh", "Sharukh@rediffmail.com");
		PersonSecond p2 = new PersonSecond("Kajol", "kajol@yahoomail.com");
		PersonSecond p3 = new PersonSecond("ritesh", "ritesh.deshmukh@gmail.com");
		PersonSecond p4 = new PersonSecond("ritesh", "ritesh.deshmukh@gmail.com");
		
		ArrayList<PersonSecond> col = new ArrayList<PersonSecond>();
		col.add(p1);
		col.add(p2);
		col.add(p3);
		col.add(p4);
		
		System.out.println("The p3 is contained in the collection ? - " + col.contains(p3));
		System.out.println("Is p3 same as p4? - " + p3.equals(p4));
		
		System.out.println("The p3 object value is - " + p3);
	}

}
