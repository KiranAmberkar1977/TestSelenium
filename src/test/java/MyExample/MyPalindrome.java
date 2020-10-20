package MyExample;

public class MyPalindrome {

	public static void main(String[] args) {
		
		// Using conventional method.
		String srcString = "Dot saw i was Tod";
		srcString = srcString.toLowerCase();
		
		String dstString = MyPalindrome.reversed_string(srcString);
		if (dstString.contentEquals(srcString))
			System.out.println("String is a palindrome...");
		else
			System.out.println("String is NOT a palindrome...");
		
		// Using StringBuilder reverse function.
		StringBuilder sb_srcString = new StringBuilder();
		sb_srcString.append("Dot saw i was Tod");
		
		StringBuilder sb_dstString = sb_srcString.reverse();
		System.out.println("SB Dst String is:" + sb_dstString);
		
		if (sb_dstString.equals(sb_srcString))
			System.out.println("SB String is a palindrome...");
		else
			System.out.println("SB String is NOT a palindrome...");
		
	}

	public static String reversed_string(String srcString) {
		String dstString = new String();
		int length = srcString.length(), i;
		char[] newCharArr = new char[length];
		char[] dstCharArr = new char[length];
		
		// Copy over string contents to the char array.
		for(i=0; i<length; i++)
			newCharArr[i]= srcString.charAt(i);
		
		// Insert the reversed contents to another char array.
		for(i=0; i<length; i++)
				dstCharArr[i] = newCharArr[length - 1 -i];
		
		dstString = new String(dstCharArr);
		System.out.println("Dst String is:" + dstString);
		
		return dstString;
	}
}
