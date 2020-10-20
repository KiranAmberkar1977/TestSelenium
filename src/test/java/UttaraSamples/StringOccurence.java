package UttaraSamples;

public class StringOccurence {

	// Goal: To find no. of occurrences of a substring in a given string.
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String s1 = new String("raabracadabradabradarara");
		String s2 = "ra"; 
		int substr_count = 0;
		int S2_LEN = s2.length();
		int index = 0;
		
		for(int i = 0; i < s1.length(); i++ ) { 
			index = s1.indexOf(s2, index);
			if (index == -1) break;
			else {	
				index += S2_LEN;
				substr_count++;
				System.out.println("Index is now: " + index + "and substr_count is: " + substr_count);
				Thread.sleep(3000);
			}
		}
		
		System.out.println("No. of occurences of s2 string in s2 is: " + substr_count);
	}
}
