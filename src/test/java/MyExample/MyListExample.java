package MyExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MyListExample {

	public static void main(String[] args) throws ClassNotFoundException {
		List<String> myAL = new ArrayList<String>();
		
		myAL.add(0, "First element");
		myAL.add(1, "Second element");
		myAL.add(2, "Third element");
		myAL.add(3, null);
		myAL.add(4, "Fifth element");
		
		System.out.println("ArrayList object is: " + myAL);
		print(myAL);
				
		myAL.remove(2);
		System.out.println("ArrayList object is: " + myAL);
		print(myAL);
		
		List<String> myLL = new LinkedList<String>();
				
		myLL.add(0, "First element");
		myLL.add(1, "Second element");
		myLL.add(2, "Third element");
		myLL.add(3, null);
		myLL.add(4, "Fifth element");
		
		System.out.println("LinkedList object is: " + myLL);
		print(myLL);
		myLL.remove(2);
		System.out.println("LinkedList object is: " + myLL);
		print(myLL);
		
		Class classlldr = Class.forName("MyExample.MyListExample");  //lang class loader is passed as parameter  
		System.out.println("Name of Class  = " + classlldr.getName());  //get the name of class  
		System.out.println("Package Name  = " + classlldr.getPackage());//get the package of class  
		System.out.println("Interface Name  = " + classlldr.getInterfaces());  //get the interface of class  
		
	}
	
	public static void print(List myList) {
		System.out.println("Elements of list are:");
		Iterator myIt = myList.iterator();
			while (myIt.hasNext()) {
				System.out.println("Element is:" + myIt.next());
			}
	}
}
