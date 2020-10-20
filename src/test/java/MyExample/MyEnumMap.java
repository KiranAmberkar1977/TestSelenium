package MyExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyEnumMap {

	public enum MY_DAYOFWEEK {
		SATURDAY, SUNDAY, MONDAY, WEDNESDAY,
	}

	public static void main(String[] args) {
		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		EnumMap<MY_DAYOFWEEK,String> myEMap = new EnumMap<MY_DAYOFWEEK,String>(MY_DAYOFWEEK.class);
		
		myEMap.put(MY_DAYOFWEEK.MONDAY, "Mondays are moderately productive...");
		myEMap.put(MY_DAYOFWEEK.WEDNESDAY, "Wednesdays are very productive...");
		myEMap.put(MY_DAYOFWEEK.SATURDAY, "Saturdays are for personal time...");
		myEMap.put(MY_DAYOFWEEK.SUNDAY, "Sundays are for relaxing time...");
		
		System.out.println("Size of the enumMap is:" + myEMap.size());
		
		System.out.println("EnumMap structure is: " + myEMap);
		
		System.out.println("EnumMap value of Wednesday is: " + myEMap.get(MY_DAYOFWEEK.WEDNESDAY) );
		
		System.out.println("Does Wednesday have a value: " + myEMap.containsValue("Wednesdays are very productive..."));
		System.out.println("Does Sunday have a key: " + myEMap.containsKey(MY_DAYOFWEEK.SUNDAY));
	}
}
