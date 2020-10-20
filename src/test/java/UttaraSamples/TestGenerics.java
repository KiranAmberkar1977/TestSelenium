package UttaraSamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class TestGenerics {

	public static void main(String[] args) {

		List<String> al1 = new ArrayList<String>();
		al1.add("kiran"); al1.add("chetan"); al1.add("nikhil");
		printCollection(al1, "al1");
		
		List<Number> al2 = new ArrayList<Number>();
		al2.add(1);
		al2.add(2.2);
		al2.add(3.3);
		printCollection(al2, "al2");
				
		List<Double> al3 = new LinkedList<Double>();
		al3.add(4.4);
		al3.add(5.5d);
		al3.add(6.6d);
		printCollection(al3, "al3");
		
	}

	private static void printCollection(Collection<?> mylist, String name) {
		System.out.println("Printing the collection of : " + name);
		
		for (Object ob : mylist) {
			System.out.println("Element is:" + ob);
		}
	}
}
