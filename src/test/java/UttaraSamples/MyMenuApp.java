package UttaraSamples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MyMenuApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		Integer ch1 = 0;
		String name, phone_num;
		
		Map<String, String> myMap = new LinkedHashMap<String, String>();
		
		while (ch1 != 4) {
			System.out.println("Enter 1 to add a Person with name and phonenum to the system");
			System.out.println("Enter 2 to List all the Persons added to the system");
			System.out.println("Enter 3 to search for phonenumber of the Person");
			System.out.println("Enter 4 to exit the App Menu");
		
			while( !sc1.hasNextInt() ) {
				System.out.println("Enter valid integer values only here...Exiting the App menu...");
				System.exit(1);
			}
			
			ch1 = sc1.nextInt();
			
			switch(ch1) {
			case 1:
				System.out.println("Case 1 entered...");
				System.out.println("Enter the name of the person: ");
				name = sc1.next();
				System.out.println("Enter the phonenumber of the person: ");
				phone_num = sc1.next();
				myMap.put(name, phone_num);
				
				break;
			case 2:
				System.out.println("Case 2 entered...Printing the contents of the Map");
				
				System.out.println(myMap);
				
				break;
			case 3:
				System.out.println("Case 3 entered...");
				System.out.println("Enter the name of the person: ");
				
				if ( (name = sc1.next()) != null)
					System.out.println("The phone num of the person: " + name + " is : " + myMap.get(name));
				else
					System.out.println("This person's entry doesn't exist in the System. Enter a valid person name again...");
				
				break;
			case 4:
				System.out.println("Option 4 selected. Exiting the App menu...");
				break;
			default:
				System.out.println("Enter valid Option values only b/w 1 and 4 !!");
				break;
				
			}
		}
		sc1.close();
	}
}
