package MyExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MyHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> myHash = new LinkedHashMap<Integer, String>();
		
		myHash.put(10, "this is value 10");
		myHash.put(30, "this is value 30");
		myHash.put(20, "this is value 20");
		
		if (myHash.containsKey(20)) {
			System.out.println("Is the key empty: " + myHash.isEmpty());	
			System.out.println("The value for key 20 is: " + myHash.get(20));
		}
		
		System.out.println("Size of map is: " + myHash.size() + "Contents of map are: " + myHash);
		
		SortedMap<Integer, String> myHash2 = new TreeMap<Integer, String>();
		
		myHash2.put(10, "this is value 10");
		myHash2.put(30, "this is value 30");
		myHash2.put(20, "this is value 20");
		
		if (myHash2.containsKey(20)) {
			System.out.println("Is the key empty: " + myHash2.isEmpty());	
			System.out.println("The value for key 20 is: " + myHash2.get(20));
		}
		
		System.out.println("Size of map is: " + myHash2.size() + "Contents of map are: " + myHash2);
		
	}

	 
}
