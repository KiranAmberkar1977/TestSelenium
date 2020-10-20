package UttaraSamples;

public class StringOperations {
	static int count_vowel, count_digit, count_consonant, count_specialchar; static Character c;
	
	/**
	 * Goal of this function is to:
	 * 1. Compute the total no. of vowels in the given string.
	 * 2. Compute the total no. of Digits in the given string.
	 * 3. Compute the total no. of vowels in the given string.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ramanuja1234sir22!@#$";		// Total of 21 chars.
		String src_string = "RamaNuja";  // Convert this to its transpose such that the o/p is rAMAnUJA.
		String dest_string = "";
		
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			
			if( (c=='a')|| (c=='e')|| (c=='i') || (c=='o') || (c=='u')) {
				System.out.println("Vowel character detected...");
				count_vowel++;
			}
			else if(Character.isDigit(c)) {
				System.out.println("Digit character detected...");
				count_digit++;
			}
			else if(! Character.isAlphabetic(c)) {
				System.out.println("Special character detected...");
				count_specialchar++;
			}
			else  {
				System.out.println("Consonant character detected...");
				count_consonant++;
			}
		}
		System.out.println("Total vowels are: " + count_vowel + "Total digits are: " +  count_digit + "Total consonants are: " + count_consonant + "Total special chars are: " + count_specialchar);
		
		// To transpose a given String using a stringbuilder object as an Intermediary.
		StringBuilder sb = new StringBuilder("");
		
		for (int i = 0; i < src_string.length(); i++) {
			c = src_string.charAt(i); 
			
			if(c.isLowerCase(c))
				sb.append(c.toUpperCase(c));
			else
				sb.append(c.toLowerCase(c));
		}	
		dest_string = sb.toString();
		System.out.println("The transpose string of source string is: " + dest_string);
	}
}
