package UttaraSamples;

import java.util.Comparator;

public class MyStringLengthComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		
		if (obj1 == null || obj2 == null)
			throw new IllegalArgumentException("Cannot compare null values for Strings in the overriden comparator's method !!");
			
		if (obj1 instanceof String && obj2 instanceof String) {
			String sobj1 = (String)obj1;
			String sobj2 = (String)obj2;
			int val = sobj1.length() - sobj2.length();
			
			if (val == 0)
				return sobj1.compareTo(sobj2);
			else
				return val;
		}
		else
			throw new IllegalArgumentException("Cannot compare 2 non-strings in the overriden comparator's method !!");
		
	}

}
