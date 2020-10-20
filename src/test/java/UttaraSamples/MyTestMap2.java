package UttaraSamples;

import java.util.*;

public class MyTestMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m = new LinkedHashMap<Integer, String>();			// Using this ensures that the Retrieval order is SAME as insertion order.
			
		System.out.println(m.put(13, "Ritesh")); 
		System.out.println(m.put(14, "Akshay Kumar"));
		System.out.println(m.put(11, "Amitabh")); 
		System.out.println(m.put(12, "Aamir Khan")); 
		System.out.println(m.put(11, "Rajkumar"));
		
		System.out.println("The Map contents are:" + m);
		System.out.println("The Map contents as entrySet are:" + m.entrySet());
		
		for(Object o: m.entrySet()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>)o;
			System.out.println("Map key are: " + entry.getKey() + " and value are: " + entry.getValue());
		}
	}
}
