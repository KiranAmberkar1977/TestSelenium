package UttaraSamples;

import java.util.*;

public class CollectionHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet col = new HashSet();
		Object o1 = "rose", o2 = "lotus", o3 = "lilly", o4 = "sunflower";
		
		col.add(o1); col.add(o2); col.add(o3); col.add(o4);
		
		System.out.println("Collection contents are: " + col);
		
		Object o5 = "freesia", o6 = new String("lilly"), o7 = new String("lotus");
		System.out.println("Collection contains lilly is: " + col.contains(o6));
		
		col.remove(o7);
		System.out.println("Collection contents are: " + col);
		
		System.out.println("Collection added status is: " + col.add(o7)); System.out.println("Collection added status is: " + col.add(o7));
		System.out.println("Collection contents are: " + col);		
		
		col.remove(o7);
		System.out.println("Collection contents are: " + col + " and collection size is: " + col.size());
		
		for (Object o : col)
			System.out.println("Collection contents are: " + o);
			
	}
}
