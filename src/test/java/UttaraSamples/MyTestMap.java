package UttaraSamples;

import java.util.*;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

public class MyTestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap m = new LinkedHashMap();			// Using this ensures that the Retrieval order is SAME as insertion order.
		
		System.out.println(m.put(13, "Ritesh")); 
		System.out.println(m.put(14, "Akshay Kumar")); 
		System.out.println(m.put(11, "Amitabh")); 
		System.out.println(m.put(12, "Aamir Khan")); 
		System.out.println(m.put(11, "Rajkumar"));
		
		System.out.println("The Map contents are:" + m);
		
		for(Object o : m.keySet()) {
			int myKey = (int)o;
			System.out.println("Key is: " + myKey + "and value is:" + m.get(myKey) );
		}

	}
}
