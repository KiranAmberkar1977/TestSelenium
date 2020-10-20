package MyExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExampleSwitch {

	enum MY_DAYOFWEEK {
		SATURDAY, SUNDAY, MONDAY, WEDNESDAY,
	}

	public static void main(String[] args) {
		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the day of the week to know your tentative mood:");
		String day_of_week = null;

		try {
			day_of_week = in.readLine();

			switch (MY_DAYOFWEEK.valueOf(day_of_week)) {
			case MONDAY:
				System.out.println("Monday's are plain boring...");
				break;
			case SATURDAY:
			case SUNDAY:
				System.out.println("Weekends are happening...");
				break;
			case WEDNESDAY:
				System.out.println("Mid week days are so-so...");
				break;
			default:
				System.out.println("Please Enter a Valid day name...");
				System.exit(1);
			}

		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.err.println("Error message is:" +  e.getMessage());
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
		
		// Calling values() 
        MY_DAYOFWEEK arr[] = MY_DAYOFWEEK.values(); 
  
        // enum with loop 
		for (MY_DAYOFWEEK day : arr) 
        { 
            // Calling ordinal() to find index 
            // of color. 
            System.out.println(day + " at index " + day.ordinal()); 
        } 

		System.out.println("Exiting the program...");
		System.exit(0);
	}
}
