package UttaraSamples;

public class StringToCharArr {
	/**
	 * This function displays 3 ways to convert a String to a char array.
	 * a. Using charAt() instance method using each individual object char index.
	 * b. Using substring() instance method.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myStr = "kiran is typing"; 
		
		Character[] c = new Character[myStr.length()];
		
		// Approach-01:
		int i;
		
		for (i = 0; i < myStr.length(); i++) {
			c[i] = myStr.charAt(i);
			System.out.println("The char got from approach-01 is : " + c[i]);
		}
		
		System.out.println("The char array got from approach-01 is : " + c.length);
		
		// Approach-02:
		c = new Character[myStr.length()];
		for (i = 0; i < myStr.length(); i++) {
			c[i] = (myStr.substring(i, i+1)).charAt(0);
			System.out.println("The char got from approach-01 is : " + c[i]);
		}
		
		System.out.println("The char array got from approach-02 is : " + c.length);
		
		
	}

}
