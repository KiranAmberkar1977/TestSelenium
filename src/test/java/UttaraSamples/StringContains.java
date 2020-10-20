package UttaraSamples;

public class StringContains {

	public static boolean myContains(String s1, String s2) {
		char[] ca1 = s1.toCharArray();
		char[] ca2 = s2.toCharArray();
		boolean match = false;
		
		if (s1.equals("") || s2.equals("")) {
			throw new IllegalArgumentException("Null strings are passed as arguments");
		}
		else if (s2.length() > s1.length()) {
			throw new IllegalArgumentException("s2 should always be bigger than s1");
		}
		
		for (int i=0; i < ca1.length; i++) {
			System.out.println("Index of i is: " + i);
			if (ca1[i] == ca2[0]) {
				match = true;
				for(int j=1; j < ca2.length; j++) {
					System.out.println("j is: " + j + "and i+j is: " + (int)(i+j));
					if (ca1[i+j] != ca2[j]) {
						match = false;
						System.out.println("Match is false. j is: " + j + "and i+j is: " + (int)(i+j));
						break;
					}
				}
				if (match == true) {
					System.out.println("String contains worked...");
					return true;
				}
			}
		}
	return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdcedcdf cdcdefgh", s2 = "cde";
		
		System.out.println("s2 is contained in s1 is: " + StringContains.myContains(s1, s2));

	}

}
